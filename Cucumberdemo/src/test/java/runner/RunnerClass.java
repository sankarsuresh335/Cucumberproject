package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="Featurefile",

		glue= {"stepDefinitions","hookesproject"},
		
		dryRun=false,
		
		monochrome=true,

		plugin={"html:report/WebReport","json:report/jsonreport.json"},

		tags= {"@Hooks"}

)

public class RunnerClass {

	// feature file+ stepdefination

}
