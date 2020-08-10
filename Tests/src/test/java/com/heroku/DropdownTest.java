package com.heroku;

import org.junit.BeforeClass;
import org.junit.Test;

import com.test.Pages;

import junit.framework.Assert;

public class DropdownTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Pages.DropDownPage().goTo();
//		Assert.assertTrue(Pages.DropDownPage().isAt());
	}

	@Test
	public void selectOptionTwoFromDropDown() {
		Pages.DropDownPage().selectDropDown("Option 2");
		Assert.assertTrue(Pages.DropDownPage().isDropDownSelectionCorrect("Option 2"));
	}

}
