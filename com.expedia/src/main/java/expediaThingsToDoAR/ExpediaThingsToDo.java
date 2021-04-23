package expediaThingsToDoAR;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static expediaThingsToDoAR.ExpediaThingsToDoWebElements.*;

public class ExpediaThingsToDo extends BaseAPI{


    @FindBy (xpath = WEB_ELEMENT_SEARCH_EVENT_TICKETS_LINK)
    WebElement searchEventTicketsLink;

    @FindBy (xpath = WEB_ELEMENT_LOCATION_FIELD)
    WebElement locationField;


    public void ExpediaThingsToDo(){
        PageFactory.initElements(driver, "this");
    }



    //METHODS:

    public void selectThingsToDoDropDownOption(){
        explicitWaitUntilClickable(20,WEB_ELEMENT_MORE_TRAVEL_DROPDOWN_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_THINGS_TO_DO_DROPDOWN_OPTION);
        implicitWait(20);
    }

    public void clickSearchEventTicketsLink(){
        explicitWaitUntilClickable(20,WEB_ELEMENT_MORE_TRAVEL_DROPDOWN_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_THINGS_TO_DO_DROPDOWN_OPTION);
        implicitWait(20);
        explicitWaitUntilClickable(20, WEB_ELEMENT_SEARCH_EVENT_TICKETS_LINK);
        implicitWait(20);
    }

    public void enterLocationField(){
        explicitWaitUntilClickable(20,WEB_ELEMENT_MORE_TRAVEL_DROPDOWN_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_THINGS_TO_DO_DROPDOWN_OPTION);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_LOCATION_FIELD);
        locationField.sendKeys(WEB_ELEMENT_INPUT_LOCATION_FIELD);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_X_IMAGE);
    }
    public void clickSearchButton(){
        explicitWaitUntilClickable(20,WEB_ELEMENT_MORE_TRAVEL_DROPDOWN_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_THINGS_TO_DO_DROPDOWN_OPTION);
        explicitWaitUntilClickable(20, WEB_ELEMENT_SEARCH_BUTTON);
        implicitWait(20);

    }
    public void verifyFindYourNextDestinationHeader(){
        explicitWaitUntilClickable(20,WEB_ELEMENT_MORE_TRAVEL_DROPDOWN_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_THINGS_TO_DO_DROPDOWN_OPTION);
        implicitWait(20);

    }




















}





















