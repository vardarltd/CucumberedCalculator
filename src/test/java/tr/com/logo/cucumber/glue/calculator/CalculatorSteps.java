/**
 * Copyright 2015 Vardar Ltd
 * 
 */
package tr.com.logo.cucumber.glue.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tr.com.logo.cucumber.training.Calculator;

/**
 * @author umitvardar
 *
 */
public class CalculatorSteps {
	
	Calculator calculator = new Calculator();
	long result = 0;
	
	@Given("^Calculator is available$") 
	public void calculatoeIsAvailable() {
	   assertNotNull(calculator);
	};

	@When("^someone entered (\\d+) and (\\d+)$")
	public void someoneEntered(Integer arg1, Integer arg2){
	    // Write code here that turns the phrase above into concrete actions
	    result = calculator.multiply(arg1,arg2);
	};

	@Then("^result must be (\\d+)$") 
	public void resultMustBe(Integer arg1){
	    assertEquals(arg1.longValue(), result);
	};
	
	@When("^someone tries to multiply  (\\d+) with  (\\d+)$")
	public void someoneTriestomultiply (Integer arg1, Integer arg2) {
	    // Write code here that turns the phrase above into concrete actions
		result = calculator.multiply(arg1,arg2);
	};
	
	@Then("^check (\\d+) is the output$") 
	public void checkTheOutput(Integer arg1){
	    assertEquals(arg1.longValue(), result);
	};

}
