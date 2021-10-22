package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// features tells cucumber where all feature files are located
		// glue tells cucumber where all stepDef classes are located
		// tags we will run one scenario, or multiple scenarios, or entire feature
		// dryRun checks if there are any missing steps in StepDefiniton class
		//for each scenario steps in feature file
		// monochrome will make console readable
		//strict will mark scenario failed if there are any pending steps. 
		// plugin will be used for generating a readable report
		features = "classpath:features",
		glue = "stepDefinitions", 
		tags = "@smokeTest", 
		dryRun = false,
		monochrome =true,
		strict = true,
		plugin = {"pretty"}
		
		)
public class TestRunner {

}