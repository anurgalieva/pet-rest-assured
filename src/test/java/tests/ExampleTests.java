package tests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ExampleTests {

    //сделать запрос к урлу https://selenoid.autotests.cloud/status

    @Test
    void checkTotal() {
        given()
                .when()
                .get("https://selenoid.autotests.cloud/status")
                .then()
                .statusCode(200);

    }

}
