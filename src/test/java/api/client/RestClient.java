package api.client;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import config.ConfigReader;

public class RestClient {

    public static Response post(String endpoint, String payload) {
        return given()
                .baseUri(ConfigReader.get("base.url"))
                .header("accept", "*/*")
                .header("accept-language", "en-GB,en-US;q=0.9,en;q=0.8")
                .header("content-type", "application/json")
                .header("origin", "https://bard-pms-dev.elivaas.com")
                .header("priority", "u=1, i")
                .header("referer", "https://bard-pms-dev.elivaas.com/swagger-ui/index.html")
                .header("sec-ch-ua", "\"Not(A:Brand\";v=\"8\", \"Chromium\";v=\"144\", \"Google Chrome\";v=\"144\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-fetch-mode", "cors")
                .header("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/144.0.0.0 Safari/537.36")
                .header("Authorization", "Bearer " + ConfigReader.get("auth.token"))
                .body(payload)
                .when()
                .post(endpoint)
                .then()

                .extract()
                .response();
    }

    public static Response get(String endpoint,String payload){
        return given().get();
    }
    
    public static String readEndpoint(String endpoint) {
        return ConfigReader.get("base.url") + endpoint;
    }
}
