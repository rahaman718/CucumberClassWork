Feature:

  Scenario: Sign up with valid Email address
    Given That I am on TalentTek signup page
    When I fill the form with valid email address
    And I click on the Create my Account Button
    Then I verify that I successfully singed up

    Scenario: Sign Up without password
      Given That I am on TalentTek signup page
      When I fill the form without Password
      And I click on the Create my Account Button
      Then I verify that I get password inline validation error
