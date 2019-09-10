Feature: Login Function

  Scenario: To check login function by entering valid details
    Given User is on home page
    When User enter some valid details.
      | kartik | kumar | delhi | pmnbvcf@gmail.com | 9800766754 |
    And User enters remaining..
      | Karti5 | Karti5 |
    Then Verify wheather able to login
