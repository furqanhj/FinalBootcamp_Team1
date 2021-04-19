package ebayHomepageFJ;

import common.BaseAPI;
import dataSource.DataSource;
import ebayAdvancedSearchPageFJ.EbayAdvancedSearchPage;
import ebaySignInPageFJ.EbaySignInPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static ebayHomepageFJ.EbayHomepageWebElements.*;

public class EbayHomepage extends BaseAPI {

    /**
     * @author Furqan.
     * Declaring the locators of the elements on the homepage by the use of @FindBy annotation,
     * and storing them in the WebElement type instance variable.
     */
    @FindBy(xpath = WEB_ELEMENT_EBAY_HOMEPAGE_LINK)
    public WebElement ebayHomepageLink;

    @FindBy (css = WEB_ELEMENT_SEARCH_BAR)
    public WebElement searchBar;

    @FindBy (xpath = WEB_ELEMENT_SEARCH_BUTTON)
    public WebElement searchButton;

    @FindBy (css = WEB_ELEMENT_SHOP_BY_CAT_DROPDOWN)
    public WebElement shopByDropdown;

    @FindBy (css = WEB_ELEMENT_ALL_CAT_DROPDOWN)
    public WebElement allCategoriesDropdown;

    @FindBy (css = WEB_ELEMENT_ADVANCED_SEARCH_LINK)
    public WebElement advancedSearchButton;

    @FindBy (css = WEB_ELEMENT_SIGN_IN_BUTTON)
    public WebElement signInButton;

    @FindBy (css = WEB_ELEMENT_REGISTER_BUTTON)
    public WebElement registerButton;

    @FindBy (xpath = WEB_ELEMENT_DAILY_DEALS_BUTTON)
    public WebElement dailyDealsButton;

    @FindBy (xpath = WEB_ELEMENT_BRAND_OUTLET_BUTTON)
    public WebElement brandOutletButton;

    @FindBy (xpath = WEB_ELEMENT_HELP_AND_CONTACT_BUTTON)
    public WebElement helpAndContactButton;

    @FindBy (css = WEB_ELEMENT_SELL_BUTTON)
    public WebElement sellButton;

    @FindBy (css = WEB_ELEMENT_WATCHLIST_DROPDOWN)
    public WebElement watchlistDropdown;

    @FindBy (css = WEB_ELEMENT_MY_EBAY_DROPDOWN)
    public WebElement myEbayDropdown;

    @FindBy (css = WEB_ELEMENT_NOTIFICATIONS_BUTTON)
    public WebElement notificationsButton;

    @FindBy (css = WEB_ELEMENT_SHOPPING_CART_BUTTON)
    public WebElement shoppingCartButton;

    @FindBy (css = WEB_ELEMENT_SAVED_LINK_BUTTON)
    public WebElement savedButton;

    @FindBy (css = WEB_ELEMENT_MOTORS_LINK_BUTTON)
    public WebElement motorsButton;

    @FindBy (xpath = WEB_ELEMENT_FASHION_LINK_BUTTON)
    public WebElement fashionButton;

    @FindBy (xpath = WEB_ELEMENT_ELECTRONICS_LINK_BUTTON)
    public WebElement electronicsButton;

    @FindBy (xpath = WEB_ELEMENT_COLLECTIBLES_LINK_BUTTON)
    public WebElement collectiblesButton;

    @FindBy (xpath = WEB_ELEMENT_HOME_AND_GARDEN_LINK_BUTTON)
    public WebElement homeAndGardenButton;

    @FindBy (xpath = WEB_ELEMENT_SPORTING_GOODS_LINK_BUTTON)
    public WebElement sportingGoodsButton;

    @FindBy (xpath = WEB_ELEMENT_TOYS_LINK_BUTTON)
    public WebElement toysButton;

    @FindBy (xpath = WEB_ELEMENT_BUSN_AND_IND_LINK_BUTTON)
    public WebElement businessAndIndButton;

    @FindBy (xpath = WEB_ELEMENT_MUSIC_LINK_BUTTON)
    public WebElement musicButton;

    @FindBy (xpath = WEB_ELEMENT_DEALS_LINK_BUTTON)
    public WebElement dealsButton;

    @FindBy (xpath = WEB_ELEMENT_EXPECTED_TEXT_SEARCH_RESULT)
    public WebElement expectedTextFromSearchResult;

    @FindBy (css = WEB_ELEMENT_EXPECTED_ALL_CAT_DROPDOWN)
    public WebElement expectedAllCatDropdown;

    @FindBy (css = WEB_ELEMENTS_EXPECTED_ALL_CAT_DROPDOWN_SEARCH_BAR)
    public List<WebElement> expectedAllCatDropdownTotalElements;

    @FindBy (xpath = WEB_ELEMENT_ACTUAL_TEXT_SEARCH_RESULT_WIRELESS_CHARGING_STATION)
    public WebElement actualTextSearchResultWirelessChargingStation;

    public String GET_WEB_ELEMENTS_EXPECTED_ALL_CAT_DROPDOWN_SEARCH_BAR(){
        return WEB_ELEMENTS_EXPECTED_ALL_CAT_DROPDOWN_SEARCH_BAR;
    }

    /**
     * @author Furqan.
     * Initializing the WebElement variables by the use of constructor, using the WebDriver and
     * the "this" keyword to initialize the variables on this page (class)
     */
    public EbayHomepage(){
        PageFactory.initElements(driver, this);
    }

    /**
     * @author Furqan.
     * Here will be all the helper methods for the ebay Homepage.
     */

    public void enterTextInSearchBar(String dataToSearch){
        sendKeysToElement(searchBar, dataToSearch);
    }

    public void clickSearchButton(){
        clickElement(searchButton);
    }

    public void searchForAnItem(String itemSearch){
        enterTextInSearchBar(itemSearch);
        clickSearchButton();
    }

    public void selectCategoryFromSearchBarUsingIndex(int index) {
        selectOptionByIndex(allCategoriesDropdown, index);
    }

    public void selectCategoryFromSearchBarUsingValue(String value) {
        selectOptionByValue(allCategoriesDropdown, value);
    }

    public void selectCategoryFromSearchBarUsingVisibleText(String visibleText) {
        selectOptionByVisibleText(shopByDropdown, visibleText);
    }

    public void clickOnEbayIconForHomepage(){
        clickElement(ebayHomepageLink);
    }

    public EbaySignInPage navigateToSignInPage(){
        clickElement(signInButton);

        return new EbaySignInPage();
    }

    public EbayAdvancedSearchPage navigateToAdvancedSearchPage(){
        clickElement(advancedSearchButton);

        return new EbayAdvancedSearchPage();
    }

    // First attempt at using SQL DB to search for an item
    public void searchForAnItemUsingSQLDB() throws Exception {
        clickElement(searchBar);
        DataSource.insertDataIntoDB();
        List<String> elementFromDB = DataSource.getItemsListFromDB();
        String searchItem = elementFromDB.get(2);
        sendKeysToElement(searchBar, searchItem);
        clickSearchButton();
    }



}
