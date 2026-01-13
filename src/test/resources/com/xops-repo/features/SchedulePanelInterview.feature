
@feature_schedule_panel_interview
Feature: SchedulePanelInterview

Background: 
  Given the user is on the Schedule Interview section

@create_interview
Scenario Outline: Schedule Panel Interview for a Candidate
  When the user clicks on Create Interview
  And the user selects "<job_opening>" from the dropdown
  And the user selects "<location>" from the available options
  And the user enters "<candidate_email>" and selects the candidate
  And the user chooses the "<panel_interview>" option
  And the user selects the Interview Date "<interview_date>" and Start Time "<start_time>"
  And the user selects "<attendees>" and Interview Round "<interview_round>"
  And the user selects the Interview Provider "<interview_provider>"
  And the user clicks on Next
  And the user attaches "<required_files>"
  And the user clicks on Confirm and Send
  Then the system displays a confirmation message for the scheduled interview

  Examples:
    | job_opening       | location        | candidate_email        | panel_interview | interview_date | start_time | attendees           | interview_round | interview_provider | required_files |
    | job opening value | location value  | candidate@example.com  | Panel Interview | 2023-10-15    | 10:00 AM  | attendee@example.com | Round 1        | Provider Name      | file.pdf       |

  @schedule-panel-interview
  Scenario Outline: Schedule Panel Interview
    When I click on Create Interview
    And I select "<job_opening>" from the dropdown
    And I select "<location>" from the available options
    And I enter the candidate's email address "<candidate_email>" and select the candidate
    And I choose the "<interview_type>" option
    And I select "<interview_date>" and "<start_time>"
    And I select "<attendees>" and "<interview_round>"
    And I select "<interview_provider>"
    And I fill in optional fields "<interview_notes>" and "<special_instructions>"
    And I click on Next
    And I attach required files
    And I click on Confirm and Send
    Then the system displays a confirmation message for the scheduled interview
    And all optional fields are saved and displayed correctly in the interview details
    And notifications are sent to all participants with the additional information included
    And the interview appears in the calendar of all attendees with all details
    And the candidate receives an email notification with all details
    And the recruiter can view the scheduled interview in their dashboard with all information

    Examples:
      | job_opening       | location        | candidate_email        | interview_type  | interview_date | start_time | attendees              | interview_round | interview_provider | interview_notes                     | special_instructions                   |
      | Job Opening 1     | Location 1      | candidate@example.com   | Panel Interview  | 2023-10-15     | 10:00 AM   | Attendee 1, Attendee 2 | Round 1        | Provider Name      | Interview notes a * 100             | Special instructions a * 100          |

@edit-panel-interview
Scenario Outline: Schedule Panel Interview
  When the recruiter selects a scheduled panel interview to edit
  And the recruiter clicks on Edit Interview
  And the recruiter makes changes to the Interview Date, Start Time, or Attendees
  And the recruiter clicks on Save Changes
  Then the system displays a confirmation message indicating that the interview has been updated
  And the updated interview details are reflected in the system
  And notifications are sent to all attendees regarding the changes
  And the candidate receives an email notification with updated interview details
  And the recruiter can view the updated interview in their dashboard

Examples:
  | Interview Date | Start Time | Attendees        |
  | 2023-10-15     | 10:00 AM   | John Doe, Jane Smith |

  @notification-sent
  Scenario Outline: Schedule Panel Interview
    When the user checks the email inbox of "<attendee>"
    Then the attendee receives an email notification with the interview details
    And the email contains the correct Interview Date, Start Time, and Location
    And the email includes a calendar invite for the interview

    Examples:
      | attendee     |
      | attendee1    |
      | attendee2    |
      | attendee3    |

@cancel_interview
Scenario Outline: Schedule Panel Interview
  When the recruiter selects a scheduled panel interview to cancel
  And the recruiter clicks on Cancel Interview
  And the recruiter confirms the cancellation
  Then the system displays a confirmation message indicating that the interview has been canceled
  Then the interview is removed from the scheduled interviews list
  Then notifications are sent to all attendees regarding the cancellation
  Then the candidate receives an email notification about the cancellation

Examples:
  | interview_id |
  | 12345        |

  @error_no_job_opening
  Scenario Outline: Schedule Panel Interview without Job Opening
    When the user clicks on Create Interview
    And the user leaves the Job Opening field empty
    And the user selects "<location>" from the available options
    And the user enters the Candidate's email address as "<candidate_email>"
    And the user selects the candidate "<candidate_name>"
    And the user chooses the Panel Interview option
    And the user selects the Interview Date as "<interview_date>" 
    And the user selects the Start Time as "<start_time>"
    And the user clicks on Next
    Then the system displays an error message indicating that the Job Opening must be selected
    And the user remains on the scheduling page
    And no interview is scheduled

    Examples:
      | location   | candidate_email     | candidate_name | interview_date | start_time  |
      | New York   | candidate@example.com| John Doe       | 15/11/2023     | 10:00 AM    |

@error_candidate_not_selected
Scenario Outline: Schedule Panel Interview without selecting a Candidate
  When the user clicks on Create Interview
  And the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user leaves the Candidate field empty
  And the user chooses the Panel Interview option
  And the user selects the Interview Date and Start Time
  And the user clicks on Next
  Then the system displays an error message indicating that a Candidate must be selected
  And the user remains on the scheduling page
  And no interview is scheduled

Examples:
  | Job Opening      | Location       |
  | <job_opening>    | <location>     |

@error_message_on_empty_date
Scenario Outline: Schedule Panel Interview
  When the user clicks on Create Interview
  And the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user enters the Candidate's email address and selects the candidate
  And the user chooses the Panel Interview option
  And the user leaves the Interview Date field empty
  And the user clicks on Next
  Then the system displays an error message indicating that an Interview Date must be selected
  And the user remains on the scheduling page
  And no interview is scheduled

  Examples:
    | Job Opening   | Location   | Candidate Email      |
    | Job1          | Location1  | candidate1@example.com |

  @error-message
  Scenario Outline: Schedule Panel Interview Without Start Time
    When the user clicks on Create Interview
    And the user selects a Job Opening from the dropdown
    And the user selects a Location from the available options
    And the user enters the Candidate's email address and selects the candidate
    And the user chooses the Panel Interview option
    And the user selects the Interview Date
    And the user leaves the Start Time field empty
    And the user clicks on Next
    Then the system displays an error message indicating that a Start Time must be selected
    And the user remains on the scheduling page
    And no interview is scheduled

    Examples:
      | email_address          |
      | candidate@example.com  |

@error-message
Scenario Outline: Schedule Panel Interview
  When the user clicks on Create Interview
  And the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user enters the Candidate's email address "<email>" and selects the candidate
  And the user chooses the Panel Interview option
  And the user selects the Interview Date and Start Time
  And the user leaves the Attendees field empty
  And the user clicks on Next
  Then the system displays an error message indicating that at least one Attendee must be selected
  And the user remains on the scheduling page
  And no interview is scheduled

  Examples:
    | email                  |
    | candidate@example.com  |

  @error_message_past_date
  Scenario Outline: Schedule Panel Interview with Past Interview Date
    When the user clicks on Create Interview
    And the user selects a Job Opening from the dropdown
    And the user selects a Location from the available options
    And the user enters the Candidate's email address "<email>" and selects the candidate
    And the user chooses the Panel Interview option
    And the user selects a past Interview Date "<interview_date>"
    And the user selects a Start Time
    And the user clicks on Next
    Then the system displays an error message indicating that the Interview Date cannot be in the past
    And the user remains on the scheduling page
    And no interview is scheduled

    Examples:
      | email     | interview_date |
      | abc@      | 01/01/2020     |

  @feature_schedule_panel_interview
  @overlapping_interview
  Scenario Outline: Schedule Panel Interview
    When the user clicks on Create Interview
    And the user selects "<job_opening>" from the dropdown
    And the user selects "<location>" from the available options
    And the user enters the Candidate's email address "<candidate_email>" and selects the candidate
    And the user chooses the Panel Interview option
    And the user selects the Interview Date "<interview_date>" and Start Time "<start_time>" that overlaps with an existing interview
    And the user selects "<attendees>" and "<interview_round>"
    And the user clicks on Next
    Then the system displays an error message indicating that the interview time overlaps with an existing interview
    And the user remains on the scheduling page
    And no interview is scheduled

    Examples:
      | job_opening         | location       | candidate_email             | interview_date | start_time | attendees               | interview_round |
      | Job Opening 1       | Location 1     | overlapping_candidate@gmail.com | 10/10/2023     | 10:00 AM  | Attendee 1, Attendee 2  | Round 1         |

@invalid_email_format
Scenario Outline: Schedule Panel Interview
  When the user clicks on Create Interview
  And the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user enters an invalid email format for the Candidate "<email>"
  And the user chooses the Panel Interview option
  And the user selects the Interview Date and Start Time
  And the user clicks on Next
  Then the system displays an error message indicating that the email format is invalid
  And the user remains on the scheduling page
  And no interview is scheduled

  Examples:
    | email         |
    | invalidemail  |

  @validate_schedule_interview
  Scenario Outline: Schedule Panel Interview
    Given the recruiter clicks on Create Interview
    When the recruiter selects "<job_opening>"
    And the recruiter selects "<location>"
    And the recruiter enters "<candidate_email>" and selects the candidate
    And the recruiter chooses the Panel Interview option
    And the recruiter selects the Interview Date "<interview_date>" and Start Time "<start_time>"
    And the recruiter selects the maximum number of Attendees "<max_attendees>"
    And the recruiter clicks on Next
    And the recruiter attaches required files "<required_files>"
    And the recruiter clicks on Confirm and Send
    Then the system should display a confirmation message for the scheduled interview

    Examples:
      | job_opening         | location          | candidate_email      | interview_date | start_time | max_attendees | required_files |
      | job opening value   | location value    | candidate@example.com | 2023-10-30     | 10:00 AM   | 10            | file.pdf       |

@valid_schedule_interview
Scenario Outline: Schedule Panel Interview
  When the recruiter clicks on Create Interview
  And the recruiter selects "<job_opening>" from the dropdown
  And the recruiter selects "<location>" from the available options
  And the recruiter enters "<candidate_email>" and selects the candidate
  And the recruiter chooses the "<panel_interview_option>"
  And the recruiter selects "<interview_date>" and "<start_time>"
  And the recruiter selects "<min_attendees>" as the minimum number of Attendees allowed
  And the recruiter clicks on Next
  And the recruiter attaches "<required_files>"
  And the recruiter clicks on Confirm and Send
  Then the system displays a confirmation message for the scheduled interview
  And all attendees receive notifications
  And the interview appears in the calendar of all attendees
  And the candidate receives an email notification with interview details
  And the recruiter can view the scheduled interview in their dashboard

  Examples:
    | job_opening         | location        | candidate_email      | panel_interview_option | interview_date | start_time | min_attendees | required_files |
    | job opening value   | location value  | candidate@example.com | Panel Interview        | 2023-10-15    | 10:00 AM   | 2             | file.pdf       |

@max-character-email
Scenario Outline: Schedule Panel Interview with Maximum Character Limit Email
  When the user clicks on Create Interview
  And the user selects "<job_opening>" from the dropdown
  And the user selects "<location>" from the available options
  And the user enters a candidate email address "<email_address>"
  And the user chooses the Panel Interview option
  And the user selects the Interview Date "<interview_date>" and Start Time "<start_time>"
  And the user clicks on Next
  Then the system should accept the email address without errors
  And the interview can be scheduled successfully
  And notifications are sent to all participants

  Examples:
    | job_opening      | location       | email_address                                                                 | interview_date | start_time |
    | Software Engineer | New York       | a@a.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

@minimum-character-email
Scenario Outline: Schedule Panel Interview with Minimum Character Email
  When the user clicks on Create Interview
  And the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user enters a candidate email address "<email>"
  And the user chooses the Panel Interview option
  And the user selects the Interview Date and Start Time
  And the user clicks on Next
  Then the system accepts the email address without errors
  And the interview can be scheduled successfully
  And notifications are sent to all participants

  Examples:
    | email    |
    | a@b.c   |
