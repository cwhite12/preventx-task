Feature: Products API Testing

  @test
  Scenario: Get all products
    When I send a GET request to "https://automationexercise.com/api/productsList"
    Then the response status code should be 200
    And the response should contain "products"

  @test
  Scenario: Verify login with invalid credentials
    When I send a POST request to "https://automationexercise.com/api/verifyLogin" with email "valid@example.com" and password "correctpass"
    Then the response status code should be 200
    And the response should contain "User not found!"
