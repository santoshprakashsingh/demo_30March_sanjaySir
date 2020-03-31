package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh Softwares\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Given("USer is on login feature")
	public void user_is_on_login_feature() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("When User enter the Username and Password")
	public void when_User_enter_the_Username_and_Password() {
		driver.findElement(By.name("login")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("abc123");
	}

	@Then("User click on the submit button")
	public void user_click_on_the_submit_button() {
	    driver.findElement(By.name("proceed")).click();
	}
	@Then("User is able to see Rediffmail page")
	public void user_is_able_to_see_Rediffmail_page() {
		Assert.assertEquals(driver.getTitle(), "Rediffmail");
		System.out.println("Test Completed Successfully");
	    
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}

}
