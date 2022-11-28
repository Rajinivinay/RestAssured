package reqres.CRUDOperationwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PutUserTest {
	@Test
	public void PutUser() {
		baseURI="https://reqres.in/";
		//step1 create prerequisites
		JSONObject obj=new 	JSONObject();
		obj.put("name", "morpheus");
		obj.put("job","zion resident");
		//step2 send request
		given()
		.body(obj)
		.contentType(ContentType.JSON)
        .when()
          .put("\r\n"
          		+ "/api/users/2")
          .then()
          .assertThat().statusCode(200)
          .log().all();
	
		
	}

}
