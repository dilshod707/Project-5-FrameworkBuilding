package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import utils.ConfigPropertyReader;
import utils.Driver;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {


    public static Properties properties = new Properties();


    @BeforeMethod(alwaysRun = true)
    public void setUp() {

        Driver.getDriver().manage().window().maximize();// base
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(ConfigPropertyReader.getProperty("implicit.wait"))));
        Driver.getDriver().get(ConfigPropertyReader.getProperty("url"));

    }



    @AfterMethod(alwaysRun = true)
    public void cleanUp() {
        Driver.quitDriver();
        System.out.println("Application quited successfully");
    }
}
