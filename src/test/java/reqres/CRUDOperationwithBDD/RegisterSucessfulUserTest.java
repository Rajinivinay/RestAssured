package reqres.CRUDOperationwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class RegisterSucessfulUserTest {
	@Test
	public void RegisterSucessfulUser() {
		baseURI="https://reqres.in/";
		//step1  create prerequasites
		JSONObject obj=new JSONObject();
		obj.put("email", "eve.holt@reqres.in");
		obj.put("password", "pistol");
		//send a request
		given()
		.body(obj)
		.contentType(ContentType.JSON)
        .post("\r\n"
        		+ "/api/register")		
        .then()
        .assertThat().statusCode(200)
        .log().all();
	}

}
