package pageobjectmodel;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//h2[text()='My Account']")
	WebElement msgHeading;
	@FindBy(xpath = "//div[@id='top-links']//a[text()='Logout']")
	WebElement lnkLogout;
	
	public boolean isMyAccExist()
	{
		try {
			return msgHeading.isDisplayed();
		}catch(Exception e) {
			
			return false;
		}
		
	}
	
	public void logout() {
		
		lnkLogout.click();
	}
}
