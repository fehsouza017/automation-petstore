package qa.io.fsouza.automation.petstore.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import qa.io.fsouza.automation.petstore.config.SpringIntegrationTest;

@RunWith(Cucumber.class)

@CucumberOptions(tags = "@upload-image-pet",

		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json" },
		monochrome = true,
		features = "src/test/resources",
		snippets = SnippetType.CAMELCASE, glue = {
				"qa.io.fsouza.automation.petstore.steps",
				"qa.io.fsouza.automation.petstore.config" })
public class RunCucumberTest extends SpringIntegrationTest {
@BeforeClass
public static void setup() {

}
}
