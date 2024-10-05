package Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/Orders.feature",
        glue = "stepsDefinition",
        monochrome = false,

        plugin = { "pretty", "html:target/cucumber-reports" }



)

public class OrdersRunnerTests {
}
