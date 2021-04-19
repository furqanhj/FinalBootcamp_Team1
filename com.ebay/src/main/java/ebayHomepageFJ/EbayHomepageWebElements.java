package ebayHomepageFJ;

public class EbayHomepageWebElements {

    /**
     * @author Furqan
     * All locators from Ebay Homepage
     */

    //Ebay logo on homepage that is also a direct link to Ebay homepage (XPATH):
    public static final String WEB_ELEMENT_EBAY_HOMEPAGE_LINK = "//a[@id='gh-la']";

    /**
    Locators for elements related to Search
     */
    // Search Bar on homepage (CSS)
    public static final String WEB_ELEMENT_SEARCH_BAR = "input#gh-ac";
    // Search button on homepage (XPATH)
    public static final String WEB_ELEMENT_SEARCH_BUTTON = "//input[@id='gh-btn']";
    // Shop by Category dropdown (CSS)
    public static final String WEB_ELEMENT_SHOP_BY_CAT_DROPDOWN = "button#gh-shop-a";
    // All Categories dropdown inside Search Bar (CSS)
    public static final String WEB_ELEMENT_ALL_CAT_DROPDOWN = "select#gh-cat";
    // Advanced Search Link besides search bar (CSS)
    public static final String WEB_ELEMENT_ADVANCED_SEARCH_LINK = "a#gh-as-a";

    /**
    Locators for elements for Sign-in and Register Link
     */
    // Sign-in button link (CSS)
    public static final String WEB_ELEMENT_SIGN_IN_BUTTON = "span#gh-ug > a";
    // Register button link (CSS)
    public static final String WEB_ELEMENT_REGISTER_BUTTON = "span#gh-ug-flex > a";

    /**
    Locators for elements on Header ABOVE search bar
     */
    // Daily deals button top header (XPATH)
    public static final String WEB_ELEMENT_DAILY_DEALS_BUTTON = "//li[@id='gh-p-1']";
    // Brand Outlet button top header (XPATH)
    public static final String WEB_ELEMENT_BRAND_OUTLET_BUTTON = "//li[@id='gh-p-4']";
    // Help & Contact button top header (XPATH)
    public static final String WEB_ELEMENT_HELP_AND_CONTACT_BUTTON = "//li[@id='gh-p-3']";
    // Sell button top header (XPATH)
    public static final String WEB_ELEMENT_SELL_BUTTON = "//li[@id='gh-p-2']";
    // Watchlist dropdown top header (CSS)
    public static final String WEB_ELEMENT_WATCHLIST_DROPDOWN = "a[title='Watchlist']";
    // My ebay dropdown top header (CSS)
    public static final String WEB_ELEMENT_MY_EBAY_DROPDOWN = "a[title='My eBay']";
    // Notifications button top header (CSS)
    public static final String WEB_ELEMENT_NOTIFICATIONS_BUTTON = "i#gh-Alerts-i";
    // Shopping Cart button top header (CSS)
    public static final String WEB_ELEMENT_SHOPPING_CART_BUTTON = ".gh-cart-icon";

    /**
    Locators for elements on Header BELOW search bar
     */
    // Saved items link Button bottom header (CSS)
    public static final String WEB_ELEMENT_SAVED_LINK_BUTTON = ".saved > a";
    // Motors link Button on bottom header (CSS)
    public static final String WEB_ELEMENT_MOTORS_LINK_BUTTON = ".hl-cat-nav__container > li:nth-of-type(3) > a";
    // Fashion Link Button on bottom header (XPATH)
    public static final String WEB_ELEMENT_FASHION_LINK_BUTTON = "//div[@id='mainContent']/div[1]/ul[1]/li[4]/a[1]";
    // Electronics Link Button on bottom header (XPATH)
    public static final String WEB_ELEMENT_ELECTRONICS_LINK_BUTTON = "//div[@id='mainContent']/div[1]/ul[1]/li[5]/a[1]";
    // Collectibles & Art Link Button on bottom header (XPATH)
    public static final String WEB_ELEMENT_COLLECTIBLES_LINK_BUTTON = "//ul[@class='hl-cat-nav__container']/li[6]/a[1]";
    // Home & Garden Link Button on bottom header (XPATH)
    public static final String WEB_ELEMENT_HOME_AND_GARDEN_LINK_BUTTON = "//ul[@class='hl-cat-nav__container']/li[7]/a[1]";
    // Sporting Goods Link Button on bottom header (XPATH)
    public static final String WEB_ELEMENT_SPORTING_GOODS_LINK_BUTTON = "//ul[@class='hl-cat-nav__container']/li[8]/a[1]";
    // Toys Link Button on bottom header (XPATH)
    public static final String WEB_ELEMENT_TOYS_LINK_BUTTON = "//ul[@class='hl-cat-nav__container']/li[9]/a[1]";
    // Business & Industrial Link Button on bottom header (XPATH)
    public static final String WEB_ELEMENT_BUSN_AND_IND_LINK_BUTTON = "//ul[@class='hl-cat-nav__container']/li[10]/a[1]";
    // Music Link Button on bottom header (XPATH)
    public static final String WEB_ELEMENT_MUSIC_LINK_BUTTON = "//ul[@class='hl-cat-nav__container']/li[11]/a[1]";
    // Deals Link Button on bottom header (XPATH)
    public static final String WEB_ELEMENT_DEALS_LINK_BUTTON = "//ul[@class='hl-cat-nav__container']/li[12]/a[1]";

    /**
     * Locators needed for Assertions
     */
    // Locator for TestCase1 - Getting text from search result (XPATH)
    public static final String WEB_ELEMENT_EXPECTED_TEXT_SEARCH_RESULT = "//h1[@class=\"srp-controls__count-heading\"]/span[2]";
    // Locator for TestCase2 - Collectibles option in All Categories dropdown in search box (CSS)
    public static final String WEB_ELEMENT_EXPECTED_ALL_CAT_DROPDOWN = "#gh-cat > option:nth-child(11)";
    // Locator for TestCase3 - Number of elements in All Categories Dropdown list (CSS)
    public static final String WEB_ELEMENTS_EXPECTED_ALL_CAT_DROPDOWN_SEARCH_BAR = "#gh-cat option";
    // Locator for TestCase5 - Text from search result page (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_SEARCH_RESULT_WIRELESS_CHARGING_STATION = "//div[@class='srp-controls__row-cells']/div/h1/span[2]";

}
