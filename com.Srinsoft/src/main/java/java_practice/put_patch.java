package java_practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class put_patch {
	
	
@Test
public void putrequest_Ex() {
	JSONObject jobj=new JSONObject();
	jobj.put("name", "chandru");
	jobj.put("job", "president");
	RestAssured.baseURI="https://reqres.in/";
	RestAssured.given().when().body(jobj.toJSONString()).patch("/api/users/2").then().statusCode(201);
	

	
}
	
	
}
