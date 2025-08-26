import appdata.ApplicationData;
import commonactions.ApplicationActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.AccountLogin;
import pompfmwithpcc.MyStore;
import pomwithpfm.MyAccount;

public class LoginWithPOMPFMAndPCCTestNG {

    WebDriver driver;
    @BeforeMethod
    public void openBrowserAndEnterUrl()
    {
        //1- Open the browser
        driver = ApplicationActions.launchBrowser(ApplicationData.BROWSER_NAME);

        //2- Enter the url
        driver.get(ApplicationData.APP_URL);
    }


    @Test(priority = 2)
    public  void login1()
    {
        //3- Click on My Account icon
        MyStore ms = new MyStore(driver);
        ms.clickOnMyAccountIcon();

        //4- Click on login Link
        AccountLogin al =ms.clickOnLoginLink();

        //5- Enter credentials
        al.enterCredentials(ApplicationData.EMAIL_ID, ApplicationData.PASSWORD);

        //7- Click on Login button
        MyAccount ma=al.clickOnLoginButton();

        //8- Validate Login Status
        ma.validateLoginStatus();
    }

    @Test(priority = 3)
    public  void login2()
    {
        //3- Click on My Account icon
        MyStore ms = new MyStore(driver);
        ms.clickOnMyAccountIcon();

        //4- Click on login Link
        AccountLogin al =ms.clickOnLoginLink();

        //5- Enter credentials
        al.enterCredentials(ApplicationData.INVALID_EMAIL_ID, ApplicationData.INVALID_PASSWORD);

        //7- Click on Login button
        MyAccount ma=al.clickOnLoginButton();

        //8- Validate Login Status
        ma.validateLoginStatus();
    }
    @Test(priority = 1)
    public  void login3()
    {
        //3- Click on My Account icon
        MyStore ms = new MyStore(driver);
        ms.clickOnMyAccountIcon();

        //4- Click on login Link
        AccountLogin al =ms.clickOnLoginLink();

        //5- Enter credentials
        al.enterCredentials(ApplicationData.EMAIL_ID, ApplicationData.PASSWORD);

        //7- Click on Login button
        MyAccount ma=al.clickOnLoginButton();

        //8- Validate Login Status
        ma.validateLoginStatus();
    }

    @AfterMethod
    public  void closeBrowser()
    {
        //9- Close the browser
        ApplicationActions.closeBrowser();
    }



}
