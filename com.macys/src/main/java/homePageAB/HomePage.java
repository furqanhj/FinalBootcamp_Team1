package homePageAB;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static homePageAB.HomePageWebElement.*;
public class HomePage extends BaseAPI {

    @FindBy(css = WEB_ELEMENT_BUTTON_DEALS)
    public WebElement buttonDeals;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToDealsPage() {
        clickElement(buttonDeals);
    }

    @FindBy(css = WEB_ELEMENT_INPUT_SEARCH_BAR)
    public WebElement inputSearchBar;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_SEARCH_SEARCH_BAR)
    public WebElement buttonSearchBar;
    @FindBy(css = WEB_ELEMENT_EXPECTED_TEXT_SEARCH_RESULT)
    public WebElement expectedTextSearchResult;


    @FindBy(css = WEB_ELEMENT_SIGN_BUTTON)
    public WebElement signinLink;
    @FindBy(css = WEB_ELEMENT_EMAIL_ADDRESS)
    public WebElement emailAddress;
    @FindBy(css = WEB_ELEMENT_PASSWORD)
    public WebElement password1;
    @FindBy(css = WEB_ELEMENT_SIGN_IN_BUTTON)
    public WebElement signInButton;
    @FindBy(css = WEB_ELEMENT_ACTUAL_TEXT_ERROR_MESSAGE)
    public WebElement actualTextErrorMessage;

    @FindBy(css = WEB_ELEMENT_MACYS_LOGO)
    public WebElement MacysLogo;


    @FindBy(css = WEB_ELEMENT_MACYS_MY_ACCOUNT)
    public WebElement myAccount;
    @FindBy(css = WEB_ELEMENT_MACYS_EMAIL)
    public WebElement macysEmail;
    @FindBy(css = WEB_ELEMENT_MACYS_PASSWORD)
    public WebElement macysPassword;
    @FindBy(css = WEB_ELEMENT_MACYS_SIGN_IN)
    public WebElement macysSignInButton;
    @FindBy(css = WEB_ELEMENT_ACTUAL_TEXT_ERROR_MESSAGE1)
    public WebElement actualTextErrorMessage1;


    @FindBy (xpath=WEB_ELEMENT_MY_SHOPPING_CART)
        public WebElement myShoppingCart;

    @FindBy(css=WEB_ELEMENT_ACTUAL_TEXT_ERROR_MESSAGE3)
        public WebElement actualTextErrorMessage3;

    public void sendKeyToSearchBar(String searchKeys) {
        sendKeysToElement(inputSearchBar, searchKeys);
    }

    public void clickSearchButton() {
        clickElement(buttonSearchBar);
    }

    public void doSearch(String searchKeys) {
        sendKeyToSearchBar(searchKeys);
        clickSearchButton();
    }

    public void doInvalidLogIn(String email, String password) {
        clickElement(signinLink);
        sendKeysToElement(emailAddress, email);
        sendKeysToElement(password1, password);
        clickElement(signInButton);

    }

    public void doMacysLogo() {

    }


    public void doInvalidMyAccount(String email, String password) {
        clickElement(myAccount);
        sendKeysToElement(emailAddress, email);
        sendKeysToElement(macysPassword, password);
        clickElement(signInButton);


    }

    public void doCheckMyShoppingCart(){
        //clickElement(myShoppingCart);
        myShoppingCart.click();


    }

}