package test.testcases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class test {

	@Test
	public void openNewTabInChrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\Chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rctiplus.com");

		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Account')]"));
		Actions actionOpenLinkInNewTab = new Actions(driver);
		actionOpenLinkInNewTab.moveToElement(element).keyDown(Keys.COMMAND).keyDown(Keys.SHIFT).click(element)
				.keyUp(Keys.COMMAND).keyUp(Keys.SHIFT).perform();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window((String) tabs.get(1));
		driver.get("http://www.yahoo.com");
		driver.close();

		driver.switchTo().window((String) tabs.get(0));
		driver.get("http://www.facebook.com");

		driver.close();
	}

}
