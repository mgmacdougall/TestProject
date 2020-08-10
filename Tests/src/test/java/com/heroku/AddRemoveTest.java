package com.heroku;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.test.Browser;
import com.test.Pages;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AddRemoveTest {
	
	@BeforeClass
	public static void setup() {
		Pages.AddRemovePage().goTo();
	}
	
	@Test
	public void canGoToAddRemoveElementsPage() {

		Pages.AddRemovePage().isAt();
		Assert.assertEquals("Add/Remove Elements", Pages.AddRemovePage().getPageTitle());
	}
	
	@Test
	public void canAddElement() {
		Assert.assertEquals(true, Pages.AddRemovePage().addElement());
	}
	
	@Test
	public void canRemoveElement() {
		Assert.assertEquals(true, Pages.AddRemovePage().removeElement());
	}
	
}
