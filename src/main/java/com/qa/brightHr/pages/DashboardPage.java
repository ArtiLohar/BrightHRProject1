package com.qa.brightHr.pages;

import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Page;
import com.qa.brightHr.factory.PlaywrightFactory;

public class DashboardPage {

    Page page;
    Properties prop;

    public DashboardPage(Page page) throws IOException {
        this.page = page;
        PlaywrightFactory pf = new PlaywrightFactory();
        prop = pf.init_properties();
    }

    // Locators
    String logoutTab = "//span[text()='Logout']";
    String employeeTabFromLeftPanel = "//div[@title='Employees']";

    // Actions
    public void clickOnLogout() {
        page.click(logoutTab);
    }

    public boolean getPresenceOfLogoutLink() {
        return page.isVisible(logoutTab);
    }

    public String getTitle() {
        return page.title();
    }

    public void clickEmployeesFromLeftPanel() {
        page.click(employeeTabFromLeftPanel);
    }
}
