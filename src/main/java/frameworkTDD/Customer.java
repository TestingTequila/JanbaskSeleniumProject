package frameworkTDD;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Customer
{

    @Test
    public void register()
    {
        System.out.println("@Test: This is my Register test case...");
        SoftAssert sa = new SoftAssert();
        sa.fail();
        System.out.println("Will this Line be printed");
        sa.assertAll();
    }

    @Test
    public void search()
    {
        System.out.println("@Test: This is my Login test case...");
    }

}
