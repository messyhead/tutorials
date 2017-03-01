package feature.speaking.clock;

import uk.gov.ros.speaking.clock.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SpeakingClockSteps {

    SpeakingClockEngine engine;


    @Given("^the time is (\\d+).(\\d+)$")
    public void the_time_is(int hour, int minute) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I ask the clock the time$")
    public void i_ask_the_clock_the_time() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the clock says \"([^\"]*)\"$")
    public void the_clock_says(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
