Feature: Register new user
  @smokeTest
  Scenario: Registering user page
    Given I am on signup page
    When I register as new user with "nisha" and "nisha+1@email.com"
    And I should fill all mandatory registration details
      | Password | FirstName  | Lastname  | Company  | Address      | State   | City     | Zipcode | MobileNumber |
      | pass123  | John       | Doe       | Acme Inc | 123 Main St  |  NY     | New York | 10001   | 1234567890    |
