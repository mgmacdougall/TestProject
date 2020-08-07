package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


/**
 * Add Elements Page
 * @author mgmac
 *
 */
public class AddRemovePage extends Browser{

	static String url = "https://the-internet.herokuapp.com/add_remove_elements/";
	static String title = "The Internet";
	
	
	public void goTo() {
		Browser.goTo(url);
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}
	
	public String getPageTitle() {
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		return driver.findElement(By.tagName("h3")).getText();
	}

	public boolean addElement() {
		return driver.findElement(By.tagName("button")).isDisplayed();
	}

	public boolean removeElement() {
		driver.findElement(By.cssSelector(".example button")).click();
		return driver.findElement(By.cssSelector(".added-manually")).isEnabled();
	}

}
