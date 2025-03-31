package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.InventoryPage;
import pages.CartPage;
import utilities.DriverManager;

public class CartSteps {
    WebDriver driver = DriverManager.getDriver();
    InventoryPage inventoryPage = new InventoryPage(driver);
    CartPage cartPage = new CartPage(driver);

    @When("I add three items to the cart")
    public void iAddThreeItemsToCart() {
        inventoryPage.addItemsToCart(3);
    }

    @When("I go to the cart")
    public void iGoToTheCart() {
        inventoryPage.goToCart();
    }

    @Then("I proceed to checkout")
    public void iProceedToCheckout() {
        cartPage.clickCheckout();
    }
}
