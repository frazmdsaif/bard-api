package stepdefinitions;

import api.services.SlugCloneService;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static org.junit.Assert.*;

public class SlugCloneSteps {

    Response response;

    @Given("User have slug clone API")
    public void getAPI() {
        String endpoint = SlugCloneService.readSlugCloneEndpoint("villa-in-goa");
    }

    @When("User clone slug with slug {string}")
    public void cloneSlug(String slug) {
        response = SlugCloneService.cloneSlugSimple(slug);
    }

    @Then("Slug clone status should be {int}")
    public void validateStatus(int code) {
        assertEquals(code, response.getStatusCode());
    }

    @Then("Validate slug clone response contains data")
    public void validateCloneResponse() {
        String responseBody = response.getBody().asString();
        assertNotNull("Response body should not be null", responseBody);
        assertTrue("Response should contain data", responseBody.length() > 0);
    }
}
