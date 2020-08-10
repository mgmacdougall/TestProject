package com.heroku;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.test.Browser;
import com.test.Pages;

@RunWith(Suite.class)
@SuiteClasses({ AddRemoveTest.class, SampleTest.class })
public class AllTests {

//	@BeforeClass
//	public static void setup() {
//		Pages.HomePage().goTo();
//	}
	
	
	@AfterClass
	public static void tearDown() {
		Browser.quit();
		
		
	}
	
}
