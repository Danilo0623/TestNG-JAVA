package com.class_Test_TestNG;

import org.testng.annotations.Test;

public class TestNG {
    @Test
   void setup(){
       System.out.println("Opening Browser");
   }

    @Test
    void login(){
        System.out.println("this is login test");
    }

    @Test
    void teardown(){
        System.out.println("closing browser");
    }
}
