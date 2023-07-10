package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class TestdefRunner {
	@RunWith(Cucumber.class)

	@CucumberOptions(monochrome = true, plugin = { "pretty","html:target/html-cucumber",
			"json:target/cucumber.json" }, features = "src/test/java/features", glue = "stepDefs", tags = {
					"@Login or @AddToCart" })

	public class TestRunner {

	}

}
