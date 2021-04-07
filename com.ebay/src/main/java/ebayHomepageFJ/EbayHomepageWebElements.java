package ebayHomepageFJ;

public class EbayHomepageWebElements {

    /**
     * @author Furqan
     * All locators from Ebay Homepage
     */

    //Ebay logo on homepage that is also a direct link to Ebay homepage (XPATH):
    public static final String webElementEbayHomepageLink = "//a[@id='gh-la']";

    /**
    Locators for elements related to Search
     */
    // Search Bar on homepage (CSS)
    public static final String webElementSearchBar = "input#gh-ac";
    // Search button on homepage (XPATH)
    public static final String webElementSearchButton = "//input[@id='gh-btn']";
    // Shop by Category dropdown (CSS)
    public static final String webElementShopByCatDropdown = "button#gh-shop-a";
    // All Categories dropdown inside Search Bar (CSS)
    public static final String webElementAllCatDropdown = "select#gh-cat";
    // Advanced Search Link besides search bar (CSS)
    public static final String webElementAdvancedSearchLink = "a#gh-as-a";

    /**
    Locators for elements for Sign-in and Register Link
     */
    // Sign-in button link (CSS)
    public static final String webElementSignInButton = "span#gh-ug > a";
    // Register button link (CSS)
    public static final String webElementRegisterButton = "span#gh-ug-flex > a";

    /**
    Locators for elements on Header ABOVE search bar
     */
    // Daily deals button top header (XPATH)
    public static final String webElementDailyDealsButton = "//li[@id='gh-p-1']";
    // Brand Outlet button top header (XPATH)
    public static final String webElementBrandOutletButton = "//li[@id='gh-p-4']";
    // Help & Contact button top header (XPATH)
    public static final String webElementHelpAndContactButton = "//li[@id='gh-p-3']";
    // Sell button top header (XPATH)
    public static final String webElementSellButton = "//li[@id='gh-p-2']";
    // Watchlist dropdown top header (CSS)
    public static final String webElementWatchlistDropdown = "a[title='Watchlist']";
    // My ebay dropdown top header (CSS)
    public static final String webElementMyEbayDropdown = "a[title='My eBay']";
    // Notifications button top header (CSS)
    public static final String webElementNotificationsButton = "i#gh-Alerts-i";
    // Shopping Cart button top header (CSS)
    public static final String webElementShoppingCartButton = ".gh-cart-icon";

    /**
    Locators for elements on Header BELOW search bar
     */
    // Saved items link Button bottom header (CSS)
    public static final String webElementSavedButton = ".saved > a";
    // Motors link Button on bottom header (CSS)
    public static final String webElementMotorsButton = ".hl-cat-nav__container > li:nth-of-type(3) > a";
    // Fashion Link Button on bottom header (XPATH)
    public static final String webElementFashionButton = "//div[@id='mainContent']/div[1]/ul[1]/li[4]/a[1]";
    // Electronics Link Button on bottom header (XPATH)
    public static final String webElementElectronicsButton = "//div[@id='mainContent']/div[1]/ul[1]/li[5]/a[1]";
    // Collectibles & Art Link Button on bottom header (XPATH)
    public static final String webElementCollectiblesButton = "//ul[@class='hl-cat-nav__container']/li[6]/a[1]";
    // Home & Garden Link Button on bottom header (XPATH)
    public static final String webElementHomeAndGardenButton = "//ul[@class='hl-cat-nav__container']/li[7]/a[1]";
    // Sporting Goods Link Button on bottom header (XPATH)
    public static final String webElementSportingGoodsButton = "//ul[@class='hl-cat-nav__container']/li[8]/a[1]";
    // Toys Link Button on bottom header (XPATH)
    public static final String webElementToysButton = "//ul[@class='hl-cat-nav__container']/li[9]/a[1]";
    // Business & Industrial Link Button on bottom header (XPATH)
    public static final String webElementBusnAndIndButton = "//ul[@class='hl-cat-nav__container']/li[10]/a[1]";
    // Music Link Button on bottom header (XPATH)
    public static final String webElementMusicButton = "//ul[@class='hl-cat-nav__container']/li[11]/a[1]";
    // Deals Link Button on bottom header (XPATH)
    public static final String webElementDealsButton = "//ul[@class='hl-cat-nav__container']/li[12]/a[1]";

}
