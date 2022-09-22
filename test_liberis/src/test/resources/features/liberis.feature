Feature: Type of Partner selection section

  Scenario: Verification of Reset button
    Given Launch the application
    When Click on the Get Demo button
    Then Verify user has landed on Partner Selection page
    Then Verify Type of partner options
      | Options                 |
      | I'm a Broker            |
      | I'm an ISO              |
      | I'm a Strategic Partner |
    Then Verify the validation message for Get Demo
