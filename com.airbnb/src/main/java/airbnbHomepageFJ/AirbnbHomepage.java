package airbnbHomepageFJ;

import static airbnbHomepageFJ.AirbnbHomepageLocators.*;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AirbnbHomepage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_BUTTON_DROPDOWN_GLOBAL_LOGIN_ICON)
    public WebElement globalDropdownMenuButton;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_SIGN_UP_OPTION)
    public WebElement signupButtonInGlobalDropdown;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_LOG_IN_OPTION)
    public WebElement loginButtonInGlobalDropdown;
    @FindBy(id = WEB_ELEMENT_COUNTRY_REGION_DROPDOWN)
    public WebElement countryRegionDropdown;
    @FindBy(id = WEB_ELEMENT_PHONE_NUMBER_INPUT_FIELD)
    public WebElement phoneNumberInputField;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_CONTINUE_SIGNUP)
    public WebElement continueSignupButton;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_CONTINUE_WITH_EMAIL)
    public WebElement continueWithEmailButton;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_CONTINUE_WITH_FACEBOOK)
    public WebElement continueWithFacebookButton;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_CONTINUE_WITH_GOOGLE)
    public WebElement continueWithGoogleButton;


    /**
     * Initialization of elements required for Assertions
     */
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_NUM_OF_LINKS_IN_GLOBAL_DROPDOWN)
    public List<WebElement> actualNumOfLinksInGlobalDropdown;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_SIGN_UP_IFRAME)
    public WebElement actualTextInSignUpIframe;
    @FindBy(id = WEB_ELEMENT_ACTUAL_TEXT_PHONE_NUMBER_ERROR_MESSAGE)
    public WebElement actualTextPhoneNumberErrorMessage;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_COUNTRY_CODE_PHONE_NUMBER_FIELD)
    public WebElement actualTextCountryCodePhoneNumberField;
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_NUMBER_OF_COUNTRIES_IN_COUNTRY_DROPDOWN)
    public List<WebElement> actualNumOfCountriesInCountryDropdown;
    @FindBy(className = WEB_ELEMENT_COUNTRY_CODE_AUTO_CHANGE_INSIDE_PHONE_NUMBER_INPUT_FIELD)
    public WebElement countryCodeAutoChangeInsidePhoneNumberInputField;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_VALID_SIGNUP_CONFIRM_YOUR_NUMBER)
    public WebElement actualTextValidSignupConfirmYourNumber;
    @FindBy(xpath = WEB_ELEMENT_INPUT_FIELD_EMAIL_ON_CONTINUE_WITH_EMAIL_OPTION)
    public WebElement emailInputFieldOnContinueWithEmailOption;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_CONTINUE_WITH_FACEBOOK_NEW_WINDOW)
    public WebElement actualTextContinueWithFacebookNewWindow;

    /**
     * RECAPTCHA box and its elements Initialization
     */
    @FindBy(id = WEB_ELEMENT_RECAPTCHA_BOX)
    public WebElement recaptchaBoxUponContinueSignup;
    @FindBy(xpath = WEB_ELEMENT_CHECKBOX_RECAPTCHA_BOX)
    public WebElement checkboxRecaptchaBox;


    public AirbnbHomepage() {
        PageFactory.initElements(driver, this);
    }

    public void clickGlobalDropdownMenu() {
        clickElement(globalDropdownMenuButton);
    }

    public void clickSignUpButtonInDropdownMenu() {
        clickGlobalDropdownMenu();
        clickElement(signupButtonInGlobalDropdown);
    }

    public void clickLogInButtonInDropdownMenu() {
        clickGlobalDropdownMenu();
        clickElement(loginButtonInGlobalDropdown);
    }

    public void doSignup(String phoneNumber) {
        clickSignUpButtonInDropdownMenu();
        sendKeysToElement(phoneNumberInputField, phoneNumber);
        clickElement(continueSignupButton);
    }

    public void selectDifferentCountryRegionFromDropdownForSignup(String countryNameAndCountryCode) {
        clickSignUpButtonInDropdownMenu();
        clickElement(countryRegionDropdown);
        WebElement countrySelected = selectOptionByVisibleText(countryRegionDropdown, countryNameAndCountryCode);
        countrySelected.click();
        phoneNumberInputField.click();
    }

    public void changeCountryAndSignup(String countryNameAndCountryCode, String phoneNumber) {
        selectDifferentCountryRegionFromDropdownForSignup(countryNameAndCountryCode);
        sendKeysToElement(phoneNumberInputField, phoneNumber);
        clickElement(continueSignupButton);
        if (recaptchaBoxUponContinueSignup.isDisplayed()) {
            clickElement(checkboxRecaptchaBox);
            clickElement(continueSignupButton);
        }
    }

    public void clickOnOptionContinueWithEmail() {
        clickSignUpButtonInDropdownMenu();
        clickElement(continueWithEmailButton);
    }

    public void clickOnOptionContinueWithFacebook() {
        clickSignUpButtonInDropdownMenu();
        clickElement(continueWithFacebookButton);
        switchToNewWindow();
    }

    public void clickOnOptionContinueWithGoogle() {
        clickSignUpButtonInDropdownMenu();
        clickElement(continueWithGoogleButton);
        switchToNewWindow();
    }
}
