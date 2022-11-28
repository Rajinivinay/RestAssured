package CreateBody3Differntways;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateUserUsingHashMapTest {
	 @Test
	 public void CreateUser() {
		// Step1 create prerequties
		 HashMap obj=new HashMap();
		 obj.put("name", "morpheus");
		 obj.put("job", "leader");
		 //send response
		 given()
		 .body(obj)
		 .contentType(ContentType.JSON)
		 .when()
		 .post("https://reqres.in/api/users")
		 .then()
		 .assertThat().statusCode(201)
		 .log().all();
		 
		 
	 }

}
