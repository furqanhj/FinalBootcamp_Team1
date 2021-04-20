package espnWatchOriginalsKE;

import common.BaseAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static espnWatchOriginalsKE.WatchOriginalsWebElementsLocators.*;

public class EspnWatchOriginalsPage extends BaseAPI {


    @FindBy(xpath = WEB_ELEMENT_WATCH_ORIGINALS_LINK)
    public WebElement watchOriginalsTextLink;
    @FindBy(xpath = WEB_ELEMENT_ORIGINALS_SELECT)
    public WebElement selectOriginals;
    @FindBy(xpath = WEB_ELEMENT_RIGHT_CARET_ICON)
    public WebElement rightCaretIcon;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE_IMAGE)
    public WebElement validateImage1;
    @FindBy(css = WEB_ELEMENT_AMERICA_CADDIE_TRAILER)
    public WebElement americaCaddieTrailer;
    @FindBy(css = WEB_ELEMENT_BLACK_HISTORY_IMAGE)
    public WebElement blackHistoryImageLink;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE_TEXT_BLACK_HISTORY_PAGE)
    public WebElement validateTextBlackHistoryPage;


    public EspnWatchOriginalsPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectOriginalsPage() {

        clickElement(watchOriginalsTextLink);
        clickElement(selectOriginals);
    }
    public void clickRightCaretIcon(){

        clickElement(rightCaretIcon);
    }
    public void playAmericaCaddieTrailer(){

        clickElement(americaCaddieTrailer);
    }
    public void clickBlackHistoryImageLink(){

        JavascriptExecutor jse = (JavascriptExecutor)driver;


       // jse.executeScript("scroll(1326, 500)"); // if the element is on top.

             jse.executeScript("scroll(1326, 500)"); // if the element is on bottom.

        clickElement(blackHistoryImageLink);
        //blackHistoryImageLink.click();


    }




}