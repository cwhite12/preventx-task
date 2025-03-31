package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverManager;
import static org.junit.Assert.assertTrue;

public class BasePage {
    WebDriver driver = DriverManager.getDriver();

    public BasePage(WebDriver driver) {
         this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return driver.getTitle();
    }
    public void assertTextIsDisplayed(String expectedText) {
        WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        assertTrue("Expected text not found on page!", bodyText.contains(expectedText));
    }
}
