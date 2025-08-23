package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pomwithpfm.MyAccount;

public class AccountLogin
{
    WebDriver driver;

    public AccountLogin(WebDriver driver)
    {
        this.driver = driver;
    }
    public void enterCredentials(String emailId, String password)
    {
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys(emailId);

        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys(password);
    }

    public MyAccount clickOnLoginButton()
    {
        WebElement loginButton=driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        return new MyAccount(driver);
    }
}
