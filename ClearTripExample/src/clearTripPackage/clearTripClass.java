package clearTripPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class clearTripClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/maheshabeydeera/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");

		// driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.id("OneWay")).click();
		System.out.println("===ONEWAY BUTTON IS SELECTED===");
		Thread.sleep(5000);

		driver.findElement(By.id("FromTag")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Chennai");
		Thread.sleep(5000);
		driver.findElement(By.id("FromTag")).sendKeys(Keys.ENTER);
		System.out.println("===FROM LOCATION IS SELECTED===");
		Thread.sleep(5000);

		driver.findElement(By.id("ToTag")).sendKeys("mum");
		Thread.sleep(5000);
		driver.findElement(By.id("ToTag")).sendKeys(Keys.ENTER);
		System.out.println("===TO LOCATION IS SELECTED===");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		System.out.println("===CURRENT DATE IS SELECTED===");
		Thread.sleep(5000);

		Select child = new Select(driver.findElement(By.id("Childrens")));
		child.selectByVisibleText("3");
		System.out.println("===NUMBER OF CHILD SELECTED===");
		Thread.sleep(5000);

		driver.findElement(By.id("SearchBtn"));
		System.out.println("===SEARCHING===");
		driver.quit();

	}

}
