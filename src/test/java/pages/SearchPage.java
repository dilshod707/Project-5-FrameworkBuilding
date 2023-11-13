package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement getSearchField() {
        return searchField;
    }

    @FindBy(id = "global-enhancements-search-query")
    private WebElement searchField;

    @FindBy(id = "global-enhancements-search-query")
    private WebElement searchField2;

    public WebElement getSearchField2() {
        return searchField2;
    }
}
