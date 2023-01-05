import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class testone {

    @Test
    public void test_01() {
        RestAssured.baseURI = "https://test-api.k6.io/auth/basic/login/";
        RestAssured.given().body("{\n" +
                        "    \"username\": \"hugo96sa\",\n" +
                        "    \"password\": \"73223294\"\n" +
                        "}").post().then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }
}
