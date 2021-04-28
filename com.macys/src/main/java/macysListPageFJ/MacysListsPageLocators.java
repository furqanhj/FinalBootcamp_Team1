package macysListPageFJ;

public class MacysListsPageLocators {

    //Sign-in button link in the body of lists page: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_SIGN_IN_BODY_OF_LISTS_PAGE = "//div[@class='sign-in-container']/div[2]//li";
    //Guest List Table, bottom right, GO ARROW: (CLASS)
    public static final String WEB_ELEMENT_BUTTON_GO_ARROW_GUESTS_LIST = "lists--item-go";
    //Globally available search input bar: (XPATH - custom)
    public static final String WEB_ELEMENT_INPUT_SEARCH_BAR_GLOBAL = "//input[@id='globalSearchInputField']";
    //Search submit button inside search bar: (ID)
    public static final String WEB_ELEMENT_BUTTON_SEARCH_SUBMIT_GLOBAL = "searchSubmit";

    /**
     * Locators required for Assertions
     */
    // Actual Text on sign-in page: (CSS - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ON_SIGN_IN_PAGE = "#ul-header > h1";
    //Actual Text on Guest List default page: (CSS -custom)
    public static final  String WEB_ELEMENT_ACTUAL_TEXT_ON_GUEST_LIST_DEFAULT_PAGE = "#guest-view p b";
    // Search Result Item after searching for NIKE MEN HOODIE: (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_ELEMENT_AFTER_SEARCH_RESULT_NIKE_MEN_HOODIE = "//*[@id=\"8038055\"]/div[3]/div[2]/a";


}
