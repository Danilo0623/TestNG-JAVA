package class_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

/*
TC 1: HRMS Add Employee:

Open chrome browser
Go to HRMS
Login into the application
Add 5 different Employees and create login credentials by providing:
First Name
Last Name
Username
Password
Verify Employee has been added successfully and take screenshot (you must have 5 different screenshots)
Close the browser
Specify group for this test case, add it into specific suite and execute from xml file.

 */
public class Task_1 {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void openAndNavigate() {
        System.setProperty("webdriver.chrome.driver", "/Users/punchcode/eclipse-workspace/TestNGProject/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 0, groups = "regression")
    public void logoAndValidLogin() throws InterruptedException {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("menu_pim_addEmployee")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Danilo");
        driver.findElement(By.id("lastName")).sendKeys("Nikolic");
        driver.findElement(By.id("chkLogin")).click();

        driver.findElement(By.id("user_name")).sendKeys("NikolicDanilo");
        driver.findElement(By.id("user_password")).sendKeys("!HelloNikolic12345#");
        driver.findElement(By.id("re_password")).sendKeys("!HelloNikolic12345#");
        driver.findElement(By.id("btnSave")).click();

        String employeeName = driver.findElement(By.xpath("//div[@id='profile-pic']//h1")).getText();
        System.out.println(employeeName);

    }


//    @Test(priority = 1,groups = "regression")
//    public void addEmployee(){
//        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
////        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
////        driver.findElement(By.id("btnLogin")).click();
//
//    }


    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        System.out.println("After method annotation");
        //driver.quit();
    }

//    public Object[][] loginCredentials(String ){
//
//    }


}
