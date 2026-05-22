package stepdefination;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
import junit.framework.Assert;

	public class RegStepDefinition {

	WebDriver driver;

	@Given("on the registration")
	public void on_the_registration() {
		
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	}

	@When("Enter admin and admin@{int}")
	public void enter_admin_and_admin(Integer int1) {
		
	WebElement emailTextBox=driver.findElement(By.name("email"));
	WebElement PasswordTextBox=driver.findElement(By.name("password"));
	WebElement loginbutton=driver.findElement(By.xpath("//span[text()='login']"));
		
	emailTextBox.sendKeys("admin");
	PasswordTextBox.sendKeys("admin@123");
	loginbutton.click();
		
	}
	@Then("user registration successfully")
	public void user_registration_successfully() {
		
		String fbTittle=driver.getTitle();

		Assert.assertEquals(fbTittle, "FACEBOOK");

		driver.quit();
		
	}

	@When("Enter admin2 and admin@{int}")
	public void enter_admin2_and_admin(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	}



