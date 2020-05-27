package test.testcases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import object.EditProfile;
import object.Login;

public class Profile {
	WebDriver driver;

	By displayName = By.id("action-profile");
	By labelNickname = By.xpath("//label[contains(text(),'Nickname (Live Chat)')]");
	By nicknameInput = By.id("nickname-input");
	By formField = By.id("form-field");
	By buttonSave = By.xpath("//button[contains(text(),'Save')]");
	By alertTaken = By.xpath("//p[contains(text(),'Your Nickname Has Been Taken')]");
	By accountMenu = By.xpath("//a[contains(text(),'Account')]");

	public Profile(WebDriver driver) {
		this.driver = driver;
	}

	public void nickname() throws InterruptedException {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		login();
		gotoProfile();
		EditProfile edit = PageFactory.initElements(driver, EditProfile.class);
		edit.klikNickname();
		clearFormField();
		edit.inputNickname("teamqc" + randomInt);
		String actualAlert = driver.findElement(alertTaken).getText();
		String expectedAlert = "Your Nickname Has Been Taken";
		Assert.assertEquals(actualAlert, expectedAlert);
		System.out.println(actualAlert + " = " + expectedAlert);
	}

	public void nicknameNull() throws InterruptedException {
		String nickname = "";

		login();
		gotoProfile();
		EditProfile edit = PageFactory.initElements(driver, EditProfile.class);
		edit.klikNickname();
		clearFormField();
		edit.inputNickname(nickname);
		WebElement display = driver.findElement(alertTaken);
		if (display.isEnabled()) {
			System.err.println("Error : Button is Enabled");
		} else {
			System.out.println("Button Enabled");
		}
	}

	public void nicknameTaken() throws InterruptedException {
		String nickname = "dikakoko";

		login();
		gotoProfile();
		EditProfile edit = PageFactory.initElements(driver, EditProfile.class);
		edit.klikNickname();
		clearFormField();
		edit.inputNickname(nickname);
		String actualAlert = driver.findElement(alertTaken).getText();
		String expectedAlert = "Your Nickname Has Been Taken";
		Assert.assertEquals(actualAlert, expectedAlert);
		System.out.println(actualAlert + " = " + expectedAlert);
	}

	public void clearFormField() {
		driver.findElement(formField).click();
		driver.findElement(formField).clear();
		driver.findElement(buttonSave).isDisplayed();
	}

	public void gotoProfile() {
		driver.findElement(accountMenu).click();
		driver.findElement(displayName).click();
	}

	public void login() throws InterruptedException {
		String email = "rt@mailinator.com";
		String password = "dikakoko";

		Login login = PageFactory.initElements(driver, Login.class);
		login.inputUsername(email);
		login.inputPassword(password);
		Thread.sleep(5000);
	}
}
