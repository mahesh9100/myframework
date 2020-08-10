package autoSuggestDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AutoSuggestDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/maheshabeydeera/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
				
		driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("uni");
		
		WebDriverWait wd = new WebDriverWait(driver, 10);
		wd.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='United Arab Emirates']")));

		
		driver.findElement(By.xpath("//div[text()='United Arab Emirates']")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value"), "United Arab Emirates");
		driver.close();

	}

}
