package class_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
US 17666 Syntax Logo should be present on the login page
US 17667 Error message “Invalid credentials” should be displayed when user enters invalid credentials
 */
public class HW_1 {
    WebDriver driver;
    @BeforeMethod
    public void openAndNavigate() {
        System.setProperty("webdriver.chrome.driver","/Users/punchcode/eclipse-workspace/TestNGProject/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test
    public void logoValidation() {
        WebElement logo = driver.findElement(By.cssSelector("img[src$='syntax.png']"));
        if(logo.isDisplayed()) {
            System.out.println("Logo is displayed. Test Pass");
        } else {
            System.out.println("Logo is not displayed. Test Fail");
        }
    }
    @Test
    public void invalidCredentials() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin1");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm1234");
        driver.findElement(By.id("btnLogin")).click();
        WebElement errorMessage = driver.findElement(By.id("spanMessage"));
        if(errorMessage.isDisplayed()) {
            System.out.println("Error message Invalid credentials is displayed. Test Pass");
        } else {
            System.out.println("Error message is not present. Test Fail");
        }
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
