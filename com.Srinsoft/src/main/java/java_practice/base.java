package java_practice;

import io.opentelemetry.api.trace.StatusCode;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class base {
	
	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();
//		//WebDriver driver =new ChromeDriver();
//Response response= RestAssured.get("https://reqres.in/api/users/3");
//ResponseBody reb=response.body();
//
//
//
//String abc=reb.asString();
//System.out.println(reb.prettyPrint());
//}
		base.BDDstyle_rest();
		
	}
static void BDDstyle_rest() {
	RestAssured.baseURI="http://kedge.srinsofttech.com";
	Response responce=RestAssured.given()
	.param("", "").header("","")
	
	.when().get("/#/apps/timesheets");
	System.out.println(responce.statusCode());
	System.out.println();
	
}

	
	
}
