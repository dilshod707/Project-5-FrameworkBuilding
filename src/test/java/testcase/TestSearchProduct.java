package testcase;

import org.testng.Assert;
import pages.SearchPage;
import utils.Driver;
import org.testng.annotations.Test;

public class TestSearchProduct extends TestBase {

    @Test
    public void SearchField() {
        SearchPage searchPage = new SearchPage();
        searchPage.getSearchField().sendKeys("sweater");
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, "Sweater - Etsy");
    }

    @Test
    public void SearchField2() {
        SearchPage searchPage = new SearchPage();
        searchPage.getSearchField2().sendKeys("socks");
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, "Socks - Etsy");
    }

}

