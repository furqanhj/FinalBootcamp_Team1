package redfinHomepageFJ;

public class RedfinHomepageWebElements {

    /**
     * Locators on homepage
     */
    //Mortgage dropdown menu on homepage header: (XPATH - custom)
    public static final String WEB_ELEMENT_MORTGAGE_DROPDOWN_HOVERABLE_MENU = "//div[@class='header-right']/div[4]";
    //Payment calculator option in Mortgage dropdown: (XPATH - custom)
    public static final String WEB_ELEMENT_PAYMENT_CALCULATOR_BUTTON_UNDER_MORTGAGE = "//div[@class='flyoutColumn']/ul/li[2]";


    /**
     * Locators required for Assertions
     */
    //Actual Text on Mortgage Calculator landed page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_MORTGAGE_CALCULATOR_PAGE = "//div[@class='CalculatorWidgetTitle row-center']/div/h1";

}
