package FlightsMA;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static FlightsMA.FlightsLocators.*;

public class FlightsPage extends BaseAPI {

    public FlightsPage() { PageFactory.initElements(driver,this); }

    @FindBy (xpath = WEB_ELEMENT_CLICK_SEARCH)
    public WebElement clickSearch;
    @FindBy (xpath = WEB_ELEMENT_ADD_TRAVELER)
    public WebElement addTraveler;
    @FindBy (xpath = WEB_ELEMENT_CLICK_SUPPORT)
    public WebElement clickSupport;
    @FindBy (xpath = WEB_ELEMENT_LEAVING_FROM)
    public WebElement leavingFrom;
    @FindBy (xpath = WEB_ELEMENT_GOING_TO)
    public WebElement goingTo;

    @FindBy (xpath = WEB_ELEMENT_GET_THE_APP)
    public WebElement getTheApp;
    @FindBy (xpath = WEB_ELEMENT_CLICK_NEWSROOM)
    public WebElement clickNewsroom;
    @FindBy (xpath = WEB_ELEMENT_ADVERTISING)
    public WebElement advertising;
    @FindBy (xpath = WEB_ELEMENT_INVESTOR_RELATIONS)
    public WebElement investorRelations;
    @FindBy (xpath = WEB_ELEMENT_TERMS_OF_USE)
    public WebElement termsOfUse;

    public void clickSearch (){
        implicitWait();
        clickSearch.click();
        implicitWait();
    }

    public void addTraveler (){
        implicitWait();
        addTraveler.click();
        implicitWait();
    }

    public void clickSupport (){
        implicitWait();
        clickSupport.click();
        implicitWait();

    }

    public void leavingFrom (){
        implicitWait();
        leavingFrom.click();
        implicitWait();

    }

    public void goingTo (){
        implicitWait();
        goingTo.click();
        implicitWait();
    }

    public void getTheApp (){
        implicitWait();
        getTheApp.click();
    }

    public void clickNewsroom (){
        implicitWait();
        clickNewsroom.click();
    }

    public void advertising (){
        implicitWait();
        advertising. click();

    }

    public void investorRelations (){
        implicitWait();
        investorRelations.click();

    }

    public void termsOfUse (){
        implicitWait();
        termsOfUse.click();
    }

}
