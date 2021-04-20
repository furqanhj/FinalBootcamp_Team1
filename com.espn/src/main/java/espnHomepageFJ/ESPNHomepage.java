package espnHomepageFJ;

import static espnHomepageFJ.ESPNHomepageWebElements.*;
import common.BaseAPI;
import cricinfoHomepageFJ.CricinfoHomepage;
import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ESPNHomepage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_DROPDOWN_MORE_OPTIONS_HEADER_LINKS)
    public WebElement moreOptionsDropdown;
    @FindBy (xpath = WEB_ELEMENT_BUTTON_CRICKET_LINK)
    public WebElement cricketLinkButton;

    /**
     * Initializing elements required for Assertions
     */
    @FindBy (xpath = WEB_ELEMENT_ACTUAL_LOGO_CRICINFO_PAGE)
    public WebElement actualLogoOnCricinfoPage;

    public ESPNHomepage() {
        PageFactory.initElements(driver, this);
    }

    public CricinfoHomepage navigateToCricketPage(){
        clickElement(moreOptionsDropdown);
        clickElement(cricketLinkButton);
        switchToNewTab(1);

        return new CricinfoHomepage();
    }
}
