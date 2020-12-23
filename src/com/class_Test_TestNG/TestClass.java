package com.class_Test_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {

    public static void main(String[] args) {
        // Testing Chrome

        System.setProperty("webdriver.chrome.driver","/Users/punchcode/eclipse-workspace/TestNGProject/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");


        // Testing Firefox

//        System.setProperty("webdriver.gecko.driver","/Users/punchcode/eclipse-workspace/TestNGProject/drivers/geckodriver");
//
//        WebDriver driver2 = new FirefoxDriver();
//
//        driver2.get("http://www.google.com/");

    }
}
