import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class RAtestDeleteDelete {

    @Test
    @DisplayName("RAtestDeleteDelete")
    void deleteUsers() {
        given()
                .spec(Spec.request)
                .pathParam("id", 2)
                .when()
                .delete("/users/{id}")
                .then()
                .spec(Spec.deleteCode)
                .log().status();
    }
}
