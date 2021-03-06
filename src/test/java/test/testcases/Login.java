package test.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void invalidEmail() {
		String email = "dikakoko.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Email Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Email");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.invalidEmail(wording);
	}
	
	public void loginByAccountinvalidEmail() {
		String email = "dikakoko.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Email Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Email");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.goLogin(true);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.invalidEmail(wording);
	}
	
	public void loginByHistoryinvalidEmail() {
		String email = "dikakoko.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Email Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Email");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.history(true);
		login.popupLogin(true);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.invalidEmail(wording);
	}
	
	public void loginByMylistinvalidEmail() {
		String email = "dikakoko.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Email Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Email");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.mylist(true);
		login.popupLogin(true);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.invalidEmail(wording);
	}
	
	public void loginByContinueWatchinginvalidEmail() {
		String email = "dikakoko.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Email Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Email");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.continueWatching(true);
		login.popupLogin(true);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.invalidEmail(wording);
	}

	public void invalidPassword() {
		String email = "dikakoko04@gmail.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Password Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Password");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.invalidPassword(wording);
	}
	
	public void loginByAccountinvalidPassword() {
		String email = "dikakoko04@gmail.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Password Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Password");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.goLogin(true);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.invalidPassword(wording);
	}
	
	public void loginByHistoryinvalidPassword() {
		String email = "dikakoko04@gmail.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Password Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Password");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.history(true);
		login.popupLogin(true);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.invalidPassword(wording);
	}
	
	public void loginByMylistinvalidPassword() {
		String email = "dikakoko04@gmail.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Password Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Password");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.mylist(true);
		login.popupLogin(true);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.invalidPassword(wording);
	}
	
	public void loginByContinueWatchinginvalidPassword() {
		String email = "dikakoko04@gmail.com";
		String password = "passwordsalah";
		String wording = "Please Try Again Password Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Password");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.continueWatching(true);
		login.popupLogin(true);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.invalidPassword(wording);
	}

	public void notRegisteredEmail() throws InterruptedException {
		String email = "dikakoko@gg.gg";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN - Test Email Not Registered");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.notRegistered(wording);
	}
	
	public void loginByAccountnotRegisteredEmail() throws InterruptedException {
		String email = "dikakoko@gg.gg";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN - Test Email Not Registered");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.goLogin(true);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.notRegistered(wording);
	}
	
	public void loginByHistorynotRegisteredEmail() throws InterruptedException {
		String email = "dikakoko@gg.gg";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN - Test Email Not Registered");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.history(true);
		login.popupLogin(true);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.notRegistered(wording);
	}
	
	public void loginByMylistnotRegisteredEmail() throws InterruptedException {
		String email = "dikakoko@gg.gg";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN - Test Email Not Registered");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.mylist(true);
		login.popupLogin(true);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.notRegistered(wording);
	}
	
	public void loginByContinueWatchingnotRegisteredEmail() throws InterruptedException {
		String email = "dikakoko@gg.gg";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN - Test Email Not Registered");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.continueWatching(true);
		login.popupLogin(true);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.notRegistered(wording);
	}

	public void notRegisteredPhone() throws InterruptedException {
		String phone = "08229098776544";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN - Test Phone Number Not Registered");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button(true);
		login.notRegistered(wording);
	}
	
	public void loginByAccountnotRegisteredPhone() throws InterruptedException {
		String phone = "08229098776544";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN - Test Phone Number Not Registered");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.goLogin(true);
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button(true);
		login.notRegistered(wording);
	}
	
	public void loginByHistorynotRegisteredPhone() throws InterruptedException {
		String phone = "08229098776544";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN - Test Phone Number Not Registered");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.history(true);
		login.popupLogin(true);
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button(true);
		login.notRegistered(wording);
	}
	
	public void loginByMylistnotRegisteredPhone() throws InterruptedException {
		String phone = "08229098776544";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN - Test Phone Number Not Registered");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.mylist(true);
		login.popupLogin(true);
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button(true);
		login.notRegistered(wording);
	}
	
	public void loginByContinueWatchingnotRegisteredPhone() throws InterruptedException {
		String phone = "08229098776544";
		String password = "passwordsalah";
		String wording = "User has not been registered";

		System.out.println("LOGIN - Test Phone Number Not Registered");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.continueWatching(true);
		login.popupLogin(true);
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button(true);
		login.notRegistered(wording);
	}

	public void invalidPhone() {
		String phone = "8767868768768";
		String password = "passwordsalah";
		String wording = "Please Try Again Phone Number Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Phone Number");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button(true);
		login.invalidPhone(wording);
	}
	
	public void loginByAccountinvalidPhone() {
		String phone = "8767868768768";
		String password = "passwordsalah";
		String wording = "Please Try Again Phone Number Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Phone Number");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.goLogin(true);
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button(true);
		login.invalidPhone(wording);
	}
	
	public void loginByHistoryinvalidPhone() {
		String phone = "8767868768768";
		String password = "passwordsalah";
		String wording = "Please Try Again Phone Number Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Phone Number");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.history(true);
		login.popupLogin(true);
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button(true);
		login.invalidPhone(wording);
	}
	
	public void loginByMylistinvalidPhone() {
		String phone = "8767868768768";
		String password = "passwordsalah";
		String wording = "Please Try Again Phone Number Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Phone Number");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.mylist(true);
		login.popupLogin(true);
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button(true);
		login.invalidPhone(wording);
	}
	
	public void loginByContinueWatchinginvalidPhone() {
		String phone = "8767868768768";
		String password = "passwordsalah";
		String wording = "Please Try Again Phone Number Is Incorrect";

		System.out.println("LOGIN - Test Input Invalid Phone Number");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.continueWatching(true);
		login.popupLogin(true);
		login.inputUsername(phone);
		login.inputPassword(password);
		login.button(true);
		login.invalidPhone(wording);
	}

	public void login() throws InterruptedException {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";

		System.out.println("LOGIN - Test Login Success");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.account(true);
		login.displayName(name);
	}

	public void loginByAccount() {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";

		System.out.println("LOGIN By Account Menu - Test Login Success");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.goLogin(true);
		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.account(true);
		login.displayName(name);
	}

	public void loginByHistory() throws InterruptedException {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";

		System.out.println("LOGIN By History Menu - Test Login Success");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.history(true);

		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.account(true);
		login.displayName(name);
	}

	public void loginByMylist() throws InterruptedException {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";

		System.out.println("LOGIN By My List Menu - Test Login Success");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.mylist(true);

		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.account(true);
		login.displayName(name);
	}

	public void loginByContinueWatching() throws InterruptedException {
		String email = "dikakoko04@gmail.com";
		String password = "dikakoko";
		String name = "dikakoko";

		System.out.println("LOGIN By Continue Watching Menu - Test Login Success");
		object.Login login = PageFactory.initElements(driver, object.Login.class);
		login.account(true);
		login.continueWatching(true);

		login.inputUsername(email);
		login.inputPassword(password);
		login.button(true);
		login.account(true);
		login.displayName(name);
	}
}
