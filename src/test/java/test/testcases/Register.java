package test.testcases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Register {
	WebDriver driver;
	
	By emails = By.xpath("//input[@id='email']");
	By passwords = By.xpath("//input[@id='password']");
	By repasswords = By.xpath("//input[@id='password2']");
	By phones = By.xpath("//input[@id='phone_number']");
	By emailsMenu = By.xpath("//a[contains(text(),'Email')]");
	By buttons = By.xpath("//button[contains(text(),'NEXT')]");
	By wordings1 = By.xpath("//div[contains(text(),'please try again, email has been taken')]");
	By wordings2 = By.xpath("//div[contains(text(),'Password must match')]");
	By wordings3 = By.xpath("//div[contains(text(),'Please Try Again Phone Number Is Incorrect')]");
	By wordings4 = By.xpath("//div[contains(text(),'please try again, phone has been taken')]");
	By gotoPhone = By.xpath("//a[contains(text(),'Phone Number')]");
	
	String email = "paijo@mailinator.com";
	String password = "dikakoko";
	String passwordBeda = "sdfhgadfg";
	String phoneSalah = "1234234242";
	String phoneTaken = "82278843303";
	
	String mailinator = "https://www.mailinator.com/v3/index.jsp";
	
	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(1000);
			
	public Register(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clearForm() {
		driver.findElement(emails).click();
		driver.findElement(emails).clear();
		driver.findElement(passwords).click();
		driver.findElement(passwords).clear();
		driver.findElement(repasswords).click();
		driver.findElement(repasswords).clear();
	}
	
	public void clearFormPhone() {
		driver.findElement(phones).click();
		driver.findElement(phones).clear();
		driver.findElement(passwords).click();
		driver.findElement(passwords).clear();
		driver.findElement(repasswords).click();
		driver.findElement(repasswords).clear();
	}
	
	public void alert1() throws InterruptedException {
		clearForm();
		driver.findElement(emails).click();
		driver.findElement(emails).sendKeys(email);
		driver.findElement(passwords).click();
		driver.findElement(passwords).sendKeys(password);
		driver.findElement(repasswords).click();
		driver.findElement(repasswords).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(buttons).click();
		String actual = driver.findElement(wordings1).getText();
		String expected = "please try again, email has been taken";
		Assert.assertEquals(actual, expected);
	}
	
	public void alert2() throws InterruptedException {
		clearForm();
		driver.findElement(emails).click();
		driver.findElement(emails).sendKeys("qc" + randomInt + "@mailinator.com");
		driver.findElement(passwords).click();
		driver.findElement(passwords).sendKeys(password);
		driver.findElement(repasswords).click();
		driver.findElement(repasswords).sendKeys(passwordBeda);
		Thread.sleep(5000);
		driver.findElement(buttons).click();
		String actual = driver.findElement(wordings2).getText();
		String expected = "Password must match";
		Assert.assertEquals(actual, expected);
	}
	
	public void alert3() throws InterruptedException {
		gotoPhone();
		clearFormPhone();
		driver.findElement(phones).click();
		driver.findElement(phones).sendKeys(phoneSalah);
		driver.findElement(passwords).click();
		driver.findElement(passwords).sendKeys(password);
		driver.findElement(repasswords).click();
		driver.findElement(repasswords).sendKeys(passwordBeda);
		Thread.sleep(5000);
		driver.findElement(buttons).click();
		String actual = driver.findElement(wordings3).getText();
		String expected = "Please Try Again Phone Number Is Incorrect";
		Assert.assertEquals(actual, expected);
	}
	
	public void alert4() throws InterruptedException {
		gotoPhone();
		clearFormPhone();
		driver.findElement(phones).click();
		driver.findElement(phones).sendKeys(phoneTaken);
		driver.findElement(passwords).click();
		driver.findElement(passwords).sendKeys(password);
		driver.findElement(repasswords).click();
		driver.findElement(repasswords).sendKeys(passwordBeda);
		Thread.sleep(5000);
		driver.findElement(buttons).click();
		String actual = driver.findElement(wordings4).getText();
		String expected = "please try again, phone has been taken";
		Assert.assertEquals(actual, expected);
	}
	
	public void gotoPhone() throws InterruptedException {
		driver.findElement(gotoPhone).click();
	}
	
	

}
