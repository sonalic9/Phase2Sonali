package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstep {
	
	WebDriver driver = Hooks.driver;
	

	@Given("I have launched the application")
	public void i_have_launched_the_application() throws InterruptedException {
			driver.get("https://www.saucedemo.com");
		Thread.sleep(5000);

	}

@When("I enter username as {string}")
public void i_enter_username_as(String usernameValue)  throws InterruptedException {
  	
	WebElement userName = driver.findElement(By.xpath("//input[@name='user-name']"));
	userName.sendKeys(usernameValue);
	Thread.sleep(5000);
}

@When("I enter password as {string}")
public void i_enter_password_as(String passwordvalue) throws InterruptedException {
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys(passwordvalue);
	Thread.sleep(5000);
}

@When("Click on login")
public void click_on_login() {
	WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
	loginButton.click();
}



@Then("I should be able to login successfully")
public void i_should_be_able_to_login_successfully() {
	String expected_url = "https://www.saucedemo.com/inventory.html";
	String actual_url = driver.getCurrentUrl();
	Assert.assertEquals(expected_url, actual_url);
	

}

@Then("I should get error message {string}")
public void i_should_get_error_message(String ExpError) throws InterruptedException  {
	WebElement error = driver.findElement(By.xpath("//*[@data-test='error']"));
		Thread.sleep(5000);
	String ActError = error.getText();
	Assert.assertEquals(ActError, ExpError);
}
   
}





