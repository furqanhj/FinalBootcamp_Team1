package truliaNeighborhoodsPageFJ;

public class NeighborhoodsPageWebElements {

    //Search box on Neighborhoods page: (CLASS)
    public static final String WEB_ELEMENT_SEARCH_BOX_INPUT = "nh-intro__search_input";
    //Search button inside Search box: (CLASS)
    public static final String WEB_ELEMENT_SEARCH_BUTTON = "nh-intro__search_submit";
    //Link to Austin neighborhood on the auto-scroll portion of Neighborhoods page: (XPATH)
    public static final String WEB_ELEMENT_AUSTIN_LINK_BOX = "/html/body/section[1]/div/div[5]/div/div/a/div";
    //Price Range option button on search result page: (XPATH - custom)
    public static final String WEB_ELEMENT_PRICE_RANGE_DROPDOWN_BUTTON = "//div[@id='main-content']//ul/li[2]";
    //Minimum Price Option dropdown under Price Range Option button: (XPATH - custom)
    public static final String WEB_ELEMENT_MINIMUM_PRICE_RANGE_OPTION_DROPDOWN_BUTTON = "//select[@aria-label='minimum price filter']";
    //Maximum Price Option dropdown under Price Range Option button: (XPATH - custom)
    public static final String WEB_ELEMENT_MAXIMUM_PRICE_RANGE_OPTION_DROPDOWN_BUTTON = "//select[@aria-label='maximum price filter']";
    //Rent radio button at the bottom of Neighborhoods Page: (ID)
    public static final String WEB_ELEMENT_RADIO_BUTTON_RENT = "property_search_widget-type-for_rent";
    //Input Search Box at the bottom of the Neighborhoods Page: (XPATH - Custom)
    public static final String WEB_ELEMENT_INPUT_SEARCH_BOX_BOTTOM_OF_NEIGHBORHOOD_PAGE = "//input[@id='property_search']";
    //Search Button at the bottom of the Neighborhood page: (ID)
    public static final String WEB_ELEMENT_SEARCH_BUTTON_BOTTOM_OF_NEIGHBORHOOD_PAGE = "property-search-widget-submit";
    //Get latest on Trulia Email field on Neighborhoods page: (XPATH - custom)
    public static final String WEB_ELEMENT_INPUT_EMAIL_REGISTER_FOR_LATEST_ON_TRULIA = "//input[@name='tru-register-email']";
    //Button to confirm register email address to receive updates: (ID)
    public static final String WEB_ELEMENT_BUTTON_CONFIRM_EMAIL_REGISTRATION = "tru-register-email-btn";

    /**
     * Locators required for Assertions
     */
    //Text on Search Result page, Austin: (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_SEARCH_RESULT_PAGE_AUSTIN = "//*[@id=\"resultsColumn\"]/div[1]/div/h1/div";
    //Total number of Price ranges in Minimum Price Range options(46): (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_NUMBER_OF_OPTIONS_IN_MINIMUM_PRICE_RANGE = "//select[@aria-label='minimum price filter']/option";
    //Total number of Price ranges in Maximum Price Range options: (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_NUMBER_OF_OPTIONS_IN_MAXIMUM_PRICE_RANGE = "//select[@aria-label='maximum price filter']/option";
    //Text On Search Result page, Rent option bottom of page (search 67401): (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_SEARCH_RESULT_PAGE_67401 = "//*[@id=\"resultsColumn\"]/div[1]/div/h1/div";
    //Text under email input field after pressing right arrow (to receive updates): (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_WITH_VALID_EMAIL_REGISTRATION = "//span[@class='tru-reg-status']";
    //Text under email input field after registering with invalid email: (CLASS)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_WITH_INVALID_EMAIL_REGISTRATION = "/html/body/section[6]/div[2]/div[3]/div/div/form/p[2]";


}
