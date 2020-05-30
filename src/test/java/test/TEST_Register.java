package test;

import org.testng.annotations.Test;

import test.testcases.Register;

public class TEST_Register extends Baseclass {
	
	String url = "https://rc-webm.rctiplus.com/";
	
	@Test(priority = 1)
	public void register() throws InterruptedException {
		Register page = new Register(driver);
		driver.get(url + "register");
		page.register();
	}

	@Test(priority = 1)
	public void register_invalidEmail() throws InterruptedException {
		Register page = new Register(driver);
		driver.get(url + "register");
		page.invalidEmail();
	}
}
