package functions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import common.BaseTest;
import pages.LoginPage;

public class JobSearchFunction extends BaseTest {
	
public JobSearchFunction(WebDriver driver){
		
		super.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void logingFunction(String name, String password) throws IOException, InterruptedException {
		
		//driver = initializeBrowser();
		
		//Thread.sleep(1000000);
		driver.get("https://www.linkedin.com");
		LoginPage LP= new LoginPage(driver);
		Thread.sleep(5000);
		LP.btnSignIn1st.click();
		Thread.sleep(5000);
		LP.txtUsername.click();
		LP.txtUsername.sendKeys(name);
		Thread.sleep(1000);
		LP.txtPassword.click();
		LP.txtPassword.sendKeys(password);
		LP.btnSubmit.click();
		Thread.sleep(5000);
		driver.close();
		
	}
}
