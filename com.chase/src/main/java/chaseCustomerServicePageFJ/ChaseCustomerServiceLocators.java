package chaseCustomerServicePageFJ;

public class ChaseCustomerServiceLocators {

    /**
     * Locators for all links inside the Customer Service Dropdown
     */
    //Get help with your account link under Customer Service header on homepage: (XPATH)
    public static final String WEB_ELEMENT_GET_HELP_WITH_YOUR_ACCOUNT_LINK = "//*[@id=\"contact-2\"]/ul/li[3]/a";
    //Find ATM or Branch link under Customer Service header on homepage: (CSS)
    public static final String WEB_ELEMENT_FIND_ATM_OR_BRANCH_LINK = "#contact-2 > ul > li:nth-child(4) > a";
    //Dispute a Charge Link under Customer Service header on homepage: (XPATH)
    public static final String WEB_ELEMENT_DISPUTE_A_CHARGE_LINK = "//*[@id=\"contact-2\"]/ul/li[5]/a";
    //Replace lost/Damaged card Link under Customer Service header on homepage: (XPATH)
    public static final String WEB_ELEMENT_REPLACE_LOST_DAMAGED_CARD_LINK = "//*[@id=\"contact-2\"]/ul/li[6]/a";
    //Make a payment Link under Customer Service header on homepage: (CSS)
    public static final String WEB_ELEMENT_MAKE_A_PAYMENT_LINK = "#contact-2 > ul > li:nth-child(7) > a";
    //Reset username/Password Link under Customer Service header on homepage: (XPATH)
    public static final String WEB_ELEMENT_RESET_USERNAME_PASSWORD_LINK = "//*[@id=\"contact-2\"]/ul/li[8]/a";

    /**
     * Locators required for Assertions
     */
    //Input SearchBox on landed Find ATM Link: (CSS)
    public static final String WEB_ELEMENT_SEARCH_BOX_TO_FIND_NEAREST_ATM = "#q";
    //4 header links on Dispute a charge page for case#3: (CSS)
            public static final String WEB_ELEMENT_ACTUAL_LINKS_ON_DISPUTE_CHARGE_PAGE = "#SubHeaderOriginal > ul > li";
    //Text on Make A Payment page: (CSS)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_MAKE_A_PAYMENT_PAGE = ".body-copy.default h2";
    //Text on Reset Username/ Password Link: (ID)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_RESET_USERNAME_PSWD_PAGE = "passwordResetHeader";
}
