package BusinessMA;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static BusinessMA.BusinessLocators.*;

public class BusinessPage extends BaseAPI {

    public BusinessPage() { PageFactory.initElements(driver,this); }

    @FindBy (xpath = WEB_ELEMENT_DROP_DOWN_PRODUCTS)
    public WebElement DropDownProduct;
    @FindBy (xpath =WEB_ELEMENT_VERIFY_STORES )
    public WebElement verifyStores;
    @FindBy (xpath = WEB_ELEMENT_WHY_VERIZON)
    public WebElement whyVerizon;
    @FindBy (xpath = WEB_ELEMENT_REQUEST_A_CALL)
    public WebElement requestACall;
    @FindBy (xpath = WEB_ELEMENT_ABOUT_US)
    public WebElement aboutUs;



    public void clickDeals (){
    implicitWait();
    DropDownProduct.click();
    implicitWait();

    }

    public void verifyStores (){
        implicitWait();
        verifyStores.click();
        implicitWait();

    }

    public void whyVerizon (){
        implicitWait();
        whyVerizon.click();
        implicitWait();
    }

    public void requestACall (){
        implicitWait();
        requestACall.click();
        implicitWait();
    }

    public void aboutUs (){
        implicitWait();
        aboutUs.click();
        implicitWait();
    }
}







