package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.DriverManager;


public class LoginSteps{

    WebDriver driver = DriverManager.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    @Given("I open the login page")
    public void iOpenLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter username {string} and password {string}")
    public void iEnterCredentials(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("I should see the inventory page")
    public void iShouldSeeInventoryPage() {
        assert driver.getTitle().contains("Swag Labs");
        driver.quit();
    }
}
