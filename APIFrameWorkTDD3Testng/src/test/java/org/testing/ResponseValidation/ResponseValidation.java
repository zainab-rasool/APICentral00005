package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseValidation {
	public static void responseStatusCodeValidate(int expectedStatusCode, Response res){
		if(expectedStatusCode==res.statusCode()){
			System.out.println("Test case pass with status code :- " +res.statusCode());
		}
		else
		{
			System.out.println("Test case fail with status code :- " +res.statusCode());
		}
	}

}
