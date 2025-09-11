Feature: Use this to test different type of scenarios

  Scenario: Login with credentials
    Given I am on the login page
    When I enter "manoj_thakur_username" as username and "password@123" as password
    Then I should be logged in successfully

  Scenario: Add multiple products to cart ---- Data table
    Given I am on the product page
    When I add the following products to the cart:
      | Product Name | Quantity | Available |
      | Laptop       | 1        | Yes       |
      | Mouse        | 2        | No        |
    Then the cart should contain all added products


  Scenario Outline: User Login with different credentials ---Example Table
    Given I am on the login page
    When I enter "<username>" and "<password>"
    Then I should see "<message>"
    Examples:
      | username | password | message         |
      | user1    | pass1    | Welcome user1   |
      | user2    | pass2    | Invalid credentials |