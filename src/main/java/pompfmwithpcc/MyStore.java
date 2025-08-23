package pompfmwithpcc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.AccountLogin;

import java.time.Duration;

public class MyStore
{
    WebDriver driver;

    public MyStore(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//i[@class='fa fa-user']")
    WebElement myAccountIcon;

    @FindBy(xpath = "//a[text()='Login']")
    WebElement loginLink;
    public void clickOnMyAccountIcon()
    {
        myAccountIcon.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
    }

    public AccountLogin clickOnLoginLink()
    {
        loginLink.click();
        return new AccountLogin(driver);
    }
}
