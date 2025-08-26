package frameworkTDD;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Users
{
    @Test(timeOut = 2000)
    public void login() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("@Test: This is my login test case...");
    }

    @BeforeMethod
    public void openBrowserAndEnterUrl()
    {
        System.out.println("@BeforeMethod: Opening Browser and Entering the URL");
    }
}
