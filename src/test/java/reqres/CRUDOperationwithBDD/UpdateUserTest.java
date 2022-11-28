package reqres.CRUDOperationwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

public class UpdateUserTest {
	@Test
	public void UpdateUser() {
		baseURI="https://reqres.in/";
		//step1 create prerequsites
		JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "zion resident");
		//step2 send a request
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.patch("\r\n"
				+ "/api/users/2")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	
		
	}

}
