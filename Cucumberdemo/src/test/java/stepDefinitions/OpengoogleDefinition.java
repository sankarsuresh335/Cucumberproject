package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpengoogleDefinition {
	
	RemoteWebDriver driver;

	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		
		
	}

	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String searchterm) throws Throwable {
		
		driver.findElement(By.name("q")).sendKeys(searchterm);
		
	}

	@When("^enters the return key$")
	public void enters_the_return_key() throws Throwable {

		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^the user should see the serch result$")
	public void the_user_should_see_the_serch_result() throws Throwable {
		
		Boolean status=driver.findElement(By.partialLinkText("san")).isDisplayed();
		
		if(status) {
			
			System.out.println(" serch teram dispaly");
		}

	}

}
