package expediaHomepageBS;

import common.BaseAPI;
import org.openqa.selenium.support.PageFactory;

import static expediaHomepageBS.ExpediaHomepageWebElements.*;

public class ExpediaHomepage extends BaseAPI {

    public ExpediaHomepage(){
        PageFactory.initElements(driver, this);
    }

    public void clickOnBookNow(){
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BOOK_NOW);
        implicitWait();
    }
    public void clickOnTakeALook(){
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TAKE_A_LOOK);
        implicitWait(10);
    }
    public void navigateToDiscoverMore(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_DISCOVER_MORE);
        implicitWait();
        switchToNewTab(1);
        implicitWait();
    }



}
