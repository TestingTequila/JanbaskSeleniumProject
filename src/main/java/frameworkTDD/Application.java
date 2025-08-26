package frameworkTDD;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Application
{
    @Test(priority = 2,dependsOnMethods = "register", alwaysRun = true, groups = "smoke")
    public void login()
    {
        System.out.println("@Test: This is my login test case...");
    }

    @Test(priority = 1, invocationCount = 10, groups = "smoke")
    public void register()
    {
        System.out.println("@Test: This is my Register test case...");
        Assert.fail();
    }

    @Test(priority = 3, enabled = false, alwaysRun = true, groups = "sanity")
    public void payment()
    {
        System.out.println("@Test: This is my Payment test case...");
    }

    @Test(priority = 4, enabled = true, invocationCount = 5, groups = "component", dependsOnGroups = "smoke")
    public void search()
    {
        System.out.println("@Test: This is my Search test case...");
    }

    @BeforeMethod
    public void openBrowserAndEnterUrl()
    {
        System.out.println("@BeforeMethod: Opening Browser and Entering the URL");
    }

    @AfterMethod
    public void closeBrowser()
    {
        System.out.println("@AfterMethod: Browser Closed...");
    }

    @Test
    public void testAttributes()
    {
        Assert.assertNotEquals(12,12);
    }

    @Test
    public void myTest()
    {
        //Assert.assertTrue(12==121);
        Assert.assertFalse(12==121);
    }
}
