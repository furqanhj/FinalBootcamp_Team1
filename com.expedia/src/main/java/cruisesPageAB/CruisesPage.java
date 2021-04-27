package cruisesPageAB;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static cruisesPageAB.CruisesPageWebElement.*;

public class CruisesPage extends BaseAPI {

    @FindBy(xpath=WEB_ELEMENT_BUTTON_CRUISES_PAGE_LINK)
    public WebElement buttonCruisesPageLink;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_BACK_TO_MAIN_PAGE_LINK)
    public WebElement buttonBackToMainPage;

    public CruisesPage(){
        PageFactory.initElements(driver, this);
    }
    public void clickCruisesPageLink(){
        clickElement(buttonCruisesPageLink);
        clickElement(buttonBackToMainPage);
    }

}
