package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/skeleton/casestudy4.feature"},
			glue="skeleton",
			plugin="html:target/htmlreport")
			//tags={"@smoke"})

	public class RunnerClass {

}
