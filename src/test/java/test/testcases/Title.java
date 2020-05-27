package test.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Title {
	WebDriver driver;
	public Title(WebDriver driver) {
		this.driver = driver;
	}
	
	public void testTitle() {
		String actual = driver.getTitle();
		String expected = "RCTI+ - Live Streaming Program 4 TV Terpopuler";
		
		Assert.assertEquals(actual, expected);
		System.out.println("Title : " + actual + " = " + expected);
	}
}
