package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "html:target/cucumber-reports.html"},
        monochrome = true,
        tags = "@test"
)
public class WebRunner {
}