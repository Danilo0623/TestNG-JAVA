/*
package class_4;


import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class MikeTest_1 {
    WebDriver driver;
    private String browser;
    private String url;
    private String username;
    private String password;
    List<Employees> employeesList;

    @Test(groups = "regression")
    private void HRMAddEmployee() throws InterruptedException, IOException {
        WebElement usernameTextBox = driver.findElement(By.cssSelector("input#txtUsername"));
        WebElement passwordTextBox = driver.findElement(By.cssSelector("input#txtPassword"));
        usernameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
        loginButton.click();
        WebElement PIMButton = driver.findElement(By.xpath("//a[@id = 'menu_pim_viewPimModule']/b"));
        PIMButton.click();
        WebElement AddButton = driver.findElement(By.cssSelector("input#btnAdd"));
        AddButton.click();
        ExcelEmployeeDetails();
        addEmployees();
    }

    public void verifyEmployeeAdded() {
        WebElement employeePicture = driver.findElement(By.cssSelector("img#empPic"));
        Assert.assertTrue(employeePicture.isDisplayed());
    }

    private void addEmployees() throws IOException, InterruptedException {
        for (int i = 0; i < employeesList.size(); i++) {
            WebElement firstNameTextBox = driver.findElement(By.cssSelector("input#firstName"));
            firstNameTextBox.sendKeys(employeesList.get(i).getFirstName());

            WebElement lastNameTextBox = driver.findElement(By.cssSelector("input#lastName"));
            lastNameTextBox.sendKeys(employeesList.get(i).getLastName());

            WebElement photograph = driver.findElement(By.cssSelector("input#photofile"));
            photograph.sendKeys(employeesList.get(i).getPhotograph());

            Thread.sleep(500);
            WebElement createLoginCheckBox = driver.findElement(By.cssSelector("input#chkLogin"));
            createLoginCheckBox.click();

            WebElement usernameTextBox = driver.findElement(By.cssSelector("input#user_name"));
            usernameTextBox.sendKeys(employeesList.get(i).getUsername());

            WebElement passwordTextBox = driver.findElement(By.cssSelector("input#user_password"));
            passwordTextBox.sendKeys(employeesList.get(i).getPassword());

            WebElement confirmPasswordTextBox = driver.findElement(By.cssSelector("input#re_password"));
            confirmPasswordTextBox.sendKeys(employeesList.get(i).getConfirmPassword());

            WebElement saveButton = driver.findElement(By.cssSelector("input#btnSave"));
            saveButton.click();

            Thread.sleep(2500);

            verifyEmployeeAdded();

            Thread.sleep(2500);

            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File(".//Screenshots//" + employeesList.get(i).getUsername() + ".png"));

            WebElement PIMButton = driver.findElement(By.xpath("//a[@id = 'menu_pim_viewPimModule']/b"));
            PIMButton.click();
            WebElement AddButton = driver.findElement(By.cssSelector("input#btnAdd"));
            AddButton.click();
        }
    }

    private void ExcelEmployeeDetails() throws IOException {
        String path = "/Users/punchcode/eclipse-workspace/TestNGProject/src/class_4/Students.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook inputXSSFWorkbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet = inputXSSFWorkbook.getSheet("Data");
        employeesList = new ArrayList<>();
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            Employees employees = new Employees();
            employees.setFirstName(row.getCell(0).getStringCellValue());
            employees.setLastName(row.getCell(1).getStringCellValue());
            employees.setPhotograph(row.getCell(2).getStringCellValue());
            employees.setUsername(row.getCell(3).getStringCellValue());
            employees.setPassword(row.getCell(4).getStringCellValue());
            employees.setConfirmPassword(row.getCell(5).getStringCellValue());
            employeesList.add(employees);
            fileInputStream.close();
        }
    }

    @BeforeMethod(alwaysRun = true)
    private void launchBrowser() throws IOException {
        configurationsFile();

        switch (browser.toLowerCase()) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "/Users/punchcode/eclipse-workspace/TestNGProject/drivers/geckodriver");
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "/Users/punchcode/eclipse-workspace/TestNGProject/drivers/chromedriver");
                driver = new ChromeDriver();
                break;
        }

        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    private void quitBrowser() {
        driver.quit();
    }

    private void configurationsFile() throws IOException {
        String path = "/Users/punchcode/eclipse-workspace/TestNGProject/src/class_4/Configuration.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        browser = properties.getProperty("browser");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
    }

}
*/