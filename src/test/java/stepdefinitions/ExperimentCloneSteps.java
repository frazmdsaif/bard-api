package stepdefinitions;

import api.services.ExperimentCloneService;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static org.junit.Assert.*;

public class ExperimentCloneSteps {

    Response response;

    @Given("User have experiment clone API")
    public void getAPI() {
        String endpoint = ExperimentCloneService.readExperimentCloneEndpoint("villa-in-goa", 35);
    }

    @When("User clone experiment with queryKey {string} and experimentId {int}")
    public void cloneExperiment(String queryKey, Integer experimentId) {
        response = ExperimentCloneService.cloneExperimentSimple(queryKey, experimentId);
    }

    @Then("Experiment clone status should be {int}")
    public void validateStatus(int code) {
        assertEquals(code, response.getStatusCode());
    }

    @Then("Validate experiment clone response contains data")
    public void validateCloneResponse() {
        String responseBody = response.getBody().asString();
        assertNotNull("Response body should not be null", responseBody);
        assertTrue("Response should contain data", responseBody.length() > 0);
    }
}
