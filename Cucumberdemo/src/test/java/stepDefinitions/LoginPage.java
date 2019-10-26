package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPage {
	
	WebDriver driver;

	@Given("^:	User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		

	}

	@When("^:  The user enter the valid username and Password$")
	public void the_user_enter_the_valid_username_and_Password() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin ");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
	}

	@When("^:  click on the login page$")
	public void click_on_the_login_page() throws Throwable {
		
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^: the user should be navigated to home page$")
	public void the_user_should_be_navigated_to_home_page() throws Throwable {
		
		boolean status =driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
		
		Assert.assertTrue(status);
		
		System.out.println("contindion is ture"+status);
		
	}

}
