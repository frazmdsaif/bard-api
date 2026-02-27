package api.services;

import api.client.RestClient;
import io.restassured.response.Response;
import config.ConfigReader;
import static io.restassured.RestAssured.given;

public class ExperimentCloneService {

    public static Response cloneExperiment(String queryKey, Integer experimentId) {
        String endpoint = String.format("/api/v1/pms/explore-pages/%s/experiments/%d/clone", queryKey, experimentId);
        String cookie = ConfigReader.get("session.cookie");
        
        io.restassured.specification.RequestSpecification request = given()
                .baseUri(ConfigReader.get("base.url"))
                .header("accept", "*/*")
                .header("accept-language", "en-GB,en-US;q=0.9,en;q=0.8")
                .header("cache-control", "no-cache")
                .header("content-length", "0")
                .header("origin", "https://bard-pms-dev.elivaas.com")
                .header("pragma", "no-cache")
                .header("priority", "u=1, i")
                .header("referer", "https://bard-pms-dev.elivaas.com/swagger-ui/index.html")
                .header("sec-ch-ua", "\"Not:A-Brand\";v=\"99\", \"Google Chrome\";v=\"145\", \"Chromium\";v=\"145\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"macOS\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/145.0.0.0 Safari/537.36")
                .header("Authorization", "Bearer " + ConfigReader.get("auth.token"));
        
        if (cookie != null && !cookie.isEmpty()) {
            request = request.header("Cookie", cookie);
        }
        
        return request
                .when()
                .post(endpoint)
                .then()
                .log().all()
                .extract()
                .response();
    }

    public static Response cloneExperimentSimple(String queryKey, Integer experimentId) {
        String endpoint = String.format("/api/v1/pms/explore-pages/%s/experiments/%d/clone", queryKey, experimentId);
        return RestClient.post(endpoint, "");
    }

    public static String readExperimentCloneEndpoint(String queryKey, Integer experimentId) {
        String endpoint = String.format("/api/v1/pms/explore-pages/%s/experiments/%d/clone", queryKey, experimentId);
        return RestClient.readEndpoint(endpoint);
    }
}
