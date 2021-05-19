package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java/features/LaunchGoogle.feature",
glue="StepDefination"
//tags = {"@Functional"}
)

public class TestRunner {
	

}
