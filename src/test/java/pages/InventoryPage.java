package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {
    WebDriver driver;
    private final By cartLink = By.className("shopping_cart_link");
    private WebDriverWait wait;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemsToCart(int count) {
        for (int i = 1; i <= count; i++) {
            String itemId = "add-to-cart-sauce-labs-" + i;
            try {
                wait.until(ExpectedConditions.elementToBeClickable(By.id(itemId))).click();
            } catch (Exception e) {
                System.out.println("Could not add item " + i + ": " + e.getMessage());
            }
        }
    }

    public CartPage goToCart() {
        driver.findElement(cartLink).click();
        return new CartPage(driver);
    }
}
