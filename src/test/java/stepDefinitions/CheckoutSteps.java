package stepDefinitions;

import io.cucumber.java.en.*;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;
import utilities.DriverManager;

public class CheckoutSteps {

    WebDriver driver = DriverManager.getDriver(); // shared driver instance
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @Step("I enter checkout details {string}, {string}, {string}")
    @When("I enter checkout details {string}, {string}, {string}")
    public void iEnterCheckoutDetails(String firstName, String lastName, String zip) {
        checkoutPage.enterCheckoutDetails(firstName, lastName, zip);
        checkoutPage.clickContinue();
    }
    @Step("I complete the checkout")
    @Then("I complete the checkout")
    public void iCompleteCheckout() {
        checkoutPage.clickFinish();
    }
}
