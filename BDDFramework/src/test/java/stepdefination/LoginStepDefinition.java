package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;

@Given("the user is on the FACEBOOK login page")
public void the_user_is_on_the_FACEBOOK_login_page() {
	
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
    // Write code here that turns the phrase above into concrete actions
	System.out.println(" the User is on the login page");
}

@When("the user enters a valid user name and password and clicks on the login button")
public void the_user_enters_a_valid_user_name_and_password_and_clicks_on_the_login_button() {
	
	WebElement emailTextBox=driver.findElement(By.name("email"));
	WebElement PasswordTextBox=driver.findElement(By.name("password"));
	WebElement loginbutton=driver.findElement(By.xpath("//span[text()='login"));
	
			emailTextBox.sendKeys("admin");
			PasswordTextBox.sendKeys("admin@123");
			loginbutton.click();
			
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User enters details");
}

@Then("the user should be redirected to the home page of FACEBOOK")
public void the_user_should_be_redirected_to_the_home_page_of_FACEBOOK() {
	
	
String fbTittle=driver.getTitle();

Assert.assertEquals(fbTittle, "FACEBOOK");

driver.quit();
	
	
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User redirected to the home page");
}



}
