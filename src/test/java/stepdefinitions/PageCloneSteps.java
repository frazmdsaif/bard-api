package stepdefinitions;

import api.services.PageCloneService;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static org.junit.Assert.*;

public class PageCloneSteps {

    Response response;

    @Given("User have page clone API")
    public void getAPI() {
        String endpoint = PageCloneService.readPageCloneEndpoint("villa-in-goa");
    }

    @When("User clone page with queryKey {string}")
    public void clonePage(String queryKey) {
        response = PageCloneService.clonePageSimple(queryKey);
    }

    @Then("Page clone status should be {int}")
    public void validateStatus(int code) {
        assertEquals(code, response.getStatusCode());
    }

    @Then("Validate page clone response contains data")
    public void validateCloneResponse() {
        String responseBody = response.getBody().asString();
        assertNotNull("Response body should not be null", responseBody);
        assertTrue("Response should contain data", responseBody.length() > 0);
    }
}
