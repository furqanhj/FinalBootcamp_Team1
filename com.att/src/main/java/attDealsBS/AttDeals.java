package attDealsBS;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static attDealsBS.AttDealsWebElements.*;

public class AttDeals extends BaseAPI {
//********************
    @FindBy(xpath = WEB_ELEMENT_DEALS_CLICK)
    WebElement dealsClick;
    public AttDeals(){  //only need to write this once for the class
        PageFactory.initElements(driver, this);
    }
    public void navigateToDealsPage(){
        dealsClick.click();
    }

//*********************
    @FindBy(xpath = WEB_ELEMENT_DEALS_WIRELESS_LINK)
    WebElement dealsWirelessClick;

    public void navigateToWirelessPage(){
        dealsWirelessClick.click();
    }
//*********************

    @FindBy(xpath = WEB_ELEMENT_WIRELESS_EXPLORE_LINK)
    WebElement exploreWirelessClick;

    public void navigateToExploreWirelessPage(){
        exploreWirelessClick.click();
    }

//*********************
    @FindBy(xpath = WEB_ELEMENT_INTERNET_AND_TV)
    WebElement internetAndTvClick;

    public void navigateToInternetAndTvPage() {
        internetAndTvClick.click();
    }

 //*********************
    @FindBy(xpath = WEB_ELEMENT_SHOP_NOW)
     WebElement shopNowClick;

    public void navigateToShopNowPage() {
        clickByXpathUsingJavaScript(WEB_ELEMENT_SHOP_NOW);
        }

//*********************

    }


