package waitExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/maheshabeydeera/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
		
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Process')]")));
		
		Actions a = new Actions(driver);
		a.doubleClick(driver.findElement(By.xpath("//div[contains(text(),'Process')]"))).build().perform();
		
		
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Process')]")).getText());
		Thread.sleep(100000);
		
		driver.close();

	}

}
