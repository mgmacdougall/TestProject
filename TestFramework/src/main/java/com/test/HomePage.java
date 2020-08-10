package com.test;

public class HomePage {

	static String url = "https://the-internet.herokuapp.com/";
	static String title = "The Internet";
	
	public void goTo() {
		Browser.goTo(url);
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
