package object;

import org.openqa.selenium.WebDriver;

public class Url {
	private WebDriver driver;
	
	String baseUrl = "https://rc-webm.rctiplus.com";
	
	public Url(WebDriver driver) {
		this.driver = driver;
	}
	
	public void url(boolean urls, String url) {
		
		if (urls == false && url == null) {
		driver.get(baseUrl);
		System.out.println("Url: " + driver.getCurrentUrl());
		} else {
			driver.get(baseUrl + url );
			System.out.println("Url: " + driver.getCurrentUrl());
		}
		
		
		
	}
}
