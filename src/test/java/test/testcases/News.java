package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class News {
	WebDriver driver;
	
	public News(WebDriver driver) {
		this.driver = driver;
	}
	
	By activeLink = By.xpath("//li[@class='active navigation-tabs-item nav-item']");
	By imageSlider = By.className("center-cropped");
	By articelThumnail = By.className("article-thumbnail");
	By articelThumnailFull = By.className("article-thumbnail-full-width");
	By articelTitle = By.className("article-title");
	By search = By.xpath("//div[@class='btn-link-top-nav']//*[local-name()='svg']");
	By searchClick = By.xpath("//*[name()='path' and contains(@d,'M15.5 14h-')]");
	By defaultSearch = By.xpath("//div[@class='not-found-message']");
	By searchInput = By.xpath("//input[@id='search-news-input']");
	By itemTitleSearch = By.className("list-item-thumbnail"); 
	
	String keyword = "Corona";
	
	public void gotoNews() {
		driver.findElement(activeLink).isDisplayed();
	}
	
	public void search() throws InterruptedException {
		driver.findElement(search).click();
		driver.findElement(searchInput).sendKeys(keyword);
		driver.findElement(searchClick).click();
		Thread.sleep(5000);
		int countResultSearch = driver.findElements(itemTitleSearch).size();
		System.out.println("Jumlah Hasil Search: " + countResultSearch);
		int expectedCount = 5;
		Assert.assertEquals(countResultSearch, expectedCount);
		System.out.println("Jumlah Result Search: " + countResultSearch );
	}
	
	public void defaultSearch() {
		driver.findElement(search).click();
		String searchNotFound = driver.findElement(defaultSearch).getText();
		String expectedWording = "There is no search history";
		Assert.assertEquals(searchNotFound, expectedWording);
		System.out.println("Wording: " + searchNotFound);
	}
	
	public void artikelClick() {
		driver.findElement(articelTitle).click();
		String newsTitleClick = driver.findElement(articelTitle).getText();
		System.out.println("TEST_Title News: " + newsTitleClick);
		
		String validateOpenNewsTitle = driver.findElement(By.xpath("//b[contains(text(),'" + newsTitleClick +"')]")).getText();
		Assert.assertEquals(newsTitleClick.toLowerCase(), validateOpenNewsTitle.toLowerCase(), "Assert Error");
		System.out.println("Assert Success: " + newsTitleClick + " = " + validateOpenNewsTitle );
		
		int count = driver.findElements(articelTitle).size();
		int expected = 4;
		Assert.assertEquals(count, expected);
	}
	
	public void artikelThumbFull() {
		int countArticelThumnailFull = driver.findElements(articelThumnailFull).size();
		System.out.println("Jumlah Articel Thumnail Full: " + countArticelThumnailFull);
	}
	
	public void artikelThumb() {
		int countArticelThumnail = driver.findElements(articelThumnail).size();
		System.out.println("Jumlah Articel Thumnail: " + countArticelThumnail);
	}
	
	public void slider() {
		int countImageSlider = driver.findElements(imageSlider).size();
		System.out.println("Jumlah Image Slider: " + countImageSlider);
	}
	
	//Search
	//validate history search
}
