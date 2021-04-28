package cricinfoHomepageFJ;

public class CricinfoHomepageLocators {

    /**
     * Locators on cricinfo homepage header - DROPDOWNS
     */
    //Live scores link hover-over dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_HOVER_OVER_LIVE_SCORES_BUTTON = "//ul[@class='navbar-nav mr-auto']/li[1]";
    //Series link hover-over dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_HOVER_OVER_SERIES_BUTTON = "//ul[@class='navbar-nav mr-auto']/li[2]";
    //Teams link hover-over dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_HOVER_OVER_TEAMS_BUTTON = "//ul[@class='navbar-nav mr-auto']/li[3]";
    //News link hover-over dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_HOVER_OVER_NEWS_BUTTON = "//ul[@class='navbar-nav mr-auto']/li[4]";
    //Features link hover-over dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_HOVER_OVER_FEATURES_BUTTON = "//ul[@class='navbar-nav mr-auto']/li[5]";
    //Videos link hover-over dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_HOVER_OVER_VIDEOS_BUTTON = "//ul[@class='navbar-nav mr-auto']/li[6]";
    //Videos2 link hover-over dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_HOVER_OVER_VIDEOS2_BUTTON = "//ul[@class='navbar-nav mr-auto']/li[7]";
    //Stats link hover-over dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_HOVER_OVER_STATS_BUTTON = "//ul[@class='navbar-nav mr-auto']/li[8]";
    //IPL 2021 link in Series dropdown on header: (XPATH)
    public static final String WEB_ELEMENT_IPL2021_UNDER_SERIES_DROPDOWN = "//*[@id=\"navbarSupportedContent\"]/ul[1]/li[2]/div/div/ul[1]/li[1]/a";
    //Pakistan link under Teams dropdown on header: (XPATH - custom)
    public static final String WEB_ELEMENT_PAKISTAN_LINK_UNDER_TEAMS_DROPDOWN = "//*[@id=\"navbarSupportedContent\"]//a[@href='/team/pakistan-7']";
    //India link under Teams dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_INDIA_LINK_UNDER_TEAMS_DROPDOWN = "//*[@id=\"navbarSupportedContent\"]//a[@href='/team/india-6']";
    //News Home link under News dropdown on header: (XPATH - custom)
    public static final String WEB_ELEMENT_NEWS_HOME_UNDER_NEWS_DROPDOWN = "//a[@data-hover=\"News Home\"]";


    /**
     * Locators for iFrames (videos)
     */
    //Play button on first video on cricinfo homepage: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_PLAY_FIRST_VIDEO_CRICINFO_HOMEPAGE = "//div[@class='story-container']/div/div/div/div/div";
    //Play, pause button on modal window playing video: (XPATH -custom)
    public static final String WEB_ELEMENT_BUTTON_PLAY_PAUSE_VIDEO_IN_MODAL = "//button[@title='Play']";
    //Fast-forward button on modal window playing video: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_FAST_FORWARD_VIDEO_IN_MODAL = "//button[@title='Fast Forward']";
    //Rewind button on modal window playing video: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_REWIND_VIDEO_IN_MODAL = "//button[@title='Rewind']";
    //Slider bar on modal window playing video: (XPATH - custom)
    public static final String WEB_ELEMENT_SLIDER_BAR_VIDEO_IN_MODAL = "//div[@class='vjs-play-progress vjs-slider-bar']";
    //ModalWindow body to hover over to display the play, pause etc action buttons: (XPATH - custom)
    public static final String WEB_ELEMENT_MODAL_WINDOW_BODY_TO_HOVER_OVER = "//div[@class='videoAdUiClickElement']";
    //Skip button appearing after 6 seconds for the video ad played in modal window: (XPATH - custom)
    public static final String WEB_ELEMENT_SKIP_AD_BUTTON_IN_MODAL = "//div[@class='videoAdUi trueview ima-action-ad']/div[3]/div[1]/div[2]/button";



    /**
     * Locators required for Assertions
     */
    //Number of links on the cricinfo page header (8 links): (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUM_OF_LINKS_CRICKET_PAGE_HEADER = "//ul[@class='navbar-nav mr-auto']/li";
    //Actual Text on modal window of first video on homepage: (CLASS)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_MODAL_WINDOW_FIRST_VIDEO = "modal-title";
    //Actual Text on IPL2021 link landed page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_IPL2021_PAGE = "//a[@href='/series/ipl-2021-1249214']//h5";
    //Actual Text on Pakistan link landed page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_PAKISTAN_PAGE = "//a[@href='/team/pakistan-7']//h5";
    //Actual Text on India link landed page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_INDIA_PAGE = "//a[@href='/team/india-6']//h5";
    // Filter button present on News Home link under News dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_FILTER_BUTTON_DISPLAYED_ON_NEWS_PAGE = "//div[@class='filter-body']/div/input";

    /**
     * Locators for individual Dropdown menus on header required for creating GETTERS to assert via Excel file
     */
    //Actual number of links in Live scores dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_LIVE_SCORES_DROPDOWN = "//*[@id=\"navbarSupportedContent\"]/ul[1]/li[1]/div/div/ul/li";
    //Actual number of links in Series dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_SERIES_DROPDOWN = "//ul[@class='navbar-nav mr-auto']/li[2]/div/div/ul/li";
    //Actual number of links in Teams dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_TEAMS_DROPDOWN = "//ul[@class='navbar-nav mr-auto']/li[3]/div/div/ul/li";
    //Actual number of links in News dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_NEWS_DROPDOWN = "//ul[@class='navbar-nav mr-auto']/li[4]/div/div/ul/li";
    //Actual number of links in Features dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_FEATURES_DROPDOWN = "//ul[@class='navbar-nav mr-auto']/li[5]/div/div/ul/li";
    //Actual number of links in Videos dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_VIDEOS_DROPDOWN = "//ul[@class='navbar-nav mr-auto']/li[6]/div/div/ul/li";
    //Actual number of links in Videos2 dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_VIDEOS2_DROPDOWN = "//ul[@class='navbar-nav mr-auto']/li[7]/div/div/ul/li";
    //Actual number of links in Stats dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_STATS_DROPDOWN = "//ul[@class='navbar-nav mr-auto']/li[8]/div/div/ul/li";

    /**
     * To handle modal window pop-up
     */
    //Latest Cricket Updates pop-up modal window: (CLASS)
    public static final String WEB_ELEMENT_MODAL_WINDOW_LATEST_UPDATES = "wzrk-alert wiz-show-animate";
    //"Not Now" button on the pop-up: (ID)
    public static final String WEB_ELEMENT_CANCEL_BUTTON_ON_POPUP = "wzrk-cancel";
    //Modal window playing video from link on homepage: ()
}
