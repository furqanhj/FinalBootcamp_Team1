package ebaySignInPageFJ;

public class EbaySignInPageWebElements {

    // Recaptcha Checkbox on signIn page: (CSS)
    public static final String WEB_ELEMENT_RECAPTHA_CHECKBOX = "#recaptcha-anchor > div.recaptcha-checkbox-border";
    // Email or userID input field on signIn page: (CSS)
    public static final String WEB_ELEMENT_USERID_INPUT_FIELD = "input#userid";
    // Continue button on signIn page: (XPATH)
    public static final String WEB_ELEMENT_SIGN_IN_CONTINUE_BUTTON = "//button[@id='signin-continue-btn']";
    // Ebay image on signIn page that is also a link to go to the homepage: (XPATH)
    public static final String WEB_ELEMENT_HOMEPAGE_LINK_BUTTON = "//a[@href=\"https://www.ebay.com/\"]";

}
