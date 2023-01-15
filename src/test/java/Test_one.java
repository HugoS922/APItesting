import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class Test_one {

    @Test
    public void test_01() {
        RestAssured.baseURI = "https://test-api.k6.io";
        JSONObject bodyParams = new JSONObject();
        bodyParams.put("username", "hugo96sa");
        bodyParams.put("password", "73223294");

        RestAssured.given()
                .body(bodyParams.toString()).contentType(ContentType.JSON)
                .when()
                .post("/auth/basic/login/")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);
    }
}
