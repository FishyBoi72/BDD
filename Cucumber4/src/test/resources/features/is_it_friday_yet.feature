Feature: Is it Friday yet?

  Scenario: Today is Friday
    Given today is Friday
    When I ask whether it's Friday yet
    Then I should be told "Yes"

  Scenario: Today is not Friday
    Given today is Monday
    When I ask whether it's Friday yet
    Then I should be told "No"
