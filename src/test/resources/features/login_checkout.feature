@test
Feature: Purchase three items

  Scenario: Login and purchase an item
    Given I open the login page
    When I enter username "standard_user" and password "secret_sauce"
    And I add three items to the cart
    And I go to the cart
    Then I proceed to checkout
    When I enter checkout details "John", "Doe", "12345"
    Then I complete the checkout