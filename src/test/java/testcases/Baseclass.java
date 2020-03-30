package testcases;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup() throws IOException {
		Map<String, String> mobile = new HashMap<String, String>();
		mobile.put("deviceName", "Galaxy S5");
		ChromeOptions handlessOptions = new ChromeOptions();
		handlessOptions.setExperimentalOption("mobileEmulation", mobile);
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability(ChromeOptions.CAPABILITY, handlessOptions);
		driver = new ChromeDriver(caps);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://dev.rctiplus.com/");
	}

	@AfterMethod
	public void setDown() {
		driver.quit();
	}
}
