package com.qa.brightHr.tests;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.brightHr.base.BaseTest;
import com.qa.brightHr.pages.AddMultiplEmployeesPage;
import com.qa.brightHr.pages.DashboardPage;
import com.qa.brightHr.pages.EmployeeHubPage;

public class Test_MultiEmployeeCreation extends BaseTest {

    public DashboardPage dashboardPage;
    public EmployeeHubPage employeeHubPage;
    public AddMultiplEmployeesPage addMultiplEmployeesPage;

    @Test
    public void verifyMultiEmployeeCreation() throws IOException {
        dashboardPage = new DashboardPage(page);
        employeeHubPage = new EmployeeHubPage(page);
        addMultiplEmployeesPage = new AddMultiplEmployeesPage(page);

        dashboardPage.clickEmployeesFromLeftPanel();
        employeeHubPage.clickOnAddEmployeesTab();
        String firstUser = addMultiplEmployeesPage.addEmployeeWithFullDetails();
        employeeHubPage.clickOnAddEmployeesTab();
        String secondUser = addMultiplEmployeesPage.addEmployeeWithFullDetails();

        boolean isFirstEmpCreated = employeeHubPage.verifyThePresenceOfCreatedEmployeeAfterSearch(firstUser);
        boolean isSecondEmployeeCreated = employeeHubPage.verifyThePresenceOfCreatedEmployeeAfterSearch(secondUser);

        Assert.assertTrue(isFirstEmpCreated);
        Assert.assertTrue(isSecondEmployeeCreated);
    }
}
