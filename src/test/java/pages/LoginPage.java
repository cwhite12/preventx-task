package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By userNameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public InventoryPage login(String username, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameField)).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

        wait.until(ExpectedConditions.urlContains("inventory"));

        return new InventoryPage(driver);
    }
}
