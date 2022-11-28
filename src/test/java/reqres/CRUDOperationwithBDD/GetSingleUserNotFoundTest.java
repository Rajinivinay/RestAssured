package reqres.CRUDOperationwithBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetSingleUserNotFoundTest {
	@Test
	public void getSingleUserNotFound() {
		baseURI="https://reqres.in/";
		when()
		.get("/api/users/23")
		.then()
		.log().all();
		
		
	}

}
