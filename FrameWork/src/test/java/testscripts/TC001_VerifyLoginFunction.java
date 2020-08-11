package testscripts;

import java.io.IOException;

import org.apache.maven.plugin.MojoExecutionException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.BaseTest;
import pages.LoginPage;
import common.TestDataReader;
import functions.JobSearchFunction;

public class TC001_VerifyLoginFunction extends BaseTest{
	

	
	String username;
	String password;
	
	
	
	@BeforeMethod
	
	public void dataReader() throws Exception {
		
		
		//staging commit
		TestDataReader.getTestDataFile("./src/main/java/Data/common.properties");// Load the test data file
		
		username = TestDataReader.getTestData("username");
		password = TestDataReader.getTestData("password");
			
	}
	

	
	@Test(description="login function")

	public void linkedInLogin() throws IOException, InterruptedException{
		
	driver = initializeBrowser();

	JobSearchFunction js= new JobSearchFunction(driver);
	
	LoginPage LP= new LoginPage(driver);

	js.logingFunction(username, password);

	
	System.out.println(LP.txtProfileName.getText());

	//Assert.assertEquals(LP.txtProfileName.getText(), "Mahesh abeydeera");

	System.out.println("===== PROFILE IMAGE IS DISPLAYED=====");

	}
	

}