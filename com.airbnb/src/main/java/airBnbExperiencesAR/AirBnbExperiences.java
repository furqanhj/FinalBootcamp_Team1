package airBnbExperiencesAR;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static airBnbExperiencesAR.AirBnbExperiencesWebElements.*;


public class AirBnbExperiences extends BaseAPI {

    //- This class will EXTEND the BASE class (so that the constructor used on line 41, will instantiate the elements)
    //  - Also, this class will have all the helper methods, that would be called upon in the TEST CLASS.

    @FindBy(css = WEB_ELEMENT_EXPERIENCES_LINK)
    WebElement experiencesLink;

    @FindBy(xpath = WEB_ELEMENT_LOCATION_FIELD)
    WebElement locationField;

    @FindBy(xpath = WEB_ELEMENT_DATE_FIELD)
    WebElement dateField;

    @FindBy (css = WEB_ELEMENT_SEARCH_BUTTON)
    WebElement searchButton;

    @FindBy (xpath = WEB_ELEMENT_BECOME_A_HOST_BUTTON)
    WebElement becomeAHostButton;

    @FindBy (css = WEB_ELEMENT_EXPERIENCES_SEARCH_BUTTON)
    WebElement experiencesSearchButton;

    @FindBy (xpath = WEB_ELEMENT_GUESTS_BUTTON)
    WebElement guestsButton;

    @FindBy (xpath = WEB_ELEMENT_PLUS_SIGN)
    WebElement plusSign;

    @FindBy (xpath = WEB_ELEMENT_SAVE_BUTTON)
    WebElement guestsDropDownSaveButton;


    //initialize the web elements on this page, using PageFactory
    public AirBnbExperiences() {
        PageFactory.initElements(driver, this); }


    //METHODS:


//click the Experiences link on the Airbnb Homepage
    public void clickExperiencesLink(){
    experiencesLink.click();
}

//Type in the location field on Experiences page
    public void enterALocation(String keysToSend) {
        locationField.click();
        locationField.sendKeys("Mexico");
        experiencesSearchButton.click();
    }

    public void clickBecomeAHostButton(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BECOME_A_HOST_BUTTON);
    }
    public void addNumberOfGuests(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_GUESTS_BUTTON);
        plusSign.click();

    }






}