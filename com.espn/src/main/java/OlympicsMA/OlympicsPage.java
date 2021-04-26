package OlympicsMA;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static OlympicsMA.OlympicsLocators.*;

public class OlympicsPage extends BaseAPI {


    public OlympicsPage (){
        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = WEB_ELEMENT_CLICK_WATCH)
    public WebElement clickWatch;
    @FindBy (xpath = WEB_ELEMENT_DROP_DOWN_SPORTS)
    public WebElement dropDownSport;
    @FindBy (xpath = WEB_ELEMENT_SIGN_UP)
    public WebElement signUp;
    @FindBy (xpath = WEB_ELEMENT_LOG_IN)
    public WebElement logIn;
    @FindBy (xpath = WEB_ELEMENT_CONTACT_US)
    public WebElement contactUs;


    public void clickWatch (){
        implicitWait();
        clickWatch.click();
        implicitWait();
    }

    public void dropDownSport (){
        implicitWait();
        dropDownSport.click();
        implicitWait();
    }

    public void signUp (){
        implicitWait();
        signUp.click();
        implicitWait();
    }

    public void logIn (){
        implicitWait();
        logIn.click();
        implicitWait();
    }

    public void contactUs (){
        implicitWait();
        contactUs.click();
        implicitWait();
    }

}
