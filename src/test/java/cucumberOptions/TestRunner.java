package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinations", tags="@RegTest",strict=false,monochrome = false,dryRun=false,
		plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"}
			)	
public class TestRunner {

}
