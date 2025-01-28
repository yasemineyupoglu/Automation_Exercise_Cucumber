package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",
                "utilities.formatter.PrettyReports:target/cucumber-pretty-reports"},
        features = "src/test/resources/features", //test senaryolarının bulunduğu klasör
        glue = "stepdefinitions", //test adımlarının bulunduğu klasör
        tags = "@product_quantity_in_cart", //test senaryolarının bulunduğu tag
        dryRun = false
)

public class Runner {
}
