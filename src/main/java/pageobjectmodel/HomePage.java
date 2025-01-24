package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage  {

	public HomePage(WebDriver driver) {
		
		super(driver);	
}
	
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement lnkLogin;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement searchBar;
	
	@FindBy(xpath = "//i[@class='fa fa-search']")
	WebElement searchBtn;
	
	public void myAcc() {
		lnkMyaccount.click();
	}
	
	public void loginAcc() {
		lnkLogin.click();
	}
	
	public void registerAcc() {
		
		lnkRegister.click();
	}
	
	public void searchBar(String productName) {
		searchBar.clear();
		searchBar.sendKeys(productName);
	}
	
	public void searchproductbtn() {
		searchBtn.click();
	}
	
	
}
