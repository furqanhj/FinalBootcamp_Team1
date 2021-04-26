package Homepage.MA;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Homepage.MA.HomePageLocators.*;


public class ChaseHomePage extends BaseAPI {

    {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = WEB_ELEMENT_CLICK_ON_SIGN_IN)
   public WebElement clickSignIn;
    @FindBy (xpath = WEB_ELEMENT_CLICK_ON_OPEN_AN_ACCOUNT )
    public WebElement clickOpenAccount;
    @FindBy (xpath = WEB_ELEMENT_VERIFY_CREDIT_CARD )
   public WebElement verifyCreditCard;
    @FindBy (xpath = WEB_ELEMENT_CLICK_SEARCH_BAR)
    public WebElement clickSearchBar;
    @FindBy (xpath = WEB_ELEMENT_CLICK_PRIVACY )
    public WebElement clickPrivacy;

    @FindBy (xpath = WEB_ELEMENT_NAVIGATE_BUSINESS )
    public WebElement navigateBusiness;
    @FindBy (xpath = WEB_ELEMENT_CLICK_CHECKING)
    public WebElement clickChecking;
    @FindBy (xpath = WEB_ELEMENT_SAVINGS)
    public WebElement savings;
    @FindBy (xpath = WEB_ELEMENT_NAVIGATE_HOME_LOANS)
    public WebElement homeLoans;
    @FindBy (xpath = WEB_ELEMENT_CAREERS)
    public WebElement careers;

    public void clickSignIn (){
        implicitWait();
        clickSignIn.click();
        implicitWait();
    }

    public void setClickOpenAccount (){
        implicitWait();
        clickOpenAccount.click();
        implicitWait();
    }

    public void verifyCreditCard (){
        implicitWait();
        verifyCreditCard.click();
        implicitWait();
    }

    public void setClickSearchBar (){
        implicitWait();
        clickSearchBar.click();
        implicitWait();
    }

    public void clickPrivacy (){
        implicitWait();
        clickPrivacy.click();
        implicitWait();
    }

    public void navigateBusiness (){
        implicitWait();
        navigateBusiness.click();
        implicitWait();
    }

    public void clickChecking (){
        implicitWait();
        clickChecking.click();
        implicitWait();
    }

    public void savings (){
        implicitWait();
        savings.click();
    }

    public void navigateHomeLoans (){
        implicitWait();
        homeLoans.click();
    }

    public void careers (){
        implicitWait();
        careers.click();
    }


}


