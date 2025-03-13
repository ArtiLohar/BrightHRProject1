package com.qa.brightHr.pages;

import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Page;
import com.qa.brightHr.factory.PlaywrightFactory;

public class LoginPage {

	Page page;
	Properties prop;

	// Locators
	private String emailField = "//input[@id='email']";
	private String passwordField = "//input[@id='password']";
	private String loginSubmitTab = "//button[@type='submit']";

	// Constructor to initialize the page object
	public LoginPage(Page page) throws IOException {
		this.page = page;
		PlaywrightFactory pf = new PlaywrightFactory();
		prop = pf.init_properties();
	}

	// Actions
	public void enterEmail(String email) {
		page.fill(emailField, email);
	}

	public void enterPassword(String password) {
		page.fill(passwordField, password);
	}

	public void clickLoginSubmitBttn() {
		page.click(loginSubmitTab);
	}

	public void getUserLoggedIn(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		clickLoginSubmitBttn();
	}
}
