package stepdefinitions;

import api.services.ExplorePagesService;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static org.junit.Assert.*;

public class ExplorePagesSteps {

    Response response;

    @Given("User have explore pages API")
    public void getAPI(){
        String a=ExplorePagesService.readExplorePagesEndpoint();
    }

    @When("User hits explore pages API with {string} payload")
    public void callAPI(String payloadType) {
        switch(payloadType.toLowerCase()) {
            case "full":
                response = ExplorePagesService.getExplorePages();
                break;
            case "simple":
                response = ExplorePagesService.getExplorePagesSimple();
                break;
            case "noexperiments":
                response = ExplorePagesService.getExplorePagesNoExperiments();
                break;
            case "custom1":
                response = ExplorePagesService.getCustom1();
                break;
            default:
                response = ExplorePagesService.getExplorePages();
        }
    }

    @Then("Explore pages status should be {int}")
    public void validateStatus(int code) {
        assertEquals(code, response.getStatusCode());
    }
}
