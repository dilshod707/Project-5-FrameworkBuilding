package testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Driver;

import java.time.Duration;

public class TestLogin extends TestBase {

    @Test(groups = "regression")
    public static void ValidLoginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.getSignIn().click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        loginPage.getUserName().sendKeys("davidme1988@gmail.com");
        loginPage.getPassword().sendKeys("Salom@2024");
        loginPage.getSubmitButton().click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");


    }

    @Test(groups = "smoke")
    public static void InvalidUserName() {

        LoginPage loginPage = new LoginPage();
        loginPage.getSignIn().click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        loginPage.getUserName().sendKeys("anytime@gmail.com");
        loginPage.getPassword().sendKeys("Salom@2024");
        loginPage.getSubmitButton().click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");

    }

    @Test(groups = "smoke")
    public static void InvalidPassword() {

        LoginPage loginPage = new LoginPage();
        loginPage.getSignIn().click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        loginPage.getUserName().sendKeys("davidme1988@gmail.com");
        loginPage.getPassword().sendKeys("anyway");
        loginPage.getSubmitButton().click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");


    }

}
