package ebayAdvancedSearchPageFJ;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static ebayAdvancedSearchPageFJ.EbayAdvancedSearchPageWebElements.*;

public class EbayAdvancedSearchPage extends BaseAPI {

    @FindBy (css = WEB_ELEMENT_INPUT_FIELD_FOR_SEARCH)
    public WebElement inputFieldForSearch;

    @FindBy (css = WEB_ELEMENT_INPUT_FIELD_EXCLUDE_KEYWORDS)
    public WebElement inputFieldExcludeKeywords;

    @FindBy (linkText = WEB_ELEMENT_SEARCH_TIPS_LINK_BUTTON)
    public WebElement searchTipsLink;

    @FindBy (partialLinkText = WEB_ELEMENT_USING_ADVANCED_SEARCH_LINK_BUTTON)
    public WebElement usingAdvancedSearchLink;

    @FindBy (id = WEB_ELEMENT_SEARCH_BUTTON)
    public WebElement searchButton;

    @FindBy (className = WEB_ELEMENT_EXPECTED_TEXT_SEARCH_RESULT)
    public WebElement expectedTextFromSearchResult;

    public EbayAdvancedSearchPage(){
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToSearchInputField(String enterKeys){
        sendKeysToElement(inputFieldForSearch, enterKeys);
    }

    public void sendKeysToExcludeKeywordsInputField(String enterKeys){
        sendKeysToElement(inputFieldExcludeKeywords, enterKeys);
    }

    public void doSearchInAdvancedSearchPage(String keysInSearchBox, String keysInExcludeKeywords){
        sendKeysToSearchInputField(keysInSearchBox);
        sendKeysToExcludeKeywordsInputField(keysInExcludeKeywords);
        clickElement(searchButton);
    }

    public void clickOnSearchTipsLink(){
        clickElement(searchTipsLink);
        switchToNewWindow();
    }

    public void clickOnUsingAdvancedSearchLink(){
        clickElement(usingAdvancedSearchLink);
        switchToNewWindow();
    }


}
