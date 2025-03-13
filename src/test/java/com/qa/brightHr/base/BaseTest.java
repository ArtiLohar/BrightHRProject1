package com.qa.brightHr.base;

import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.microsoft.playwright.Page;
import com.qa.brightHr.factory.PlaywrightFactory;
import com.qa.brightHr.pages.DashboardPage;
import com.qa.brightHr.pages.HomePage;
import com.qa.brightHr.pages.LoginPage;

public class BaseTest {

    PlaywrightFactory pf;
    protected Page page;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    public Properties prop;

    @BeforeTest
    public void validateTitle() throws IOException {
        pf = new PlaywrightFactory();
        prop = pf.init_properties();
        page = pf.initBrowser(prop);
        homePage = new HomePage(page);
        loginPage = new LoginPage(page);
        dashboardPage = new DashboardPage(page);
        homePage.clickOnLoginTab();
        loginPage.getUserLoggedIn(prop.getProperty("username"), prop.getProperty("password"));
        System.out.println("The user got successfully Logged in !!, currently on Dashboard page " + page.title());
    }

    @AfterTest
    public void tearDown() {
        if (dashboardPage.getPresenceOfLogoutLink()) {
            dashboardPage.clickOnLogout();
        }
        page.context().browser().close();
    }
}
