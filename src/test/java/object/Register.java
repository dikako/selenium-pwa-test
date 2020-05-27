package object;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {
	private WebDriver driver;
	Properties selector;

	@FindBy(how = How.XPATH, xpath = "//input[@id='email']")
	WebElement formEmail;

	@FindBy(how = How.XPATH, xpath = "//input[@id='password']")
	WebElement formPassword1;

	@FindBy(how = How.XPATH, xpath = "//input[@id='password2']")
	WebElement formPassword2;

	@FindBy(how = How.XPATH, xpath = "//button[@class='btn-next block-btn btn btn-secondary']")
	WebElement buttonNext;

	@FindBy(how = How.XPATH, xpath = "//input[@id='fullname']")
	WebElement formFullname;

	@FindBy(how = How.XPATH, xpath = "//input[@id='BirthDate']")
	WebElement formBirthday;

	@FindBy(how = How.XPATH, xpath = "//input[@id='gender']")
	WebElement formGender;

	@FindBy(how = How.XPATH, xpath = "//body//input[1]")
	WebElement formOtp;

	@FindBy(how = How.XPATH, xpath = "//button[contains(text(),'Drama')]")
	WebElement formInterest1;

	@FindBy(how = How.XPATH, xpath = "//button[contains(text(),'Comedy')]")
	WebElement formInterest2;

	@FindBy(how = How.XPATH, xpath = "//button[contains(text(),'SitCom')]")
	WebElement formInterest3;

	@FindBy(how = How.XPATH, xpath = "//button[contains(text(),'Animation')]")
	WebElement formInterest4;

	@FindBy(how = How.XPATH, xpath = "//button[contains(@class,'btn-next btn btn-secondary')]")
	WebElement buttonSave;

	public Register(WebDriver driver) throws IOException {
		this.driver = driver;
	}

	public void inputEmail(String email) {
		waitForVisible(driver, formEmail);
		Actions actions = new Actions(driver);
		actions.moveToElement(formEmail);
		actions.click();
		actions.sendKeys(email);
		actions.build().perform();
		System.out.println("Email Entered: " + email);
	}

	public void inputPassword(String password1) {
		waitForVisible(driver, formPassword1);
		Actions actions = new Actions(driver);
		actions.moveToElement(formPassword1);
		actions.click();
		actions.sendKeys(password1);
		actions.build().perform();
		System.out.println("Password Entered: " + password1);
	}

	public void inputPassword2(String password2) {
		waitForVisible(driver, formPassword2);
		Actions actions = new Actions(driver);
		actions.moveToElement(formPassword2);
		actions.click();
		actions.sendKeys(password2);
		actions.build().perform();
		System.out.println("Password Entered: " + password2);
	}

	private void waitForVisible(WebDriver driver, WebElement element) {
		try {
			Thread.sleep(1000);
			System.out.println("Waiting for element visibility");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
