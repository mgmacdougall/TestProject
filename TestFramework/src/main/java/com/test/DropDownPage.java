package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class DropDownPage extends Browser {

	private static final String url = "https://the-internet.herokuapp.com/dropdown";
	String title = "The internet";

	public void goTo() {
		super.goTo(url);
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

	public void selectDropDown(String selectionValue) {
		WebElement dropDownSelector =driver.findElement(By.id("dropdown"));
		Select dropdown = new Select(dropDownSelector);
		dropdown.selectByVisibleText(selectionValue);
		
	}
	
	public boolean isDropDownSelectionCorrect(String selectionValue) {
		Select dropdown = new Select(driver.findElement(By.cssSelector("#dropdown")));
		return dropdown.getAllSelectedOptions().get(0).getText().equals(selectionValue);
	}
	
	
}
