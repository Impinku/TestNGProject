import org.testng.annotations.Test;

public class DependentTest {
    @Test(dependsOnMethods = {"lignUp3"})
    void dignUp2(){
        System.out.println("sign up test 2");
    }
    @Test
    void lignUp3(){
        System.out.println("sign up test 3");
    }
    @Test(dependsOnMethods = {"dignUp2"})
    void lignUp4(){
        System.out.println("sign up test 4");
    }
    @Test(dependsOnMethods = {"dignUp2","lignUp4"})
    void lignUp5(){
        System.out.println("sign up test 5");
    }
}
