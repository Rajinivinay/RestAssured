package reqres.CRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateUserTest {
	@Test
	public void CreateUser() {
		//step1:create pre requisits
		JSONObject obj=new JSONObject();
		obj.put("name", "morpheus");
		obj.put("job", "leader");
		
		//step2:send a request
	RequestSpecification	request=RestAssured.given();
	request.body(obj);
	request.contentType(ContentType.JSON);
	Response resp=request.post();
	//validate the response
	System.out.println(resp.getStatusCode());
	//System.out.println(resp.asString());
	//System.out.println(resp.prettyPrint());
	//System.out.println(resp.prettyPeek());
	ValidatableResponse val=resp.then();
	val.log().all();
	}

}
