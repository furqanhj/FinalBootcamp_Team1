package cbsSportsFantasyAR;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static cbsSportsFantasyAR.CbsSportsFantasyWebElements.*;

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


    }

}