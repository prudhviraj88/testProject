package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/java/testFeatures/Test1.feature",
		glue={"stepDefinition"},
		plugin={"pretty","html:target/Destination"}
		//tags={""}
)

public class Runner 
{
	

}
