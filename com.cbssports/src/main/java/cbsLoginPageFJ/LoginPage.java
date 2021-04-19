package cbsLoginPageFJ;

import static cbsLoginPageFJ.LoginPageWebElements.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_INPUT_FIELD_EMAIL_USER_ID)
    public WebElement emailIdInputField;

    @FindBy (xpath = WEB_ELEMENT_INPUT_FIELD_PASSWORD)
    public WebElement passwordInputField;

    @FindBy (xpath = WEB_ELEMENT_BUTTON_LOGIN)
    public WebElement loginButton;

    @FindBy (xpath = WEB_ELEMENT_LINK_FORGOT_YOUR_PASSWORD)
    public WebElement linkForgotYourPassword;

    @FindBy (xpath = WEB_ELEMENT_LINK_DONT_HAVE_AN_ACCOUNT_SIGNUP)
    public WebElement linkDontHaveAnAccountSignup;

    @FindBy(id = WEB_ELEMENT_INPUT_EMAIL_ID_FORGOT_PASSWORD_PAGE)
    public WebElement inputEmailIdForgotPasswordPage;

    @FindBy(xpath = WEB_ELEMENT_CONTINUE_BUTTON_FORGOT_PASSWORD_PAGE)
    public WebElement continueButtonForgotPasswordPage;

    @FindBy (className = WEB_ELEMENT_BUTTON_LOGIN_WITH_FACEBOOK)
    public WebElement loginWithFacebookButton;

    @FindBy (className = WEB_ELEMENT_BUTTON_LOGIN_WITH_GOOGLE)
    public WebElement loginWithGoogleButton;

    /**
     * Initializing elements required for Assertions
     */
    @FindBy (className = WEB_ELEMENT_ACTUAL_TEXT_ERROR_WITH_INVALID_LOGIN)
    public WebElement actualTextErrorWithInvalidLogin;

    @FindBy (xpath = WEB_ELEMENT_ACTUAL_TEXT_ERROR_MSG_FORGOT_PASSWORD_PAGE)
    public WebElement actualTextErrorMsgForgotPasswordPage;

    @FindBy (className = WEB_ELEMENT_ACTUAL_TEXT_ERROR_MSG_UNREGISTERED_VALID_EMAIL)
    public WebElement actualTextErrorMsgUnregisteredValidEmail;

    @FindBy (xpath = WEB_ELEMENT_REGISTER_BUTTON_SIGN_UP_PAGE)
    public WebElement registerButtonOnSignUpPage;

    @FindBy (css = WEB_ELEMENTS_ACTUAL_NUMBER_OF_LINKS_ON_FOOTER_LOGIN_PAGE)
    public List<WebElement> actualNumberOfLinksOnFooterLoginPage;

    @FindBy (css = WEB_ELEMENTS_ACTUAL_NUMBER_OF_SOCIAL_NETWORK_LINKS_ON_FOOTER_LOGIN_PAGE)
    public List<WebElement> actualNumberOfSocialNetworksLinkOnFooterLoginPage;

    @FindBy(css = WEB_ELEMENTS_ACTUAL_NUMBER_OF_PARTNER_LINKS_ON_FOOTER_LOGIN_PAGE)
    public List<WebElement> actualNumberOfPartnerLinksOnFooterLoginPage;

    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_LOGIN_WITH_FACEBOOK_NEW_WINDOW)
    public WebElement actualTextLoginWithFacebookNewWindow;

    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_LOGIN_WITH_GOOGLE_NEW_WINDOW)
    public WebElement actualTextLoginWithGoogleNewWindow;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void enterInvalidEmailAddress(String sendKeys){
        clickElement(emailIdInputField);
        sendKeysToElement(emailIdInputField, sendKeys);
    }

    public void enterInvalidPassword (String sendKeys){
        clickElement(passwordInputField);
        sendKeysToElement(passwordInputField, sendKeys);
    }

    public void clickOnLoginButton(){
        clickElement(loginButton);
    }

    public void doInvalidLogin(String invalidEmail, String invalidPassword){
        enterInvalidEmailAddress(invalidEmail);
        enterInvalidPassword(invalidPassword);
        clickOnLoginButton();
    }

    public void clickLinkForgotYourPassword(){
        clickElement(linkForgotYourPassword);
    }

    public void enterInvalidEmailAndClickContinueInForgotPasswordPage(String invalidEmailId){
        sendKeysToElement(inputEmailIdForgotPasswordPage, invalidEmailId);
        clickElement(continueButtonForgotPasswordPage);
    }

    public void enterValidButUnregisteredEmailAndClickContinueInForgotPasswordPage(String validEmailID){
        sendKeysToElement(inputEmailIdForgotPasswordPage, validEmailID);
        clickElement(continueButtonForgotPasswordPage);
    }

    public void clickDontHaveAnAccountSignupLink(){
        clickElement(linkDontHaveAnAccountSignup);
    }

    public void clickLoginWithFacebook(){
        clickElement(loginWithFacebookButton);
        switchToNewWindow();
    }

    public void clickLoginWithGoogle(){
        clickElement(loginWithGoogleButton);
        switchToNewWindow();
    }

}
