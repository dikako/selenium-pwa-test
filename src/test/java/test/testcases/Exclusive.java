package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Exclusive {
	WebDriver driver;
	
	By activeClass = By.xpath("//a[@class='active nav-link']");
	By programTitle = By.className("program-title");
	
	public Exclusive(WebDriver driver) {
		this.driver = driver;
	}
	
	public void gotoexclusive() {
		driver.findElement(activeClass).isDisplayed();
		int countProgramTitle = driver.findElements(programTitle).size();
		System.out.println("Jumlah Program TEST_Title: " + countProgramTitle);
	}
}
