package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Explores {
	WebDriver driver;
	
	By headerList = By.xpath("//div[@class='header-list']");
	By contentImage = By.className("content-image");
	
	String placeholder = "Search for a program, genre, etc.";
	String headerListName = "For You"; 
	
	public Explores(WebDriver driver) {
		this.driver = driver;
	}
	
	public void gotoExplore() throws InterruptedException {
		Thread.sleep(5000);
		
		String actualHeaderList = driver.findElement(headerList).getText();
		Assert.assertEquals(actualHeaderList, headerListName, "Assert HeaderList Error");
		System.out.println("Header List Name : " + actualHeaderList);
		
		int countContentImage = driver.findElements(contentImage).size();
		System.out.println("Jumlah Content Image: " + countContentImage);
	}
}
