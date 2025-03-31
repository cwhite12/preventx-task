package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverManager;


public class BasePage {
    WebDriver driver = DriverManager.getDriver();

    public BasePage(WebDriver driver) {
         this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
