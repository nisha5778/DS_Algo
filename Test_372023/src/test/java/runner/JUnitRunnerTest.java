
package runner;

import org.junit.runner.RunWith;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.testng.annotations.Test;


	
@RunWith(Cucumber.class) 
//@RunWith(SpringRunner.class)

	@CucumberOptions(
			
			tags = "@TS_001",
			//tags = "@TS_001 or @TS_003 or @TS_002",
			//tags = "@tagGraph",
			//tags = "@tagGraph5 or @tagGraph4",
			features = {"src/test/resources/features"}, //location of feature files
			//features = {"features"},
			glue= "stepDefinition") //location of step definition files

public class JUnitRunnerTest {

	
}

