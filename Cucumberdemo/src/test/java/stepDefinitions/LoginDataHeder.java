package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginDataHeder {

	WebDriver driver;

	@Given("^:	User is on the login pages stage to satr the method$")
	public void user_is_on_the_login_pages_stage_to_satr_the_method() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();

	}

	@When("^:  The user enter the valid to the valid box to crdatital$")
	public void the_user_enter_the_valid_to_the_valid_box_to_crdatital(DataTable datatable) throws Throwable {

		List<Map<String, String>> Cradanitial = datatable.asMaps(String.class, String.class);

		String username = Cradanitial.get(0).get("username");

		String password = Cradanitial.get(0).get("password");

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}

	@When("^:  click on the login page to go main home page to window$")
	public void click_on_the_login_page_to_go_main_home_page_to_window() throws Throwable {

		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^: the user should be navigated to home page with tittalpage and tital name$")
	public void the_user_should_be_navigated_to_home_page_with_tittalpage_and_tital_name() throws Throwable {

		boolean status = driver.findElement(By.linkText("Welcome Admin")).isDisplayed();

		String tittale = driver.getTitle();

		System.out.println(tittale);

		Assert.assertTrue(status);

		System.out.println("contindion is ture" + status);

	}

}
