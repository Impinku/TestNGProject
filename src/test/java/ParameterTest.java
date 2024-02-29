import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @BeforeClass
    void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\E008053\\Documents\\My study\\TestNGProject\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Browser launched");
    }

    @BeforeMethod
    void launchBrowser44(){
        System.out.println("Browser launched");
    }

    @Parameters({"browser","username"})
        @Test
    void signUp(String browser, String username){
        System.out.println("sign up test"+browser+" "+username);
    }
    @Parameters({"browser"})
    @Test
    void dignUp2(String browser){
        System.out.println("sign up test 2"+browser);
    }
    @Test
    void lignUp3(){
        System.out.println("sign up test 3");
    }
}
