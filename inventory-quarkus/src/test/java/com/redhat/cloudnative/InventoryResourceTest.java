package com.redhat.cloudnative;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
@QuarkusTestResource(H2DatabaseTestResource.class)
@TestProfile(H2Profile.class)
public class InventoryResourceTest {

    @Test
    public void should_return_quantity_from_inventory() {
        given()
            .pathParam("itemId", 329299)
        .when()
            .get("/api/inventory/{itemId}")
        .then()
            .statusCode(200)
            .body("quantity", is(35));
    }

}
