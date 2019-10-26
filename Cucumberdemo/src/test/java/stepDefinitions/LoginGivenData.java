package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginGivenData {

	WebDriver driver;

	@Given("^:	User is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();

	}

	@When("^:  The user enter the valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enter_the_valid_and(String username, String password) throws Throwable {

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}

	@When("^:  click on the login page to go$")
	public void click_on_the_login_page_to_go() throws Throwable {

		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^: the user should be navigated to home page with tittalpage$")
	public void the_user_should_be_navigated_to_home_page_with_tittalpage() throws Throwable {

		boolean status = driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
		
		String tittale=driver.getTitle();
		
		System.out.println(tittale);

		Assert.assertTrue(status);

		System.out.println("contindion is ture" + status);

	}

}
