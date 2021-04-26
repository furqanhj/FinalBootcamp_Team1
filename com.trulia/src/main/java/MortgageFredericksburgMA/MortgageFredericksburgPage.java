package MortgageFredericksburgMA;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static MortgageFredericksburgMA.MortgageFredericksburgLocators.*;

public class MortgageFredericksburgPage extends BaseAPI {

    public MortgageFredericksburgPage () { PageFactory.initElements(driver,this); }


    @FindBy (xpath = WEB_ELEMENT_DROP_DOWN_ANY_PRICE)
    public WebElement price;
    @FindBy (xpath = WEB_ELEMENT_DROP_DOWN_BUY)
    public WebElement buy;
    @FindBy (xpath = WEB_ELEMENT_CLICK_RENT)
    public WebElement clickRent;
    @FindBy (xpath = WEB_ELEMENT_CLICK_AGENTS_LISTING)
    public WebElement agentsListing;
    @FindBy (xpath = WEB_ELEMENT_NAVIGATE_TOWNHOMES)
    public WebElement townhomes;


    public void dropDownAnyPrice (){
        implicitWait();
        price.click();
        implicitWait();
    }

    public void dropDownBuy (){
        implicitWait();
        buy.click();
        implicitWait();
    }

    public void clickRent(){
        implicitWait();
        clickRent.click();
        implicitWait();
    }

    public void clickAgentsListing (){
        implicitWait();
        agentsListing.click();
        implicitWait();
    }

    public void navigateTownhomes (){
        implicitWait();
        townhomes.click();

    }


}
