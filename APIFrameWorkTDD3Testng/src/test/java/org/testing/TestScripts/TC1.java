package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HttpMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testing.utilities.ResponseDataParsingUsingJsonPath;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC1 {
	
	static String idValue;
	
	@Test
	
	public void testcase1() throws IOException{
		
		Random r=new Random();
		Integer i=r.nextInt();
		
		
		JSONObject data=new JSONObject();
		data.put("name", "Shri");
		data.put("roll_no", "14");
		data.put("age", "25");
		data.put("id", i.toString());
		data.put("designation", "Contract qa");
		
		Properties pr=PropertiesFileLoad.propertiesFile("../APIFrameworkAssignment/Env.properties");
		HttpMethods http=new HttpMethods(pr);
		Response res=http.postrequest("QA_URI", data.toString());
		ResponseValidation.responseStatusCodeValidate(201, res);
		System.out.println("Testcase 1 :- Post the data");
		System.out.println(res.asString());
		idValue=ResponseDataParsingUsingJsonPath.response_parsing(res, "id");
		System.out.println("id value is :- " +idValue);
		
		
	}

}
