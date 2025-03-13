package com.qa.brightHr.pages;

import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Page;
import com.qa.brightHr.factory.PlaywrightFactory;

public class EmployeeHubPage {

    Page page;
    Properties prop;

    public EmployeeHubPage(Page page) throws IOException {
        this.page = page;
        PlaywrightFactory pf = new PlaywrightFactory();
        prop = pf.init_properties();
    }

    // Locators
    String addEmployeesTab = "//button[text()='Add employees']";
    String filterName = "//input[@id='find-emp']";

    // Actions
    public void clickOnAddEmployeesTab() {
        page.click(addEmployeesTab);
    }

    public boolean verifyThePresenceOfCreatedEmployeeAfterSearch(String name) {
        String dynamicXpath = "//div[contains(@class,'BasicInfo-')]/p[contains(text(),'"+name+"')]";
        page.fill(filterName, name);
        return page.locator(dynamicXpath).isVisible();
    }
}
