package stepdefination;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodel.HomePage;
import pageobjectmodel.ProductPage;
import pageobjectmodel.ShoppingCartPage;

public class AddCartStepDefination {
	
	HomePage hp;
	ProductPage pp;
	ShoppingCartPage scp;
	
	
	
	@Given("I am on the OpenCart homepage")
	public void i_am_on_the_open_cart_homepage() {
		hp = new HomePage(BaseClass.getDriver());
	}

	@Given("I search for {string}")
	public void i_search_for(String productName) {
		hp.searchBar(productName);
		hp.searchproductbtn();

	}

	@When("I add the product {string} to the cart")
	public void i_add_the_product_to_the_cart(String productName) {
		pp = new ProductPage(BaseClass.getDriver());
		pp.addmackBook(productName);

	}

	@Then("the cart should display {string}")
	public void the_cart_should_display(String expectedCount) {
	   scp = new ShoppingCartPage(BaseClass.getDriver());
	   scp.cartBntClick();
	   String actualCount = scp.getQuantityCount();
	  // Assert.assertEquals(expectedCount, actualCount);
	  // Assert.assertEquals(expectedCount, actualCount);
	}



}
