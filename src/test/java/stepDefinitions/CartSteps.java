package stepDefinitions;

import io.cucumber.java.en.*;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.InventoryPage;
import pages.CartPage;
import utilities.DriverManager;

public class CartSteps {
    WebDriver driver = DriverManager.getDriver();
    InventoryPage inventoryPage = new InventoryPage(driver);
    CartPage cartPage = new CartPage(driver);

    @Step("I add three items to the cart")
    @When("I add three items to the cart")
    public void iAddThreeItemsToCart() {
        inventoryPage.addItemsToCart(3);
    }
    @Step("I go to the cart")
    @When("I go to the cart")
    public void iGoToTheCart() {
        inventoryPage.goToCart();
    }
    @Step("I proceed to checkout")
    @Then("I proceed to checkout")
    public void iProceedToCheckout() {
        cartPage.clickCheckout();
    }
}
