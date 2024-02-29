import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {


    @Test(dataProvider = "create")
    void dignUp2(String username, String password) {
        System.out.println("username :" + username + "password :" + password);
    }

    @DataProvider(name = "create")
    public Object[][] dataset() {
        return new Object[][]{
                {"name1", "pass1"},
                {"name1", "pass2"},
                {"name1", "pass3"}
        };
    }
}
