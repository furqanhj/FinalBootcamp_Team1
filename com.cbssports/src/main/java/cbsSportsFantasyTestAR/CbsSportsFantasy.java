package cbsSportsFantasyTestAR;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static cbsSportsFantasyTestAR.CbsSportsFantasyWebElements.*;

public class CbsSportsFantasy extends BaseAPI {

    @FindBy(css = WEB_ELEMENT_FANTASY_LINK)
    WebElement fantasyLink;

    @FindBy(xpath = WEB_ELEMENT_FANTASY_HEADER)
    WebElement fantasyHeader;

    @FindBy(xpath = WEB_ELEMENT_LOG_IN_LINK)
    WebElement logInLink;

    @FindBy(xpath = WEB_ELEMENT_SIGN_UP_LINK)
    WebElement signUpLink;

    @FindBy(xpath = WEB_ELEMENT_LOG_IN_EMAIL_TEXT_BOX)
    WebElement logInEmailTextBox;

    @FindBy(xpath = WEB_ELEMENT_LOG_IN_PASSWORD_TEXT_BOX)
    WebElement logInPasswordTextBox;

    @FindBy(xpath = WEB_ELEMENT_LOG_IN_BUTTON)
    WebElement logInButton;

    @FindBy (xpath = WEB_ELEMENT_LOGIN_ERROR_MESSAGE)
    WebElement logInErrorMessage;


    //Initialize all the web elements on this page, using Page Factory
    public  CbsSportsFantasy() {
        PageFactory.initElements(driver, "this");
    }


    //METHODS

    public void navigateToFantasyLink(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FANTASY_LINK);
    }

    public void doLogIn(String email, String password){
        fantasyLink.click();
        sendKeysToElement(logInEmailTextBox,email);
        sendKeysToElement(logInPasswordTextBox, password);
        implicitWait(20);
        logInButton.click();
    }
    public void clickSignUpLink() {
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_LOG_IN_LINK);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SIGN_UP_LINK);
    }

    public void selectTvShowsListingsOption(){
        implicitWait(20);
        hoverOverNClickUsingXpath(WEB_ELEMENT_WATCH_LINK, WEB_ELEMENT_TV_SHOWS_LISTINGS_OPTION);
        implicitWait(20);
    }

    public void clickFantasyPagePlayButton(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FANTASY_LINK);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_PLAY_BUTTON);
        implicitWait(20);
    }
    public void verifyTopHeadlinesHeader(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FANTASY_LINK);
        implicitWait(20);
    }



}