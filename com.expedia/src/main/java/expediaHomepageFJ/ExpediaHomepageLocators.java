package expediaHomepageFJ;

public class ExpediaHomepageLocators {

    // Sign-in header on homepage: (XPATH - custom)
    public static final String WEB_ELEMENT_SIGN_IN_HEADER = "//nav[@id='secondaryNav']/div[4]/button";
    // Sign-in button under Sign-in header on homepage: (XPATH)
    public static final String WEB_ELEMENT_SIGN_IN_BUTTON = "//a[@href='/user/signin?ckoflag=0&uurl=e3id%3Dredr%26rurl%3D%2F']";
    // Sign-up button under Sign-in header on homepage: (XPATH)
    public static final String WEB_ELEMENT_SIGN_UP_BUTTON = "//a[contains(text(),'Sign up, it’s free')]";

    /**
     * Locators required for Assertions
     */

    //Text available on sign-in page: (XPATH)
    public static final String WEB_ELEMENT_EXPECTED_TEXT_ON_SIGN_IN_PAGE = "//*[@id=\"login-form\"]/p[1]";

}
