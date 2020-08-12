package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenImagesPage extends Browser {

	
	String url = "https://the-internet.herokuapp.com/broken_images";
	String title = "The internet";
	String pageTitle = "Broken Images";
	String imageIcon = "[src='img/avatar-blank.jpg']";
	
	
	public void goTo() {
		super.goTo(url);
		
	}
	
	public boolean isAt() {
		return Browser.title().equals(title);
	}
	
	public boolean isPageTitleCorrect() {
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		WebDriverWait waitr = new WebDriverWait(driver, 40);
		return waitr.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".example>h3"),pageTitle));
		
	}

	public int imageAppears() {
		return driver.findElements(By.cssSelector(imageIcon)).size();
	}
}
