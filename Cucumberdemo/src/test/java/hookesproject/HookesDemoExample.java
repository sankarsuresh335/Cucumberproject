package hookesproject;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookesDemoExample {
	
	
	@Before
	public void beforethone() {
		
		System.out.println("thones collecting stone");
		
	}
	
	@After
	public void afterthons () {
		
		System.out.println("thones going to garden");
		
	}

}
