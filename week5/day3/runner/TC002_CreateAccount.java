package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/featuresSF/CreateAccount.feature"},glue =  {"stepsSF"},dryRun = false, monochrome = true, publish = true)


public class TC002_CreateAccount extends AbstractTestNGCucumberTests{

}
