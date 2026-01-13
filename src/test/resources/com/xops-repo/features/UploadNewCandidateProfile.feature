
@feature_upload_new_candidate_profile
Feature: UploadNewCandidateProfile

Background: 
  Given the recruiter is on the Profile section

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the recruiter clicks on the upload icon
  And the recruiter browses and selects a valid candidate profile file
  And the recruiter clicks on the Upload button
  And the recruiter waits for the upload process to complete
  Then a success confirmation message is displayed to the user

  Examples:
    | candidate_profile_file |
    | valid_candidate.pdf     |
    | valid_candidate.docx    |

  @valid-upload-profile
  Scenario Outline: Upload New Candidate Profile
    When the recruiter clicks on the upload (cloud) icon
    And the recruiter browses and selects the <profile_file>
    And the recruiter clicks on the Upload button
    Then the recruiter waits for the upload to complete and confirms success
    And the recruiter repeats the above steps for a second valid candidate profile file
    Then both profiles are listed in the Profile section

    Examples:
      | profile_file           |
      | FirstProfile.pdf       |
      | SecondProfile.pdf      |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the recruiter clicks on the upload icon
  And the recruiter browses and selects a valid candidate profile file of 2MB
  And the recruiter clicks on the Upload button
  And the recruiter waits for the upload process to complete
  Then a success confirmation message is displayed to the user

  Examples:
    | valid_candidate_profile_file |
    | candidate_profile_2MB.pdf    |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload icon
  And the user browses and selects a valid candidate profile file with a long filename
  And the user clicks on the Upload button
  And the user waits for the upload process to complete
  Then a success confirmation message is displayed to the user

  Examples:
    | filename                                      |
    | Candidate_Profile_2023_John_Doe_Very_Long_Filename.pdf |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a valid candidate profile file in .txt format
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

  Examples:
    | file_name         |
    | valid_candidate.txt |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When I click on the upload icon
    And I browse and select a valid candidate profile file with UTF-8 encoding
    And I click on the Upload button
    And I wait for the upload process to complete
    Then a success confirmation message is displayed to the user

  Examples:
    | file_name                     |
    | valid_candidate_profile_utf8  |

  @valid-profile-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a valid candidate profile file with a .doc extension
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | file_extension |
      | .doc          |

  @upload_candidate_profile
  Scenario Outline: Upload New Candidate Profile
    When the recruiter clicks on the upload icon
    And the recruiter browses and selects a valid candidate profile file with text in Spanish
    And the recruiter clicks on the Upload button
    And the recruiter waits for the upload process to complete
    Then a success confirmation message is displayed to the user

  Examples:
    | file_name                     |
    | valid_candidate_profile_spanish |

  @unsupported-file-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects an unsupported file type <unsupported_file_type>
    And the user clicks on the Upload button
    Then the system should display an error message indicating the file type is not supported
    And the upload process should not initiate

  Examples:
    | unsupported_file_type |
    | .exe                  |

  @file_size_exceed
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a file that exceeds the size limit
    And the user clicks on the Upload button
    Then an error message is displayed indicating the file exceeds the maximum size limit
    And the upload process does not initiate

    Examples:
      | file_size |
      | 6MB       |

  @error_no_file_selected
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user does not select any file
    And the user clicks on the Upload button
    Then the user should see an error message indicating that no file was selected
    And the upload process should not initiate

    Examples:
      |    |
      |    |

  @network_failure
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a valid candidate profile file
    And the user clicks on the Upload button
    And the network failure is simulated
    Then an error message should be displayed indicating a network failure occurred
    And the upload process does not complete successfully

    Examples:
      | valid_candidate_profile_file |
      | candidate_profile.pdf        |

  @timeout-error
  Scenario Outline: Upload New Candidate Profile
    Given the user clicks on the upload icon
    When the user browses and selects a valid candidate profile file
    And the user clicks the Upload button
    And the user simulates a timeout during the upload process
    Then an error message is displayed indicating the upload process timed out
    And the upload process does not complete successfully

    Examples:
      | valid_candidate_profile_file |
      | candidate_profile.pdf        |

  @corrupted-file-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a corrupted candidate profile file
    And the user clicks on the Upload button
    Then an error message is displayed indicating the file is corrupted and cannot be uploaded
    And the upload process does not initiate

  Examples:
    | corrupted_file         |
    | corrupted_file1.pdf    |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload (cloud) icon
  And the user browses and selects a valid candidate profile file with special characters in the filename
  And the user clicks on the Upload button
  Then the upload process should complete
  And a success confirmation message should be displayed to the user

Examples:
  | candidate_profile_file          |
  | John_Doe@2023.pdf               |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid candidate profile file with a very short filename
    And the user clicks on the Upload button
    Then the upload process should complete
    And a success confirmation message should be displayed to the user

    Examples:
      | filename |
      | A.pdf    |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the recruiter clicks on the upload icon
  And the recruiter browses and selects a valid candidate profile file with spaces in the filename
  And the recruiter clicks on the Upload button
  And the recruiter waits for the upload process to complete
  Then a success confirmation message is displayed to the user

  Examples:
    | filename                     |
    | John Doe Profile.pdf        |
