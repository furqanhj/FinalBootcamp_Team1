package attSupportAR;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static attSupportAR.AttSupportWebElements.*;

public class AttSupport extends BaseAPI {

    //Declaring the Web Elements by FindBy
    @FindBy(css = WEB_ELEMENT_SUPPORT_LINK)
    WebElement supportLink;

    @FindBy(xpath = WEB_ELEMENT_WELCOME_HEADER)
    WebElement welcomeHeader;

    @FindBy(xpath = WEB_ELEMENT_SUPPORT_SEARCH_BOX)
    WebElement supportSearchBox;

    @FindBy(xpath = WEB_ELEMENT_SEARCH_BUTTON)
    WebElement searchButton;

    @FindBy(xpath = WEB_ELEMENT_MANAGE_DATA_USE_LINK)
    WebElement manageDataUseLink;




    //initializing the web elements on this page, using PageFactory
    public AttSupport() {
        PageFactory.initElements(driver, this);
    }


    //METHODS:

    //clicking the Support page link
    public void navigateToAttSupportPage() {
        supportLink.click();
    }



    //Searching for 'bill' in the search box on Support page, and select 'View your bill period'
    //option from drop down
    public void viewYourBillPeriod() {
        supportLink.click();
        supportSearchBox.click();
        supportSearchBox.sendKeys();
    }



    //Type in the search box on Support page
    public void sendKeysToSearchBox(String keysToSend) {
        supportSearchBox.sendKeys(keysToSend);
    }

    public void clickSearchButton() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);
    }

    public void doSearch() {
        typeOnElement(WEB_ELEMENT_SUPPORT_SEARCH_BOX, WEB_ELEMENT_INPUT_TEXT);
        clickSearchButton();
    }


    //method to select an option from the Account drop down
    //Click Account drop down on At&t homepage
    //Select Account Overview from drop down options
    public void selectAccountDropdown() throws InterruptedException {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ACCOUNT_DROPDOWN);
        Thread.sleep(5000);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ACCOUNT_OVERVIEW);
        Thread.sleep(5000);
    }



    public void clickManageDataUseLink(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MANAGE_DATA_USE_LINK);
    }





}










