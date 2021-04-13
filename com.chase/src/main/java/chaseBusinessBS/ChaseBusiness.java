package chaseBusinessBS;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static chaseBusinessBS.ChaseBusinessWebElements.*;

public class ChaseBusiness extends BaseAPI {

    @FindBy(xpath =WEB_ELEMENT_SIDE_MENU)
    WebElement sideMenu;
    @FindBy(xpath = WEB_ELEMENT_SEE_ALL)
    WebElement seeAll;

    public void sideMenuOptions(){
        implicitWait();
        sideMenu.click();
        implicitWait();
        seeAll.click();

    }


}
