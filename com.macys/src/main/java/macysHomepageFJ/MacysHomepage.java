package macysHomepageFJ;

import static macysHomepageFJ.MacysHomepageWebElements.*;
import common.BaseAPI;
import macysListPageFJ.MacysListsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MacysHomepage extends BaseAPI {

    @FindBy (id = WEB_ELEMENT_BUTTON_LISTS_LINK_ON_HEADER)
    public WebElement listsLinkButtonOnHeader;

    /**
     * Initialization of Elements required for Assertions
     */
    @FindBy (className = WEB_ELEMENT_ACTUAL_TEXT_ON_LISTS_PAGE)
    public WebElement actualTextOnListsPage;

    public MacysHomepage(){
        PageFactory.initElements(driver, this);
    }

    public MacysListsPage navigateToListsPage(){
        clickElement(listsLinkButtonOnHeader);

        return new MacysListsPage();
    }
}
