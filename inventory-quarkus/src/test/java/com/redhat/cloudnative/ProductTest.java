package com.redhat.cloudnative;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class ProductTest {

    @Test
    @Disabled
    public void should_return_quantity_for_all_products() {
        given()
            .header("ike-session-id", "live_debug")
        .when()
            .get("gateway:8080/api/products")
        .then()
            .statusCode(200)
            .body("quantity", is(35));
    }

}
