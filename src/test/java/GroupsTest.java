import org.testng.annotations.Test;

public class GroupsTest {
    @Test
    void lignUp3(){
        System.out.println("sign up test 3");
    }
    @Test(groups = {"run"})
    void lignUp4(){
        System.out.println("sign up test 4");
    }
    @Test(groups = {"run"})
    void lignUp5(){
        System.out.println("sign up test 5");
    }
}
