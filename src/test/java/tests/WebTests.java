package tests;

import org.junit.Test;
import stepDefinitions.LoginSteps;

public class WebTests {
@Test
    public void loginAndCheckoutTest() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.iOpenLoginPage();
    }
}
