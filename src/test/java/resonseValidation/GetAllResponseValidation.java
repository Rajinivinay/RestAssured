package resonseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class GetAllResponseValidation {
	@Test
	public void getAllResponseValidation() {
		baseURI="https://reqres.in/";
		String expData="janet.weaver@reqres.in";
		//capture the respoonse
		Response resp=when()
			.get("\r\n"
					+ "/api/users");
		List<Object> actData=resp.jsonPath().get("data");
		for(Object d:actData)
		{
			String data=d.toString();
			if(data.contains(expData))
			{
				System.out.println(data+"data matched");
			
			}
			else {
				System.out.println( "data not matched");
			}
		}
		
	}

}
