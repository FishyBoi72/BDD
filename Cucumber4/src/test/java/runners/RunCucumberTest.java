package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  // Path to your feature files
        glue = "stepdefinitions",                  // Package where step definitions are located
        plugin = {"pretty"}
)
public class RunCucumberTest {
}
