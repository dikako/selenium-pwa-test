package test;

import org.testng.annotations.Test;

import object.Url;
import test.testcases.Login;

public class TEST_Login extends Baseclass {

	// String url = "https://rc-webm.rctiplus.com/";

	Url url = new Url(driver);

	@Test(priority = 0)
	public void login_invalidEmail() throws InterruptedException {
		Login page = new Login(driver);
		url.url(true, "/login");
		page.invalidEmail();
	}

	@Test(priority = 1)
	public void login_byAccountinvalidEmail() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByAccountinvalidEmail();
	}

	@Test(priority = 1)
	public void login_byHistoryinvalidEmail() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByHistoryinvalidEmail();
	}

	@Test(priority = 1)
	public void login_byMylistinvalidEmail() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByMylistinvalidEmail();
	}

	@Test(priority = 1)
	public void login_byContinueWatchinginvalidEmail() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByContinueWatchinginvalidEmail();
	}

	@Test(priority = 1)
	public void login_invalidPassword() throws InterruptedException {
		Login page = new Login(driver);
		url.url(true, "/login");
		page.invalidPassword();
	}

	@Test(priority = 1)
	public void login_byAccountinvalidPassword() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByAccountinvalidPassword();
	}

	@Test(priority = 1)
	public void login_byHistoryinvalidPassword() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByHistoryinvalidPassword();
	}

	@Test(priority = 1)
	public void login_byMylistnvalidPassword() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByMylistinvalidPassword();
	}

	@Test(priority = 1)
	public void login_byContinueWatchinginvalidPassword() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByContinueWatchinginvalidPassword();
	}

	@Test(priority = 2)
	public void login_invalidPhone() throws InterruptedException {
		Login page = new Login(driver);
		url.url(true, "/login");
		page.invalidPhone();
	}

	@Test(priority = 2)
	public void login_byAccountinvalidPhone() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByAccountinvalidPhone();
	}

	@Test(priority = 2)
	public void login_byHistoryinvalidPhone() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByHistoryinvalidPhone();
	}

	@Test(priority = 2)
	public void login_byMylistnvalidPhone() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByMylistinvalidPhone();
	}

	@Test(priority = 2)
	public void login_byContinueWatchinginvalidPhone() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByContinueWatchinginvalidPhone();
	}

	@Test(priority = 3)
	public void login_notRegisteredEmail() throws InterruptedException {
		Login page = new Login(driver);
		url.url(true, "/login");
		page.notRegisteredEmail();
	}

	@Test(priority = 3)
	public void login_byAccountnotRegisteredEmail() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByAccountnotRegisteredEmail();
	}

	@Test(priority = 3)
	public void login_byHistorynotRegisteredEmail() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByHistorynotRegisteredEmail();
	}

	@Test(priority = 3)
	public void login_byMylistnotRegisteredEmail() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByMylistnotRegisteredEmail();
	}

	@Test(priority = 3)
	public void login_byContinueWatchingnotRegisteredEmail() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByContinueWatchingnotRegisteredEmail();
	}

	@Test(priority = 4)
	public void login_notRegisteredPhone() throws InterruptedException {
		Login page = new Login(driver);
		url.url(true, "/login");
		page.notRegisteredPhone();
	}

	@Test(priority = 4)
	public void login_byAccountnotRegisteredPhone() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByAccountnotRegisteredPhone();
	}

	@Test(priority = 4)
	public void login_byHistorynotRegisteredPhone() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByHistorynotRegisteredPhone();
	}

	@Test(priority = 4)
	public void login_byMylistnotRegisteredPhone() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByMylistnotRegisteredPhone();
	}

	@Test(priority = 4)
	public void login_byContinueWatchingnotRegisteredPhone() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByContinueWatchingnotRegisteredPhone();
	}

	@Test(priority = 5)
	public void login_success() throws InterruptedException {
		Login page = new Login(driver);
		url.url(true, "/login");
		page.login();
	}

	@Test(priority = 0)
	public void login_successByAccount() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByAccount();
	}

	@Test(priority = 1)
	public void login_successByHistory() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByHistory();
	}

	@Test(priority = 2)
	public void login_successByMyList() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByMylist();
	}

	@Test(priority = 3)
	public void login_successByContinueWatching() throws InterruptedException {
		Login page = new Login(driver);
		page.loginByContinueWatching();
	}
}
