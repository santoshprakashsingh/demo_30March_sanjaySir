package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class MyntraLoginSteps {
	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh Softwares\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications", "--start-fullscreen");
		driver = new ChromeDriver(options);
	}
	
	@Given("User is on Myntra login page")
	public void user_is_on_Myntra_login_page() {
		
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("When User enter the Username and Password in Myntra")
	public void when_User_enter_the_Username_and_Password_in_Myntra() {
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
	}

	@Then("User click on the submit button in Myntra")
	public void user_click_on_the_submit_button_in_Myntra() {
	   driver.findElement(By.xpath("//button[@class='login-login-button']")).click();
	}

	@Then("User is able to see Myntra page")
	public void user_is_able_to_see_Myntra_page() {
		Assert.assertEquals(driver.getTitle(), "Login");
		System.out.println("Test Completed Successfully");
		
	}
	
	@Given("User  on Myntra login page")
	public void user_on_Myntra_login_page() {

		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("When User enter  {string} and {string}")
	public void when_User_enter_and(String username, String password) {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("User click  submit button in Myntra")
	public void user_click_submit_button_in_Myntra() {
		driver.findElement(By.xpath("//button[@class='login-login-button']")).click();
	}

	@Then("User is able to view Myntra page")
	public void user_is_able_to_view_Myntra_page() {
		Assert.assertEquals(driver.getTitle(), "Login");
		System.out.println("Test Completed Successfully");
		
	}
	
	@When("When User enter  username and password")
	public void when_User_enter_username_and_password(DataTable dataTable) {
	    
		List<List<String>> data=dataTable.asLists();
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}

}
