package CreateBody3Differntways;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClass.UserLibraries;

import static io.restassured.RestAssured.*;

public class createUserUsingPoJOClass {
	@Test
	public void CreateUser() {
		UserLibraries obj=new UserLibraries("rajini","softwareTestEngineer");
		System.out.println(obj.getname());
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
