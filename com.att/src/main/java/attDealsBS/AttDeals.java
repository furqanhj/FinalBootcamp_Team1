package attDealsBS;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static attDealsBS.AttDealsWebElements.*;

public class AttDeals extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_DEALS_CLICK)
    WebElement dealsClick;

    public AttDeals() {  //only need to write this once for the class
        PageFactory.initElements(driver, this);
    }

    public void navigateToDealsPage() {
        dealsClick.click();
    }

    //*********************
    @FindBy(xpath = WEB_ELEMENT_DEALS_WIRELESS_LINK)
    WebElement dealsWirelessClick;

    public void navigateToWirelessPage() {
        dealsWirelessClick.click();
    }
//*********************

    @FindBy(xpath = WEB_ELEMENT_WIRELESS_EXPLORE_LINK)
    WebElement exploreWirelessClick;

    public void navigateToExploreWirelessPage() {
        exploreWirelessClick.click();
    }

    //*********************
    @FindBy(xpath = WEB_ELEMENT_INTERNET_AND_TV)
    WebElement internetAndTvClick;

    public void navigateToInternetAndTvPage() {
        internetAndTvClick.click();
    }

    @FindBy(xpath = WEB_ELEMENT_SHOP_NOW)
    WebElement shopNowClick;

    public void navigateToShopNowPage() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOP_NOW);
    }

    //*********************
    @FindBy(xpath = WEB_ELEMENT_ACCESSORIES)
    WebElement accessories;
    @FindBy(xpath = WEB_ELEMENT_HEADPHONES)
    WebElement headphones;
    @FindBy(xpath = WEB_ELEMENT_CASES)
    WebElement cases;
    @FindBy(xpath = WEB_ELEMENT_CHARGERS)
    WebElement chargers;

    public void accessoriesHeaderDisplays() {
        dealsClick.click();
        accessories.click();

    }

    public void headphonesHeaderDisplays() {
        dealsClick.click();
        accessories.click();
        headphones.click();
    }

    public void casesHeaderDisplays() {
        dealsClick.click();
        accessories.click();
        cases.click();
    }

    public void chargersHeaderDisplays() {
        dealsClick.click();
        accessories.click();
        chargers.click();
    }

    @FindBy(xpath = WEB_ELEMENT_IM_LOOKING_FOR)
    WebElement imLookingForField;
    @FindBy(xpath = WEB_ELEMENT_SEARCH_BUTTON)
    WebElement searchButton;

    public void searchForIphone12() {
        dealsClick.click();
        imLookingForField.click();
        imLookingForField.sendKeys(WEB_ELEMENT_IPHONE12_SEARCH);
        searchButton.click();
    }

    public void searchForIphone12ProMax() {
        dealsClick.click();
        imLookingForField.click();
        imLookingForField.sendKeys(WEB_ELEMENT_IPHONE12PRO_MAX_SEARCH);
        searchButton.click();

    }
}


