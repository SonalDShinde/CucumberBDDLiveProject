package factory;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.apache.commons.lang3.RandomStringUtils;


public class BaseClass {

	static WebDriver driver;
	static Properties p;
	static Logger logger;
	
	
	public static WebDriver initilizeBrowser() throws IOException {
		
		p=getProperties();
		String enviromnemt = p.getProperty("execution_env");
		String browser = p.getProperty("browser").toLowerCase();
		String os = p.getProperty("os").toLowerCase();
		
		if(enviromnemt.equalsIgnoreCase("remote")) {
			
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			
			switch(os) {
			case "windows":
				desiredCapabilities.setPlatform(Platform.WINDOWS);
				break;
			case "mac":
				desiredCapabilities.setPlatform(Platform.MAC);
				break;
			case "linux" :
				desiredCapabilities.setPlatform(Platform.LINUX);
				break;
			default:
				System.out.println("No Operating system matching");
				return null;
			}
			switch(browser) {
			case "chrome":
				desiredCapabilities.setBrowserName("chrome");
				break;
			case "firefox":
				desiredCapabilities.setBrowserName("firefox");
				break;
			case "edge":
				desiredCapabilities.setBrowserName("edge");
				break;
			default:
				System.out.println("No matching browser found");
				return null;
			}
			driver = new RemoteWebDriver(new URL(""), desiredCapabilities);
		}
		
		else if(enviromnemt.equalsIgnoreCase("local")) {
			
			switch(browser.toLowerCase()) {
			case "chrome":
				driver=new ChromeDriver();
				break;
			case "edge":
				driver=new EdgeDriver();
				break;
			case "firefox":
				driver=new FirefoxDriver();
				break;
			default:
				System.out.println("No browser found");
				driver=null;
				
			
			}
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		return driver;
		
		
	}
	
	public static WebDriver getDriver() {
		
		return driver;
	}
	
	public static Properties getProperties() throws IOException {
		FileReader file = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		p = new Properties();
		p.load(file);
		return p;
	}
	
	public static Logger getLogger() {
		
		logger= LogManager.getLogger();
		
		return logger;
		
	}
	
	public static String randomString() {
		
		String generatedString= RandomStringUtils.randomAlphabetic(10);
		return generatedString;
	}
	
	public static String randomNumber() {
		String generateNumber = RandomStringUtils.randomNumeric(10);
		return generateNumber;
	}
	
	public static String randomAlhaNumeric() {
		
		String str = RandomStringUtils.randomAlphabetic(10);
		String num = RandomStringUtils.randomNumeric(10);
		return str+num;
	}
}
