package class_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
TC 1: HRMS Add Employee:
Open chrome browser
Go to “http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Login into the application
Click on Add Employee
Verify labels: Full Name, Employee Id, Photograph are displayed
Provide Employee First and Last Name
Add a picture to the profile
Verify Employee has been added successfully
Close the browser
 */
public class HW_1 {

    WebDriver driver;
    @BeforeMethod
    public void openAndNavigate() {
        System.setProperty("webdriver.chrome.driver","/Users/punchcode/eclipse-workspace/TestNGProject/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test(priority = 0)
    public void logoValidation() {
        WebElement logo = driver.findElement(By.cssSelector("img[src$='syntax.png']"));
//        if(logo.isDisplayed()) {
//            System.out.println("Logo is displayed. Test Pass");
//        } else {
//            System.out.println("Logo is not displayed. Test Fail");
//        }
        Assert.assertTrue(logo.isDisplayed(),"its not displayed");
    }
    @Test(priority = 1) //enabled = false
    public void invalidCredentials() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin1");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm1234");
        driver.findElement(By.id("btnLogin")).click();
        String errorMessage = driver.findElement(By.id("spanMessage")).getText();

        String expectedErrorMessage="Invalid credentials";
//        if(errorMessage.equals(expectedErrorMessage)) {
//            System.out.println("Error message Invalid credentials is displayed. Test Pass");
//        } else {
//            System.out.println("Error message is not present. Test Fail");
//        }
        Assert.assertEquals(expectedErrorMessage,errorMessage,"is not Matching");
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
