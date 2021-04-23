package verizonHomepageFJ;

public class VerizonHomepageWebElements {

    /**
     * Locators on homepage
     */
    // SignIn button on homepage header: (CSS - custom)
    public static final String WEB_ELEMENT_BUTTON_SIGN_IN_HEADER_TWO = "#gnav20-sign-id";
    //Mobile Tab in the draggable options header: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_TAB_MOBILE_OPTION = "//div[@class='Tabs']/ul/li[1]";
    //Draggable phones in Mobile options (total 4 drags): (XPATH)
    public static final String WEB_ELEMENTS_TOTAL_DRAGGABLE_OPTIONS_UNDER_MOBILE = "//*[@id=\"phones-tab\"]/div/div[2]/div/ul/li";
    //HomeInternet Tab in the draggable options header: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_TAB_HOME_INTERNET_OPTION = "//div[@class='Tabs']/ul/li[2]";
    //Right arrow button to scroll through the options in the Tab: (XPATH)
    public static final String WEB_ELEMENT_BUTTON_SCROLL_THROUGH_TAB_OPTIONS = "//body/div[2]/main[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]";

    /**
     * Locators for buttons on header two
     */
    //Shop button dropdown on header two: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_SHOP_DROPDOWN_HEADER_TWO = "//div[@class='gnav20-row-two']/div[2]/div/div/div[1]";
    //Why Verizon button dropdown on header two: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_WHY_VERIZON_DROPDOWN_HEADER_TWO = "//div[@class='gnav20-row-two']/div[2]/div/div/div[2]";
    //Support button dropdown on header two: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_SUPPORT_DROPDOWN_HEADER_TWO = "//div[@class='gnav20-row-two']/div[2]/div/div/div[3]";

    /**
     * Locators required for Assertions
     */
    //Actual number of links on top header1 (4 links) (: (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_ON_HEADER_ONE = "//div[@class='gnav20-row-one']//a";
    //Actual number of links on top header2 (3 links): (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_ON_HEADER_TWO = "//div[@class='gnav20-row-two']//div[@class='gnav20-navigation-item']";
    //UserID or Verizon Mobile Number input field on signIn page: (XPATH)
    public static final String WEB_ELEMENT_USER_ID_FIELD_ON_SIGN_IN_PAGE = "//body/main[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]";
    //Mobile tab sliders options, element after 4 clicks assertions: (XPATH)
    public static final String WEB_ELEMENT_TO_VALIDATE_ELEMENT_AFTER_NUM_OF_CLICKS = "//*[@id=\"slick-slide00\"]/div/div/a";
    //Actual number of elements in Shop dropdown on header two (7 links): (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUMBER_OF_LINKS_IN_SHOP_DROPDOWN = "//ul[@class='gnav20-submenu-column gnav20-featured-scroll-area gnav20-column-highlight']/li";
    //Actual number of elements in Why Verizon dropdown on header two (4 links): (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUMBER_OF_LINKS_IN_WHY_VERIZON_DROPDOWN = "//ul[@class='gnav20-submenu-column gnav20-featured-scroll-area gnav20-column-highlight']/li";
    //Actual number of elements in Support dropdown on header two ( links): (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_NUMBER_OF_LINKS_IN_SUPPORT_DROPDOWN = "//ul[@class='gnav20-submenu-column gnav20-featured-scroll-area gnav20-column-highlight']/li";
    //Actual number of menu items on footer one of homepage (8 menus): (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_NUMBER_OF_MENUS_ON_FOOTER_ONE = "//div[@class='gnav20-footer-level-one']/div/div";
    //Actual texts of sub-items under Shop menu in footer one: (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_SHOP_MENU_FOOTER_ONE = "//div[@class='gnav20-footer-level-one']/div[1]/div[1]//ul/li";
    //Actual texts of sub-items under Top Device Brands menu in footer one: (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_TOP_DEVICE_BRANDS_MENU_FOOTER_ONE = "//div[@class='gnav20-footer-level-one']/div[1]/div[2]//ul/li";
    //Actual texts of sub-items under Support menu in footer one: (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_SUPPORT_MENU_FOOTER_ONE = "//div[@class='gnav20-footer-level-one']/div[1]/div[3]//ul/li";
    //Actual texts of sub-items under About Verizon menu in footer one: (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_ABOUT_VERIZON_MENU_FOOTER_ONE = "//div[@class='gnav20-footer-level-one']/div[1]/div[4]//ul/li";
    //Actual texts of sub-items under Most Popular menu in footer one: (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_MOST_POPULAR_MENU_FOOTER_ONE = "//div[@class='gnav20-footer-level-one']/div[2]/div[1]//ul/li";
    //Actual texts of sub-items under Top Accessory Brands menu in footer one: (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_TOP_ACCESSORY_BRANDS_MENU_FOOTER_ONE = "//div[@class='gnav20-footer-level-one']/div[2]/div[2]//ul/li";
    //Actual texts of sub-items under Important Consumer Information menu in footer one: (XPATH - custom)
    public static final String WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_IMPORTANT_CONSUMER_INFORMATION_MENU_FOOTER_ONE = "//div[@class='gnav20-footer-level-one']/div[2]/div[3]//ul/li";


}
