import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;
import static io.restassured.http.ContentType.JSON;

public class Spec {

    public static RequestSpecification request = with()
            .baseUri("https://reqres.in/api")
            .log().uri()
            .log().body()
            .contentType(JSON);

    public static ResponseSpecification deleteCode = new ResponseSpecBuilder()
            .expectStatusCode(204)
            .build();

    public static ResponseSpecification statusCode = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();

    public static ResponseSpecification postStatusCode = new ResponseSpecBuilder()
            .expectStatusCode(201)
            .build();
}
