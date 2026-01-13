
Feature: Chemical,Proppant,Email&Del
  @feature_user_login
  Background: 
    Given the user is in the Jobs section

  @navigate_chemical_proppant_email_setup
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user selects a current Job from the list
    And the user chooses a Well associated with the Job
    And the user selects a Stage for the Job
    And the user clicks on the Chemical Setup option
    Then the user is redirected to the Chemical Setup screen
    And the selected Job, Well, and Stage are displayed correctly on the Chemical Setup screen
    When the user clicks on the Proppant Setup option
    Then the user is redirected to the Proppant Setup screen
    And the selected Job, Well, and Stage are displayed correctly on the Proppant Setup screen
    When the user clicks on the Email Setup option
    Then the user is redirected to the Email Setup screen
    And the selected Job, Well, and Stage are displayed correctly on the Email Setup screen

    Examples:
      | Job    | Well    | Stage   |
      | Job1   | Well1   | Stage1  |

  @feature_user_login
  @add_acid_additive
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    Given the user clicks on the "Add Chemical" button
    When the user selects "<chemical_name>" from the chemical dropdown
    And the user enters a design concentration value of "<design_concentration>"
    And the user enters a designed volume of "<designed_volume>"
    And the user clicks on the "Save" button
    Then the Acid & Additives entry should be added to the list
    And the entry should persist after the page refresh
    And the correct design concentration "<design_concentration>" and volume "<designed_volume>" should be displayed
    And no validation errors should occur during the process

    Examples:
      | chemical_name | design_concentration | designed_volume |
      | Acid          | 10                   | 100             |

@add_slickwater
Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
  Given the user clicks on the "Add Chemical" button
  When the user selects "<chemical_name>" from the chemical dropdown
  And the user enters "<design_concentration>" as the design concentration
  And the user enters "<designed_volume>" as the designed volume
  And the user clicks on the "Save" button
  And the user refreshes the page
  Then the Slickwater entry should be added to the list
  And the entry should persist after the page refresh
  And the correct design concentration "<design_concentration>" and volume "<designed_volume>" should be displayed
  And no validation errors should occur during the process

  Examples:
    | chemical_name | design_concentration | designed_volume |
    | Slickwater    | 0                    | a * 100        |

  @feature_user_login
  @valid-proppant-setup
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Proppant" button
    And the user selects the Proppant name "<proppant_name>" from the dropdown
    And the user enters "<design_volume>" as the total design volume
    And the user clicks on the "Save" button
    And the user repeats the above steps for the next Proppant
    And the user refreshes the page
    Then all Proppants should be added to the list
    And each Proppant should display the correct name and design volume
    And the entries should persist after the page refresh
    And no validation errors should occur during the process

    Examples:
      | proppant_name | design_volume |
      | Proppant A    | 1000          |
      | Proppant B    | 2000          |
      | Proppant C    | 3000          |
      | Proppant D    | 4000          |

  @add_vendor
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Vendor" button
    And the user selects the vendor type "<vendor_type>"
    And the user enters the vendor name
    And the user enters the PO number
    And the user clicks on the "Save" button
    Then all vendors should be added to the list
    And each vendor should display the correct name and PO number
    And the entries should persist after the page refresh
    And no validation errors should occur during the process

    Examples:
      | vendor_type |
      | Chemical    |
      | Proppant    |

@update_meeting_id
Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
  Given the user locates the "Others" section on the Email Setup screen
  When the user clicks on the Meeting ID field
  And the user enters "<meeting_id>"
  And the user clicks on the "Save" button
  Then the Meeting ID is updated successfully
  And the new Meeting ID persists after the page refresh
  And no validation errors occur during the process

  Examples:
    | meeting_id    |
    | meeting_id_123 |

  @feature_user_login
  @create_delivery_record
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Delivery Record" button
    And the user selects a vendor from the dropdown
    And the user selects a PO from the dropdown
    And the user selects a chemical type from the dropdown
    And the user enters <BOL number>, <received quantity>, <UOM>, and <BOL quantity>
    And the user selects <inventory type>
    And the user clicks on the "Save" button
    Then the delivery record is added to the list
    And all entered details are displayed correctly
    And the entry persists after the page refresh
    And no validation errors occur during the process

    Examples:
      | vendor   | PO    | chemical type | BOL number | received quantity | UOM | BOL quantity | inventory type |
      | Vendor1  | PO123 | ChemicalA     | BOL001     | 100              | kg  | 100          | Type1          |
      | Vendor2  | PO456 | ChemicalB     | BOL002     | 200              | l   | 200          | Type2          |

  @feature_user_login
  @dropdown_verification
  Scenario Outline: Chemical, Proppant, and Email Setup for Job Stages
    When I click on the chemical name dropdown
    Then the chemical name dropdown displays all available chemicals

    When I open the Proppant Setup screen
    And I click on the Proppant name dropdown
    Then the Proppant name dropdown displays all available Proppants

    When I open the Email Setup screen
    And I click on the vendor type dropdown
    Then the vendor type dropdown displays all available vendor types

    Then no errors occur during the loading of dropdown options

    Examples:
      | chemical_name | proppant_name | vendor_type |
      | Chemical A    | Proppant A    | Vendor A    |

  @feature_user_login
  @add_save_new_buttons
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Chemical" button
    And the user fills in the required fields
    And the user clicks "Save"
    Then the first Chemical is saved successfully

    When the user clicks on the "Add Chemical" button
    And the user fills in the required fields
    And the user clicks "Save & New"
    Then the second Chemical is added and the form resets for new entry

    When the user clicks on the "Save" button for the last entry
    Then the last entry is saved successfully
    And there are no validation errors during the process

  Examples:
    | action                | result                                      |
    | Add Chemical         | The first Chemical is saved successfully    |
    | Add Chemical         | The second Chemical is added and the form resets for new entry |
    | Save last entry      | The last entry is saved successfully        |
    | Validation check     | No validation errors occur during the process |

  @feature_user_login
  @missing_fields_error
  Scenario Outline: Chemical Setup with Missing Fields
    When the user clicks on the "Add Chemical" button
    And the user leaves the chemical name field empty
    And the user enters a design concentration value of "<concentration>"
    And the user leaves the designed volume field empty
    And the user clicks on the "Save" button
    Then the system does not add the Chemical
    And appropriate error messages are displayed for missing fields
    And the user remains on the Chemical Setup screen

    Examples:
      | concentration |
      | 5.0          |

  @feature_user_login
  @prevent_negative_proppant
  Scenario Outline: Validate that the system prevents adding a Proppant with a negative total design volume
    When the user clicks on the "Add Proppant" button
    And the user selects "<proppant_name>" from the dropdown
    And the user enters "<total_design_volume>"
    And the user clicks on the "Save" button
    Then the system does not add the Proppant
    And an error message is displayed indicating that the total design volume must be positive
    And the user remains on the Proppant Setup screen

    Examples:
      | proppant_name    | total_design_volume |
      | NegativeProppant | -10                 |

  @feature_email_setup
  @vendor_name_missing
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Vendor" button
    And the user selects a vendor type "<vendor_type>"
    And the user leaves the vendor name field empty
    And the user enters a PO number "<po_number>"
    And the user clicks on the "Save" button
    Then the system does not save the vendor
    And an error message is displayed indicating that the vendor name is required
    And the user remains on the Email Setup screen

    Examples:
      | vendor_type | po_number |
      | Chemical    | 12345     |
      | Proppant    | 12345     |

  @missing-fields
  Scenario Outline: Validate Missing Required Fields for Delivery Record
    When the user clicks on the "Add Delivery Record" button
    And the user leaves the vendor field empty
    And the user selects "<po>" from the dropdown
    And the user selects "<chemical_type>" from the dropdown
    And the user clicks on the "Save" button
    Then the system should not create the delivery record
    And the user should see an error message indicating that the vendor is required
    And the user should remain on the Chemical Delivery Tracking screen

    Examples:
      | po                     | chemical_type             |
      | PO_Selection_Value     | Chemical_Type_Selection_Value |

  @feature_user_login
  @validate_maximum_proppants
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Proppant" button
    And the user selects "<proppant_name>" from the dropdown
    And the user enters "<design_volume>" as a total design volume
    And the user clicks on the "Save" button
    Then the user should see the success message for adding <proppant_name>

    Examples:
      | proppant_name      | design_volume |
      | Proppant Name 1   | 1000          |
      | Proppant Name 2   | 1000          |
      | Proppant Name 3   | 1000          |
      | Proppant Name 4   | 1000          |

  @attempt_add_fifth_proppant
  Scenario: Attempt to add a fifth Proppant
    When the user attempts to click on the "Add Proppant" button again
    Then the user should see an error message
    And the user should remain on the Proppant Setup screen

  @feature_user_login
  @valid_delivery_record_creation
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    Given the user clicks on the "Add Delivery Record" button
    When the user selects "<vendor>" from the dropdown
    And the user selects "<po>" from the dropdown
    And the user selects "<chemical_type>" from the dropdown
    And the user enters a valid "<bol_number>", "<received_quantity>", "<uom>", and "<bol_quantity>"
    And the user selects "<inventory_type>"
    And the user clicks on the "Save" button
    Then the delivery record should be added successfully
    And all entered details should be displayed correctly
    And the entry should persist after the page refresh
    And no validation errors should occur during the process

    Examples:
      | vendor      | po       | chemical_type | bol_number  | received_quantity | uom | bol_quantity | inventory_type     |
      | Vendor A   | PO12345  | Chemical X    | BOL123456   | 100               | kg  | 150          | Inventory Type A  |
