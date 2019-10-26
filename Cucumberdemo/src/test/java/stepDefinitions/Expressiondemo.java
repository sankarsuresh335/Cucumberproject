package stepDefinitions;

import cucumber.api.java.en.Given;

public class Expressiondemo {
	

@Given("^: I have a (\\d+) laptop$")
public void i_have_a_laptop(int count) throws Throwable {
    System.out.println("lapton item"+ count );
}

@Given("^: I have a (\\d+\\.\\d+) CGP$")
public void i_have_a_CGP(float Marke) throws Throwable {
	
	System.out.println("Mymark"+Marke);
   }

@Given("^:\"([^\"]*)\" is elder to \"([^\"]*)\" and \"([^\"]*)\"$")
public void is_elder_to_and(String name, String name1, String name2) throws Throwable {
	
	System.out.println(name + "is elder to" + name1  + "and" + name2 );
    
}


}
