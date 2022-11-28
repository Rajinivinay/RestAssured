package reqres.CRUDOperationwithBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class GetSingleUserTest {
	@Test
	public void getSingleUser() {
		baseURI="https://reqres.in/";
		when()
		.get("api/users/2")
		.then()
		.log().all();
		
	}

}
