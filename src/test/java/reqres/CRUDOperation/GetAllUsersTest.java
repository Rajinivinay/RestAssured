package reqres.CRUDOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllUsersTest {
	@Test
	public void GetAllUser() {
		//step1:no need of pre requisites for get
		//setp2:send the request
		Response resp=RestAssured.get("https://reqres.in/api/users");
		//step3:validate the response
		ValidatableResponse val=resp.then();
		val.log().all();
		
	}

}
