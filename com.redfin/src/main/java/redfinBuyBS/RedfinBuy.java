package redfinBuyBS;

import common.BaseAPI;
import org.openqa.selenium.support.PageFactory;

import static redfinBuyBS.RedfinBuyWebElements.*;

public class RedfinBuy extends BaseAPI {


    public RedfinBuy() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToBuyPage(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BUY);
    }


}
