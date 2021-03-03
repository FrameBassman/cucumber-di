package tech.romashov.steps;

import io.cucumber.java.en.Given;
import tech.romashov.ApplicationContext;

public class StepDefinitions {
    private ApplicationContext context;

    public StepDefinitions(ApplicationContext context) {
        this.context = context;
    }

    @Given("today is Sunday")
    public void today_is_Sunday() {
        context.setWeather("Nope");
    }
}
