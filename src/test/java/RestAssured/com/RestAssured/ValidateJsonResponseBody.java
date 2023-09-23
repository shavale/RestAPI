package RestAssured.com.RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ValidateJsonResponseBody {
	@Test
	public void UserlistResponseBody() {
		
	
	
	RequestSpecification requestspec= RestAssured.given();
	requestspec.baseUri("https://reqres.in/api/users?page=2");
	//requestspec.basePath();
	
	Response resp=requestspec.get();
	ResponseBody body=resp.getBody();
	String resbody=body.asString();
	System.out.println(resbody);
	Assert.assertEquals(resbody.contains("Bluth"), true,"check last_name");
	
	JsonPath jsonpathviewer=body.jsonPath();
	String emailid=jsonpathviewer.get("data[0].email");
	System.out.println(emailid);
	Assert.assertEquals(emailid,"george.bluth@reqres.in");
	
}
}
