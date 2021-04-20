package cricinfoHomepageFJ;

import static cricinfoHomepageFJ.CricinfoHomepageWebElements.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class CricinfoHomepage extends BaseAPI {

    public CricinfoHomepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = WEB_ELEMENT_HOVER_OVER_LIVE_SCORES_BUTTON)
    public WebElement hoverOverLiveScoresButton;
    @FindBy (xpath = WEB_ELEMENT_HOVER_OVER_SERIES_BUTTON)
    public WebElement hoverOverSeriesButton;
    @FindBy (xpath = WEB_ELEMENT_HOVER_OVER_TEAMS_BUTTON)
    public WebElement hoverOverTeamsButton;
    @FindBy (xpath = WEB_ELEMENT_HOVER_OVER_NEWS_BUTTON)
    public WebElement hoverOverNewsButton;
    @FindBy (xpath = WEB_ELEMENT_HOVER_OVER_FEATURES_BUTTON)
    public WebElement hoverOverFeaturesButton;
    @FindBy (xpath = WEB_ELEMENT_HOVER_OVER_VIDEOS_BUTTON)
    public WebElement hoverOverVideosButton;
    @FindBy (xpath = WEB_ELEMENT_HOVER_OVER_VIDEOS2_BUTTON)
    public WebElement hoverOverVideos2Button;
    @FindBy (xpath = WEB_ELEMENT_HOVER_OVER_STATS_BUTTON)
    public WebElement hoverOverStatsButton;
    @FindBy (xpath = WEB_ELEMENT_IPL2021_UNDER_SERIES_DROPDOWN)
    public WebElement ipl2021ButtonUnderSeriesDropdown;
    @FindBy (xpath = WEB_ELEMENT_PAKISTAN_LINK_UNDER_TEAMS_DROPDOWN)
    public WebElement pakistanLinkUnderTeamsDropdown;
    @FindBy (xpath = WEB_ELEMENT_INDIA_LINK_UNDER_TEAMS_DROPDOWN)
    public WebElement indiaLinkUnderTeamsDropdown;
    @FindBy (xpath = WEB_ELEMENT_NEWS_HOME_UNDER_NEWS_DROPDOWN)
    public WebElement newsHomeUnderNewsDropdown;

    /**
     * Elements in modal window where video is being played
     */
    @FindBy (xpath = WEB_ELEMENT_BUTTON_PLAY_FIRST_VIDEO_CRICINFO_HOMEPAGE)
    public WebElement playButtonFirstVideoOnCricinfoHomepage;
    @FindBy (xpath = WEB_ELEMENT_BUTTON_PLAY_PAUSE_VIDEO_IN_MODAL)
    public WebElement playPauseButtonInModalWindow;
    @FindBy (xpath = WEB_ELEMENT_BUTTON_FAST_FORWARD_VIDEO_IN_MODAL)
    public WebElement fastForwardButtonInModalWindow;
    @FindBy (xpath = WEB_ELEMENT_BUTTON_REWIND_VIDEO_IN_MODAL)
    public WebElement rewindButtonInModalWindow;
    @FindBy (xpath = WEB_ELEMENT_SLIDER_BAR_VIDEO_IN_MODAL)
    public WebElement sliderBarInModalWindow;
    @FindBy (xpath = WEB_ELEMENT_MODAL_WINDOW_BODY_TO_HOVER_OVER)
    public WebElement modalWindowBodyToHoverOver;
    @FindBy (xpath = WEB_ELEMENT_SKIP_AD_BUTTON_IN_MODAL)
    public WebElement skipAdButtonInModalWindow;

    /**
     * Latest Cricket Update Pop-up web elements
     */
    @FindBy (className = WEB_ELEMENT_MODAL_WINDOW_LATEST_UPDATES)
    public WebElement modalWindowLatestUpdates;

    @FindBy (id = WEB_ELEMENT_CANCEL_BUTTON_ON_POPUP)
    public WebElement cancelButtonOnPopup;

    /**
     * Initialization of elements required for Assertions
     */
    @FindBy (xpath = WEB_ELEMENTS_ACTUAL_NUM_OF_LINKS_CRICKET_PAGE_HEADER)
    public List<WebElement> actualNumOfLinksCricketPageHeader;
    @FindBy (className = WEB_ELEMENT_ACTUAL_TEXT_MODAL_WINDOW_FIRST_VIDEO)
    public WebElement actualTextModalWindowFirstVideo;
    @FindBy (xpath = WEB_ELEMENT_ACTUAL_TEXT_IPL2021_PAGE)
    public WebElement actualTextIPL2021Page;
    @FindBy (xpath = WEB_ELEMENT_ACTUAL_TEXT_PAKISTAN_PAGE)
    public WebElement actualTextPakistanPage;
    @FindBy (xpath = WEB_ELEMENT_ACTUAL_TEXT_INDIA_PAGE)
    public WebElement actualTextIndiaPage;
    @FindBy (xpath = WEB_ELEMENT_FILTER_BUTTON_DISPLAYED_ON_NEWS_PAGE)
    public WebElement filterButtonOnNewsHomePage;


    /**
     * Creating GETTERS to assert via Excel File
     */
    public String GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_LIVE_SCORES_DROPDOWN(){
        return WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_LIVE_SCORES_DROPDOWN;
    }

    public String GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_SERIES_DROPDOWN(){
        return WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_SERIES_DROPDOWN;
    }

    public String GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_TEAMS_DROPDOWN(){
        return WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_TEAMS_DROPDOWN;
    }

    public String GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_NEWS_DROPDOWN(){
        return WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_NEWS_DROPDOWN;
    }

    public String GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_FEATURES_DROPDOWN(){
        return WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_FEATURES_DROPDOWN;
    }

    public String GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_VIDEOS_DROPDOWN(){
        return WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_VIDEOS_DROPDOWN;
    }

    public String GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_VIDEOS2_DROPDOWN(){
        return WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_VIDEOS2_DROPDOWN;
    }

    public String GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_STATS_DROPDOWN(){
        return WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_STATS_DROPDOWN;
    }

    public void cancelLatestUpdatesPopup(){
        if(isElementDisplayed(modalWindowLatestUpdates))
            clickElement(cancelButtonOnPopup);
    }

    public void clickPlayButtonFirstVideoCricinfoHomepage(){
        clickElement(playButtonFirstVideoOnCricinfoHomepage);
    }

    public void useVideoControlsInModalWindowVideo(){
        clickPlayButtonFirstVideoCricinfoHomepage();
        clickElement(playPauseButtonInModalWindow);
        clickElement(fastForwardButtonInModalWindow);
        clickElement(rewindButtonInModalWindow);
        clickElement(playPauseButtonInModalWindow);
    }

    public void clickIPL2021LinkInSeriesDropdown(){
        hoverOverElement(hoverOverSeriesButton);
        clickElement(ipl2021ButtonUnderSeriesDropdown);
    }

    public void clickPakistanLinkInTeamsDropdown(){
        hoverOverElement(hoverOverTeamsButton);
        clickElement(pakistanLinkUnderTeamsDropdown);
    }

    public void clickIndiaLinkInTeamsDropdown(){
        hoverOverElement(hoverOverTeamsButton);
        clickElement(indiaLinkUnderTeamsDropdown);
    }

    public void clickNewsHomeInNewsDropdown(){
        hoverOverElement(hoverOverNewsButton);
        clickElement(newsHomeUnderNewsDropdown);
    }
}
