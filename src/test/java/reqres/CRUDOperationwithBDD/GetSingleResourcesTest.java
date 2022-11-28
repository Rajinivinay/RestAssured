package reqres.CRUDOperationwithBDD;

import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;

public class GetSingleResourcesTest {
	@Test
	public void GetSingleResource() {
		baseURI="https://reqres.in/";
	//	step;no need of prerequites
		//step2;sender response
		when()
		.get( "/api/unknown/2")
		.then()
		.log().all();
	
	}

}
