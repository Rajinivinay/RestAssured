package reqres.CRUDOperationwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class LoginSucessFulUserTest {
	@Test
	public void LoginSucessFulUser() {
		baseURI="https://reqres.in/";
		//step1  create prerequsites
		JSONObject obj=new JSONObject();
		obj.put("email", "eve.holt@reqres.in");
		obj.put("password", "cityslicka");
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.post("\r\n"
				+ "/api/login")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}

}
