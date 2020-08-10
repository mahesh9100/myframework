package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="//a[text()='Sign in']")
	public WebElement btnSignIn1st;

	@FindBy(how=How.ID,using="username")
	public WebElement txtUsername;
	
	@FindBy(how=How.ID,using="password")
	public WebElement txtPassword;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	public WebElement btnSubmit;
	
	@FindBy(how=How.XPATH,using="//a[@href='/in/mahesh-abeydeera/']")
	public WebElement txtProfileName;
	
}
