import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 1)
    void test_dummy(){
        System.out.println("login test");
    }
    @Test(priority = -1)
    void dignUp2(){
        System.out.println("sign up test 2");
    }
    @Test
    void lignUp3(){
        System.out.println("sign up test 3");
    }
}
