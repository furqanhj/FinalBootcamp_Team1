package homePageAB;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static homePageAB.HomePageWebElement.*;

public class HomePage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_INPUT_SEARCH_BAR)
    public WebElement inputSearchBar;

    @FindBy (xpath = WEB_ELEMENT_BUTTON_SEARCH_SEARCH_BAR)
    public WebElement buttonSearchBar;

    @FindBy (css= WEB_ELEMENT_EXPECTED_TEXT_SEARCH_RESULT)
    public WebElement expectedTextSearchResult;

   //Initialized all the web elements on this page, using PageFactory
    public HomePage(){PageFactory.initElements(driver, this); }

    public void sendKeysToSearchBar(String searchKeys){sendKeysToElement(inputSearchBar,searchKeys);}

    public void clickSearchButton(){clickElement(buttonSearchBar); }

    public void doSearch(String searchKeys){
        sendKeysToSearchBar(searchKeys);
        clickSearchButton();

    }










}
