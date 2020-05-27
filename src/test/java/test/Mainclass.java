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

//	@Test(priority = 0)
//	public void title() {
//		Title page = new Title(driver);
//		driver.get(url);
//		page.testTitle();
//	}
//	
//	@Test(priority = 1)
//	public void register_emailTaken() throws InterruptedException {
//		Register page = new Register(driver);
//		driver.get(url + "register");
//		page.alert1();
//	}
//	
//	@Test(priority = 1)
//	public void register_passwordNotMatch() throws InterruptedException {
//		Register page = new Register(driver);
//		driver.get(url + "register");
//		page.alert2();
//	}
//	
//	@Test(priority = 1)
//	public void register_incorrectPhone() throws InterruptedException {
//		Register page = new Register(driver);
//		driver.get(url + "register");
//		page.alert3();
//	}
//	
//	@Test(priority = 1)
//	public void register_phoneTaken() throws InterruptedException {
//		Register page = new Register(driver);
//		driver.get(url + "register");
//		page.alert4();
//	}
//	
//	@Test(priority = 2)
//	public void login_incorrectEmail() throws InterruptedException {
//		Login page = new Login(driver);
//		driver.get(url + "login");
//		page.alert1();
//	}
//	
//	@Test(priority = 2)
//	public void login_incorrectPassword() throws InterruptedException {
//		Login page = new Login(driver);
//		driver.get(url + "login");
//		page.alert2();
//	}
//	
//	@Test(priority = 2)
//	public void login_notRegistered() throws InterruptedException {
//		Login page = new Login(driver);
//		driver.get(url + "login");
//		page.alert3();
//	}
//	
//	@Test(priority = 2)
//	public void login_incorrectPhone() throws InterruptedException {
//		Login page = new Login(driver);
//		driver.get(url + "login");
//		page.alert4();
//	}
//	
//	@Test(priority = 2)
//	public void login_success() throws InterruptedException {
//		Login page = new Login(driver);
//		driver.get(url + "login");
//		page.testLogin();
//	}
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
////	@Test(priority = 5)
////	public void news_searchResult() throws InterruptedException {
////		News page = new News(driver);
////		driver.get(url + "trending");
////		page.search();
////	}	
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
//	@Test(priority = 6)
//	public void home_adsBanner() throws InterruptedException {
//		Homepage page = new Homepage(driver);
//		driver.get(url);
//		page.adsBanner();
//	}
//	
//	@Test(priority = 6)
//	public void home_account() throws InterruptedException {
//		Homepage page = new Homepage(driver);
//		driver.get(url);
//		page.account();
//	}
//	
//	@Test(priority = 6)
//	public void home_library() throws InterruptedException {
//		Homepage page = new Homepage(driver);
//		driver.get(url);
//		page.library();
//	}
//	
//	@Test(priority = 6)
//	public void home_liveTv() throws InterruptedException {
//		Homepage page = new Homepage(driver);
//		driver.get(url);
//		page.liveTv();
//	}
//	
//	@Test(priority = 6)
//	public void home_liveEvent() throws InterruptedException {
//		Homepage page = new Homepage(driver);
//		driver.get(url);
//		page.liveEvent();
//	}
//	
//	@Test(priority = 6)
//	public void home_home() throws InterruptedException {
//		Homepage page = new Homepage(driver);
//		driver.get(url);
//		page.home();
//	}
//	
//	@Test(priority = 6)
//	public void home_countMenuBawah() throws InterruptedException {
//		Homepage page = new Homepage(driver);
//		driver.get(url);
//		page.countMenuBawah();
//	}
//	
//	@Test(priority = 6)
//	public void home_countImg() throws InterruptedException {
//		Homepage page = new Homepage(driver);
//		driver.get(url);
//		page.countImg();
//	}
//	
//	@Test(priority = 6)
//	public void home_countContentTitle() throws InterruptedException {
//		Homepage page = new Homepage(driver);
//		driver.get(url);
//		page.countContentTitle();
//	}
//	
//	@Test(priority = 6)
//	public void home_countMenuTengah() throws InterruptedException {
//		Homepage page = new Homepage(driver);
//		driver.get(url);
//		page.countMenuTengah();
//	}
//	
//	@Test(priority = 6)
//	public void home_exclusive() throws InterruptedException {
//		Homepage page = new Homepage(driver);
//		driver.get(url);
//		page.exclusive();
//	}
//	
//	@Test(priority = 6)
//	public void home_news() throws InterruptedException {
//		Homepage page = new Homepage(driver);
//		driver.get(url);
//		page.news();
//	}
//	
//	@Test(priority = 6)
//	public void home_radio() throws InterruptedException {
//		Homepage page = new Homepage(driver);
//		driver.get(url);
//		page.radio();
//	}

	@Test(priority = 7)
	public void edit_nicknameTaken() throws InterruptedException {
		Profile page = new Profile(driver);
		driver.get(url + "login");
		page.nicknameTaken();
	}

	@Test(priority = 7)
	public void edit_nicknameNull() throws InterruptedException {
		Profile page = new Profile(driver);
		driver.get(url + "login");
		page.nicknameNull();
	}

}
