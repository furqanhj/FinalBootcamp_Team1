package investingPageFJ;

public class InvestingPageLocators {

    /**
     * Locators on Bank Of America Homepage
     */
    //Investing header on homepage: (XPATH)
    public static final String WEB_ELEMENT_INVESTING_HEADER = "//a[@id='navInvesting']";
    // Get started button under Investing header on homepage: (ID)
    public static final String WEB_ELEMENT_GET_STARTED_BUTTON = "btnInvesting";

    /**
     * Locators on MerrillEdge Investing Page
     */
    //Open an Account First Button on Investing Page: (CSS)
    public static final String WEB_ELEMENT_OPEN_AN_ACCOUNT_BUTTON = "#CTA1 > span:nth-child(2)";
    //Investing & Trading Link Button on Investing Page: (ID)
    public static final String WEB_ELEMENT_INVESTING_AND_TRADING_LINK_BUTTON = "spnMenuItem_15";
    //Guidance & Retirement Link Button on Investing Page: (ID)
    public static final String WEB_ELEMENT_GUIDANCE_AND_RETIREMENT_LINK_BUTTON = "spnMenuItem_38";

    /**
     * Locators on Open An Account Page
     */
    //Help Me Get Started Link button on Open An Account Page: (CSS)
    public static final String WEB_ELEMENT_HELP_ME_GET_STARTED_LINK = "#\\31 aHelp";
    //General Investing Link button on Open An Account Page: (CSS)
    public static final String WEB_ELEMENT_GENERAL_INVESTING_LINK = "#\\32 aGen > h3";
    //I'll Select My Own options Link on Open An Account Page: (CSS)
    public static final String WEB_ELEMENT_ILL_SELECT_MY_OWN_OPTIONS_LINK = "#\\33 aMESD > h3";
    //Just Me Link on Open An Account Page: (CSS)
    public static final String WEB_ELEMENT_JUST_ME_LINK = "#\\34 aInd > h3";

    /**
     * Locators required for Assertions
     */
    // Locator for text on Investing Page: (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_LANDED_INVESTING_PAGE = "//h1[@class='txt-brand-b']";
    // Number of Header Links on Investing Page (6 links): (XPATH- Custom)
    public static final String WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_ON_HEADER_INVESTING_PAGE = "//ul[@id='siteNav']/li";
    // Locator for text on Open An Account Page: (XPATH- Custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_LANDED_OPEN_AN_ACCOUNT_PAGE = "//div[@class=\"1Intro find\"]/h1";
    // Locator for text on Investing & Trading Link on Investing Page: (CSS)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_INVESTING_AND_TRADING_PAGE = "#pageTitle > div > h1";
    // Locator for Visit Retirement Planning Button on Guidance Page: (CSS)
    public static final String WEB_ELEMENT_VISIT_RETIREMENT_PLANNING_BUTTON_ON_GUIDANCE_PAGE = "#RetPlanning";
    //Locator for text on Responses Page after Open An Account (all first selected) options: (CSS)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_RESPONSES_OPEN_AN_ACCOUNT_PAGE = "div#IndCMAMod > h3";
}
