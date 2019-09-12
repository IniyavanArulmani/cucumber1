Feature: Login Function

  Scenario: To check Add customer function by entering valid details
    Given User is on home page
    When User enter some valid details
      | iniyavan | arulmani |
    And User enters remaining details
      | email    | iniyavan7777@gmail.com |
      | message  | Hai Java               |
      | telepone |             9677772535 |
    Then Verify wheather able to login
