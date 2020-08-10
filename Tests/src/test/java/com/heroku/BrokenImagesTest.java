package com.heroku;

import org.junit.BeforeClass;
import org.junit.Test;

import com.test.Pages;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class BrokenImagesTest {

	
	@BeforeClass
	public static void setUp() {
		Pages.BrokenImagesPage().goTo();	
	}
	
	@Test
	public  void canGoToBrokenImages() {
		Pages.BrokenImagesPage().isAt();
		Assert.assertEquals(Pages.BrokenImagesPage().imageAppears(),1);		
	}
}
