package boaCustomerServiceAR;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static boaCustomerServiceAR.BoaCustomerServiceWebElements.*;

public class BoaCustomerService extends BaseAPI{

    @FindBy (css = WEB_ELEMENT_CONTACT_US_LINK)
    WebElement contactUsLink;

    @FindBy (xpath = WEB_ELEMENT_CUSTOMER_SERVICE_HEADER)
    WebElement customerServiceHeader;

    @FindBy (xpath = WEB_ELEMENT_SIGN_IN_LINK)
    WebElement signInLink;

    @FindBy (xpath = WEB_ELEMENT_LOCATIONS_LINK)
    WebElement locationsLink;

    @FindBy (xpath = WEB_ELEMENT_HELP_SEARCH_BOX)
    WebElement helpSearchBox;

    @FindBy (css = WEB_ELEMENT_SEARCH_BUTTON)
    WebElement searchButton;


    //initialize all the Web Elements on this page using PageFactory
    public BoaCustomerService (){
        PageFactory.initElements(driver, "this");
    }

    //METHODS:

    public void clickContactUsLink(){
       clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_CONTACT_US_LINK);
       implicitWait(20);
    }

    public void clickSignInLink(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_CONTACT_US_LINK);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SIGN_IN_LINK);
    }

    public void clickLocationsLink(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_CONTACT_US_LINK);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_LOCATIONS_LINK);
    }

    public void clickHelpSearchBox() throws InterruptedException {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_CONTACT_US_LINK);
        implicitWait(20);
        find(WEB_ELEMENT_HELP_SEARCH_BOX);
        explicitWaitUntilClickable(20,WEB_ELEMENT_HELP_SEARCH_BOX);
        click(WEB_ELEMENT_HELP_SEARCH_BOX);
        Thread.sleep(5000);
    }

    public void typeInHelpSearchBox() throws InterruptedException {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_CONTACT_US_LINK);
        implicitWait(20);
        find(WEB_ELEMENT_HELP_SEARCH_BOX);
        explicitWaitUntilClickable(20,WEB_ELEMENT_HELP_SEARCH_BOX);
        click(WEB_ELEMENT_HELP_SEARCH_BOX);
        typeOnElementNEnter(WEB_ELEMENT_HELP_SEARCH_BOX,WEB_ELEMENT_INPUT_HELP_SEARCH_BOX);
        Thread.sleep(5000);


    }












}
