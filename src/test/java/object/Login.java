package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	private WebDriver driver;

	@FindBy(how = How.ID, id = "email")
	WebElement formUsername;

	@FindBy(how = How.ID, id = "password")
	WebElement formPassword;

	@FindBy(how = How.XPATH, xpath = "//button[contains(text(),'Log In')]")
	WebElement btnLogin;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void inputUsername(String username) {
		waitForVisible(driver, formUsername);
		Actions actions = new Actions(driver);
		actions.moveToElement(formUsername);
		actions.click();
		actions.sendKeys(username);
		actions.build().perform();
		System.out.println("Username: " + username);
	}

	public void inputPassword(String password){
		waitForVisible(driver, formPassword);
		Actions actions = new Actions(driver);
		actions.moveToElement(formPassword);
		actions.click();
		actions.sendKeys(password);
		System.out.println("Password: " + password);
		waitForVisible(driver, btnLogin);
		actions.moveToElement(btnLogin);
		actions.click();
		actions.build().perform();
	}

	private void waitForVisible(WebDriver driver, WebElement element) {
		try {
			Thread.sleep(2000);
			System.out.println("Waiting for element visibility");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
