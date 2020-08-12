package com.test;

/**
 * Driver for all test Pages
 * @author mgmac
 *
 */
public class Pages {

	public static HomePage HomePage() {
		return new HomePage();
	}

	public static ABPage ABPage() {
		return new ABPage();
	}

	public static AddRemovePage AddRemovePage() {
		return new AddRemovePage();
	}

	public static BrokenImagesPage BrokenImagesPage() {
		return new BrokenImagesPage();
	}

	public static DropDownPage DropDownPage() {
		return new DropDownPage();
	}

}
