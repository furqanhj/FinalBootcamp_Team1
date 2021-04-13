package airbnbEntireHomesBS;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static airbnbEntireHomesBS.AirbnbEntireHomesWebElements.*;

/*
- This class will EXTEND the BASE class (so that the constructor used on line 41, will instantiate the elements)
- Also, this class will have all the helper methods, that would be called upon in the TEST CLASS.
*/
public class AirbnbEntireHomes extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_ENTIRE_HOMES)
    public WebElement entireHomes;

    @FindBy(xpath = WEB_ELEMENT_EXPECTED_TEXT_ENTIRE_HOMES)
    public WebElement expectedTextEntireHomes;

    public AirbnbEntireHomes() {
        PageFactory.initElements(driver,this);
    }

    public void clickEntireHomesLink() {
        entireHomes.click();

    }



}
