package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class BaseTest {

	public WebDriver driver;
	
	
	public WebDriver initializeBrowser() throws IOException{
		
		Properties prop = new Properties();
		FileInputStream fs= new FileInputStream("./src/main/java/Data/common.properties");
		prop.load(fs);
		
		String browserName = prop.getProperty("browser");
		
		String ChromeDriverPath = System.getProperty("user.dir")+"/resources/WebDrivers/chromedriver";
		if(browserName.contains("chrome")){
		
			System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
			driver = new ChromeDriver();
		
			
			
			
		}
		return driver;
		
	}
}
