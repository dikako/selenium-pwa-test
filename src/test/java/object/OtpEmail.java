package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OtpEmail {
	private WebDriver driver;
	
	String urlMailinator = "https://www.mailinator.com/v3/index.jsp";
	
	@FindBy(how = How.ID, id = "inbox_field")
	WebElement inputEmail;
	
	@FindBy(how = How.ID, id = "go_inbox")
	WebElement go;
	
	public OtpEmail(WebDriver driver) {
		this.driver = driver;
	}
	
	public void inputEmail(String email) {
		waitForVisible(driver, inputEmail);
		Actions actions = new Actions(driver);
		actions.moveToElement(inputEmail);
		actions.click();
		actions.sendKeys(email);
		System.out.println("Input Email: " + email);
		waitForVisible(driver, go);
		actions.moveToElement(go);
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
