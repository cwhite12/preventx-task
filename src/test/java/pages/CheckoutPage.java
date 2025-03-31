package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;
    WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterCheckoutDetails(String firstName, String lastName, String zip) {
        WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
        firstNameField.sendKeys(firstName);

        driver.findElement(By.id("last-name")).sendKeys(lastName);
        driver.findElement(By.id("postal-code")).sendKeys(zip);
    }

    public void clickContinue() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("continue"))).click();
    }

    public void clickFinish() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("finish"))).click();
    }
}
