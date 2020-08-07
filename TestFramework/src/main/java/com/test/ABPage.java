package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


/**
 * Page for AB page
 * @author mgmac
 *
 */
public class ABPage extends Browser{

	static String url = "https://the-internet.herokuapp.com/abtest";
	static String title = "The Internet";
	
	public void goTo() {
		Browser.goTo(url);
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

	public String getPageTitle() {
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		return driver.findElement(By.tagName("h3")).getText();	
	}
	
	
}
