package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( //features = {".//src/test/java/features/"}, 
					features= { ".//src/test/java/features/Login.feature"},
								glue = {"stepdefination","hooks"},
								plugin= {
										"pretty", "html:reports/myreport.html",   
										"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
										"rerun:target/rerun.txt"},	
								publish = true //To publish report in cucumber server
								
		)
public class TestRunner {

}
