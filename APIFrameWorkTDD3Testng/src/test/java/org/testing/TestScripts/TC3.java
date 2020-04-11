package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HttpMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.response.Response.*;



public class TC3 {
	
	@Test

	public void testcase3() throws IOException{
		
		Properties pr=PropertiesFileLoad.propertiesFile("../APIFrameworkAssignment/Env.properties");
		HttpMethods http=new HttpMethods(pr);
		Response res=http.getrequest1("QA_URI");
		ResponseValidation.responseStatusCodeValidate(200,res);
		System.out.println("Testcase 3 :- Get request for all id ");
		System.out.println(res.asString());
		
	}
	
	

}
