package attTVPageFJ;

public class AttTVPageWebElements {

    /**
     * Locators on TV Page
     */
    //ORDER ONLINE NOW link on TV Page: (XPATH)
    public static final String WEB_ELEMENT_ORDER_ONLINE_NOW_LINK = "//*[@id=\"ALERT_BANNER1\"]/div[2]/div/div/span/span/a";
    //Auto-play Video on TV page: (XPATH)
    public static final String WEB_ELEMENT_VIDEO_AUTOPLAY_ON_TV_PAGE = "//*[@id=\"MEDIA_OVERLAY2\"]/div[1]/video";

    /**
     * Locators for 3 packages options on TV Page
     */
    //ENTERTAINMENT PACKAGE: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_ENTERTAINMENT_PACKAGE = "//div[@class='grid-col-4 _qrt-U']//a[contains(@href,'ENTERTAINMENT')]";
    //CHOICE PACKAGE: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_CHOICE_PACKAGE = "//div[@class='grid-col-4 _qrt-U']//a[contains(@href,'CHOICE')]";
    //ULTIMATE PACKAGE: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_ULTIMATE_PACKAGE = "//div[@class='grid-col-4 _qrt-U']//a[contains(@href,'ULTIMATE')]";

    /**
     * Locators required for Assertions
     */
    //Text On Order Online Now Page header: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_HEADER_ORDER_ONLINE_NOW_PAGE = "//div[@class='Bundle__bundle-header']";
    //Number of Packages Options on TV Page (3pckgs): (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUMBER_OF_PACKAGES_OPTIONS_TV_PAGE = "//div[@class='mar-t-xs mar-b-xs text-center']";
    //Number of links on header of TV Page: (CSS - custom)
    public static final String WEB_ELEMENT_ACTUAL_NUMBER_OF_LINKS_HEADER_TV_PAGE = "#HEADBAND0 > ul> li";

    /**
     * Locators for Assertions of TV Packages
     */
    //Text on ENTERTAINMENT package page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ENTERTAINMENT_PACKAGE_PAGE = "//div[contains(text(),'1. Your TV package')]";
    // Text on CHOICE package page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_CHOICE_PACKAGE_PAGE = "//div[contains(text(),'1. Your TV package')]";
    //Text on ULTIMATE package page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ULTIMATE_PACKAGE_PAGE = "//div[contains(text(),'1. Your TV package')]";

}
