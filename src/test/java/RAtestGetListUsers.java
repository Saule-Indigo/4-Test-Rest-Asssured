import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RAtestGetListUsers {


    @Test
    @DisplayName("RAGetUserTests")
    void checkTotalUsers() {
        given()
                .spec(Spec.request)
                .get("/users?page=2")
                .then()
                .spec(Spec.statusCode)
                .body("total", equalTo(12))
                .log().body()
                .log().status();
    }
}