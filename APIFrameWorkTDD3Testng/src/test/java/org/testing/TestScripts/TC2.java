package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HttpMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC2  {
	
	@Test

	public void testcase2() throws IOException{
	Properties pr=PropertiesFileLoad.propertiesFile("../APIFrameworkAssignment/Env.properties");
	HttpMethods http=new HttpMethods(pr);
	Response res=http.getrequest("QA_URI", TC1.idValue);
	ResponseValidation.responseStatusCodeValidate(200, res);
	System.out.println("Testcase 2 :- Get the data  based upon id");
	System.out.println(res.asString());
	//System.out.println("Code:- ");
	//System.out.println(res.statusCode());
	
}
}
