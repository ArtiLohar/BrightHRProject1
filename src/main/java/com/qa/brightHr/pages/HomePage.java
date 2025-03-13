package com.qa.brightHr.pages;

import com.microsoft.playwright.Page;

public class HomePage {

    Page page;
    private String loginTab = "//a[text()='Log in']";

    public HomePage(Page page) {
        this.page = page;
    }

    public String getHomePageTitle() {
        return page.title();
    }

    public String getHomePageURL() {
        return page.url();
    }

    public void clickOnLoginTab() {
        page.click(loginTab);
    }
}
