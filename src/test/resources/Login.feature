Feature: Login scenarios

  Scenario Outline: Login with invalid user name
    When I enter the user name as "<username>"
    And I enter the password as "<password>"
    And I clicked on login button
    Then login should fail with an error "<error>"
    Examples:
      | username        | password     | error |
      | InvalidUserName | secret_sauce | Username and pad do not match any user in this server |

  Scenario Outline: Login with invalid password
    When I enter the user name as "<username>"
    And I enter the password as "<password>"
    And I clicked on login button
    Then login should fail with an error "<error>"
    Examples:
      | username      | password         | error |
      | standard_user | invalid_password | Username and password do not match any user in this server |


  Scenario Outline: Login with valid username and password
    When I enter the user name as "<username>"
    And I enter the password as "<password>"
    And I clicked on login button
    Then I should see product page with title as "<title>"
    Examples:
      | username      | password     | title |
      | standard_user | secret_sauce | PRODUCTS |