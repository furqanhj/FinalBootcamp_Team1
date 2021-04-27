package verizonSupportPageAB;

import common.BaseAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static verizonSupportPageAB.VerizonSupportPageWebElement.*;
public class VerizonSupportPage extends BaseAPI {

    @FindBy(xpath =WEB_ELEMENT_SUPPORT_LINK )
     public WebElement supportLink;
    @FindBy(xpath = WEB_ELEMENT_SUPPOER_OVERVIEW_LINK)
    public WebElement supportOverviewLink;
    @FindBy(xpath = WEB_ELEMENT_SUPPORT_WELCOME_MESSAGE)
    public WebElement supportWelcomeMessage;
    @FindBy(xpath=WEB_ELEMENT_VERIZON_LOGO)
    public WebElement verizonLogo;
    @FindBy(xpath = WEB_ELEMENT_SUPPORT_SEARCH_TEXT_BOX)
    public WebElement supportSearchTextBox;

    @FindBy(xpath=WEB_ELEMENT_SUPPORT_SEARCH_BUTTON)
    public WebElement supportSearchButton;

    public VerizonSupportPage(){
       PageFactory.initElements(driver, this);

    }
    public void navigateToSupportLink(){
        clickElement(supportLink);
        clickElement(supportOverviewLink);
    }


    @FindBy(xpath = WEB_ELEMENT_SIGNIN_LINK)
    public WebElement signInLink;

    @FindBy(xpath =WEB_ELEMENT_USER_ID_BOX)
    public WebElement userIdBox;

    @FindBy(xpath = WEB_ELEMENT_PASSWORD_BOX)
    public WebElement passWordBox;

    @FindBy(xpath = WEB_ELEMENT_SIGN_IN_BUTTON)
    public WebElement signInButton;

    @FindBy(xpath=WEB_ELEMENT_FAIL_LOGIN_MESSAGE)
    public WebElement failLogInMessage;

//
//    public void verrizonSignIn(){
//        clickElement(signInLink);
//        sendKeysToElement(userIdBox, keysToSend);
//

    }








