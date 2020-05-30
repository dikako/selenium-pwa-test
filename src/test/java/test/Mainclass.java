package test;

import org.testng.annotations.Test;

import test.testcases.Exclusive;
import test.testcases.Explores;
import test.testcases.Homepage;
import test.testcases.Login;
import test.testcases.News;
import test.testcases.Profile;
import test.testcases.Register;
import test.testcases.Title;

@Test
public class Mainclass extends Baseclass {

	String url = "https://rc-webm.rctiplus.com/";
	

//	
//	@Test(priority = 3)
//	public void explores() throws InterruptedException {
//		Explores page = new Explores(driver);
//		driver.get(url + "explores");
//		page.gotoExplore();
//	}
//	
//	@Test(priority = 4)
//	public void exclusive() throws InterruptedException {
//		Exclusive page = new Exclusive(driver);
//		driver.get(url + "exclusive");
//		page.gotoexclusive();
//	}
//	
//	@Test(priority = 5)
//	public void news() throws InterruptedException {
//		News page = new News(driver);
//		driver.get(url + "trending");
//		page.gotoNews();
//	}
//	
//	@Test(priority = 5)
//	public void news_searchResult() throws InterruptedException {
//		News page = new News(driver);
//		driver.get(url + "trending");
//		page.search();
//	}	
//	
//	@Test(priority = 5)
//	public void news_defaultSearch() throws InterruptedException {
//		News page = new News(driver);
//		driver.get(url + "trending");
//		page.defaultSearch();
//	}
//	
//	@Test(priority = 5)
//	public void news_artikelClick() throws InterruptedException {
//		News page = new News(driver);
//		driver.get(url + "trending");
//		page.artikelClick();
//	}
//	
//	@Test(priority = 5)
//	public void news_artikelThumb() throws InterruptedException {
//		News page = new News(driver);
//		driver.get(url + "trending");
//		page.artikelThumb();
//	}
//	
//	@Test(priority = 5)
//	public void news_artikelThumbFull() throws InterruptedException {
//		News page = new News(driver);
//		driver.get(url + "trending");
//		page.artikelThumbFull();
//	}
//	
//	@Test(priority = 5)
//	public void news_slider() throws InterruptedException {
//		News page = new News(driver);
//		driver.get(url + "trending");
//		page.slider();
//	}
//	
//
//	@Test(priority = 7)
//	public void edit_nicknameTaken() throws InterruptedException {
//		Profile page = new Profile(driver);
//		driver.get(url + "login");
//		page.nicknameTaken();
//	}
//
////	@Test(priority = 7)
////	public void edit_nicknameNull() throws InterruptedException {
////		Profile page = new Profile(driver);
////		driver.get(url + "login");
////		page.nicknameNull();
////	}

}
