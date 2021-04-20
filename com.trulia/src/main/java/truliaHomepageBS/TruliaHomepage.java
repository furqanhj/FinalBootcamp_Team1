package truliaHomepageBS;

import common.BaseAPI;
import org.openqa.selenium.support.PageFactory;

import static truliaHomepageBS.TruliaHomepageWebElements.*;

public class TruliaHomepage extends BaseAPI {

    public TruliaHomepage() {
        PageFactory.initElements(driver, this);
    }

    public void hoverOverBuyLink(){
        basicHoverUsingXpath(WEB_ELEMENT_BUY);
        implicitWait(5);
    }
    public void hoverOverRentLink(){
        basicHoverUsingXpath(WEB_ELEMENT_RENT);
        implicitWait(5);
    }
    public void clickOnFindAHome(){
        implicitWait(5);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FIND_A_HOME);
        implicitWait();
    }

    }

