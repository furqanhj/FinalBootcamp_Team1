package truliaNeighborhoodsPageFJ;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static truliaNeighborhoodsPageFJ.NeighborhoodsPageWebElements.*;

import common.BaseAPI;
import org.openqa.selenium.support.PageFactory;
import truliaHomepageFJ.TruliaHomepage;
import java.util.List;

public class NeighborhoodsPage extends BaseAPI {

    @FindBy(className = WEB_ELEMENT_SEARCH_BOX_INPUT)
    public WebElement searchBox;

    @FindBy(className = WEB_ELEMENT_SEARCH_BUTTON)
    public WebElement searchButton;

    @FindBy(xpath = WEB_ELEMENT_AUSTIN_LINK_BOX)
    public WebElement austinLinkBox;

    @FindBy(xpath = WEB_ELEMENT_PRICE_RANGE_DROPDOWN_BUTTON)
    public WebElement priceRangeOptionDropdownButton;

    @FindBy(xpath = WEB_ELEMENT_MINIMUM_PRICE_RANGE_OPTION_DROPDOWN_BUTTON)
    public WebElement minimumPriceRangeOptionDropdownButton;

    @FindBy(xpath = WEB_ELEMENT_MAXIMUM_PRICE_RANGE_OPTION_DROPDOWN_BUTTON)
    public WebElement maximumPriceRangeOptionDropdownButton;

    @FindBy(id = WEB_ELEMENT_RADIO_BUTTON_RENT)
    public WebElement radioButtonRent;

    @FindBy(xpath = WEB_ELEMENT_INPUT_SEARCH_BOX_BOTTOM_OF_NEIGHBORHOOD_PAGE)
    public WebElement inputSearchBoxAtBottomOfNeighborhoodPage;

    @FindBy(id = WEB_ELEMENT_SEARCH_BUTTON_BOTTOM_OF_NEIGHBORHOOD_PAGE)
    public WebElement searchButtonBottomOfNeighborhoodPage;

    @FindBy(xpath = WEB_ELEMENT_INPUT_EMAIL_REGISTER_FOR_LATEST_ON_TRULIA)
    public WebElement inputEmailRegisterForLatestOnTrulia;

    @FindBy(id = WEB_ELEMENT_BUTTON_CONFIRM_EMAIL_REGISTRATION)
    public WebElement buttonConfirmEmailRegistration;

    /**
     * Initialization of elements required for Assertions
     */
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_ON_SEARCH_RESULT_PAGE_AUSTIN)
    public WebElement actualTextOnSearchResultPageAustin;

    @FindBy(xpath = WEB_ELEMENT_ACTUAL_NUMBER_OF_OPTIONS_IN_MINIMUM_PRICE_RANGE)
    public List<WebElement> actualNumberOfOptionsInMinPriceRange;

    @FindBy(xpath = WEB_ELEMENT_ACTUAL_NUMBER_OF_OPTIONS_IN_MAXIMUM_PRICE_RANGE)
    public List<WebElement> actualNumberOfOptionsInMaxPriceRange;

    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_ON_SEARCH_RESULT_PAGE_67401)
    public WebElement getActualTextOnSearchResultPage67401;

    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_WITH_VALID_EMAIL_REGISTRATION)
    public WebElement actualTextWithValidEmailRegistration;

    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_WITH_INVALID_EMAIL_REGISTRATION)
    public WebElement actualTextWithInvalidEmailRegistration;


    public NeighborhoodsPage() {
        PageFactory.initElements(driver, this);
    }

    TruliaHomepage homepage = new TruliaHomepage();

    public void enterCityNameInSearchBar(String enterKeys) {
        sendKeysToElement(searchBox, enterKeys);
    }

    public void clickSearchButton() {
        clickElement(searchButton);
    }

    public void searchForACityOrNeighborhood(String enterText){
        enterCityNameInSearchBar(enterText);
        clickSearchButton();
    }

    // First attempt to use actions class to move over to an automated scrolling box and then click on it.
    public void waitForAndClickOnAustinLink(){
        Actions actions = new Actions(driver);

        waitForVisibilityOfElement(austinLinkBox);
        actions.moveToElement(austinLinkBox).build().perform();
        waitForElementToBeClickable(austinLinkBox);
        actions.click(austinLinkBox).build().perform();
        switchToNewWindow();
    }

    public void clickOnPriceRangeMinimumDropdown(){
        waitForAndClickOnAustinLink();
        clickElement(priceRangeOptionDropdownButton);
        clickElement(minimumPriceRangeOptionDropdownButton);
    }

    public void clickOnPriceRangeMaximumDropdown(){
        waitForAndClickOnAustinLink();
        clickElement(priceRangeOptionDropdownButton);
        clickElement(maximumPriceRangeOptionDropdownButton);
    }

//    //Trying to select a random minimum price range using the index of the dropdown
//    public int selectRandomPriceFromMinPriceRangeDropdown(){
//        Random random = new Random();
//        int option = 0;
//        String selectedOption = "";
//
//        clickOnPriceRangeMinimumDropdown();
//
//        List<WebElement> priceRangeOptionsInMinimumRange = retrieveAllTextFromMinPriceRange;
//        List<String> allTextFromMinPriceRange = new ArrayList<>();
//
//        for(int i = 0; i < priceRangeOptionsInMinimumRange.size(); i++){
//            allTextFromMinPriceRange.add(priceRangeOptionsInMinimumRange.get(i).getText());
//        }
//
//        return option;
//    }

    public void selectMinAndMaxPriceRangeInSearchResultPage(int indexForMinPrice, int indexForMaxPrice){
        waitForAndClickOnAustinLink();
        clickElement(priceRangeOptionDropdownButton);
        minimumPriceRangeOptionDropdownButton.click();
        selectOptionByIndex(minimumPriceRangeOptionDropdownButton, indexForMinPrice);
        maximumPriceRangeOptionDropdownButton.click();
        selectOptionByIndex(maximumPriceRangeOptionDropdownButton, indexForMaxPrice);
    }

    public void selectRentOptionEnterTextAndSearchBottomOfNeighborhoodPage(String textToSearch){
        actions.moveToElement(radioButtonRent).build().perform();
        actions.click(radioButtonRent).build().perform();

        sendKeysToElement(inputSearchBoxAtBottomOfNeighborhoodPage, textToSearch);
        clickElement(searchButtonBottomOfNeighborhoodPage);
        switchToNewTab(1);
    }

    public void enterValidEmailAddressForLatestOnTrulia(String enterValidEmail){
        sendKeysToElement(inputEmailRegisterForLatestOnTrulia, enterValidEmail);
        clickElement(buttonConfirmEmailRegistration);
    }

    public void enterInvalidEmailAddressForLatestOnTrulia(String enterInvalidEmail){
        sendKeysToElement(inputEmailRegisterForLatestOnTrulia, enterInvalidEmail);
        clickElement(buttonConfirmEmailRegistration);
    }
}
