package com.qa.brightHr.factory;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFactory {

    public Browser browser;
    public BrowserContext context;
    public static Page page;
    public static Playwright playwright;
    public Properties prop;

    public Page initBrowser(Properties prop) {
        String browserName = prop.getProperty("browser");
        System.out.println("Starting the browser: " + browserName);

        playwright = Playwright.create();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();

        switch (browserName.toLowerCase()) {
            case "chromium":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "safari":
                browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browserName);
        }

        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(width, height));
        page = context.newPage();
        page.navigate(prop.getProperty("url"));

        return page;
    }

    public Properties init_properties() throws IOException {
        String configFilePath = "C:\\Users\\als22\\eclipse-workspace\\Automation_Code\\ZZZZ_BrightHRProject\\src\\test\\resources\\config\\config.properties";
        File file = new File(configFilePath);
        FileInputStream ip = new FileInputStream(file);
        prop = new Properties();
        prop.load(ip);

        return prop;
    }

    public static Page getPage() {
        return page;
    }

    public String takeScreenshot(Page page) {
        String path = System.getProperty("user.dir") + "/screenshot/" + System.currentTimeMillis() + ".png";
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)));
        return path;
    }

    public String getValueFromExcel(String sheetName, int rowNumber) throws IOException {
        String filePath = "C:\\Users\\als22\\eclipse-workspace\\Automation_Code\\Z1BrightHRProject\\src\\test\\resources\\ExcelSheets\\TestData.xlsx";
        FileInputStream fis = new FileInputStream(new File(filePath));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);

        Row row = sheet.getRow(rowNumber);

        if (row != null) {
            Cell cell2 = row.getCell(1);
            if (cell2 != null) {
                return cell2.getStringCellValue();
            }
        }
        return "Row not found or Column 2 is empty";
    }
}
