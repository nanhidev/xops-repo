
@feature_create_new_job_opening
Feature: CreateNewJobOpening

  Background: 
    Given the user is logged into the application

  @view-job-opening
  Scenario Outline: Create New Job Opening
    When the user clicks on the "Job Openings" menu item in the application
    Then the Job Opening page is displayed
    And the "Add Job Opening" button is visible and clickable

    Examples:
      | action                          |
      | Click on the "Job Openings"    |

  @display_create_new_job_opening_form
  Scenario Outline: Create New Job Opening
    When the user clicks on the "Add Job Opening" button
    And the user waits for the Create New Job Opening form to load
    Then the Create New Job Opening form is displayed
    And all required fields are present

    Examples:
      | Job Title    | Job Description | Department   | Location     |
      | Software Dev | Develop software | IT           | New York     |
      | Data Analyst  | Analyze data    | Analytics    | San Francisco |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given the user enters a valid Job Title "<job_title>"
    And the user enters a valid Job Description "<job_description>"
    And the user selects a valid Department "<department>"
    And the user enters a valid Location "<location>"
    When the user clicks the "Save" button
    Then a success message is displayed confirming the job opening creation
    And the new job opening appears in the Job Openings listing

    Examples:
      | job_title         | job_description                                                      | department  | location  |
      | Software Engineer  | Develop and maintain software applications. Collaborate with cross-functional teams to define, design, and ship new features. |
      | Engineering        | New York                                                           |

  @job-title-empty
  Scenario Outline: Create New Job Opening with Empty Job Title
    Given the job title field is empty
    When I enter "<job_description>"
    And I select "<department>"
    And I enter "<location>"
    And I click the "Save" button
    Then an error message should be displayed indicating that the Job Title is required
    And the job opening is not created

    Examples:
      | job_description                                           | department | location   |
      | A challenging position that requires strong analytical skills and teamwork. | Engineering | New York   |

@create-job-opening
Scenario Outline: Create New Job Opening
  Given the user is on the Job Opening Creation Page
  When I enter "<job_title>"
  And I enter "<job_description>"
  And I select "<department>"
  And I leave optional fields empty
  And I click the "Save" button
  Then a success message is displayed confirming the job opening creation
  And the new job opening appears in the Job Openings listing with only the filled fields

  Examples:
    | job_title           | job_description                             | department   |
    | Software Engineer    | Develop and maintain software applications. | Engineering   |

  @cancel_job_opening
  Scenario Outline: Create New Job Opening and Cancel Process
    Given the user enters valid details in the form
    When the user clicks the Cancel button
    Then the user should be redirected back to the Job Openings listing
    And no new job opening should be created

    Examples:
      |   |
      |   |

  @edit_job_opening
  Scenario Outline: Create New Job Opening
    When the user clicks on the newly created job opening
    And the user clicks the "Edit" button
    And the user modifies the Job Description
    And the user clicks the "Save" button
    Then a success message is displayed confirming the job opening update
    And the updated job opening details are reflected in the Job Openings listing

    Examples:
      | job_description       |
      | Updated Job Description |

@view_job_opening_details
Scenario Outline: Create New Job Opening
  When the user clicks on the newly created job opening
  Then the job opening details are displayed correctly
  And all fields (Job Title, Job Description, Department, Location) are visible and accurate

  Examples:
    | job_title       | job_description       | department | location     |
    | Software Engineer| Develop software      | IT         | New York     |

  @filter_job_openings
  Scenario Outline: Create New Job Opening
    When the user clicks on the filter options
    And the user selects <Department> from the filter dropdown
    And the user clicks the Apply Filter button
    Then the Job Openings listing updates to show only job openings that match the selected Department
    And the filter criteria are displayed on the page

    Examples:
      | Department   |
      | Engineering  |
      | Marketing    |

  @sort_job_openings
  Scenario Outline: Create New Job Opening
    When the user clicks on the sorting options
    And the user selects the sorting order
    Then the Job Openings listing updates to show job openings sorted by the selected criteria
    And the sorting order is visually indicated on the page

    Examples:
      | sorting_option   | sorting_order |
      | Job Title        | Ascending     |
      | Date Created     | Descending    |

  @job-pagination
  Scenario Outline: Create New Job Opening
    Given the user observes the pagination controls at the bottom of the listing
    When the user clicks on the next page button
    Then the Job Openings listing updates to show the next set of job openings
    And the pagination controls reflect the current page number

    Examples:
      | page_number |
      | 1           |

  @job-opening-creation
  Scenario Outline: Create New Job Opening
    When I create a new job opening with valid details
    And I click the Save button
    Then a confirmation message is displayed indicating the job opening was created successfully
    And the user is redirected to the Job Openings listing

    Examples:
      |  |
      |  |

  @duplicate_job_title
  Scenario Outline: Create New Job Opening with Duplicate Job Title
    Given the user enters "<job_title>"
    And the user fills in "<job_description>"
    And the user selects "<department>"
    And the user enters "<location>"
    When the user clicks the "Save" button
    Then an error message is displayed indicating that the Job Title already exists
    And the job opening is not created

    Examples:
      | job_title           | job_description                                                                                       | department | location  |
      | Duplicate Job Title | This is a job description that provides details about the responsibilities and requirements of the position. It should be comprehensive and clear. | Sales      | New York  |

  @job_description_exceeds_limit
  Scenario Outline: Create New Job Opening
    Given the user enters a valid Job Title "<jobTitle>"
    And the user enters a Job Description "<jobDescription>"
    And the user selects a valid Department "<department>"
    And the user enters a valid Location "<location>"
    When the user clicks the "Save" button
    Then an error message is displayed indicating that the Job Description exceeds the maximum length
    And the job opening is not created

    Examples:
      | jobTitle          | jobDescription                                                                 | department  | location   |
      | Software Engineer  | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
      | Software Engineer  | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @invalid-location
  Scenario Outline: Create New Job Opening
    Given the admin enters a valid Job Title
    And the admin enters a valid Job Description
    And the admin selects a valid Department
    When the admin enters an invalid Location
    And the admin clicks the Save button
    Then an error message is displayed indicating that the Location format is invalid
    And the job opening is not created

    Examples:
      | job title          | job description                             | department   | location         |
      | Software Engineer   | Develop and maintain software applications. | Engineering  | @InvalidLocation! |

  @invalid-department
  Scenario Outline: Create New Job Opening with Invalid Department
    Given I enter "<job_title>"
    And I enter "<job_description>"
    And I select an invalid Department
    And I enter "<location>"
    When I click the "Save" button
    Then an error message is displayed indicating that the selected Department is invalid
    And the job opening is not created

    Examples:
      | job_title                | job_description                                                | location  |
      | Software Engineer         | Develop and maintain software applications, ensuring high quality and performance. | New York  |

  @invalid-job-title
  Scenario Outline: Create New Job Opening with Invalid Job Title
    Given the user enters "<job_title>" as the Job Title
    And the user enters "<job_description>" as the Job Description
    And the user selects "<department>" as the Department
    And the user enters "<location>" as the Location
    When the user clicks the "Save" button
    Then an error message is displayed indicating that the Job Title contains invalid characters
    And the job opening is not created

    Examples:
      | job_title          | job_description                                        | department  | location   |
      | !@#$%^&*()         | This is a valid job description for the position.    | Engineering | New York   |

  @missing_required_fields
  Scenario Outline: Create New Job Opening with Missing Required Fields
    When the user leaves all required fields empty
    And the user clicks the "Save" button
    Then error messages are displayed for all required fields indicating they must be filled
    And the job opening is not created

    Examples:
      | required_field_1 | required_field_2 |
      |                   |                   |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given the user is on the Create New Job Opening Page
    When I enter a valid Job Title "<jobTitle>"
    And I enter a Job Description with the maximum allowed characters "<jobDescription>"
    And I select a valid Department "<department>"
    And I enter a valid Location "<location>"
    And I click the "Save" button
    Then a success message is displayed confirming the job opening creation
    And the new job opening appears in the Job Openings listing with the correct details

    Examples:
      | jobTitle          | jobDescription                                                                 | department   | location   |
      | Software Engineer  | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | Engineering | New York   |

  @min-character-creation
  Scenario Outline: Create New Job Opening
    Given the user enters a Job Title with the minimum allowed characters as "<job_title>"
    And the user enters a Job Description with the minimum allowed characters as "<job_description>"
    And the user selects the Department "<department>"
    And the user enters the Location "<location>"
    When the user clicks the "Save" button
    Then a success message is displayed confirming the job opening creation
    And the new job opening appears in the Job Openings listing with the correct details

    Examples:
      | job_title | job_description      | department  | location    |
      | Dev       | Develop software     | Engineering | New York    |
