package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtoCart {
	
	private static final Object Expproduct = null;
	WebDriver driver = Hooks.driver;
	
	@When("I click on Login button")
	public void i_click_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
	}

	

	@Then("I should land on home page")
	public void i_should_land_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click on the Product name as {string}")
	public void i_click_on_the_Product_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
	    WebElement product = driver.findElement(By.xpath("//button[text()='Add to cart'][1]"));
		product.click();
	}

	@When("I click on the Add to cart Button")
	public void i_click_on_the_Add_to_cart_Button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	    WebElement shopping_cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		shopping_cart.click();
		Thread.sleep(5000);

	}

	@When("I click on Shopping cart link")
	public void i_click_on_Shopping_cart_link() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	    WebElement added_product =driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		String product_name = added_product.getText();
		Thread.sleep(5000);
	}

	@Then("I verify the item on cart page")
	public void i_verify_the_item_on_cart_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		WebElement added_product =driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		String actual_product_name = added_product.getText();

		Assert.assertEquals(actual_product_name, Expproduct);  
		Thread.sleep(5000);
	}
	}





