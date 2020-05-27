package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Homepage {
	WebDriver driver;
	
	By exclusive = By.xpath("//p[contains(text(),'Exclusive')]");
	By news = By.xpath("//p[contains(text(),'News')]");
	By radio = By.xpath("//p[contains(text(),'Radio+')]");
	By home = By.xpath("//a[contains(text(),'Home')]");
	By liveEvent = By.xpath("//a[contains(text(),'Live Event')]");
	By liveTv = By.xpath("//a[contains(text(),'Live TV')]");
	By library = By.xpath("//a[contains(text(),'Library')]");
	By account = By.xpath("//a[contains(text(),'Account')]");
	By menuTengah = By.className("menu-label");
	By menuBawah = By.className("footer-wrapper-list");
	By contentTitle = By.className("content-title");
	By img = By.className("img");
	By adsBanner = By.id("google_image_div");
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void adsBanner() {
		driver.findElement(adsBanner).isDisplayed();
	}
	
	public void account() {
		String actual = driver.findElement(account).getText();
		String expected = "Account";
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
		System.out.println(actual + " = " + expected);
	}
	
	public void library() {
		String actual = driver.findElement(library).getText();
		String expected = "Library";
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
		System.out.println(actual + " = " + expected);
	}
	
	public void liveTv() {
		String actual = driver.findElement(liveTv).getText();
		String expected = "Live Tv";
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
		System.out.println(actual + " = " + expected);
	}
	
	public void liveEvent() {
		String actual = driver.findElement(liveEvent).getText();
		String expected = "Live Event";
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
		System.out.println(actual + " = " + expected);
	}
	
	public void home() {
		String actual = driver.findElement(home).getText();
		String expected = "Home";
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase());
		System.out.println(actual + " = " + expected );
	}
	
	public void countMenuBawah() {
		int count = driver.findElements(menuBawah).size();
		System.out.println("Jumlah Menu bawah: " + count);
	}
	
	public void countImg() {
		int count = driver.findElements(img).size();
		System.out.println("Jumlah tag img: " + count);
	}
	
	public void countContentTitle() {
		int count = driver.findElements(contentTitle).size();
		System.out.println("Jumlah Content title: " + count);
	}
	
	public void countMenuTengah() {
		int count = driver.findElements(menuTengah).size();
		System.out.println("Jumlah Menu Tengah: " + count);
		int expected = 3;
		Assert.assertEquals(count, expected);
	}
	
	public void exclusive() {
		String actual = driver.findElement(exclusive).getText();
		String expected = "Exclusive";
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase(), "Assert Exclusive Gagal");
		System.out.println(actual + " = " + expected);
	}
	
	public void news() {
		String actual = driver.findElement(news).getText();
		String expected = "News";
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase(), "Assert News Gagal");
		System.out.println(actual + " = " + expected);
	}
	
	public void radio() {
		String actual = driver.findElement(radio).getText();
		String expected = "Radio+";
		Assert.assertEquals(actual.toLowerCase(), expected.toLowerCase(), "Assert Eadio Gagal");
		System.out.println(actual + " = " + expected);
	}
	
	
}
