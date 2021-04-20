package macysFindStoresPage_KE;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static macysFindStoresPage_KE.MacysFindStoresPageWebELementsLocators.WEB_ELEMENT_IFRAME;
import static macysFindStoresPage_KE.MacysFindStoresPageWebELementsLocators.WEB_ELEMENT_STORES_TEXT_LINK;


public class MacysFindStoresPage extends BaseAPI {
    @FindBy(xpath = WEB_ELEMENT_STORES_TEXT_LINK)
    public WebElement storesTextLink;
    @FindBy(xpath = WEB_ELEMENT_IFRAME)
    public WebElement iFrame;

    public void clickStoresTextLink()  {

          //  storesTextLink.click();
        waitForPageLoad("https://www.macys.com/");

       clickElement(storesTextLink);
    }



}
