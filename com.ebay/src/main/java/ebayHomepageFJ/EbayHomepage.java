package ebayHomepageFJ;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static ebayHomepageFJ.EbayHomepageWebElements.*;

public class EbayHomepage extends BaseAPI {

    /**
     * @author Furqan.
     * Declaring the locators of the elements on the homepage by the use of @FindBy annotation,
     * and storing them in the WebElement type instance variable.
     */
    @FindBy(xpath = webElementEbayHomepageLink)
    WebElement ebayHomepageLink;

    @FindBy (css = webElementSearchBar)
    WebElement searchBar;

    @FindBy (xpath = webElementSearchButton)
    WebElement searchButton;

    @FindBy (css = webElementShopByCatDropdown)
    WebElement shopByDropdown;

    @FindBy (css = webElementAllCatDropdown)
    WebElement allCategoriesDropdown;

    @FindBy (css = webElementAdvancedSearchLink)
    WebElement advancedSearchButton;

    @FindBy (css = webElementSignInButton)
    WebElement signInButton;

    @FindBy (css = webElementRegisterButton)
    WebElement registerButton;

    @FindBy (xpath = webElementDailyDealsButton)
    WebElement dailyDealsButton;

    @FindBy (xpath = webElementBrandOutletButton)
    WebElement brandOutletButton;

    @FindBy (xpath = webElementHelpAndContactButton)
    WebElement helpAndContactButton;

    @FindBy (css = webElementSellButton)
    WebElement sellButton;

    @FindBy (css = webElementWatchlistDropdown)
    WebElement watchlistDropdown;

    @FindBy (css = webElementMyEbayDropdown)
    WebElement myEbayDropdown;

    @FindBy (css = webElementNotificationsButton)
    WebElement notificationsButton;

    @FindBy (css = webElementShoppingCartButton)
    WebElement shoppingCartButton;

    @FindBy (css = webElementSavedButton)
    WebElement savedButton;

    @FindBy (css = webElementMotorsButton)
    WebElement motorsButton;

    @FindBy (xpath = webElementFashionButton)
    WebElement fashionButton;

    @FindBy (xpath = webElementElectronicsButton)
    WebElement electronicsButton;

    @FindBy (xpath = webElementCollectiblesButton)
    WebElement collectiblesButton;

    @FindBy (xpath = webElementHomeAndGardenButton)
    WebElement homeAndGardenButton;

    @FindBy (xpath = webElementSportingGoodsButton)
    WebElement sportingGoodsButton;

    @FindBy (xpath = webElementToysButton)
    WebElement toysButton;

    @FindBy (xpath = webElementBusnAndIndButton)
    WebElement businessAndIndButton;

    @FindBy (xpath = webElementMusicButton)
    WebElement musicButton;

    @FindBy (xpath = webElementDealsButton)
    WebElement dealsButton;

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
        searchBar.sendKeys(dataToSearch);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public void searchForAnItem(String itemSearch){
        enterTextInSearchBar(itemSearch);
        clickSearchButton();
    }

    public void clickOnEbayIconForHomepage(){
        ebayHomepageLink.click();
    }

    public void clickOnSignInLink(){
        signInButton.click();
    }


}
