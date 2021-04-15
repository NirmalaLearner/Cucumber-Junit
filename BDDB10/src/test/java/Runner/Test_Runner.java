package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Login/Login.feature"},glue= {"Step_defnitions"}, dryRun = true,
monochrome = true, tags= "@Login",strict = true)


public class Test_Runner {
	
}
