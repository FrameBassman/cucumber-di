package tech.romashov.steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tech.romashov.ApplicationContext;

public class FridayStepsDefinition {
    private ApplicationContext context;

    public FridayStepsDefinition(ApplicationContext context) {
        this.context = context;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        System.out.println("nice");
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        Assert.assertEquals("Nope", context.getWeather());
    }
}
