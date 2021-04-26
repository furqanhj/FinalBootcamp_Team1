package HelpCenterMA;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.server.PushBuilder;

import static HelpCenterMA.HelpCenterLocators.*;

public class HelpCenterPage extends BaseAPI {


    public HelpCenterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = WEB_ELEMENT_LOG_IN)
    public WebElement logIn;
    @FindBy (xpath = WEB_ELEMENT_SIGN_UP)
    public WebElement signUp;
    @FindBy (xpath = WEB_ELEMENT_BOOKING_TRAVELING)
    public WebElement bookingTraveling;
    @FindBy (xpath = WEB_ELEMENT_SAFETY_CONCERNS)
    public WebElement safetyConcerns;
    @FindBy (xpath = WEB_ELEMENT_PRIVACY_POLICY)
    public WebElement privacyPolicy;
    @FindBy (xpath = WEB_ELEMENT_HOSTING_STAYS)
    public WebElement hostingStays;
    @FindBy (xpath = WEB_ELEMENT_REPORTING_ISSUES)
    public WebElement reportingIssues;
    @FindBy (xpath = WEB_ELEMENT_TERMS_OF_SERVICES)
    public WebElement termsOfServices;
    @FindBy (xpath = WEB_ELEMENT_VIEW_REVIEWS )
    public WebElement viewReviews;
    @FindBy (xpath = WEB_ELEMENT_ACCOUNT_SECURITY)
    public WebElement accountSecurity;

    public void clickLogIn (){
        implicitWait();
        logIn.click();
        implicitWait();
    }

    public void signUp (){
        implicitWait();
        signUp.click();
        implicitWait();
    }

    public void bookingTraveling (){
        implicitWait();
        bookingTraveling. click();
        implicitWait();
    }

    public void safetyConcerns (){
        implicitWait();
        safetyConcerns. click();
        implicitWait();
    }

    public void privacyPolicy (){
        implicitWait();
        privacyPolicy. click();
        implicitWait();
    }

    public void hostingStays (){
        implicitWait();
        hostingStays.click();
        implicitWait();
    }

    public void reportingIssues (){
        implicitWait();
        reportingIssues.click();
        implicitWait();
    }

    public void termsOfServices (){
        implicitWait();
        termsOfServices.click();
        implicitWait();
    }

    public void viewReviews (){
        implicitWait();
        viewReviews.click();
    }

    public void accountSecurity (){
        implicitWait();
        accountSecurity.click();
        implicitWait();
    }


}
