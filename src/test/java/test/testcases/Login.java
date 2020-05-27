package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login {
	WebDriver driver;

	By usernames = By.xpath("//input[@id='email']");
	By passwords = By.xpath("//input[@id='password']");
	By buttons = By.xpath("//button[contains(text(),'Log In')]");
	By wordings1 = By.xpath("//div[contains(text(),'Please Try Again Email Is Incorrect')]");
	By wordings2 = By.xpath("//div[contains(text(),'Please Try Again Password Is Incorrect')]");
	By wordings3 = By.xpath("//div[contains(text(),'User has not been registered')]");
	By wordingsOk = By.xpath("//button[contains(text(),'OK')]");
	By wordings4 = By.xpath("//div[contains(text(),'Please Try Again Phone Number Is Incorrect')]");
	By emailName = By.xpath("//div[text()='dikakoko']");
	By accountMenu = By.xpath("//a[contains(text(),'Account')]");

	String email = "dikakoko04@gmail.com";
	String emailSalah = "dikakoko.com";
	String emailng = "dikakoko@gg.gg";
	String passwordSalah = "passwordsalah";
	String passwordKurang = "123456";
	String password = "dikakoko";
	String phoneSalah = "8767868768768";
	String urlProfile = "https://rc-webm.rctiplus.com/profile";

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void clearForm() {
		driver.findElement(usernames).click();
		driver.findElement(usernames).clear();
		driver.findElement(passwords).click();
		driver.findElement(passwords).clear();
	}

	public void alert1() {
		clearForm();
		driver.findElement(usernames).click();
		driver.findElement(usernames).sendKeys(emailSalah);
		driver.findElement(passwords).click();
		driver.findElement(passwords).sendKeys(passwordSalah);
		driver.findElement(buttons).click();
		String actual = driver.findElement(wordings1).getText();
		String expected = "Please Try Again Email Is Incorrect";
		Assert.assertEquals(actual, expected, "Alert1 Error");
		System.out.println("1. (Pass) Wording Email Salah: " + actual + " = " + expected);
	}

	public void alert2() {
		clearForm();
		driver.findElement(usernames).click();
		driver.findElement(usernames).sendKeys(email);
		driver.findElement(passwords).click();
		driver.findElement(passwords).sendKeys(passwordSalah);
		driver.findElement(buttons).click();
		String actual = driver.findElement(wordings2).getText();
		String expected = "Please Try Again Password Is Incorrect";
		Assert.assertEquals(actual, expected, "Alert2 Error");
		System.out.println("2. (Pass) Wording Password Salah: " + actual + " = " + expected);
	}

	public void alert3() throws InterruptedException {
		clearForm();
		driver.findElement(usernames).click();
		driver.findElement(usernames).sendKeys(emailng);
		driver.findElement(passwords).click();
		driver.findElement(passwords).sendKeys(passwordSalah);
		driver.findElement(buttons).click();
		Thread.sleep(4000);
		String actual = driver.findElement(wordings3).getText();
		String expected = "User has not been registered";
		Assert.assertEquals(actual, expected, "Alert3 Error");
		System.out.println("3. (Pass) Wording Email Belum Daftar: " + actual + " = " + expected);
		driver.findElement(wordingsOk).click();
	}

	public void alert4() {
		clearForm();
		driver.findElement(usernames).click();
		driver.findElement(usernames).sendKeys(phoneSalah);
		driver.findElement(passwords).click();
		driver.findElement(passwords).sendKeys(passwordSalah);
		driver.findElement(buttons).click();
		String actual = driver.findElement(wordings4).getText();
		String expected = "Please Try Again Phone Number Is Incorrect";
		Assert.assertEquals(actual, expected, "Alert4 Error");
		System.out.println("4. (Pass) Wording Phone Number Incorrect: " + actual + " = " + expected);
	}

	public void nameEmail() throws InterruptedException {
		// driver.get(urlProfile);
		driver.findElement(accountMenu).click();
		Thread.sleep(5000);
		String actual = driver.findElement(emailName).getText();
		String expected = "dikakoko";
		Assert.assertEquals(actual, expected, "Validate Name Error");
	}

	public void testLogin() throws InterruptedException {
		clearForm();
		driver.findElement(usernames).click();
		driver.findElement(usernames).sendKeys(email);
		driver.findElement(passwords).click();
		driver.findElement(passwords).sendKeys(password);
		driver.findElement(buttons).click();
		Thread.sleep(5000);
		nameEmail();
		System.out.println("5. (Pass) Login Success! ");
		System.out.println("Login Test Finish");
	}
	
}
