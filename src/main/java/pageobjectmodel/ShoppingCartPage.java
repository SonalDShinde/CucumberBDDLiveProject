package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends HomePage {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
	WebElement cartBtn;
	
    @FindBy(css = "span#cart-total")
	WebElement quantity;

	
	public String getQuantityCount() {
		
		return quantity.getText();
	}
	
	public void cartBntClick() {
		cartBtn.click();
	}
}
