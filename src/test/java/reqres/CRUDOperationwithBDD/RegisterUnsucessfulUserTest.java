package reqres.CRUDOperationwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

public class RegisterUnsucessfulUserTest {
	@Test
	public void RegisterUnsucessfuluser() {
		baseURI="https://reqres.in/";
		//step1 create prerequasites
		JSONObject obj=new JSONObject();
		obj.put("email","sydney@fife");
		
		//send a request
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.post("\r\n"
				+ "/api/register")
		.then()
		.assertThat().statusCode(400)
		.log().all();
		
	}

}
