import org.testng.annotations.Test;

public class Paralleldemo1 {
    @Test
    void lignUp3(){
        System.out.println("sign up test 3");
    }
    @Test
    void lignUp4() throws InterruptedException {
        System.out.println("sign up test 4");
        Thread.sleep(5000);
    }
    @Test
    void lignUp5() throws InterruptedException {
        Thread.sleep(20000);
        System.out.println("sign up test 5");
    }
    @Test
    void lignUp6() throws InterruptedException {
        Thread.sleep(30000);
        System.out.println("sign up test 6");
    }
    @Test
    void lignUp7(){
        System.out.println("sign up test 7");
    }
}
