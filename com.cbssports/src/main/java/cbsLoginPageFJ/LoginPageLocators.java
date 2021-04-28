package cbsLoginPageFJ;

public class LoginPageLocators {

    /**
     * Locators on login page
     */
    // Email or Member ID input field (XPATH - custom)
    public static final String WEB_ELEMENT_INPUT_FIELD_EMAIL_USER_ID = "//input[@id='userid']";
    // password input field (XPATH - custom)
    public static final String WEB_ELEMENT_INPUT_FIELD_PASSWORD = "//input[@id='password']";
    // login button on login page (XPATH)
    public static final String WEB_ELEMENT_BUTTON_LOGIN = "//*[@id=\"login_form\"]/div[1]/div[2]/input";
    //forgot your password link (XPATH - custom)
    public static final String WEB_ELEMENT_LINK_FORGOT_YOUR_PASSWORD = "//div[@class='help-links']/div[1]/a";
    // dont have an account- sign up link (XPATH - custom)
    public static final String WEB_ELEMENT_LINK_DONT_HAVE_AN_ACCOUNT_SIGNUP = "//div[@class='help-links']/div[2]/a";
    // Email ID input field on Forgot Password Page: (ID)
    public static final String WEB_ELEMENT_INPUT_EMAIL_ID_FORGOT_PASSWORD_PAGE = "email";
    // Continue button on Forgot Password Page: (XPATH- Custom)
    public static final String WEB_ELEMENT_CONTINUE_BUTTON_FORGOT_PASSWORD_PAGE = "//button[@type='submit']";
    // Login with Facebook button on Login page: (CLASSNAME)
    public static final String WEB_ELEMENT_BUTTON_LOGIN_WITH_FACEBOOK = "facebookLogIn";
    // Login with Google button on Login page: (CLASSNAME)
    public static final String WEB_ELEMENT_BUTTON_LOGIN_WITH_GOOGLE = "googleSignIn";

    /**
     * Locators required for Assertions
     */
    // Invalid login error message: (CLASS)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ERROR_WITH_INVALID_LOGIN = "formErrorSummary";
    // Invalid email error message on Forgot Password Page: (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ERROR_MSG_FORGOT_PASSWORD_PAGE = "//*[@id=\"row_email\"]/div/div[2]";
    // Valid but unregistered email error message actual text on Forgot Password page: (CLASS)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ERROR_MSG_UNREGISTERED_VALID_EMAIL = "warn";
    // Register button element displayed on Sign-up page: (XPATH - custom)
    public static final String WEB_ELEMENT_REGISTER_BUTTON_SIGN_UP_PAGE = "//input[@type='submit']";
    // Actual number of links (11) on the FOOTER of login page: (CSS - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUMBER_OF_LINKS_ON_FOOTER_LOGIN_PAGE = ".site-footer-links > li";
    // Actual number of Social Networks Link (5) on the FOOTER of login page: (CSS - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUMBER_OF_SOCIAL_NETWORK_LINKS_ON_FOOTER_LOGIN_PAGE = ".site-footer-follow > li";
    // Actual number of PARTNER links on footer of Login page: (CSS - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUMBER_OF_PARTNER_LINKS_ON_FOOTER_LOGIN_PAGE = ".site-footer-partners > *";
    // Actual Text on new window of login with facebook link: (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_LOGIN_WITH_FACEBOOK_NEW_WINDOW = "//*[@id=\"content\"]/span";
    // Actual Text on new window of login with Google link: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_LOGIN_WITH_GOOGLE_NEW_WINDOW = "//div[@class='kHn9Lb']";
}
