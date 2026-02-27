package api.services;

import api.client.RestClient;
import io.restassured.response.Response;
import payloads.ExplorePagesPayload;

import java.security.PublicKey;

public class ExplorePagesService {

    public static Response getExplorePages() {
        return RestClient.post(
            "/api/v1/pms/explore-pages",
            ExplorePagesPayload.build()
        );
    }

    public static Response getExplorePagesSimple() {
        return RestClient.post(
            "/api/v1/pms/explore-pages",
            ExplorePagesPayload.buildSimple()
        );
    }

    public static Response getExplorePagesNoExperiments() {
        return RestClient.post(
            "/api/v1/pms/explore-pages",
            ExplorePagesPayload.buildNoExperiments()
        );
    }

    public static Response getCustom1(){
        return RestClient.post(
                "/api/v1/pms/explore-pages",
                ExplorePagesPayload.custom1()
        );
    }


    public static String readExplorePagesEndpoint(){
        return RestClient.readEndpoint("/api/v1/pms/explore-pages");
    }
}
