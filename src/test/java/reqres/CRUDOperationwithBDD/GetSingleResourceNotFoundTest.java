package reqres.CRUDOperationwithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetSingleResourceNotFoundTest {
	@Test
	public void GetSingleResourceNotFound() {
		
		baseURI=("https://reqres.in/");
		when()
		.get("\r\n"
				+ "/api/unknown/23")
		.then()
		.log().all();
		
	}

}
