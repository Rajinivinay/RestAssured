package resonseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import pojoClass.UserLibraries;

import  static io.restassured.RestAssured.*;

public class ResponseValidationTest {
	@Test
	public void ResponseValidation() {
		String extData="morpheus";
		//create prerqequsites
		UserLibraries uLib=new UserLibraries("morpheus","leader");
		baseURI="https://reqres.in/";
		//send request and capture response
		Response resp=given()
				.body(uLib)
				.contentType(ContentType.JSON)
				.when()
				.post("\r\n"
						+ "/api/users");
		//write JsonPath using jsonpath()and validate
		String actData=resp.jsonPath().get("name");
		System.out.println(actData);
		resp.then().log().all();
		Assert.assertEquals(extData, actData);

			
}}
