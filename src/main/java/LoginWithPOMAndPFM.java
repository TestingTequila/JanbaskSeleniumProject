import appdata.ApplicationData;
import commonactions.ApplicationActions;
import org.openqa.selenium.WebDriver;
import pomwithpfm.AccountLogin;
import pomwithpfm.MyAccount;
import pomwithpfm.MyStore;

public class LoginWithPOMAndPFM {
    public static void main(String[] args) {

        //1- Open the browser
        WebDriver driver = ApplicationActions.launchBrowser(ApplicationData.BROWSER_NAME);

        //2- Enter the url
        driver.get(ApplicationData.APP_URL);

        //3- Click on My Account icon
        MyStore ms = new MyStore(driver);
        ms.clickOnMyAccountIcon();

        //4- Click on login Link
        ms.clickOnLoginLink();

        //5- Enter credentials
        AccountLogin al = new AccountLogin(driver);
        al.enterCredentials(ApplicationData.EMAIL_ID, ApplicationData.PASSWORD);

        //7- Click on Login button
        al.clickOnLoginButton();

        //8- Validate Login Status
        MyAccount ma = new MyAccount(driver);
        ma.validateLoginStatus();

        //9- Close the browser
        ApplicationActions.closeBrowser();

    }
}
