package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HttpMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC4 {
	
	@Test

	public void testcase4() throws IOException{
		JSONObject data=new JSONObject();
		data.put("name", "Shriupdatedggg");
		data.put("roll_no", "22");
		data.put("age", "33");
		data.put("id", TC1.idValue);
		data.put("designation", "updateddeveloper");
		Properties pr=PropertiesFileLoad.propertiesFile("../APIFrameworkAssignment/Env.properties");
		HttpMethods http=new HttpMethods(pr);
		Response res=http.updaterequest("QA_URI", data.toString(), TC1.idValue);
		ResponseValidation.responseStatusCodeValidate(200, res);
		System.out.println("Testcase 4:- Update request based upon id :- ");
		System.out.println(res.asString());
		
	}


}
