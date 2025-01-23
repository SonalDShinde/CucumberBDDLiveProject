package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement telephone;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement confirmpass;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement checkPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuebtn;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirm;
	
	
	public void setFname(String fname) {
		txtFirstname.sendKeys(fname);
	}
	
	public void setLname(String lname) {
		
		txtLastName.sendKeys(lname);
	}
	
	public void setPhone(String phone) {
		telephone.sendKeys(phone);
	}
	
	public void setEmail(String email) {
		txtemail.sendKeys(email);
		
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void setConfirmPass(String cpass) {
		confirmpass.sendKeys(cpass);
	}
	
	public void setCheckpolicy() {
		checkPolicy.click();
		
	}
	
	public void btnContn() {
		continuebtn.click();
		
	}
	public String setMsgConfirm() {
		
		try {
		return(msgConfirm.getText());
		}catch(Exception e){
			return(e.getMessage());
		}
	}
}
