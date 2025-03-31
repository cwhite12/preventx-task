package stepDefinitions;

import io.cucumber.java.en.*;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.CheckoutPage;
import utilities.DriverManager;

public class CheckoutSteps {

    WebDriver driver = DriverManager.getDriver();
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
    @Step("I should see the order confirmation message")
    @Then("I should see the order confirmation message")
    public void iShouldSeeOrderConfirmationMessage() {
        BasePage basePage = new BasePage(driver);
        basePage.assertTextIsDisplayed("Thank you for your order!");
    }
}
