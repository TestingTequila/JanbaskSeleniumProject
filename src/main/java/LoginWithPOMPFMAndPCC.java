import appdata.ApplicationData;
import commonactions.ApplicationActions;
import org.openqa.selenium.WebDriver;
import pom.AccountLogin;
import pompfmwithpcc.MyStore;
import pomwithpfm.MyAccount;

public class LoginWithPOMPFMAndPCC {
    public static void main(String[] args) {

        //1- Open the browser
        WebDriver driver = ApplicationActions.launchBrowser(ApplicationData.BROWSER_NAME);

        //2- Enter the url
        driver.get(ApplicationData.APP_URL);

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

        //9- Close the browser
        ApplicationActions.closeBrowser();

    }
}
