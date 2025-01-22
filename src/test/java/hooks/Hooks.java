package hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	
	WebDriver driver;
	Properties p;
	
	@Before
	public void setUp() throws IOException {
		driver= BaseClass.initilizeBrowser();
		p= BaseClass.getProperties();
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	public void addScreenshot(Scenario scenario) {
		//cucumber juint report
		if(scenario.isFailed()) {}
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		
 	}
	
	

}
