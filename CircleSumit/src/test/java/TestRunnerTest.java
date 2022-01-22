import org.junit.runner.RunWith;

//import com.cucumber.listener.ExtentCucumberFormatter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications=true,monochrome = true,dryRun=false,
features =
{"src/test/java/featureLogin/" },
		   glue = {"stepDefinitions"} )    

public class TestRunnerTest {

 

}