package airBnbExperiencesAR;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static airBnbExperiencesAR.AirBnbExperiencesWebElements.*;


public class AirBnbExperiences extends BaseAPI {


    @FindBy(xpath = WEB_ELEMENT_EXPERIENCES_LINK)
    WebElement experiencesLink;

    @FindBy(xpath = WEB_ELEMENT_LOCATION_FIELD)
    WebElement locationField;

    @FindBy(xpath = WEB_ELEMENT_DATE_FIELD)
    WebElement dateField;

    @FindBy (css = WEB_ELEMENT_SEARCH_BUTTON)
    WebElement searchButton;

    @FindBy (xpath = WEB_ELEMENT_BECOME_A_HOST_BUTTON)
    WebElement becomeAHostButton;

    @FindBy (xpath = WEB_ELEMENT_EXPERIENCES_SEARCH_BUTTON)
    WebElement experiencesSearchButton;

    @FindBy (css = WEB_ELEMENT_GUESTS_BUTTON)
    WebElement guestsButton;

    @FindBy (xpath = WEB_ELEMENT_PLUS_SIGN)
    WebElement plusSign;

    @FindBy (xpath = WEB_ELEMENT_GUESTS_SAVE_BUTTON )
    WebElement guestsDropDownSaveButton;

    @FindBy (xpath = WEB_ELEMENT_SIDE_MENU_BAR)
    WebElement sideMenuBar;

    @FindBy (xpath =  WEB_ELEMENT_HOST_YOUR_HOME)
    WebElement hostYourHome;

    @FindBy (xpath = WEB_ELEMENT_SELECT_DATE)
    WebElement selectADate;

    @FindBy (xpath= WEB_ELEMENT_DATE)
    WebElement date;

    //initialize the web elements on this page, using PageFactory
    public AirBnbExperiences() {
        PageFactory.initElements(driver, this); }


    //METHODS:


//click the Experiences link on the Airbnb Homepage
    public void clickExperiencesLink(){
    experiencesLink.click();
    implicitWait(20);
}

//Type in the location field on Experiences page
    public void enterALocation() throws InterruptedException {
        experiencesLink.click();
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_LOCATION_FIELD);
       implicitWait(20);
        typeOnElementNEnter(WEB_ELEMENT_LOCATION_FIELD,"Mexico");
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_EXPERIENCES_SEARCH_BUTTON);
        implicitWait(30);

    }

    //Click the 'Become A Host' button on Experiences page
    public void clickBecomeAHostButton(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BECOME_A_HOST_BUTTON);
    }

    //Click the + to add number of guests
    public void addNumberOfGuests(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_GUESTS_BUTTON);
        plusSign.click();
        guestsDropDownSaveButton.click();
        implicitWait(20);
    }

    public void clickSideMenuBar(){   //cant find the locator for 'Host your Home' on side menu drop down.
        sideMenuBar.click();
    }

    public void clickHostYourHome(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_HOST_YOUR_HOME);
    }

    public void selectADate() throws InterruptedException {
        experiencesLink.click();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_LOCATION_FIELD);
        WebDriverWait wait = new WebDriverWait(driver,20);
        typeOnElementNEnter(WEB_ELEMENT_LOCATION_FIELD,"Mexico");
        WebDriverWait wait1 = new WebDriverWait(driver,20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_DATE_FIELD);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_DATE);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_EXPERIENCES_SEARCH_BUTTON);
    }
    public void sendKeysToLocationSearchBoxUsingExcel() throws Exception {
        List<String> locations = DataSource.getItemsListFromExcel();
        String states = locations.get(3);
        typeOnElementNEnter(WEB_ELEMENT_LOCATION_FIELD,states);
        click(WEB_ELEMENT_SEARCH_BUTTON);
    }
    public void verifyAveragePriceDropDownMenu(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_EXPERIENCES_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_LOCATION_FIELD);
        implicitWait(20);
    }
    public void clickTimeOfDayMorningCheckbox(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TIME_OF_DAY_BUTTON);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TIME_OF_DAY_MORNING_CHECKBOX);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TIME_OF_DAY_SAVE_BUTTON);
    }
}