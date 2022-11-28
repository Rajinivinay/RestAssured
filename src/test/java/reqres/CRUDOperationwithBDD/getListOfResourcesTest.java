package reqres.CRUDOperationwithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getListOfResourcesTest {
	@Test
	public void getListOfResources() {
		baseURI="https://reqres.in/";
		when()
		.get( "/api/unknown")
		.then()
		.log().all();
		
		
	

	
	}

}
