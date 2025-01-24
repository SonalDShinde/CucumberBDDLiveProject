package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	//@FindBy(xpath = "div[@id='content']div[1]div[1]div[2]div[2]button[1]")
	@FindBy(xpath = "//button[contains(@onclick, 'cart.add')]")
	WebElement MacBookAddToCartBtn;
	
	
	public void addmackBook(String productName) {
		MacBookAddToCartBtn.click();
		
	}
	
	
}
