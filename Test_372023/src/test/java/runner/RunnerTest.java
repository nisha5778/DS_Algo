
package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;

	
@RunWith(Cucumber.class) 
//Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/testResult1.html", "json:target/testResult2.json"},
			//reporting purpose
			//plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
			//plugin = {"json:target/testResult2.json"},
			//dryRun = false,
			monochrome=false,  //console output color
			//tags = "@tagGraph1 or @tagGraph2 or @tagGraph3", //tags from feature file
			//tags = "@Tag1",
			//tags = "@TS_001 or @TS_003 or @TS_002",
			//tags = "@tagGraph",
			//tags = "@tagGraph5 or @tagGraph4",
			features = {"src/test/resources/features"}, //location of feature files
			//features = {"features"},
			glue= "stepDefinition") //location of step definition files

/*	public class TestRunner {
	
}
*/
	public class RunnerTest extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }
}






