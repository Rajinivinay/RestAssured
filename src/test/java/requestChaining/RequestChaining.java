package requestChaining;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


import io.restassured.response.Response;


public class RequestChaining {
	@Test
	public void RequestChaingUsingGetandDelete(){
	//step:create prerequasites
	 baseURI="https://reqres.in";
	
	//step:2send the request
	Response res=when()
	             .get("/ap/users/");
	//step3:capture the response
	int id=res.jsonPath().get("data[1].id");
	System.out.println(id);
	//step4:provide response variable to another request
	when()
	.get("/api/users/"+id)
	.then()
	.assertThat().statusCode(200)
	.log().all();

}
}

	
