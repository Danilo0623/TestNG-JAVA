package class_1;

import org.testng.annotations.Test;

public class TestNGIntro {
    @Test
    public void setup(){
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
