package becomeHostPageKE;

import common.BaseAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
        Thread.sleep(2000);

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

}