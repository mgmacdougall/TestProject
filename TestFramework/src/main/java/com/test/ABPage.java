package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

	public Boolean getPageTitle(String pageTitle) {
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		WebDriverWait waitr = new WebDriverWait(driver, 40);
		return waitr.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".example>h3"), pageTitle));
	}
	
	
}
