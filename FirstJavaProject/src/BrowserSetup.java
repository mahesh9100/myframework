import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/maheshabeydeera/Downloads/chromedriver");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://www.google.lk");
		System.out.println(Driver.getCurrentUrl());
		Driver.findElement(By.xpath("//tagname[@attibute='attname'"));
	
		Driver.close();

	}

}
