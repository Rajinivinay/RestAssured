package reqres.CRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutUserTest {
	@Test
	public void putUser() {
		//step1:update the user
		JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "zion resident");
		//step2:send the request
		RequestSpecification request=RestAssured.given();
		request.body(obj);
		request.contentType(ContentType.JSON);
		Response resp=request.put();
		ValidatableResponse val=resp.then();
		val.log().all();
		
		
	}

}
