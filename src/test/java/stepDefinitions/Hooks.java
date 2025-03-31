package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverManager;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("Starting scenario...");
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
        System.out.println("Finished scenario — driver closed.");
    }
}
