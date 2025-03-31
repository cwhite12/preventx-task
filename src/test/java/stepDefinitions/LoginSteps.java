package stepDefinitions;

import io.cucumber.java.en.*;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.DriverManager;


public class LoginSteps{

    WebDriver driver = DriverManager.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Step("I open the login page")
    @Given("I open the login page")
    public void iOpenLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }
    @Step("I enter username {string} and password {string}")
    @When("I enter username {string} and password {string}")
    public void iEnterCredentials(String username, String password) {
        loginPage.login(username,password);
    }
    @Step("I should see the inventory page")
    @Then("I should see the inventory page")
    public void iShouldSeeInventoryPage() {
        assert driver.getTitle().contains("Swag Labs");
        driver.quit();
    }
}
