package mortgageCalculatorPageFJ;

public class MortgageCalculatorPageLocators {

    /**
     * Locators on mortgage calculator page
     */
    //First slider for Home Price option: (XPATH - custom)
    public static final String WEB_ELEMENT_FIRST_SLIDER_HOME_PRICE_OPTION = "//div[@class='MortgageForm']/form/div[1]//div[@class='slider']";
    //Second slider for Down-Payment option: (XPATH - custom)
    public static final String WEB_ELEMENT_SECOND_SLIDER_DOWN_PAYMENT_OPTION = "//div[@class='MortgageForm']/form/div[2]//div[@class='slider']";
    //First Input box for Home Price option: (XPATH - custom)
    public static final String WEB_ELEMENT_FIRST_INPUT_BOX_HOME_PRICE_OPTION = "//div[@class='MortgageForm']/form/div/div/span[1]//input";
    //Second Input Box for Down payment option using amount: (XPATH - custom)
    public static final String WEB_ELEMENT_SECOND_INPUT_BOX_DOWN_PAYMENT_USING_AMOUNT = "//div[@class='MortgageForm']/form/div[2]/div/div[1]/span[1]//input";
    //Third input box for Down payment option using percentage: (XPATH - custom)
    public static final String WEB_ELEMENT_THIRD_INPUT_BOX_DOWN_PAYMENT_USING_PERCENT = "//div[@class='MortgageForm']/form/div[2]/div/div[1]/span[2]//input";
    //Fourth Input Box for City, Neighborhood Or zip option: (CSS)
    public static final String WEB_ELEMENT_FOURTH_INPUT_BOX_CITY_OR_ZIP = "form[method='post'] .SearchBox > form[method='post'] > .inline-block.search-container  input#search-box-input";
    //Loan-type dropdown menu: (XPATH - custom)
    public static final String WEB_ELEMENT_LOAN_TYPE_DROPDOWN_MENU = "//div[@class='StaticFieldWrapper StaticSelectField']/span/span";
    //1st option 30 YEAR FIXED in Loan-type dropdown menu: (XPATH - custom)
    public static final String WEB_ELEMENT_FIRST_OPTION_IN_LOAN_TYPE_DROPDOWN = "//div[@class='flyout']/div/div[1]";
    //2nd option 15 YEAR FIXED in loan-type dropdown menu: (XPATH - custom)
    public static final String WEB_ELEMENT_SECOND_OPTION_IN_LOAN_TYPE_DROPDOWN = "//div[@class='flyout']/div/div[2]";
    //3rd option 5/1 ARM in loan-type dropdown menu: (XPATH - custom)
    public static final String WEB_ELEMENT_THIRD_OPTION_IN_LOAN_TYPE_DROPDOWN = "//div[@class='flyout']/div/div[3]";
    //Did You Mean - city names options popup: (XPATH - custom)
    public static final String WEB_ELEMENT_DID_YOU_MEAN_POPUP = "//div[@class='header']";
    //First option in Did you Mean popup: (XPATH - custom)
    public static final String WEB_ELEMENT_FIRST_OPTION_TO_SELECT_IN_DID_YOU_MEAN_POPUP = "//div[@class='expanded-row-content']/div[2]";
    //View all rates link after entering city in fourth input box: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_VIEW_ALL_RATES_LINK = "//div[@class='Lenders']/div/div[1]/a";
    //Mortgage providers options in slider carousel after city is searched: (XPATH - custom)
    public static final String WEB_ELEMENT_MORTGAGE_LENDER_FIRST_OPTION_IN_CAROUSEL_SLIDER = "//ul[@class='BaseCarousel__slider']/li[1]";
    //Get pre-qualified button, which appears after clicking on the mortgage lender option: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_GET_PREQUALIFIED = "//a[@class='button Button btnLink ctaBtn primary']";

    /**
     * Locators required for Assertions
     */
    //Actual number of elements in Loan Type dropdown(3): (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUM_OF_ELEMENTS_IN_LOAN_TYPE_DROPDOWN = "//div[@class='flyout']/div/div";
    //Calculator result for monthly payment: (XPATH - custom)
    public static final String WEB_ELEMENT_CALCULATOR_RESULT_FOR_MONTHLY_PAYMENTS = "//div[@class='sectionText']/p";
    //Mortgage Providers in chosen city displayed after city entered: (CLASS)
    public static final String WEB_ELEMENT_MORTGAGE_PROVIDERS_IN_CHOSEN_CITY_SLIDER = "BaseCarousel__slider";
    //Actual text on heading of View all rates landed page: (CLASS)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_VIEW_ALL_RATES_LANDED_PAGE = "heading-medium";
    //Actual text on heading of Get Prequalified landed page: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_GET_PREQUALIFIED_LANDED_PAGE = "//span[contains(text(),'Receive')]";
}
