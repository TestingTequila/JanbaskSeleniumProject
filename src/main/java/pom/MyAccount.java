package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount {
    WebDriver driver;

    public MyAccount(WebDriver driver) {
        this.driver = driver;
    }


    public void validateLoginStatus() {
        String pageTitle = driver.getTitle();
        if (pageTitle.equals("My Account")) {
            System.out.println("Login is successful");
        } else {
            System.out.println("Login Failed...Please check your credentials...");
        }
    }
}
