package ebayAdvancedSearchPageFJ;

public class EbayAdvancedSearchPageLocators {

    // Input text box for search on advanced search page: (CSS)
    public static final String WEB_ELEMENT_INPUT_FIELD_FOR_SEARCH = "input#_nkw";
    // Input text box to exclude keywords on advanced search page: (CSS)
    public static final String WEB_ELEMENT_INPUT_FIELD_EXCLUDE_KEYWORDS = "input#_ex_kw";
    // Search Tips link on Advanced Search page: (link Text)
    public static final String WEB_ELEMENT_SEARCH_TIPS_LINK_BUTTON = "search tips";
    // Using Advanced Search Options Link on Advanced Search page: (partial link text)
    public static final String WEB_ELEMENT_USING_ADVANCED_SEARCH_LINK_BUTTON = "using advanced searc";
    // Search Button on Advanced Search Page: (ID)
    public static final String WEB_ELEMENT_SEARCH_BUTTON = "searchBtnLowerLnk";

    /**
     * Locators needed for Assertions
     */

    //"results for" on advanced search, search result page (CLASS)
    public static final String WEB_ELEMENT_EXPECTED_TEXT_SEARCH_RESULT = "kwcat";
    //text on "using advanced search options" new window (CSS)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_USING_ADVANCED_SEARCH_OPTIONS = ".article_main_container > div h2";

}
