package reqres.CRUDOperationwithBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class GetAllUsersTest {
	@Test
	public void getallUser() {
		baseURI="https://reqres.in/";
		when()
		.get("/api/users?page=2")
		.then()
		.log().all();
	}

}
