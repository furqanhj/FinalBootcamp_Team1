package chaseBusinessBS;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static chaseBusinessBS.ChaseBusinessWebElements.*;

public class ChaseBusiness extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_SIDE_MENU)
    WebElement sideMenu;
    @FindBy(xpath = WEB_ELEMENT_SEE_ALL)
    WebElement seeAll;
    @FindBy(xpath = WEB_ELEMENT_BUSINESS_LINK)
    WebElement business;
    @FindBy(xpath = WEB_ELEMENT_BUSINESS_CHECKING_LINK)
    WebElement businessChecking;
    @FindBy(xpath = WEB_ELEMENT_MERCHANT_SERVICES)
    WebElement merchantServices;
    @FindBy(xpath = WEB_ELEMENT_MERCHANT_TITLE)
    WebElement merchantTitle;
    @FindBy(xpath = WEB_ELEMENT_PPP_TITLE)
    WebElement pppTitle;

    @FindBy(xpath = WEB_ELEMENT_PPP_LEARN_MORE)
    WebElement pppLearnMore;
    @FindBy(xpath = WEB_ELEMENT_CHECKLIST_FAQ)
    WebElement checklistFAQ;
    @FindBy(xpath = WEB_ELEMENT_APPLY)
    WebElement apply;
    @FindBy(xpath = WEB_ELEMENT_WEBINAR)
    WebElement Webinar;
    @FindBy(xpath = WEB_ELEMENT_750_CASH_BACK_LEARN_MORE)
    WebElement cashBackLearnMore;
    @FindBy(xpath = WEB_ELEMENT_WOMEN_ON_THE_MOVE)
    WebElement womenOnTheMove;
    @FindBy(xpath = WEB_ELEMENT_EXPLORE_PRODUCTS_HOVER_OVER)
    public WebElement exploreProducts;
    @FindBy(xpath = WEB_ELEMENT_OPEN_ACCOUNT_HOVER)
    public WebElement openAccountHover;

    public ChaseBusiness() {
        PageFactory.initElements(driver, this);
    }

    public void sideMenu() {
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BUSINESS_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SIDE_MENU);
    }

    public void navigateToBusinessPage() {
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BUSINESS_LINK);
    }

    public void navigateToBusinessChecking() {
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BUSINESS_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BUSINESS_CHECKING_LINK);
    }

    public void navigateToMerchantServices() {

        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BUSINESS_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MERCHANT_SERVICES);
    }

    public void navigateToPppLearnMore() {

        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BUSINESS_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_PPP_LEARN_MORE);
    }

    public void clickChecklistFaq() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BUSINESS_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_PPP_LEARN_MORE);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_CHECKLIST_FAQ);
    }

    public void clickApply() {
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BUSINESS_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_PPP_LEARN_MORE);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_APPLY);
    }

    public void clickWebinar() {

        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BUSINESS_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_PPP_LEARN_MORE);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_WEBINAR);
    }

    public void navigateTo750CashBack() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BUSINESS_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_750_CASH_BACK_LEARN_MORE);
    }

    public void navigateToWomenOnTheMove() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BUSINESS_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_WOMEN_ON_THE_MOVE);
    }

    public void hoverOverExploreProducts() {
        implicitWait();
        basicHoverUsingXpath(WEB_ELEMENT_EXPLORE_PRODUCTS_HOVER_OVER);
    }

    public void hoverOverOpenAccount() {
        implicitWait();
        basicHoverUsingXpath(WEB_ELEMENT_OPEN_ACCOUNT_HOVER);
    }

}