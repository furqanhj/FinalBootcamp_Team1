package verizonSmartPhonesBS;

import common.BaseAPI;
import org.openqa.selenium.support.PageFactory;

import static verizonSmartPhonesBS.VerizonSmartPhonesWebElements.*;

public class VerizonSmartPhones extends BaseAPI {

    public VerizonSmartPhones() {
        PageFactory.initElements(driver, this);
    }
    public void navigateToSmartPhones(){
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOP_HOMEPAGE);
        implicitWait();
    }
    public void navigateAndClickOnIphone(){
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOP_HOMEPAGE);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_PHONE);
        implicitWait();
    }

}
