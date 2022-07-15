import model.UserList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class RAtestPostRegisterSuccessful {

    @Test
    @DisplayName("RAtestPostRegisterSuccessful")
    void registerUser() {
        UserList userList = new UserList();
        userList.setName("Mariya");
        userList.setJob("Tester");
        userList.setEmail("eve.holt@reqres.in");
        userList.setPassword("pistol");
        userList.setId("2541");
        given()
                .spec(Spec.request)
                .body(userList)
                .when()
                .post("/register")
                .then()
                .spec(Spec.statusCode)
                .log().status()
                .log().body()
                .body("token", notNullValue())
                .body("id", notNullValue());
    }
}

