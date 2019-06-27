package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber",
				"json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"},
		features="src/test/resources/features",
		glue="steps",
		tags="@goo",
		dryRun=false
)
public class CukesRunner {

}
