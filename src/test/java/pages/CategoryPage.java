package pages;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

@Data
public class CategoryPage {

    public CategoryPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@type=\"button\"])[1]")
    private WebElement categoryList;

    @FindBy(linkText = "Gifts")
    private WebElement giftSelect;
}
//    public WebElement getGiftSelect() {
//        return giftSelect;
//    }
//
//    public WebElement getCategoryList() {
//        return categoryList;
//    }




