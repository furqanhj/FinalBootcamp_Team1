package homePageAB;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yaml.snakeyaml.events.Event;

import static homePageAB.HomePageWebElement.*;

public class HomePage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_INPUT_SEARCH_BAR)
    public WebElement inputSearchBar;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_SEARCH_SEARCH_BAR)
    public WebElement buttonSearchBar;

    @FindBy(css = WEB_ELEMENT_EXPECTED_TEXT_SEARCH_RESULT)
    public WebElement expectedTextSearchResult;


    @FindBy(xpath = WEB_ELEMENT_BANK_OF_AMERICA_LOGO)
    public WebElement bankOfAmericaLogo;


    @FindBy(css = WEB_ELEMENT_INPUT_ONLINE_ID)
    public WebElement inputOnlineID;
    @FindBy(css = WEB_ELEMENT_INPUT_PASSCODE)
    public WebElement inputPasscode;
    @FindBy(css = WEB_ELEMENT_SIGN_IN_BUTTON)
    public WebElement buttonSignIn;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_ERROR_MESSAGE)
    public WebElement actualTextErrorMessage;

    //for Credit Card page
    @FindBy(css = WEB_ELEMENT_BUTTONS_CREDIT_CARD)
    public WebElement buttonCreditCard;

    //For Home Loans Page
    @FindBy(css=WEB_ELEMENT_BUTTON_HOME_LOANS)
        public WebElement buttonHomeLoans;

    //Initialized all the web elements on this page, using PageFactory
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToSearchBar(String searchKeys) {
        sendKeysToElement(inputSearchBar, searchKeys);
    }

    public void clickSearchButton() {
        clickElement(buttonSearchBar);
    }

    public void doSearch(String searchKeys) {
        sendKeysToSearchBar(searchKeys);
        clickSearchButton();

    }


    public void doInvalidLogIn(String email, String password) {

        sendKeysToElement(inputOnlineID, email);
        sendKeysToElement(inputPasscode, password);
        clickElement(buttonSignIn);

    }


    public void nevigateToCreditCard() {
        clickElement(buttonCreditCard);


    }

    public void nevigateToHomeLoans(){
        clickElement(buttonHomeLoans);
    }
}