package CreateBody3Differntways;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateUserUsingJsonFileDataDrivenTesting {
	@Test
	public void CreateUser() {
	baseURI="https://reqres.in/";	
	
	File obj=new File(".\\src\\test\\resources\\Data.json");
	
	given()
	.body(obj)
	.contentType(ContentType.JSON)
	.when()
	.post("\r\n"
			+ "/api/users")
	.then().assertThat().statusCode(201)
	.log().all();

}}
