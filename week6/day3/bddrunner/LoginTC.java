package bddrunner;

import org.testng.annotations.DataProvider;

import base.CommonMethods;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features/login.feature"},glue = {"pages"},dryRun = false,publish = true,monochrome = true)


public class LoginTC extends CommonMethods{
	 
	 @DataProvider(parallel=true)
	    public Object[][] scenarios() {
	       return super.scenarios();
	    }
}
