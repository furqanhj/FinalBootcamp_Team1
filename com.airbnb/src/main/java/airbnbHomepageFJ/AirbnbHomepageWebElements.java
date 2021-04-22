package airbnbHomepageFJ;

public class AirbnbHomepageWebElements {

    /**
     * Locators for WebElements on dropdown for Signup and Login options
     */
    // Global button dropdown on top right corner for signup and login options: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_DROPDOWN_GLOBAL_LOGIN_ICON = "//div[@class='_167wsvl']";
    // Sign-up option after dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_SIGN_UP_OPTION = "//a[@class='_14tt8lmp']";
    // Log-in option after dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_LOG_IN_OPTION = "//a[@href='/login']";

    /**
     * Locators required for Assertions
     */
    //Actual number of links in the global dropdown menu (5links): (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUM_OF_LINKS_IN_GLOBAL_DROPDOWN = "//div[@class='_7nxhq3b']/div/a";
    //Actual text on Signup iframe: (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_SIGN_UP_IFRAME = "//div[@class='_1dllel0']/h1/div";
    //Actual Text on Phone number error during signup: (ID)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_PHONE_NUMBER_ERROR_MESSAGE = "phone-number-error";
    //Country code text in phone number field: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_COUNTRY_CODE_PHONE_NUMBER_FIELD = "//div[@class='_1sc2yjmz']";
    //Actual number of countries in Country/Region dropdown: (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUMBER_OF_COUNTRIES_IN_COUNTRY_DROPDOWN = "//select[@id='country']/option";
    //CountryCode section inside phone number input field (CLASS)
    public static final String WEB_ELEMENT_COUNTRY_CODE_AUTO_CHANGE_INSIDE_PHONE_NUMBER_INPUT_FIELD = "_1sc2yjmz";
    //Didnt get a code? text for valid signup test case: (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_VALID_SIGNUP_CONFIRM_YOUR_NUMBER = "//p[@class='_bizipg']/span";
    //Email input field present on continue with email option: (XPATH - custom)
    public static final String WEB_ELEMENT_INPUT_FIELD_EMAIL_ON_CONTINUE_WITH_EMAIL_OPTION = "//input[@id='email']";
    //Actual Text on Continue with facebook new window: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_CONTINUE_WITH_FACEBOOK_NEW_WINDOW = "//div[@id='booklet']/div[2]";

    /**
     * Locators in the signup option
     */
    //Country/Region dropdown options: (ID)
    public static final String WEB_ELEMENT_COUNTRY_REGION_DROPDOWN = "country";
    //Phone number input field: (ID)
    public static final String WEB_ELEMENT_PHONE_NUMBER_INPUT_FIELD = "phoneNumber";
    //Continue button on signup popup: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_CONTINUE_SIGNUP = "//button[@data-testid='signup-login-submit-btn']";
    //Continue with Email option in signup window: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_CONTINUE_WITH_EMAIL = "//div[@data-testid='signup-pane']/div[2]";
    //Continue with facebook option in signup window: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_CONTINUE_WITH_FACEBOOK = "//div[@data-testid='signup-pane']/div[3]";
    //Continue with Google option in signup window: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_CONTINUE_WITH_GOOGLE = "//div[@data-testid='signup-pane']/div[4]";

    /**
     * Recaptchas and Popups locators to handle
     */
    //Recaptcha element coming up after entering valid phone number and clicking continue button: (ID)
    public static final String WEB_ELEMENT_RECAPTCHA_BOX = "rc-anchor-container";
    //Recaptcha checkbox: (XPATH - custom)
    public static final String WEB_ELEMENT_CHECKBOX_RECAPTCHA_BOX = "//div[@class='recaptcha-checkbox-border']";
}
