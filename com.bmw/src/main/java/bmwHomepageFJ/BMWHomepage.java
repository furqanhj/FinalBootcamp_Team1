package bmwHomepageFJ;

import static bmwHomepageFJ.BMWHomepageWebElements.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BMWHomepage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_OWNERS_DROPDOWN)
    public WebElement ownersDropdown;


    /**
     * Initializing elements required for Assertions
     */
    @FindBy (xpath = WEB_ELEMENTS_NUMBER_OF_LINKS_BMW_OWNERS)
    public List<WebElement> actualNumOfLinksBMWOwners;
    @FindBy (xpath = WEB_ELEMENTS_NUMBER_OF_LINKS_KNOW_YOUR_BMW)
    public List<WebElement> actualNumOfLinksKnowYourBMW;
    @FindBy (xpath = WEB_ELEMENTS_NUMBER_OF_LINKS_CARING_FOR_YOUR_BMW)
    public List<WebElement> actualNumOfLinksCaringForYourBMW;

    /**
     * Creating Getters For Assertions with Excel File
     */
    public String GET_WEB_ELEMENTS_NUMBER_OF_LINKS_BMW_OWNERS(){
        return WEB_ELEMENTS_NUMBER_OF_LINKS_BMW_OWNERS;
    }

    public String GET_WEB_ELEMENTS_NUMBER_OF_LINKS_KNOW_YOUR_BMW(){
        return WEB_ELEMENTS_NUMBER_OF_LINKS_KNOW_YOUR_BMW;
    }

    public String GET_WEB_ELEMENTS_NUMBER_OF_LINKS_CARING_FOR_YOUR_BMW(){
        return WEB_ELEMENTS_NUMBER_OF_LINKS_CARING_FOR_YOUR_BMW;
    }

    public BMWHomepage(){
        PageFactory.initElements(driver, this);
    }

    public void clickOnOwnersDropdown(){
        clickElement(ownersDropdown);
    }

}
