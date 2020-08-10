package com.heroku;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.test.Browser;

@RunWith(Suite.class)
@SuiteClasses({ AddRemoveTest.class, SampleTest.class, BrokenImagesTest.class, DropdownTest.class })
public class AllTests {

	@AfterClass
	public static void tearDown() {
		Browser.quit();	
	}
	
}
