package test.testcases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;

import object.Registers;

public class Register {
	WebDriver driver;

	By genders = By.id("gender");
	By wordings2 = By.xpath("//div[contains(text(),'Password must match')]");
	By wordings3 = By.xpath("//div[contains(text(),'Please Try Again Phone Number Is Incorrect')]");
	By wordings4 = By.xpath("//div[contains(text(),'please try again, phone has been taken')]");
	By gotoPhone = By.xpath("//a[contains(text(),'Phone Number')]");
	
	String email = "teamqc@mailinator.com";
	Random random = new Random();
	int randoms = random.nextInt(1000);
	int index = 5;
	int indexInvalidEmail = 22;
	String emailInvalid = "teamqc.com";
	String wordingInvalidEmail = "//div[contains(text(),'')]";
	String password = "dikakoko";
	
	public Register(WebDriver driver) {
		this.driver = driver;
	}
	
	public void register() {
		register_first();
		register_second();
	}
	
	public void invalidEmail() {
		String text = "please try again, email has been taken";
		String[] arr = text.split(" ");
		ArrayList<String> addArray = new ArrayList<String>();
		//Map<Integer, String> lengthMap = new HashMap<>();
		for (String i:arr) {
			String word = Character.toString(i.charAt(0)).toUpperCase();
			String subString = i.substring(1);
			System.out.println(word+subString);
			addArray.add(word+subString);
			String join = addArray.toString();
			String words = join.replace("[", "").replace("]", "").replace(", ", " ");
			System.out.println(words);
		}
	    
		By wording = By.xpath(wordingInvalidEmail(wordingInvalidEmail, text, indexInvalidEmail));
		System.out.println(wording);
		Registers register = PageFactory.initElements(driver, Registers.class);
		register.inputEmail(randomEmailInvalid(emailInvalid, randoms, index));
		register.inputPassword(password);
		register.inputRePassword(password);
		register.button();
		String actual = driver.findElement(wording).getText();
		Assert.assertEquals(actual, text);
	}
	
	public void register_first() {
		Registers register = PageFactory.initElements(driver, Registers.class);
		register.inputEmail(randomEmail(email, randoms, index));
		register.inputPassword(password);
		register.inputRePassword(password);
		register.button();
	}
	
	public void register_second() {
		Registers register = PageFactory.initElements(driver, Registers.class);
		register.inputGender();
		//register.button();
	}
	
	public static String randomEmail(String email, int randoms, int index ) {
		String newEmail = email.substring(0, index + 1) + randoms + email.substring(index + 1);
		return newEmail;
	}
	
	public static String randomEmailInvalid(String emailInvalid, int randoms, int index) {
		String newEmailInvalid = emailInvalid.substring(0, index + 1) + randoms + emailInvalid.substring(index + 1);
		return newEmailInvalid;
	}
	
	public static String wordingInvalidEmail(String wordingInvalidEmail, String text, int indexInvalidEmail) {
		String newWording = wordingInvalidEmail.substring(0, indexInvalidEmail + 1) + text + wordingInvalidEmail.substring(indexInvalidEmail + 1);
		return newWording;
	}
	
	public void countWords() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			System.err.println();
		}
	}
	
}
