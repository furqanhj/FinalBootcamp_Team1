package chaseHomepageFJ;

public class ChaseHomepageWebElements {

    /**
     * Locators on Chase Homepage
     */
    // Customer Service dropdown link (has total 6 elements/links): (XPATH- Custom)
    public static final String WEB_ELEMENT_CUSTOMER_SERVICE_DROPDOWN = "//nav[@class='header-navigation__contact']/ul/li[2]";
    //


    /**
     * Locators required for Assertions
     */
    // To find total number of elements in the Customer Service dropdown (6 elements): (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_NUM_OF_ELEMENTS_CUST_SERVICE_DROPDOWN = "//div[@id='contact-2']//ul[@role='menu']/li//a[@class='regular-link chaseanalytics-track-link']";


}