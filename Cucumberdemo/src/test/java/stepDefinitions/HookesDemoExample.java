package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HookesDemoExample {
	
	@Given("^thonse has infinty stone$")
	public void thonse_has_infinty_stone() throws Throwable {
		
		System.out.println("thonse has infinty stone");
	   }

	@When("^thonse sanp his finger$")
	public void thonse_sanp_his_finger() throws Throwable {
		
		System.out.println("thonse sanp his finger");
	    }

	@When("^thonse killed all the avanger$")
	public void thonse_killed_all_the_avanger() throws Throwable {
		
		System.out.println("thonse killed all the avanger");
	    
	}

	@Then("^thonse destoyed half the world$")
	public void thonse_destoyed_half_the_world() throws Throwable {
		
		System.out.println("thonse destoyed half the world");
	    
	}



}
