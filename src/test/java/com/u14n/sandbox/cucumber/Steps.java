package com.u14n.sandbox.cucumber;

import static org.junit.Assert.fail;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Klaus Wenger
 *
 */
public class Steps {
    /**
     * @param cukes
     * @throws Throwable
     */
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
    /**
     * @param hour 
     * @throws Throwable
     */
    @SuppressWarnings("nls")
    @When("^I wait (\\d+) hour$")
    public void I_wait_hour(int hour) throws Throwable {
//        fail("Undefined");
    }
    /**
     * @throws Throwable
     */
    @SuppressWarnings("nls")
    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
//        fail("Undefined");
    }
}
