package stepdefination;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.MyAccountPage;
import factory.BaseClass;

public class LoginstepDefination {
	WebDriver Driver;
	HomePage hp;
	LoginPage lp;
	MyAccountPage macc;
	
	@Given("The user navigates to login page")
	public void the_user_navigates_to_login_page() {
	     BaseClass.getLogger().info("Got My Accout-->Click on Login");
	     hp = new HomePage(BaseClass.getDriver());
	     hp.myAcc();
	     hp.loginAcc();
	     
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	   BaseClass.getLogger().info("Entering Email & Password For Login");
	   
	   lp = new LoginPage(BaseClass.getDriver());
	   lp.setEmail(email);
	   lp.setPassword(password);
	}

	@When("the user clicks on login button")
	public void the_user_clicks_on_login_button() {
	    lp.setLogin();
	    BaseClass.getLogger().info("Login Sucessfull");
	}

	@Then("the user should be redirected to the MyAccount page")
	public void the_user_should_be_redirected_to_the_my_account_page() {
		macc = new MyAccountPage(BaseClass.getDriver());
		boolean targetpage = macc.isMyAccExist();
		Assert.assertEquals(targetpage, true);
	    
	}

}
