package com.qa.brightHr.pages;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import com.microsoft.playwright.Page;
import com.qa.brightHr.factory.PlaywrightFactory;

public class AddMultiplEmployeesPage {

	Page page;
	Properties prop;
	PlaywrightFactory playwrightFactory;

	public AddMultiplEmployeesPage(Page page) throws IOException {

		this.page = page;
		PlaywrightFactory pf = new PlaywrightFactory();
		prop = pf.init_properties();
		playwrightFactory = new PlaywrightFactory();

	}

	// Locators
	String firstNameLocator = "//input[@id='newFirstName']";
	String lastNameLocator = "//input[@id='newLastName']";
	String addEmployeeRightCheckLocator = "//button[@aria-label=\"Add new employee\"]";

	String basicTitleLocator = "//select[@id='title']";
	String basicFirstNameLocator = "//input[@id='firstName']";
	String basicMiddleNameLocator = "//input[@id='middleName']";
	String basicLastNameLocator = "//input[@id='lastName']";
	String basicKnownAsLocator = "//input[@id='employeeKnownAs']";
	String basicDObLocator = "//input[@id='dateOfBirth']";
	String basicGenderLocator = "//select[@id='gender']";
	String basicNationalityLocator = "//select[@id='employeeNationality']";
	String basicMaritalStatusLocator = "//select[@id='employeeMaritalStatus']";
	String basicEthnicGroupLocator = "//select[@id='employeeEthnicGroup']";
	String basicNINumberLocator = "//input[@id='employeeNINumber']";
	String basicEmailLocator = "//input[@id='email']";
	String basicMobileNumberLocator = "//input[@id='mobile number']";
	String basicWorkPhoneLocator = "//input[@id='work phone number']";
	String basicJobTitleLocator = "//input[@id='jobTitle']";
	String basicEmploymentStartDateLocator = "//input[@id='startDate']";
	String basicProbationEndDateLocator = "//input[@id='probationEndDate']";

	String basicAddressLine1Locator = "//input[@id='address1']";
	String basicAddressLine2Locator = "//input[@id='address2']";
	String basicAddressLine3Locator = "//input[@id='address3']";
	String basicTownCityLocator = "//input[@id='town']";
	String basicCountyLocator = "//input[@id='county']";
	String basicPostcodeLocator = "//input[@id='postcode']";
	String basicCountryLocator = "//select[@id='employeeCountry']";

	// Bank Details
	String bankAccountNameLocator = "//input[@placeholder='Account name']";
	String bankNameLocator = "//input[@placeholder='Bank name']";
	String bankBranchLocator = "//input[@placeholder='Bank branch']";
	String bankAccountNumberLocator = "//input[@placeholder='8 digit number']";
	String bankSortCodeLocator = "//input[@placeholder='00-00-00']";

	// Salary Details
	String salaryAmountLocator = "//input[@id='salary']";
	String salaryRateLocator = "//select[@id='rate']";
	String paymentFrequencyLocator = "//select[@id='paymentFrequency']";
	String salaryEffectiveFromLocator = "//input[@id='effectiveFrom']";
	String reasonLocator = "//select[@id='reason']";
	String payrollNumberLocator = "//input[@id='payrollNumber']";

	// Sensitive Details
	String sensitiveTaxCodeLocator = "//input[@id='taxCode']";
	String sensitiveNiNumberLocator = "//input[@id='niNumber']";
	String sensitivePassportNumberLocator = "//input[@id='passportNumber']";
	String sensitiveCountryOfIssueLocator = "//select[@id='passportCountryOfIssue']";
	String sensitivePassportExpiryDateLocator = "//input[@id='passportExpiryDate']";

	// Emergency Contact
	String addEmergencyContactTabLocator = "//button[text()='Add Emergency Contact']";
	String emergencyContactFirstNameLocator = "//input[@id='emergencyFirstName']";
	String emergencyContactLastNameLocator = "//input[@id='emergencyLastName']";
	String emergencyContactMobilePhoneLocator = "//input[@id='emergencyMobilePhone']";
	String emergencyContactRelationshipLocator = "//select[@id='emergencyRelationship']";
	String emergencySaveContactLocator = "//button[text()='Save contact']";

	// License Details
	String licenceNumberLocator = "//input[@id='drivingLicenceNumber']";
	String licenceCountryOfIssueLocator = "//select[@id='drivingLicenceCountryOfIssue']";
	String licenceClassLocator = "//input[@id='drivingLicenceClass']";
	String licenceExpiryDateLocator = "//input[@id='drivingLicenceExpiryDate']";

	// Visa Details
	String visaNumberLocator = "//input[@id='visaNumber']";
	String visaExpiryDateLocator = "//input[@id='visaExpiryDate']";

	// Employee Mental Details [Section 2 of wizard]
	String juridictionSelectLocator = "//select[@id='jurisdiction']";
	String placeOfWorkAddNewButtonLocator = "//button[@aria-label=\"Add new\"]";
	String employmentTypeLocator = "//input[@value='Regular']";
	String workingPatternLocator = "//select[@id='workingPattern']";
	String contractEntitledUnitLocator = "//input[@value='days']";

	// Final Tabs
	String formSaveAndContinueLocator = "//button[text()='Save and continue']";
	String formAddAllToBrightHrLocator = "//button[text()='Add all to BrightHR']";
	String formNextButtonLocator = "//button[text()='Next']";
	String formSkipButtonLocator = "//button[text()='Skip']";
	String formSendAndContinueLocator = "//button[text()='Send & continue']";
	String formGoToEmploymentHubLocator = "//button[text()='Go to Employee Hub']";

	// Actions

	// Generate a random string of 10 characters
	public static String generateRandomString() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder randomString = new StringBuilder();
		Random random = new Random();

		// Generate a random string of length 10
		for (int i = 0; i < 10; i++) {
			int randomIndex = random.nextInt(characters.length());
			randomString.append(characters.charAt(randomIndex));
		}

		return randomString.toString();
	}

	public void clickOnAddEmployeeRightCheck() {

		page.click(addEmployeeRightCheckLocator);
	}

	// Actions
	public void enterFirstNameForEmployee(String firstNameData) {
		page.fill(firstNameLocator, firstNameData);
	}

	public void enterLastNameForEmployee(String lastNameData) {
		page.fill(lastNameLocator, lastNameData);
	}

	public void clickOnRightCheckToSave() {
		page.click(addEmployeeRightCheckLocator);
	}

	// Basic Details Section
	public void selectBasicTitleForEmployee(String titleData) {
		page.selectOption(basicTitleLocator, titleData);
	}

	public void enterBasicFirstNameForEmployee(String firstNameData) {
		page.fill(basicFirstNameLocator, firstNameData);
	}

	public void enterMiddleNameForEmployee(String middleNameData) {
		page.fill(basicMiddleNameLocator, middleNameData);
	}

	public void enterBasicLastNameForEmployee(String lastNameData) {
		page.fill(basicLastNameLocator, lastNameData);
	}

	public void enterKnownAsForEmployee(String knownAsData) {
		page.fill(basicKnownAsLocator, knownAsData);
	}

	public void enterDOBForEmployee(String dobData) {
		page.fill(basicDObLocator, dobData);
	}

	public void selectGenderForEmployee(String genderData) {
		page.selectOption(basicGenderLocator, genderData);
	}

	public void selectNationalityForEmployee(String nationalityData) {
		page.selectOption(basicNationalityLocator, nationalityData);
	}

	public void selectMaritalStatusForEmployee(String maritalStatusData) {
		page.selectOption(basicMaritalStatusLocator, maritalStatusData);
	}

	public void selectEthnicGroupForEmployee(String ethnicGroupData) {
		page.selectOption(basicEthnicGroupLocator, ethnicGroupData);
	}

	public void enterNINumberForEmployee(String niNumberData) {
		page.fill(basicNINumberLocator, niNumberData);
	}

	public void enterEmailForEmployee(String emailData) {
		page.fill(basicEmailLocator, emailData);
	}

	public void enterMobileNumberForEmployee(String mobileNumberData) {
		page.fill(basicMobileNumberLocator, mobileNumberData);
	}

	public void enterWorkPhoneForEmployee(String workPhoneData) {
		page.fill(basicWorkPhoneLocator, workPhoneData);
	}

	public void enterJobTitleForEmployee(String jobTitleData) {
		page.fill(basicJobTitleLocator, jobTitleData);
	}

	public void enterEmploymentStartDateForEmployee(String startDateData) {
		page.fill(basicEmploymentStartDateLocator, startDateData);
	}

	public void enterProbationEndDateForEmployee(String probationEndDateData) {
		page.fill(basicProbationEndDateLocator, probationEndDateData);
	}

	// Address Details Section
	public void enterAddressLine1ForEmployee(String addressLine1Data) {
		page.fill(basicAddressLine1Locator, addressLine1Data);
	}

	public void enterAddressLine2ForEmployee(String addressLine2Data) {
		page.fill(basicAddressLine2Locator, addressLine2Data);
	}

	public void enterAddressLine3ForEmployee(String addressLine3Data) {
		page.fill(basicAddressLine3Locator, addressLine3Data);
	}

	public void enterTownCityForEmployee(String townCityData) {
		page.fill(basicTownCityLocator, townCityData);
	}

	public void enterCountyForEmployee(String countyData) {
		page.fill(basicCountyLocator, countyData);
	}

	public void enterPostcodeForEmployee(String postcodeData) {
		page.fill(basicPostcodeLocator, postcodeData);
	}

	public void selectCountryForEmployee(String countryData) {
		page.selectOption(basicCountryLocator, countryData);
	}

	// Bank Details Section
	public void enterBankAccountNameForEmployee(String accountNameData) {
		page.fill(bankAccountNameLocator, accountNameData);
	}

	public void enterBankNameForEmployee(String bankNameData) {
		page.fill(bankNameLocator, bankNameData);
	}

	public void enterBankBranchForEmployee(String bankBranchData) {
		page.fill(bankBranchLocator, bankBranchData);
	}

	public void enterBankAccountNumberForEmployee(String accountNumberData) {
		page.fill(bankAccountNumberLocator, accountNumberData);
	}

	public void enterBankSortCodeForEmployee(String sortCodeData) {
		page.fill(bankSortCodeLocator, sortCodeData);
	}

	// Salary Details Section
	public void enterSalaryAmountForEmployee(String salaryAmountData) {
		page.fill(salaryAmountLocator, salaryAmountData);
	}

	public void selectSalaryRateForEmployee(String rateData) {
		page.selectOption(salaryRateLocator, rateData);
	}

	public void selectPaymentFrequencyForEmployee(String frequencyData) {
		page.selectOption(paymentFrequencyLocator, frequencyData);
	}

	public void enterSalaryEffectiveFromForEmployee(String effectiveFromData) {
		page.fill(salaryEffectiveFromLocator, effectiveFromData);
	}

	public void selectReasonForEmployee(String reasonData) {
		page.selectOption(reasonLocator, reasonData);
	}

	public void enterPayrollNumberForEmployee(String payrollNumberData) {
		page.fill(payrollNumberLocator, payrollNumberData);
	}

	// Sensitive Details Section
	public void enterTaxCodeForEmployee(String taxCodeData) {
		page.fill(sensitiveTaxCodeLocator, taxCodeData);
	}

	public void enterNiNumberForEmployee(String niNumberData) {
		page.fill(sensitiveNiNumberLocator, niNumberData);
	}

	public void enterPassportNumberForEmployee(String passportNumberData) {
		page.fill(sensitivePassportNumberLocator, passportNumberData);
	}

	public void selectCountryOfIssueForEmployee(String countryOfIssueData) {
		page.selectOption(sensitiveCountryOfIssueLocator, countryOfIssueData);
	}

	public void enterPassportExpiryDateForEmployee(String passportExpiryDateData) {
		page.fill(sensitivePassportExpiryDateLocator, passportExpiryDateData);
	}

	// Emergency Contact Section
	public void clickAddEmergencyContactTab() {
		page.click(addEmergencyContactTabLocator);
	}

	public void enterEmergencyContactFirstName(String firstNameData) {
		page.fill(emergencyContactFirstNameLocator, firstNameData);
	}

	public void enterEmergencyContactLastName(String lastNameData) {
		page.fill(emergencyContactLastNameLocator, lastNameData);
	}

	public void enterEmergencyContactMobilePhone(String mobilePhoneData) {
		page.fill(emergencyContactMobilePhoneLocator, mobilePhoneData);
	}

	public void selectEmergencyContactRelationship(String relationshipData) {
		page.selectOption(emergencyContactRelationshipLocator, relationshipData);
	}

	public void clickSaveEmergencyContact() {
		page.click(emergencySaveContactLocator);
	}

	// License Details Section
	public void enterLicenceNumberForEmployee(String licenceNumberData) {
		page.fill(licenceNumberLocator, licenceNumberData);
	}

	public void selectLicenceCountryOfIssueForEmployee(String countryOfIssueData) {
		page.selectOption(licenceCountryOfIssueLocator, countryOfIssueData);
	}

	public void enterLicenceClassForEmployee(String licenceClassData) {
		page.fill(licenceClassLocator, licenceClassData);
	}

	public void enterLicenceExpiryDateForEmployee(String expiryDateData) {
		page.fill(licenceExpiryDateLocator, expiryDateData);
	}

	// Visa Details Section
	public void enterVisaNumberForEmployee(String visaNumberData) {
		page.fill(visaNumberLocator, visaNumberData);
	}

	public void enterVisaExpiryDateForEmployee(String visaExpiryDateData) {
		page.fill(visaExpiryDateLocator, visaExpiryDateData);

	}

	// Employee Mental Details Section
	public void selectJurisdictionForEmployee(String jurisdictionData) {
		page.selectOption(juridictionSelectLocator, jurisdictionData);
	}

	public void clickAddPlaceOfWorkButton() {
		page.click(placeOfWorkAddNewButtonLocator);
	}

	public void selectEmploymentTypeForEmployee() {
		page.click(employmentTypeLocator);
	}

	public void selectWorkingPatternForEmployee(String workingPatternData) {
		page.selectOption(workingPatternLocator, workingPatternData);
	}

	public void selectContractEntitledUnitForEmployee() {
		page.click(contractEntitledUnitLocator);
	}

	// Final Tabs Section
	public void clickSaveAndContinue() {
		page.click(formSaveAndContinueLocator);
//		page.keyboard().press("Tab");
//		page.keyboard().press("Tab");
//		page.keyboard().press("Enter");
	}

	public void clickAddAllToBrightHr() {
		page.click(formAddAllToBrightHrLocator);
	}

	public void clickNextButton() {
		page.click(formNextButtonLocator);
	}

	public void clickSkipButton() {
		page.click(formSkipButtonLocator);
	}

	public void clickSendAndContinue() {
		page.click(formSendAndContinueLocator);
	}

	public void clickGoToEmploymentHub() {
		page.click(formGoToEmploymentHubLocator);
	}

	public String addEmployeeWithFullDetails() throws IOException {
		String randomString = AddMultiplEmployeesPage.generateRandomString();
		String fetchedFirstName = playwrightFactory.getValueFromExcel("EmployeeData", 1) + randomString;
		String fetchedLastName = playwrightFactory.getValueFromExcel("EmployeeData", 3) + randomString;
		enterFirstNameForEmployee(fetchedFirstName);
		enterLastNameForEmployee(fetchedLastName);
		clickOnAddEmployeeRightCheck();

		// Basic Details
		selectBasicTitleForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 0));
		enterMiddleNameForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 2));
		// enterBasicLastNameForEmployee(fetchedLastName);
		selectGenderForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 6));
		enterDOBForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 5));
		enterEmailForEmployee(randomString + playwrightFactory.getValueFromExcel("EmployeeData", 11));
		enterMobileNumberForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 12));
		enterWorkPhoneForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 13));
		enterJobTitleForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 14));
		enterEmploymentStartDateForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 15));
		enterProbationEndDateForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 16));

		// Address Details
		// Address Details Section
		enterAddressLine1ForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 17));
		enterAddressLine2ForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 18));
		enterAddressLine3ForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 19));
		enterTownCityForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 20));
		enterCountyForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 21));
		enterPostcodeForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 22));

		// Emergency Contact Section
		clickAddEmergencyContactTab();
		enterEmergencyContactFirstName(playwrightFactory.getValueFromExcel("EmployeeData", 40));
		enterEmergencyContactLastName(playwrightFactory.getValueFromExcel("EmployeeData", 41));
		enterEmergencyContactMobilePhone(playwrightFactory.getValueFromExcel("EmployeeData", 42));
		selectEmergencyContactRelationship(playwrightFactory.getValueFromExcel("EmployeeData", 43));

		clickSaveEmergencyContact();// button
									// Clicked****************************************************************

		// Bank Details Section
		enterBankAccountNameForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 24));
		enterBankNameForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 25));
		enterBankBranchForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 26));
		enterBankAccountNumberForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 27));
		enterBankSortCodeForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 28));

		// Salary Details Section
		enterSalaryAmountForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 29));
		selectSalaryRateForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 30));
		selectPaymentFrequencyForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 31));
		enterSalaryEffectiveFromForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 32));
		selectReasonForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 33));
		Random random = new Random();
		int randomNumber = 1000 + random.nextInt(9000);
		enterPayrollNumberForEmployee(randomNumber + playwrightFactory.getValueFromExcel("EmployeeData", 34));

		// Sensitive Details Section
		enterTaxCodeForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 35));
		enterNiNumberForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 36));
		enterPassportNumberForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 37));
		selectCountryOfIssueForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 38));
		enterPassportExpiryDateForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 39));

		// License Details Section
		enterLicenceNumberForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 44));
		selectLicenceCountryOfIssueForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 45));
		enterLicenceClassForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 46));
		enterLicenceExpiryDateForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 47));

		// Visa Details Section
		enterVisaNumberForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 48));
		enterVisaExpiryDateForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 49));

		clickSaveAndContinue();// button
								// Clicked****************************************************************

		// Employee Mental Details Section
		selectJurisdictionForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 50));
		selectEmploymentTypeForEmployee();
		selectWorkingPatternForEmployee(playwrightFactory.getValueFromExcel("EmployeeData", 53));

		// Contract details 
		selectContractEntitledUnitForEmployee();

		// Final Tabs Section
		clickSaveAndContinue();
		clickAddAllToBrightHr();
		clickNextButton();
		clickSkipButton();

		clickGoToEmploymentHub();
		return fetchedFirstName;

	}

}
