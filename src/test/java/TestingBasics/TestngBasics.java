package TestingBasics;
import org.testng.annotations.*;

public class TestngBasics {
    String url;

    @BeforeClass
    public void beforeclass() {
        System.out.println("==before class");
        url = "https://www.saucedemo.com/";
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("==Before method");
        System.out.println("Open browser");
        System.out.println("Navigate to " + url);
    }

    @Test
    public static void verify_Login_with_valid_Credentials() {
        System.out.println("==Test method1");
        System.out.println("Enter Username");
        System.out.println("Enter Password");
        System.out.println("Click Login button");
        System.out.println("Verify Login is successful");
    }
    @Test
    public static void verify_Login_with_Invalid_Credentials() {
        System.out.println("==Test method2");
        System.out.println("Enter Username");
        System.out.println("Enter Password");
        System.out.println("Click Login button");
        System.out.println("Verify Login is successful");
    }

    //    @Test
//    public static void myFirstTest2(){
//        System.out.println("2nd Method");
//    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("==aftermethod");
        System.out.println("close browser");

    }

    @AfterClass
    public void afterClass() {
        System.out.println("==after class");
    }

}
