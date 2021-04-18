package bankOfAmericaSmallBusinessBS;

public class BankOfAmericaSmallBusinessWebElements {

    //1. First click and navigate to small business page
    public static final String WEB_ELEMENT_HOMEPAGE_SMALL_BUSINESS = "//a[@id='NAV_BUSINESS_ADVANTAGE']"; //XPATH


    //2a. Next, click on SMALL BUSINESS RESOURCES IN SMALL BUSINESS PAGE
    public static final String WEB_ELEMENT_SMALL_BUSINESS_RESOURCES = "//a[@id='navSBResources']/span[@class='title']";//XPATH
    //2b. Then click on VISIT small business resources
    public static final String WEB_ELEMENT_VISIT_RESOURCES = "//a[@id='btnSBResources']"; //XPATH


    //3a. CLICK ON SAVINGS LINK
    public static final String WEB_ELEMENT_SAVINGS_LINK = "//a[@id='navSavings']/span[@class='title']";//XPATH
    //3b. THEN CLICK ON BUSINESS ADV SAVINGS
    public static final String WEB_ELEMENT_BUSINESS_ADVANTAGE_SAVINGS_LINK = "//a[@id='bizAdvantageSavings']";//XPATH
    //3c. ENTER ZIPCODE
    public static final String WEB_ELEMENT_ENTER_ZIPCODE = "//input[@id='zipCodeModalInputField']"; //XPATH
    //3d. CLICK GO BUTTON
    public static final String WEB_ELEMENT_ZIPCODE_GO_BUTTON = "//a[@id='go-button-zip-modal']"; //XPATH
    //3e. CLICK ON OVERVIEW
    public static final String WEB_ELEMENT_OVERVIEW_LINK = "#overview-section-link";//CSS
    //3f. CLICK ON DROPDOWN MENU FOR RATES
    public static final String WEB_ELEMENT_RATE_DROPDOWN = "//select[@id='mobileRatesTableSelectMenu']";//XPATH
    //3g. zipcode value
    public static String WEB_ELEMENT_ZIP_CODE = "11214";


    //4a. LANDING N GET A RECOMMENDATION
    public static final String WEB_ELEMENT_LENDING = "//a[@id='navLending']/span[@class='title']"; //xpath
    //4b. GET A RECOMMENDATION
    public static final String WEB_ELEMENT_RECOMMENDATION = "//a[@id='btnLending']";//XPATH
    //4c. HEADING
    public static final String WEB_ELEMENT_HEADING = "//h1[@class='heading title-heading']";


    //5.POPULAR CREDIT CARDS
    public static final String WEB_ELEMENT_CREDIT_CARDS = "//a[@id='navCreditCards']//span[@class='title'][normalize-space()='Credit Cards']";//XPATH
    public static final String WEB_ELEMENT_POPULAR_CARDS = "//a[normalize-space()='Popular Credit Cards']";//XPATH
    public static final String WEB_ELEMENT_HEADING_POPULAR_CARDS = "//h1[normalize-space()='Popular Business Credit Cards']";//XPATH

    //6.
    public static final String WEB_ELEMENT_ENROLL = "//a[@id='enroll']";//XPATH
    public static final String WEB_ELEMENT_DONT_HAVE_SSN = "//a[@id='enroll-no-ssn-link']";//XPATH


}

