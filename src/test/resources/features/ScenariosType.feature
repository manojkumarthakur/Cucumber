Feature: Use this to test different type of scenarios

  Scenario: Login with credentials
    Given I am on the login page
    When I enter "manoj_thakur_username" as username and "password@123" as password
    Then I should be logged in successfully