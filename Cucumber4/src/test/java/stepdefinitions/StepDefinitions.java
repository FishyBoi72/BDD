package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    private String today;
    private String actualAnswer;

    // Implementing the missing step definition for "today is Friday"
    @Given("today is Friday")
    public void today_is_friday() {
        this.today = "Friday";
    }

    // Implementing the missing step definition for "today is Monday"
    @Given("today is Monday")
    public void today_is_monday() {
        this.today = "Monday";
    }

    // Already existing step definition for asking if it’s Friday
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        this.actualAnswer = isItFriday(today);
    }

    // Already existing step definition to verify the answer
    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    // Helper method to determine if today is Friday
    private String isItFriday(String today) {
        return "Friday".equals(today) ? "Yes" : "No";
    }
}
