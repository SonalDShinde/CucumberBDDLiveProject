package stepdefination;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodel.BasePage;
import pageobjectmodel.HomePage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.MyAccountPage;
import pageobjectmodel.RegistrationPage;
import org.junit.Assert;

public class RegistrationStepDef {
	
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	RegistrationPage rp;
	
	@Given("the user navigates to Register Account page")
	public void user_navigate_to_register_account_page() {
		
		hp= new HomePage(BaseClass.getDriver());
		hp.myAcc();
		hp.registerAcc();
		
	}
	@When("the user enters the details into below fields")
	public void the_user_enters_the_details_into_below_fields(DataTable datatable){
		
		Map<String ,String > datamap = datatable.asMap(String.class,String.class);
		rp= new RegistrationPage(BaseClass.getDriver());
		rp.setFname(datamap.get("firstName"));
		rp.setLname(datamap.get("lastName"));
		rp.setEmail(datamap.get("email"));
		rp.setPhone(datamap.get("telephone"));
		rp.setPassword(datamap.get("password"));
		rp.setConfirmPass(datamap.get("password"));
		
	}
	@When("the user selects Privacy Policy")
	public void the_user_select_privacy_policy() {
		rp.setCheckpolicy();
		
	}
	@When("the user clicks on Continue button")
	public void click_on_continue_button() {
		rp.btnContn();
		
	}
	@Then("the user account should get created successfully")
	public void user_account_should_create_successfully() {
		String cmsg = rp.setMsgConfirm();
		Assert.assertEquals(cmsg, "Your Account Has Been Created!");
	}

}
