package newBrowserTab;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OpenNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/maheshabeydeera/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();

		
		Set<String> tab = driver.getWindowHandles();
		
		Iterator<String> chromeTab = tab.iterator();
		String newTab =chromeTab.next();
		String newTab2 =chromeTab.next();
		driver.switchTo().window(newTab2);

		Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='New Window']")).isDisplayed());
		System.out.print("Move to new Tab");

		driver.close();

	}

}
