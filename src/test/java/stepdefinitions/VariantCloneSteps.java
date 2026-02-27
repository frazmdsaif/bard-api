package stepdefinitions;

import api.services.VariantCloneService;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static org.junit.Assert.*;

public class VariantCloneSteps {

    Response response;

    @Given("User have variant clone API")
    public void getAPI() {
        String endpoint = VariantCloneService.readCloneEndpoint("villa-in-gao", 35);
    }


    @When("User clone variant with queryKey {string} and variantId {int}")
    public void cloneVariant(String queryKey, Integer variantId) {
        response = VariantCloneService.cloneVariantSimple(queryKey, variantId);
    }

    @Then("Variant clone status should be {int}")
    public void validateStatus(int code) {
        assertEquals(code, response.getStatusCode());
    }

    @Then("Validate clone response contains variant data")
    public void validateCloneResponse() {
        String responseBody = response.getBody().asString();
        assertNotNull("Response body should not be null", responseBody);
        assertTrue("Response should contain variant data", responseBody.length() > 0);
    }
}
