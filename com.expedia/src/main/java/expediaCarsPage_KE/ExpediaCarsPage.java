package expediaCarsPage_KE;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static expediaCarsPage_KE.ExpediaCarsWebElementsLocators.*;

public class ExpediaCarsPage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_CARS_ICON_LINK)
    public WebElement carsIconLink;
    @FindBy(xpath = WEB_ELEMENT_PICKuP_LOCATION)
    public WebElement pickUpLocation;
    @FindBy(xpath = WEB_ELEMENT_ALEXANDRIA_LOCATION_RESULT)
    public WebElement alexandriaLocationResult;
    @FindBy(xpath = WEB_ELEMENT_PICKup_DATES_CALENDER)
    public WebElement pickUpDatesCalender;
    @FindBy(xpath = WEB_ELEMENT_PICK_UP_DATE)
    public WebElement pickUpDate;
    @FindBy(xpath = WEB_ELEMENT_DROP_OFF_DAY)
    public WebElement dropOffDay;
    @FindBy(xpath = WEB_ELEMENT_DONE_BTN)
    public WebElement doneBtn;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE_DROP_OFF_DAY)
    public WebElement validateDropOffDay;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE_PICK_UP_DATE)
    public WebElement validatePickUpDate;



    public ExpediaCarsPage (){
        PageFactory.initElements(driver, this);
    }
    public void clickCarsIconLink (){

        clickElement(carsIconLink);

    }
    public void enterPickUpLocation(){

        sendKeysToElement(pickUpLocation," Alexandria ");
        clickElement(alexandriaLocationResult);
    }
    public void selectPickUpDatesCalender()  {

     clickElement(pickUpDatesCalender);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window,0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", pickUpDate);

    }
    public void selectPickUpDate(){
        clickElement(pickUpDate);

    }
    public void selectDropOffDay(){
        clickElement(dropOffDay);
        clickJScript(doneBtn);
        System.out.println(validateDropOffDay.getText());
    }



}
