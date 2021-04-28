package attTVPageFJ;

import static attTVPageFJ.AttTVPageLocators.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AttTVPage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_ORDER_ONLINE_NOW_LINK)
    public WebElement orderOnlineNowLink;
    @FindBy(xpath = WEB_ELEMENT_VIDEO_AUTOPLAY_ON_TV_PAGE)
    public WebElement videoAutoplayOnTVPage;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_ENTERTAINMENT_PACKAGE)
    public WebElement entertainmentPackageButton;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_CHOICE_PACKAGE)
    public WebElement choicePackageButton;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_ULTIMATE_PACKAGE)
    public WebElement ultimatePackageButton;

    /**
     * Initializing elements required for Assertions
     */
    @FindBy (xpath = WEB_ELEMENT_ACTUAL_TEXT_HEADER_ORDER_ONLINE_NOW_PAGE)
    public WebElement actualTextOrderOnlineNowPage;
    @FindBy (xpath = WEB_ELEMENTS_ACTUAL_NUMBER_OF_PACKAGES_OPTIONS_TV_PAGE)
    public List<WebElement> actualNumberOfPackagesOptionsTVPage;
    @FindBy (css = WEB_ELEMENT_ACTUAL_NUMBER_OF_LINKS_HEADER_TV_PAGE)
    public List<WebElement> actualNumOfLinksOnHeaderOfTVPage;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_ENTERTAINMENT_PACKAGE_PAGE)
    public WebElement actualTextEntertainmentPackagePage;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_ON_CHOICE_PACKAGE_PAGE)
    public WebElement actualTextChoicePackagePage;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_ULTIMATE_PACKAGE_PAGE)
    public WebElement actualTextUltimatePackagePage;

    public AttTVPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickOrderOnlineNowLink(){
        clickElement(orderOnlineNowLink);
//        waitForVisibilityOfElement(actualTextOrderOnlineNowPage);
    }

    public void checkNumberOfPackagesOptionsOnTVPage() throws InterruptedException {
        robotScrollDown(40);
    }

    public void clickOnEntertainmentPackageOption() throws InterruptedException {
        robotScrollDown(40);
        clickElement(entertainmentPackageButton);
    }

    public void clickOnChoicePackageOption() throws InterruptedException {
        robotScrollDown(40);
        clickElement(choicePackageButton);
    }

    public void clickOnUltimatePackageOption() throws InterruptedException {
        robotScrollDown(40);
        clickElement(ultimatePackageButton);
    }


}
