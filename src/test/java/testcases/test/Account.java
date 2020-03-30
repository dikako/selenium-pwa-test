package testcases.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Account {
	WebDriver driver;
	Properties selector;

	public Account(WebDriver driver) throws IOException {
		this.driver = driver;

		selector = new Properties();
		FileInputStream selectorFile = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/java/selector/account.properties");
		selector.load(selectorFile);
	}
	
	//Skenario Positive Login By Email
	public void sp_login_email() throws IOException, InterruptedException {
		clickAccount();
		WebElement btn_login_page = driver.findElement(By.xpath(selector.getProperty("btn_login_page")));
		btn_login_page.isDisplayed();
		btn_login_page.click();
		Thread.sleep(5000);

		WebElement form_username = driver.findElement(By.xpath(selector.getProperty("form_username")));
		form_username.isDisplayed();
		form_username.clear();
		form_username.sendKeys(selector.getProperty("email"));
		WebElement form_password = driver.findElement(By.xpath(selector.getProperty("form_password")));
		form_password.isDisplayed();
		form_password.clear();
		form_password.sendKeys(selector.getProperty("password"));
		WebElement btn_login = driver.findElement(By.xpath(selector.getProperty("btn_login")));
		btn_login.isDisplayed();
		btn_login.click();
		Thread.sleep(10000);

		clickAccount();
		validateLoginEmail();
		logout();
		validateLogout();
	}
	
	//Skenarion Positive Login By Phone
	public void sp_login_phone() throws IOException, InterruptedException {
		clickAccount();
		btnLoginPage();

		WebElement form_username = driver.findElement(By.xpath(selector.getProperty("form_username")));
		form_username.isDisplayed();
		form_username.clear();
		form_username.sendKeys(selector.getProperty("phone"));
		WebElement form_password = driver.findElement(By.xpath(selector.getProperty("form_password")));
		form_password.isDisplayed();
		form_password.clear();
		form_password.sendKeys(selector.getProperty("password"));
		WebElement btn_login = driver.findElement(By.xpath(selector.getProperty("btn_login")));
		btn_login.isDisplayed();
		btn_login.click();
		Thread.sleep(10000);

		clickAccount();
		validateLoginPhone();
		logout();
		validateLogout();
	}
	
	//Skenario Negative Form Login Validasi Button
	public void sn_login_emailorphone_button() throws IOException, InterruptedException {
		clickAccount();
		btnLoginPage();
		
		//Form Dikosongin Semua
		WebElement form_username = driver.findElement(By.xpath(selector.getProperty("form_username")));
		form_username.isDisplayed();
		form_username.clear();
		form_username.sendKeys("");
		WebElement form_password = driver.findElement(By.xpath(selector.getProperty("form_password")));
		form_password.isDisplayed();
		form_password.clear();
		form_password.sendKeys("");
		nullEmailorPhone();
		Thread.sleep(5000);
	}
	
	//Skenario Negative Form Login Validasi Text Alert
	public void sn_login_emailorphone_alert() throws IOException, InterruptedException {
		clickAccount();
		btnLoginPage();
		
		//Invalid Email
		WebElement form_username = driver.findElement(By.xpath(selector.getProperty("form_username")));
		form_username.isDisplayed();
		form_username.clear();
		form_username.sendKeys(selector.getProperty("invalid_email"));
		WebElement form_password = driver.findElement(By.xpath(selector.getProperty("form_password")));
		form_password.isDisplayed();
		form_password.clear();
		form_password.sendKeys(selector.getProperty("password"));
		WebElement btn_login = driver.findElement(By.xpath(selector.getProperty("btn_login")));
		btn_login.click();
		Thread.sleep(5000);
		alertInvalidEmail();
		
		//Invalid Phone Number
		WebElement form__username = driver.findElement(By.xpath(selector.getProperty("form_username")));
		form__username.isDisplayed();
		form__username.clear();
		form__username.sendKeys(selector.getProperty("invalid_phone"));
		WebElement form__password = driver.findElement(By.xpath(selector.getProperty("form_password")));
		form__password.isDisplayed();
		form__password.clear();
		form__password.sendKeys(selector.getProperty("password"));
		WebElement btn__login = driver.findElement(By.xpath(selector.getProperty("btn_login")));
		btn__login.click();
		Thread.sleep(5000);
		alertInvalidPhone();
		
		//Invalid Password
		WebElement form___username = driver.findElement(By.xpath(selector.getProperty("form_username")));
		form___username.isDisplayed();
		form___username.clear();
		form___username.sendKeys(selector.getProperty("email"));
		WebElement form___password = driver.findElement(By.xpath(selector.getProperty("form_password")));
		form___password.isDisplayed();
		form___password.clear();
		form___password.sendKeys(selector.getProperty("invalid_password"));
		WebElement btn___login = driver.findElement(By.xpath(selector.getProperty("btn_login")));
		btn___login.click();
		Thread.sleep(5000);
		alertInvalidPassword();
		
		//Email Not Register
		WebElement form____username = driver.findElement(By.xpath(selector.getProperty("form_username")));
		form____username.isDisplayed();
		form____username.clear();
		form____username.sendKeys(selector.getProperty("email_not_register"));
		WebElement form____password = driver.findElement(By.xpath(selector.getProperty("form_password")));
		form____password.isDisplayed();
		form____password.clear();
		form____password.sendKeys(selector.getProperty("invalid_password"));
		WebElement btn____login = driver.findElement(By.xpath(selector.getProperty("btn_login")));
		btn____login.click();
		Thread.sleep(5000);
		alertNotRegister();
		
		//Email Not Register
		WebElement form_____username = driver.findElement(By.xpath(selector.getProperty("form_username")));
		form_____username.isDisplayed();
		form_____username.clear();
		form_____username.sendKeys(selector.getProperty("phone_not_register"));
		WebElement form_____password = driver.findElement(By.xpath(selector.getProperty("form_password")));
		form_____password.isDisplayed();
		form_____password.clear();
		form_____password.sendKeys(selector.getProperty("invalid_password"));
		WebElement btn_____login = driver.findElement(By.xpath(selector.getProperty("btn_login")));
		btn_____login.click();
		Thread.sleep(5000);
		alertNotRegister();
	}
	
	
	//Function Klik Menu Account
	public void clickAccount() throws IOException, InterruptedException {
		WebElement menu_account = driver.findElement(By.xpath(selector.getProperty("menu_account")));
		menu_account.isDisplayed();
		menu_account.click();
		Thread.sleep(10000);
	}
	
	//Function Validate Logout
	public void validateLogout() throws IOException, InterruptedException {
		String url_profile = driver.getCurrentUrl();
		Assert.assertEquals(url_profile, selector.getProperty("url_base") + selector.getProperty("url_profile"));
		WebElement wellcome = driver.findElement(By.xpath(selector.getProperty("wellcome")));
		wellcome.isDisplayed();
		wellcome.getText().contains(selector.getProperty("wellcome_text"));
	}
	
	//Function Validate Login By Phone
	public void validateLoginPhone() throws IOException, InterruptedException {
		WebElement display_name = driver.findElement(By.xpath(selector.getProperty("display_name_phone")));
		display_name.isDisplayed();
		display_name.getText().contains(selector.getProperty("name_phone"));
		display_name.click();
		Thread.sleep(5000);
	}
	
	//Function Validate Login By Email
	public void validateLoginEmail() throws IOException, InterruptedException {
		WebElement display_name = driver.findElement(By.xpath(selector.getProperty("display_name")));
		display_name.isDisplayed();
		display_name.getText().contains(selector.getProperty("name"));
		display_name.click();
		Thread.sleep(5000);
	}
	
	//Function Logout
	public void logout() throws IOException, InterruptedException {
		WebElement three_dot = driver.findElement(By.xpath(selector.getProperty("three_dot")));
		three_dot.isDisplayed();
		three_dot.click();
		WebElement log_out = driver.findElement(By.xpath(selector.getProperty("log_out")));
		log_out.isDisplayed();
		log_out.click();
		Thread.sleep(5000);
	}
	
	//Function Klik Button Menuju Login Page
	public void btnLoginPage() throws IOException, InterruptedException {
		WebElement btn_login_page = driver.findElement(By.xpath(selector.getProperty("btn_login_page")));
		btn_login_page.isDisplayed();
		btn_login_page.click();
	}
	
	//Validate Button Input Email/Password Kosong -> Disabled Button
	public void nullEmailorPhone() throws IOException, InterruptedException {
		WebElement btn_login = driver.findElement(By.xpath(selector.getProperty("btn_login")));
		Assert.assertEquals(false, btn_login.isEnabled());
	}
	
	//Validate Alert Text Invalid Input Email
	public void alertInvalidEmail() throws IOException, InterruptedException {
		WebElement alert_invalid_email = driver.findElement(By.xpath(selector.getProperty("alert_invalid_email")));
		String txt = alert_invalid_email.getText();
		Assert.assertEquals(txt, selector.getProperty("text_invalid_email"));
	}
	
	//Validate Alert Text Invalid Password
	public void alertInvalidPassword() throws IOException, InterruptedException {
		WebElement alert_invalid_password = driver.findElement(By.xpath(selector.getProperty("alert_invalid_password")));
		String txt = alert_invalid_password.getText();
		Assert.assertEquals(txt, selector.getProperty("text_invalid_password"));
	}
	
	//Validate Alert Text Invalid Phone Number
	public void alertInvalidPhone() throws IOException, InterruptedException {
		WebElement alert_invalid_phone = driver.findElement(By.xpath(selector.getProperty("alert_invalid_phone")));
		String txt = alert_invalid_phone.getText();
		Assert.assertEquals(txt, selector.getProperty("text_invalid_phone"));
	}
	
	//Validate Phone or Email Not Registered
	public void alertNotRegister() throws IOException, InterruptedException {
		Actions act = new Actions(driver);
		WebElement alert_not_register = driver.findElement(By.xpath(selector.getProperty("alert_not_register")));
		act.moveToElement(alert_not_register).click().perform();
		String txt = alert_not_register.getText();
		Assert.assertEquals(txt, selector.getProperty("text_not_register"));
		WebElement popup_ok = driver.findElement(By.xpath(selector.getProperty("popup_ok")));
		popup_ok.click();
		System.out.println(txt);
	}
	

}
