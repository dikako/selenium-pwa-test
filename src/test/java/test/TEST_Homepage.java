package test;

import org.testng.annotations.Test;

import test.testcases.Homepage;

@Test
public class TEST_Homepage extends Baseclass {

	String url = "https://rc-webm.rctiplus.com/";

	@Test(priority = 6)
	public void home_adsBanner() throws InterruptedException {
		Homepage page = new Homepage(driver);
		driver.get(url);
		page.adsBanner();
	}

	@Test(priority = 6)
	public void home_account() throws InterruptedException {
		Homepage page = new Homepage(driver);
		driver.get(url);
		page.account();
	}

	@Test(priority = 6)
	public void home_library() throws InterruptedException {
		Homepage page = new Homepage(driver);
		driver.get(url);
		page.library();
	}

	@Test(priority = 6)
	public void home_liveTv() throws InterruptedException {
		Homepage page = new Homepage(driver);
		driver.get(url);
		page.liveTv();
	}

	@Test(priority = 6)
	public void home_liveEvent() throws InterruptedException {
		Homepage page = new Homepage(driver);
		driver.get(url);
		page.liveEvent();
	}

	@Test(priority = 6)
	public void home_home() throws InterruptedException {
		Homepage page = new Homepage(driver);
		driver.get(url);
		page.home();
	}

	@Test(priority = 6)
	public void home_countMenuBawah() throws InterruptedException {
		Homepage page = new Homepage(driver);
		driver.get(url);
		page.countMenuBawah();
	}

	@Test(priority = 6)
	public void home_countImg() throws InterruptedException {
		Homepage page = new Homepage(driver);
		driver.get(url);
		page.countImg();
	}

	@Test(priority = 6)
	public void home_countContentTitle() throws InterruptedException {
		Homepage page = new Homepage(driver);
		driver.get(url);
		page.countContentTitle();
	}

	@Test(priority = 6)
	public void home_countMenuTengah() throws InterruptedException {
		Homepage page = new Homepage(driver);
		driver.get(url);
		page.countMenuTengah();
	}

	@Test(priority = 6)
	public void home_exclusive() throws InterruptedException {
		Homepage page = new Homepage(driver);
		driver.get(url);
		page.exclusive();
	}

	@Test(priority = 6)
	public void home_news() throws InterruptedException {
		Homepage page = new Homepage(driver);
		driver.get(url);
		page.news();
	}

	@Test(priority = 6)
	public void home_radio() throws InterruptedException {
		Homepage page = new Homepage(driver);
		driver.get(url);
		page.radio();
	}

}
