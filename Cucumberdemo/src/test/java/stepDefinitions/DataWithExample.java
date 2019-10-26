package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataWithExample {
	
	WebDriver driver;
	
	@Given("^: processed to login page$")
	public void processed_to_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();

		
		
	    	}

	@When("^: user enter the logo  cradential \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_the_logo_cradential_and(String username, String password) throws Throwable {
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

		
		
	    
	}

	@When("^: to click the login button$")
	public void to_click_the_login_button() throws Throwable {
		
		
		driver.findElement(By.id("btnLogin")).click();
	    	}



}
