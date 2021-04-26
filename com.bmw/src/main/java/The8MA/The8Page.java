package The8MA;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static The8MA.The8Locators.*;

public class The8Page extends BaseAPI {

    public The8Page() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = WEB_ELEMENT_CLICK_EXPLORE)
    public WebElement explore;
    @FindBy(xpath = WEB_ELEMENT_GET_A_QUOTE)
    public WebElement getAQuote;
    @FindBy(xpath = WEB_ELEMENT_DROP_DOWN_SHOPPING)
    public WebElement dropDownShopping;
    @FindBy(xpath = WEB_ELEMENT_BUILD_YOUR_OWN)
    public WebElement buildYourOwn;
    @FindBy(xpath = WEB_ELEMENT_SHOP_NEW_INVENTORY)
    public WebElement shopNewInventory;
    @FindBy (xpath = WEB_ELEMENT_APPLY_FOR_FINANCING)
    public WebElement applyForFinancing;
    @FindBy (xpath = WEB_ELEMENT_SHOP_ONLINE)
    public WebElement shopOnline;
    @FindBy (xpath = WEB_ELEMENT_CLICK_CONCEPT_VEHICLES)
    public WebElement clickConceptVehicles;
    @FindBy (xpath = WEB_ELEMENT_BMW_CERTIFIED )
    public WebElement bmwCertified;
    @FindBy (xpath = WEB_ELEMENT_ESTIMATE_PAYMENT )
    public WebElement estimatePayment;



    public void clickExplore (){
        implicitWait();
        explore.click();
        implicitWait();
    }

    public void getAQuote (){
        implicitWait();
        getAQuote.click();
        implicitWait();
    }

    public void dropDownShopping (){
        implicitWait();
        dropDownShopping.click();
        implicitWait();
    }

    public void buildYourOwn (){
        implicitWait();
        buildYourOwn.click();
        implicitWait();
    }

    public void shopYourNewInventory (){
        implicitWait();
        shopNewInventory.click();
        implicitWait();
    }

    public void applyForFinancing (){
        implicitWait();
        applyForFinancing.click();
        implicitWait();
    }

    public void shopOnline (){
        implicitWait();
        shopOnline.click();

    }

    public void clickConceptVehicles (){
        implicitWait();
        clickConceptVehicles.click();
        implicitWait();
    }

    public void bmwCertified (){
        implicitWait();
        bmwCertified.click();
    }

    public void estimatePayment (){
        implicitWait();
        estimatePayment.click();
        implicitWait();
    }
}

