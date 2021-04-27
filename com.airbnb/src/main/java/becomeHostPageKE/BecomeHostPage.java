package becomeHostPageKE;

import common.BaseAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static becomeHostPageKE.BecomeHostPageWebElements.*;


public class BecomeHostPage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_BecomeHostPage_Link)
    public WebElement becomeHostPage;
    @FindBy(xpath = WEB_ELEMENT_PAGE_IMAGE)
    public WebElement verifyingPageImage;
    @FindBy(xpath = WEB_ELEMENT_GET_STARTED_BTN)
    public WebElement getStartedBtn;
    @FindBy(xpath = WEB_ELEMENT_COUNTRIES_SCROLL)
    public WebElement countriesScrollDown;
    @FindBy(xpath = WEB_ELEMENT_COUNTRIES_SELECTION)
    public WebElement countriesSelection;
    @FindBy(xpath = WEB_ELEMENT_EXPLORE_THE_WORLD)
    public WebElement exploreTheWorldOfHosting;
    @FindBy(css = WEB_ELEMENT_BLUE_LIVING_ROOM)
    public WebElement blueLivingRoom;

    @FindBy(xpath = WEB_ELEMENT_WOMAN_SMILING)
    public WebElement womanSmiling;
    @FindBy(xpath = WEB_ELEMENT_WOMAN_TOUCHES_HER_CHIN)
    public WebElement womanTouchesHerChin;
    @FindBy(xpath = WEB_ELEMENT_MOVIE_PLAYER_BTN)
    public WebElement moviePlayerBtn;
    @FindBy(xpath = WEB_ELEMENT_FRAME_MOVIE_PLAYER_BTN)
    public WebElement moviePlayer;
    @FindBy(xpath = WEB_ELEMENT__MOVIE_PAUSE_BTN)
    public WebElement moviePauseBtn;

    @FindBy(xpath = WEB_ELEMENT_HOW_WE_ESTIMATE_TEXT_LINK)
    public WebElement howWeEstimateTextLink;
    @FindBy(css = WEB_ELEMENT_VALIDATE)
    public WebElement validateHowWeEstimateTextLink;

    @FindBy(css = WEB_ELEMENT_NEXT_BTN)
    public WebElement nextBtn;
    @FindBy(xpath = WEB_ELEMENT_PAGE_DOT)
    public WebElement pageDot;
    @FindBy(xpath = WEB_ELEMENT_HOW_WE_SUPPORT_HOST_LINK)
    public WebElement howWeSupportHostLink;
    @FindBy(xpath = WEB_ELEMENT_TURQUOISE_COUCH)
    public WebElement turquoiseCouch;
    @FindBy(xpath = WEB_ELEMENT_LOCATION_INBOX)
    public WebElement locationInbox;
    @FindBy(xpath = WEB_ELEMENT_CHECK_IN_DATE)
    public WebElement checkInDate;
    @FindBy(xpath = WEB_ELEMENT_CHECK_OUT_DATE)
    public WebElement checkOutDate;
    @FindBy(xpath = WEB_ELEMENT_ADD_GUEST_BTN)
    public WebElement addGuest;
    @FindBy(xpath = WEB_ELEMENT_STEPPER_ADULT)
    public WebElement stepperAdultAdd;
    @FindBy(xpath = WEB_ELEMENT_STEPPER_CHILDREN)
    public WebElement stepperChildrenAdd;
    @FindBy(xpath = WEB_ELEMENT_STEPPER_ENFANTS)
    public WebElement stepperEnfantsAdd;
    @FindBy(xpath = WEB_ELEMENT_SEARCH_BUTTON)
    public WebElement searchBtn;
    @FindBy(xpath = WEB_ELEMENT_SELECTED_DATE_IN)
    public WebElement selectedDateIN;
    @FindBy(xpath = WEB_ELEMENT_SELECTED_DATE_OUT)
    public WebElement selectedDateOut;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE_SEARCH)
    public WebElement validateSearch;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE_ADD_ENFANT)
    public WebElement validateAddEnfant;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE_ADD_CHILDREN)
    public WebElement validateAddChildren;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE_ADD_ADULT)
    public WebElement validateAddAdult;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE_DATE_CHECK_OUT)
    public WebElement validateDateCheckOut;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE_DATE_CHECK_IN)
    public WebElement validateDate_CheckIn;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE_Location_)
    public WebElement validateLocation;






//    @FindBy(xpath = WEB_ELEMENT_FIND_WEBINAR_BTN)
//    public WebElement findWebinarButton;

    public BecomeHostPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickBecomeHostButton() {
        clickElement(becomeHostPage);
    }

    public void login() {
        clickElement(getStartedBtn);
        clickElement(countriesScrollDown);
        clickElement(countriesSelection);
    }

    public void clickExploreTheWorldOfHostingTextLink() {
        //clickElement(exploreTheWorldOfHosting);
        exploreTheWorldOfHosting.click();


    }

    public void clickWomanSmilingVideo() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent" +
                "('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
                + "arguments[0].dispatchEvent(evt);", womanSmiling);

        String actualTitle = driver.getTitle();
        String expectedTitle ="Why host on Airbnb? - Resource Center";

        Assert.assertEquals(actualTitle,expectedTitle,"Text Not Matching");
        //clickElement(womanSmiling);


    }

    public void playMoviePlayerBtn() throws InterruptedException {

        //moviePlayerBtn.click();
        driver.switchTo().frame(moviePlayer);
        clickElement(moviePlayerBtn);

        // JavascriptExecutor jse = (JavascriptExecutor) driver;
////Click on play button
//        jse.executeScript("jwplayer().play();");
//        Thread.sleep(2000);
//Pause

//        jse.executeScript("jwplayer().pause()");
        waitForVisibilityOfElement(moviePauseBtn);

        moviePauseBtn.click();
        //clickElement(moviePauseBtn);

    }

    public void clickHowWeEstimateTextLink() {
        clickElement(howWeEstimateTextLink);

    }
    public void clickNextBtn() throws InterruptedException {

        clickElement(nextBtn);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       clickElement(nextBtn);
    }
    public void clickHowWeSupportHostLink (){

        clickJScript(howWeSupportHostLink);
    }

    /**
     * In HomePage
     */
        public void enterLocation (){
        sendKeysToElement(locationInbox,"Miami , Florida");

        }
        public void clickOnCheckInDate(){
        clickElement(checkInDate);
        clickElement(selectedDateIN);
        }
        public void clickOnSelectedDayCheckOut(){

            clickElement(selectedDateOut);
        }
        public void clickOnAddGuest(){
        clickElement(addGuest);
        }

         public void addAdultGuest(){
        actions = new Actions(driver);
             actions.doubleClick(stepperAdultAdd).click().build().perform(); // 2 Adults

         }
         public void addChildrenGuest(){
             actions = new Actions(driver);
             actions.doubleClick(stepperChildrenAdd).build().perform(); // 3 children
         }
         public void addEnfantGuest(){
            clickElement(stepperEnfantsAdd); // 1 Enfant

         }
         public void clickSearchBtn(){
            waitForElementToBeClickable(searchBtn);
            clickJScript(searchBtn);

         }

}