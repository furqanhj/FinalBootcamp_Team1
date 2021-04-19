package expediaHomepageFJ;

import static expediaHomepageFJ.ExpediaHomepageWebElements.*;
import common.BaseAPI;
import expediaSignInPageFJ.ExpediaSignInPage;
import expediaSignUpPageFJ.ExpediaSignUpPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaHomepage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_SIGN_IN_HEADER)
    public WebElement signInHeader;

    @FindBy (xpath = WEB_ELEMENT_SIGN_IN_BUTTON)
    public WebElement signInButton;

    @FindBy (xpath = WEB_ELEMENT_SIGN_UP_BUTTON)
    public WebElement signUpButton;

    @FindBy (xpath = WEB_ELEMENT_EXPECTED_TEXT_ON_SIGN_IN_PAGE)
    public WebElement expectedTextOnSignInPage;

    public ExpediaHomepage(){
        PageFactory.initElements(driver, this);
    }

    public void navigateToSignInPage(){
        clickElement(signInHeader);
        clickElement(signInButton);
    }

    public ExpediaSignUpPage navigateToSignUpPage(){
        clickElement(signInHeader);
        clickElement(signUpButton);

        return new ExpediaSignUpPage();
    }

}
