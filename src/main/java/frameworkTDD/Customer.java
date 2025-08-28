package frameworkTDD;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Customer {

    @Test(enabled = false)
    public void register() {
        System.out.println("@Test: This is my Register test case...");
        SoftAssert sa = new SoftAssert();
        sa.fail();
        System.out.println("Will this Line be printed");
        sa.assertAll();
    }

    @Test(enabled = false)
    public void search() {
        System.out.println("@Test: This is my Login test case...");
    }

    @Test(dataProvider = "getData")
    public void userDetails(String name, int age)
    {
        System.out.print("Name: " + name + "\nAge: " + age);
        System.out.println("\n=================================");
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = {{"Jason", 23}, {"Roger", 34}, {"Kerrie", 19}};
        return data;
    }

}
