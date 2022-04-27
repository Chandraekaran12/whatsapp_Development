package java_practice;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class sample_POST_reg {
	
@Test(priority=1, enabled=true)

	public static void main(String[] args) {
		JSONObject jsonobj=new JSONObject();
		jsonobj.put("name", "chandru");
		jsonobj.put("job", "lawyer");
		
//RestAssured.baseURI="https://reqres.in";
RestAssured.given().header("", "").body(jsonobj.toJSONString()).post("https://reqres.in/api/users/3").then().statusCode(201);

	}

	
	
	
}
