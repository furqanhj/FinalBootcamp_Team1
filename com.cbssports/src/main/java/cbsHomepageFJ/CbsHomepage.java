package cbsHomepageFJ;

import static cbsHomepageFJ.CbsHomepageLocators.*;

import cbsLoginPageFJ.LoginPage;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CbsHomepage extends BaseAPI {

   @FindBy (xpath = WEB_ELEMENT_LOGIN_BUTTON)
    public WebElement loginButton;

    /**
     * Initializing web elements required for Assertions
     */
    @FindBy (css = WEB_ELEMENT_ACTUAL_TEXT_ON_LOGIN_PAGE)
    public WebElement actualTextOnLoginPage;

    public CbsHomepage (){
        PageFactory.initElements(driver, this);
    }

    public LoginPage navigateToLoginPage(){
        clickElement(loginButton);

        return new LoginPage();
    }
}