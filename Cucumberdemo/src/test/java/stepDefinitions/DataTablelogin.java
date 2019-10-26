package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTablelogin {

	WebDriver driver;

	@Given("^:	User is on the login pages stage$")
	public void user_is_on_the_login_pages_stage() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();

	}

	@When("^:  The user enter the valid to the valid box$")
	public void the_user_enter_the_valid_to_the_valid_box(DataTable datatable) throws Throwable {

		List<String> cradatital = datatable.asList(String.class);

		String username = cradatital.get(0);

		String password = cradatital.get(1);

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}

}