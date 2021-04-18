package cbsSportsHQBS;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static cbsSportsHQBS.CbsSportsHQWebElements.*;

public class CbsSportsHQ extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_SPORTS_HQ)
    WebElement sportsHQ;

    public void sportsHQClick() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SPORTS_HQ);

    }

    @FindBy(xpath = WEB_ELEMENT_MORE_TOP_VIDEOS)
    WebElement moreTopVideos;
    @FindBy(xpath = WEB_ELEMENT_MORE_NFL_VIDEOS)
    WebElement moreNflVideos;
    @FindBy(xpath = WEB_ELEMENT_MORE_COLLEGE_FOOTBALL_VIDEOS)
    WebElement moreFootballVideos;
    @FindBy(xpath = WEB_ELEMENT_MORE_NBA_VIDEOS)
    WebElement moreNbaVideos;
    @FindBy(xpath = WEB_ELEMENT_MORE_COLLEGE_BB_VIDEOS)
    WebElement moreBasketballVideos;
    @FindBy(xpath = WEB_ELEMENT_MORE_GOLF_VIDEOS)
    WebElement moreGolfVideos;
    @FindBy(xpath = WEB_ELEMENT_TOP_VIDEO)
    WebElement topVideo;
    @FindBy(xpath = WEB_ELEMENT_NFL_VIDEO)
    WebElement nflVideo;
    @FindBy(xpath = WEB_ELEMENT_NBA_VIDEO)
    WebElement nbaVideo;
    @FindBy(xpath = WEB_ELEMENT_NBA_VIDEO_TITLE)
    WebElement nbaVideoTitle;

    public void clickMoreTopVideos() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SPORTS_HQ);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MORE_TOP_VIDEOS);
    }

    public void clickMoreNflVideos() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SPORTS_HQ);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MORE_NFL_VIDEOS);
        implicitWait();
    }

    public void clickMoreFootballVideos() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SPORTS_HQ);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MORE_COLLEGE_FOOTBALL_VIDEOS);
        implicitWait();
    }

    public void clickMoreNbaVideos() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SPORTS_HQ);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MORE_NBA_VIDEOS);
        implicitWait();
    }

    public void clickMoreBasketballVideos() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SPORTS_HQ);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MORE_COLLEGE_BB_VIDEOS);
        implicitWait();

    }

    public void clickMoreGolfVideos() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SPORTS_HQ);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MORE_GOLF_VIDEOS);
        implicitWait();
    }

    public void clickOnTopVideo() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SPORTS_HQ);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TOP_VIDEO);
        implicitWait();
        switchToNewTab(1);
    }

    public void clickOnNflVideo() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SPORTS_HQ);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NFL_VIDEO);
        implicitWait();
        switchToNewTab(1);
    }

    public void clickOnNbaVideo() {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SPORTS_HQ);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NBA_VIDEO);
        implicitWait();
        switchToNewTab(1);
    }
}
