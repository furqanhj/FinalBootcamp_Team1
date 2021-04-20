package macysListPageFJ;

import static macysListPageFJ.MacysListsPageWebElements.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MacysListsPage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_BUTTON_SIGN_IN_BODY_OF_LISTS_PAGE)
    public WebElement signInButtonInBodyOfListsPage;
    @FindBy(className = WEB_ELEMENT_BUTTON_GO_ARROW_GUESTS_LIST)
    public WebElement goArrowButtonInGuestsLists;
    @FindBy (xpath = WEB_ELEMENT_INPUT_SEARCH_BAR_GLOBAL)
    public WebElement inputSearchBarGlobal;
    @FindBy (id = WEB_ELEMENT_BUTTON_SEARCH_SUBMIT_GLOBAL)
    public WebElement searchSubmitButton;

    /**
     * Initialization of elements required for Assertions
     */
    @FindBy (css = WEB_ELEMENT_ACTUAL_TEXT_ON_SIGN_IN_PAGE)
    public WebElement actualTextOnSignInPage;
    @FindBy (css = WEB_ELEMENT_ACTUAL_TEXT_ON_GUEST_LIST_DEFAULT_PAGE)
    public WebElement actualTextOnGuestListDefaultPage;
    @FindBy (xpath = WEB_ELEMENT_ACTUAL_ELEMENT_AFTER_SEARCH_RESULT_NIKE_MEN_HOODIE)
    public WebElement actualElementAfterSearchResultNikeMenHoodie;

    public MacysListsPage(){
        PageFactory.initElements(driver, this);
    }

    public void navigateToSignInPage(){
        clickElement(signInButtonInBodyOfListsPage);
    }

    public void clickGoArrowInGuestListTable(){
        clickElement(goArrowButtonInGuestsLists);
    }

    public void searchForAnItem(String itemSearch){
        sendKeysToElement(inputSearchBarGlobal, itemSearch);
        clickElement(searchSubmitButton);
    }
}
