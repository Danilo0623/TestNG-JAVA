package class_4;

public class Notes {
    /*
    TestNG is annotation based tools/frameworks
@Test - is a main annotation and it marks our method as Test method
TestNg has annotation for precondition that is define with @Before(method, class)
TestNg has annotation for postcondition that is define with @After(method, class)
US 17667 Error message “Invalid credentials” should be displayed when user enters invalid credentials
TestNG Parameters:
- priority
    priority = 0 --> is set by default
    priority = 1 --> we are defining a priority of the test
- enabled
    enabled = true --> is a default behaviour
    enabled = false --> if we want to skip specific test
- dependsOn
    we can create Test methods that will depend on others.
    In case of failure depended method will be skipped/ignored from the execution
Assertions in TestNG (validation)
- (Hard Assertion) Assert Class
    Assert.assertTrue
    Assert.assertEquals
- (Soft Assertion) -
    SoftAssert softAsert=new SoftAssert();
    Soft assert collect all failures but does not throw an exception
    at the end we need to call method .assertAll();
To format
on Mac: option+command+L
on Windows: ctrl + alt + L
TestNG Class 3
testng.xml file is a configuration file where we can specify which classes, methods, groups etc to run
<suite name ="Any Name">
    <test name="Any Name">
        <packages>
            <classes>
                <class name ="com.syntax.class2.HW">
                    <methods>
                        <include name="logoValidation"/>
                    </methods>
                </class>
            </classes>
        </packages>
    </test>
</suite>
-----------------------------------------------------------------------------------
Assertions
Hard if assertion fails -> execution stop  right away (Assert Class)
Soft collects all failures and then at the we need to call assertAll() (SoftAssert)
@Test(dependsOnMethods="turnOn")
public void turnOff(){
    ......
}
@Test
public void turnOn(){
    ......
}
Class 4
DataProvider - allow to perform DDT (data driven testing)
    testing same functionality with different sets of data
    data and code are independent. If make any changes in the data our code in test does not get affected
groups in TestNG - allow to group test cases:
        based on type of testing (smoke, regression, database etc)
        based on the functionality( login, search, payment etc)
        based on sprint (sprint5, sprint 6, sprint7 etc )
Listeners - is feature that listens/tracking to any events that happens during test execution:
        test starts
        test pass
        test fail
        test skipped
        test finished
How to implement
    1. Create a Listener class that will implement ITestListener interface
    2. Provide implementation to the methods you want
    3. configure xml file by adding <listener>

     */
}
