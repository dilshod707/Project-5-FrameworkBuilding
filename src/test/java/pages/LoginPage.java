package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
public class LoginPage { //Basic Object Model
    //
//
//   private WebDriver driver;
//
    private WebElement signIn = Driver.getDriver().findElement(By.xpath("//button[@class=\"wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin header-button\"]"));
    private WebElement userName = Driver.getDriver().findElement(By.id("join_neu_email_field"));
    private WebElement password = Driver.getDriver().findElement(By.id("join_neu_password_field"));
    private WebElement submitButton = Driver.getDriver().findElement(By.name("submit_attempt"));

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSignIn() {
        return signIn;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }
}
