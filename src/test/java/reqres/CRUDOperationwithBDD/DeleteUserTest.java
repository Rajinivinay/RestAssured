package reqres.CRUDOperationwithBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DeleteUserTest {
	@Test
	public void Deleteuser() {
		baseURI="https://reqres.in/";
		Response resp=RestAssured.delete("\r\n"
				+ "/api/users/2");
		resp.then().log().all();
	}

}
