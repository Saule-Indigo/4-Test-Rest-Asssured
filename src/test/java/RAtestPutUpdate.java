import model.UserList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class RAtestPutUpdate {

    @Test
    @DisplayName("RAtestPutUpdate")
    void putUpdateUsers() {
        UserList userList = new UserList();
        userList.setName("morpheus");
        userList.setJob("zion resident");
        userList.updatedAt("2022-07-15T13:17:16.314Z");
        given()
                .spec(Spec.request)
                .body(userList)
                .when()
                .put("/api/users/2")
                .then()
                .spec(Spec.statusCode)
                .log().status()
                .log().body();
    }

}
