package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import testcases.test.Account;
import testcases.test.Title;

@Test
public class Mainclass extends Baseclass{
	
	@Test(priority = 0)
	public void test_title() {
		Title page = new Title(driver);
		page.title();
	}
	
	@Test(priority = 1)
	public void sp_login_email() throws IOException, InterruptedException {
		Account page = new Account(driver);
		page.sp_login_email();
	}
	
	@Test(priority = 2)
	public void sp_login_phone() throws IOException, InterruptedException {
		Account page = new Account(driver);
		page.sp_login_phone();
	}
	
	@Test(priority = 3)
	public void sn_login_emailorphone_button() throws IOException, InterruptedException {
		Account page = new Account(driver);
		page.sn_login_emailorphone_button();
	}
	
	@Test(priority = 3)
	public void sn_login_emailorphone_alert() throws IOException, InterruptedException {
		Account page = new Account(driver);
		page.sn_login_emailorphone_alert();
	}
	
	
}
