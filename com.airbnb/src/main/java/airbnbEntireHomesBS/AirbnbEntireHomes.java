package airbnbEntireHomesBS;

import common.BaseAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static airbnbEntireHomesBS.AirbnbEntireHomesWebElements.*;



public class AirbnbEntireHomes extends BaseAPI {

    public AirbnbEntireHomes() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_ENTIRE_HOMES)
    WebElement entireHomes;
    @FindBy(xpath = WEB_ELEMENT_SIDE_MENU)
    WebElement sideMenu;
    @FindBy(xpath = WEB_ELEMENT_HELP_BUTTON)
    WebElement helpButton;
    @FindBy(xpath = WEB_ELEMENT_VISIT_HELP_CENTER)
    WebElement visitHelpCenter;

    public void visitHelpCenter() {
        sideMenu.click();
        implicitWait();
        helpButton.click();
        visitHelpCenter.click();
    }

    @FindBy(xpath = WEB_ELEMENT_MIRAMAR_BEACH)
    WebElement miramarBeach;
    @FindBy(xpath = WEB_ELEMENT_PAGE_2)
    WebElement page2;
    @FindBy(xpath = WEB_ELEMENT_PAGE_3)
    WebElement page3;


    public void exploreMiramarBeach() {
        miramarBeach.click();
        implicitWait();
        page2.click();
        implicitWait();
        page3.click();
    }

    @FindBy(xpath = WEB_ELEMENT_300)
    WebElement results;
    @FindBy(xpath = WEB_ELEMENT_HEART)
    WebElement heartClick;
    @FindBy(xpath = WEB_ELEMENT_CROSS_OUT)
    WebElement signUpCrossOut;

    public void verifySignUpPopUp() {
        results.click();
        implicitWait();
        heartClick.click();
        implicitWait();
        signUpCrossOut.click();
    }

    @FindBy(xpath = WEB_ELEMENT_ENTIRE_PLACE)
    WebElement entirePlace;
    @FindBy(xpath = WEB_ELEMENT_PRIVATE_ROOM)
    WebElement privateRoom;
    @FindBy(xpath = WEB_ELEMENT_SAVE_BUTTON)
    WebElement saveButton;

    public void typeOfPlace() {
        entirePlace.click();
        privateRoom.click();
        saveButton.click();
    }

    @FindBy(xpath = WEB_ELEMENT_MORE_FILTERS)
    WebElement moreFilters;
    @FindBy(xpath = WEB_ELEMENT_ADD_BEDS)
    WebElement addBeds;
    @FindBy(xpath = WEB_ELEMENT_KITCHEN_CHECKBOX)
    WebElement kitchenCheckBox;
    @FindBy(xpath = WEB_ELEMENT_PETS_ALLOWED)
    WebElement petsAllowed;
    @FindBy(xpath = WEB_ELEMENT_SHOW_STAYS)
    WebElement showStaysButton;

    public void showStaysAfterFilters() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        switchHandlesExample();
        driver.get("https://www.airbnb.com/s/homes?ne_lat=50.15067453041205&ne_lng=-57.804550570363254&sw_lat=7.03212546958795&sw_lng=-106.91144942963675&room_types%5B%5D=Entire%20home%2Fapt&property_type_id%5B%5D=2&search_type=NAVIGATION_CARD&title_type=CURATED_PROPERTY_TYPE");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MORE_FILTERS);
        Thread.sleep(5000);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ADD_BEDS);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_KITCHEN_CHECKBOX);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_PETS_ALLOWED);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOW_STAYS);

    }

    @FindBy(xpath = WEB_ELEMENT_FOUNDERS_LETTER)
    WebElement foundersLetter;
    @FindBy(xpath = WEB_ELEMENT_UPDATE_POPUP_EXIT)
    WebElement popUpExit;

    public void founderLetterPage() {
        foundersLetter.click();
        implicitWait();
        popUpExit.click();
    }

    @FindBy(xpath = WEB_ELEMENT_INVESTORS)
    WebElement investors;
    @FindBy(xpath = WEB_ELEMENT_QUARTERLY_RESULTS)
    WebElement quarterlyResults;
    @FindBy(xpath = WEB_ELEMENT_SEC_FILINGS_BUTTON)
    WebElement secFilingsButton;
    @FindBy(xpath = WEB_ELEMENT_SEC_DROPDOWN)
    WebElement secDropDown;
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_OTHER)
    WebElement dropDownOther;
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_YEAR)
    WebElement dropDownYear;
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_2020)
    WebElement dropDown2020;

    public void navigateSecFilings() {
        investors.click();
        quarterlyResults.click();
        implicitWait();
        secFilingsButton.click();
        implicitWait();
        secDropDown.click();
        dropDownOther.click();
        implicitWait();
        dropDownYear.click();
        dropDown2020.click();
    }

    @FindBy(xpath = WEB_ELEMENT_START_YOUR_SEARCH)
    WebElement startSearch;
    @FindBy(xpath = WEB_ELEMENT_LOCATION_FIELD)
    WebElement locationField;

    public void searchFieldInspection() {
        startSearch.click();
        implicitWait();
        locationField.click();

    }

    public void sendKeysToField() {
        startSearch.click();
        implicitWait();
        locationField.click();
        locationField.sendKeys(WEB_ELEMENT_LOCATION_SENDKEYS);

    }
}
