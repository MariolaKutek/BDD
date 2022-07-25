Feature: Authentication process

  Background:
    Given Home page is opened

  Scenario: Login with valid credentials
    When I fill UserID field "testUser123"
    And I fill Password field "password123"
    And I click Login button
    Then I can see page for authenticated user

  Scenario: Login with valid credentials after using Reset button
    When I fill UserID field "invalid"
    And I fill Password field "invalid"
    And I click Reset button
    And I fill UserID field "testUser123"
    And I fill Password field "password123"
    And I click Login button
    Then I can see page for authenticated user

  Scenario Outline: Authentication - negative flow
    When I fill UserID field "<userID>"
    And I fill Password field "<password>"
    And I click Login button
    Then Error message is visible "<errorMessage>"
    Examples:
      | userID       | password | errorMessage                   |
      |              |          | All fields are required        |
      | invalidLogin |          | UserID or Password are invalid |
      |              | invalid  | UserID or Password are invalid |
      | notExisted   | test123  | UserID or Password are invalid |
      | abc123       | invalid  | UserID or Password are invalid |

