package org.testing.utilities;

import com.jayway.restassured.response.Response;

public class ResponseDataParsingUsingJsonPath {
	
	public static String response_parsing(Response res, String jsonPath){
		
		return res.jsonPath().get(jsonPath);
		
	}
	

	

}
