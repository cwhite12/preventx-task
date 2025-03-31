package stepDefinitions;

import io.cucumber.java.en.*;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.Response;
import io.qameta.allure.*;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;
@Epic("API Testing")
@Feature("Prevent X task")
public class ProductsApiSteps {

    Response response;

    @Step("I send a GET request to {string}")
    @When("I send a GET request to {string}")
    public void iSendAGETRequest(String url) {
        response = given()
                .filter(new AllureRestAssured())
                .when()
                .get(url);
    }

    @Step("I send a POST request to {string}")
    @When("I send a POST request to {string}")
    public void iSendAPOSTRequest(String url) {
        response = given()
                .filter(new AllureRestAssured())
                .when()
                .post(url);
    }
    @Step("the response status code should be {int}")
    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int expectedStatusCode) {
        assertEquals(expectedStatusCode, response.getStatusCode());
    }

    @Step("the response should contain {string}")
    @Then("the response should contain {string}")
    public void theResponseShouldContain(String expectedContent) {
        System.out.println("Response Body:\n" + response.getBody().asPrettyString());
        String body = response.getBody().asString();
        assertTrue(body.contains(expectedContent));
    }

    @Step("I send a POST request to {string} with email {string} and password {string}")
    @When("I send a POST request to {string} with email {string} and password {string}")
    public void sendPostRequestWithCredentials(String url, String email, String password) {
        response = given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("email", email)
                .formParam("password", password)
                .post(url);
    }
}