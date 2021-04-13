package ebaySignInPageFJ;

import static ebaySignInPageFJ.EbaySignInPageWebElements.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbaySignInPage extends BaseAPI {

    @FindBy (css = WEB_ELEMENT_RECAPTHA_CHECKBOX)
    public WebElement recaptchaCheckbox;

    @FindBy (css = WEB_ELEMENT_USERID_INPUT_FIELD)
    public WebElement userIdInputField;

    @FindBy (xpath = WEB_ELEMENT_SIGN_IN_CONTINUE_BUTTON)
    public WebElement signInContinueButton;

    @FindBy (xpath = WEB_ELEMENT_HOMEPAGE_LINK_BUTTON)
    public WebElement homepageLinkButton;

    public EbaySignInPage(){
        PageFactory.initElements(driver, this);
//        waitForPageLoad(properties.getProperty("EbaySignInPageURL"));
    }

    public void enterEmailOrUserId(String emailId){
        sendKeysToElement(userIdInputField, emailId);
    }

    public void clickOnContinueButton(){
        clickElement(signInContinueButton);
    }

    public void doValidLogin(String enterValidEmail){
        selectElement(recaptchaCheckbox);
        enterEmailOrUserId(enterValidEmail);
        clickOnContinueButton();
    }

    public void returnToHomepage(){
        clickElement(homepageLinkButton);
    }

}
