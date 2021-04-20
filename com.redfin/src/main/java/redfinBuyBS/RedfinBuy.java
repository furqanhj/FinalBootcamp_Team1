package redfinBuyBS;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import static redfinBuyBS.RedfinBuyWebElements.*;

public class RedfinBuy extends BaseAPI {


    @FindBy(xpath = WEB_ELEMENT_LOCATION_FIELD)
    WebElement locationField;
    @FindBy(xpath = WEB_ELEMENT_SEARCH_CLICK)
    WebElement searchClick;


    public RedfinBuy() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToBuyPage(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BUY);
        implicitWait();
    }
    public void hoverOverBuyLink(){
        implicitWait();
        basicHoverUsingXpath(WEB_ELEMENT_BUY);
        implicitWait();
    }

    public void locationSendKeys(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BUY);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_LOCATION_FIELD);
        locationField.sendKeys(WEB_ELEMENT_LOCATION_SEND_PATH);
        searchClick.click();
    }


}
