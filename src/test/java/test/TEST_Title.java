package test;

import org.testng.annotations.Test;

import test.testcases.Title;

@Test
public class TEST_Title extends Baseclass {
	String url = "https://rc-webm.rctiplus.com/";

	@Test(priority = 0)
	public void title() {
		Title page = new Title(driver);
		driver.get(url);
		page.testTitle();
	}
}
