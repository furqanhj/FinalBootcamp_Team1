package requestAQuotePageFJ;

public class RequestAQuoteWebElements {

    /**
     * Locators on Request A Quote main page
     */
    //Vehicle Class dropdown menu: (XPATH - custom)
    public static final String WEB_ELEMENT_VEHICLE_CLASS_DROPDOWN_MENU = "//div[@class='vehicle-selector__classes']/div/div/div/button";
    //S-CLASS option in Class dropdown menu: (XPATH - custom)
    public static final String WEB_ELEMENT_S_CLASS_OPTION_IN_CLASS_DROPDOWN = "//div[@class='vehicle-selector__classes']/div/ul/li[13]";
    //Vehicle Model dropdown menu: (XPATH - custom)
    public static final String WEB_ELEMENT_VEHICLE_MODEL_DROPDOWN_MENU = "//label[@id='label-_knsl1n40mdn29']";
    //AMD S 63 COUPE option in Model dropdown menu: (XPATH - custom)
    public static final String WEB_ELEMENT_AMG_S_63_COUPE_OPTION_IN_MODEL_DROPDOWN = "//div[@class='vehicle-selector__models']/div/ul/li[2]";
    //Continue button: (XPATH)
    public static final String WEB_ELEMENT_CONTINUE_BUTTON = "//*[@id=\"leads-form-vehicle-selector\"]/div/div[2]/div/button";


    /**
     * Locators required for Assertions
     */
    //Image of AMG S 63 COUPE after clicking the Continue button: (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_IMAGE_OF_AMG_S_CLASS_SEARCH_RESULT = "//*[@id=\"leads-form-vehicle-selector\"]/div/div[3]/div/div/img";
    //Actual Number of Elements in Vehicle Class Dropdown (15): (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUM_OF_ELEMENTS_IN_CLASS_DROPDOWN = "//div[@class='vehicle-selector__classes']/div/ul/li";
    //Actual Number of Elements in Vehicle Model Dropdown (12): (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUM_OF_ELEMENTS_IN_MODEL_DROPDOWN = "//div[@class='vehicle-selector__models']/div/ul/lI";


}
