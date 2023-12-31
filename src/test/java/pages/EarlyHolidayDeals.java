package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

@Data
public class EarlyDeals {
    public EarlyDeals(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Early Holiday Deals")
    private WebElement EarlyDeals;

}
