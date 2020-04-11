package org.testing.TestSteps;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.response.Response.*;

import java.util.Properties;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HttpMethods {
	
    Properties pr;
	public HttpMethods(Properties pr)
	{
		this.pr=pr;
	}
	public Response postrequest(String urikey, String body){
		Response res=
				 given()
                 .contentType(ContentType.JSON)
				.body(body)
    			.when()
				.post(pr.getProperty(urikey));
		return res;
	}
	
	public Response getrequest(String urikey, String idValue){
		
		String uri=pr.getProperty(urikey)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		return res;		
	}
	
	
	public Response getrequest1(String uriKey) {
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(uriKey));
		return res;
	}
	
	public Response updaterequest(String urikey, String data, String idValue){
		String uri=pr.getProperty(urikey)+"/"+idValue;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(data)
				.when()
				.put(uri);
		return res;
	}
	
	public Response deleterequst(String urikey, String idValue){
		String uri=pr.getProperty(urikey)+"/"+idValue;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(uri);
		return res;
	}

}
