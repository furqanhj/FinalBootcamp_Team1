package macysDealsAR;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static macysDealsAR.MacysDealsWebElements.*;

public class MacysDeals extends BaseAPI {




    @FindBy (xpath = WEB_ELEMENT_DEALS_PAGE_SEARCH_BOX)
    WebElement searchBox;
    @FindBy (xpath = WEB_ELEMENT_WALLET_IMAGE)
    WebElement walletImage;

    public MacysDeals() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToDealsPage() {
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_DEALS_LINK);
        implicitWait(20);
    }

    public void clickFindOutMoreLink() {
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_DEALS_LINK);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FIND_OUT_MORE_LINK);
        implicitWait(20);
    }

    public void navigateToAllWomensClothingDeals() throws InterruptedException {

        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_DEALS_LINK);
        implicitWait(20);
        basicHoverUsingXpath(WEB_ELEMENT_SHOP_BY_DEPARTMENT_DROP_DOWN);
        implicitWait(20);
        basicHoverUsingXpath(WEB_ELEMENT_WOMEN_DROP_DOWN_OPTION);


    }

    public void typeInDealsPageSearchBox() throws InterruptedException {
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_DEALS_LINK);
        implicitWait(20);
        typeOnElement(WEB_ELEMENT_DEALS_PAGE_SEARCH_BOX,WEB_ELEMENT_INPUT_SEARCH_BOX);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_DEALS_PAGE_SEARCH_BUTTON);
        Thread.sleep(5000);
    }
    public void verifyWalletImage(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_DEALS_LINK);
        implicitWait(20);
    }
    public void verifyOffersHeader(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_DEALS_LINK);
        implicitWait(20);
    }
    public void verifySignInPageTitle(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_DEALS_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MY_ACCOUNT_LINK);
        implicitWait(20);

    }

}