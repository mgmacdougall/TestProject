package com.heroku;

import org.junit.BeforeClass;
import org.junit.Test;

import com.test.Pages;

import junit.framework.Assert;


/**
 * 
 * Sample of basic navigation and confirmation of the Heroku Page
 * @author mgmac
 *
 */
@SuppressWarnings("deprecation")
public class SampleTest {
	
	@BeforeClass
	public static void setup() {
		Pages.HomePage().goTo();
	}

	@Test
	public void canGotToHomePage() {
		Pages.HomePage().isAt();
		Assert.assertTrue(Pages.HomePage().isAt());
	}
		
	@Test
	public void canGoToABTestPage() {
		Pages.ABPage().goTo();
		Pages.ABPage().isAt();
		Assert.assertTrue(Pages.ABPage().getPageTitle("A/B Test Variation 1"));
	}
	
	@Test
	public void canGoToAddRemoveElementsPage() {
		Pages.AddRemovePage().goTo();
		Pages.AddRemovePage().isAt();
		Assert.assertEquals("Add/Remove Elements", Pages.AddRemovePage().getPageTitle());
	}
	


}
