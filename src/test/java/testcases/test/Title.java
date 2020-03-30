package testcases.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Title {
	WebDriver driver;
	
	public Title(WebDriver driver) {
		this.driver = driver;
	}
	
	public void title() {
		String expected_title = "RCTI+ - Live Streaming Program 4 TV Terpopuler";
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
		System.out.println("Title Page: " + actual_title);
	}
}
