package espnNbaBS;

import common.BaseAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

import static espnNbaBS.EspnNbaWebElements.*;

public class EspnNba extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_NBA_LINK)
    WebElement nbaLink;
    @FindBy(xpath = WEB_ELEMENT_SEARCH_BAR)
    WebElement searchBar;

    public void navigateToNbaPage() {
        implicitWait(5);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NBA_LINK);
        implicitWait();
    }

    public void navigateToNbaHome(){
        implicitWait(5);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NBA_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NBA_HOME);
        implicitWait();
    }

    public void navigateToScoresPage() {
        implicitWait(3);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NBA_LINK);
        implicitWait(3);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NBA_SCORES);
        implicitWait();
    }

    public void navigateToSchedule() {
        implicitWait(3);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NBA_LINK);
        implicitWait(3);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NBA_SCORES);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NBA_SCHEDULE);
    }

    public void navigateToBrooklynCeltics() {
        implicitWait(3);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NBA_LINK);
        implicitWait(3);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BOSTON_CELTICS);
        implicitWait();
    }
    public void brooklynNetsSearch() throws AWTException {
        implicitWait(5);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SEARCH_CLICK);
        implicitWait(5);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SEARCH_BAR);
        implicitWait(5);
        sendKeysToElement(searchBar,"Brooklyn Nets");
        implicitWait(5);
        enterKey();
    }
    public void clickOnNewYorkKnicks(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NBA_LINK);
        implicitWait(5);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NY_KNICKS);
        implicitWait(5);
    }
    public void playVideo(){
        implicitWait(5);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NBA_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NBA_HOME);
        fluentWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_PLAY_VIDEO_BUTTON);
        implicitWait();
    }

}