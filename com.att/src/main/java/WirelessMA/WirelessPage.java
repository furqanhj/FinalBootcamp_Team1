package WirelessMA;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static WirelessMA.WirelessLocators.*;

public class WirelessPage extends BaseAPI {

    public WirelessPage() { PageFactory.initElements(driver,this); }


    @FindBy (css = WEB_ELEMENT_SHOP_NOW)
    public WebElement shopNow;
    @FindBy (xpath = WEB_ELEMENT_PLANS_AND_PRICES)
    public WebElement plansAndPrices;
    @FindBy (xpath = WEB_ELEMENT_CLICK_WIRELESS)
    public WebElement clickWireless;
    @FindBy (xpath = WEB_ELEMENT_DROP_DOWN_ACCOUNT)
    public WebElement dropDownAccount;
    @FindBy (xpath = WEB_ELEMENT_SHOP_ALL_PHONES)
    public WebElement shopAllPhones;
    @FindBy (xpath =WEB_ELEMENT_CONTACT_US )
    public WebElement contactUs;
    @FindBy (xpath = WEB_ELEMENT_BRING_YOUR_OWN)
    public WebElement bringYourOwn;
    @FindBy (xpath = WEB_ELEMENT_CLICK_SUPPORT)
    public WebElement clickSupport;


    public void clickShopNow (){
        implicitWait();
        shopNow.click();
        implicitWait();
    }

    public void planAndPrices (){
        implicitWait();
        clickWireless.click();
        plansAndPrices.click();
        implicitWait();
    }

    public void verifyDropDownAccount (){
        implicitWait();
        dropDownAccount.click();
        implicitWait();
    }

    public void setShopAllPhones (){
        implicitWait();
        clickWireless.click();
        shopAllPhones.click();
        implicitWait();

    }

    public void ContactUs (){
        implicitWait();
        contactUs.click();
        implicitWait();
    }

    public void bringYourOWn (){
        implicitWait();
        bringYourOwn.click();
        implicitWait();
    }


    public void clickSupport (){
        implicitWait();
        clickSupport.click();

    }



}
