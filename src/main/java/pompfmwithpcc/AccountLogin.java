package pompfmwithpcc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLogin
{
    WebDriver driver;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement passwordTextBox;
    public AccountLogin(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void enterCredentials(String emailId, String password)
    {
        emailTextBox.sendKeys(emailId);
        passwordTextBox.sendKeys(password);
    }

    public  void clickOnLoginButton()
    {
        WebElement loginButton=driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }
}
