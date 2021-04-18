package bmwCertifiedBS;

public class BmwCertifiedWebElements{

    public static final String WEB_ELEMENT_PREOWNED= "//a[@href='https://www.bmwusa.com/certified-preowned-search.html#/results']"; //xpath
    public static final String WEB_ELEMENT_ZIPCODE = "//input[@id='zip-input-cpo']"; //xpath
    public static final String WEB_ELEMENT_ZIPCODE_ENTRY = "11214";
    public static final String WEB_ELEMENT_SHOP_CLICK = "//button[@class='cta-button cta-1']"; //xpath
    public static final String WEB_ELEMENT_RESULTS = "//div[@class='content-2--bold results_totalvehicles_3c2BR']"; //xpath
//***********CLICKING ON SPECIAL OFFERS AND IMP INFO AND CLOSING OUT POP UP MESSAGE
    public static final String WEB_ELEMENT_SPECIAL_OFFERS = "//a[contains(.,'See Special Offers')]";//XPATH
    public static final String WEB_ELEMENT_IMPORTANT_INFO = "//div[@id='animation-container-84c1f48e-c479-4420-8aa0-5fcd40c9defb']//div[contains(@class,'in')]//div//span[@class='label-2--bold underline-dark'][normalize-space()='Important Information']";//XPATH
    public static final String WEB_ELEMENT_IMPORTANT_INFO_CLOSE = "//div[@id='background-fd75471c-6b8a-4be9-866f-5f1070b2e70f']//a[@aria-label='close modal']";//XPATH

//***********CLICKING ON SPECIAL OFFERS / IMP INFO AND CLOSING OUT POP UP MESSAGE
    public static final String WEB_ELEMENT_IMPORTANT_INFO_500 = "//div[@id='animation-container-ed5a113e-1cbb-44c9-a3a3-e508fe207139']//div[contains(@class,'in')]//div//span[@class='label-2--bold underline-dark'][normalize-space()='Important Information']";//XPATH
    public static final String WEB_ELEMENT_IMPORTANT_INFO_500_CLOSE = "//div[@class='modal-overlay-item is-active']//a[contains(.,'Close')]";//XPATH

//***********SPECIAL OFFERS/SELECT SERIES X3 ON THE BOTTOM
    public static final String WEB_ELEMENT_SELECT_SERIES_X3 = "//nav[@class='globalnav-footer__series-select-nav']//a[contains(.,'X3')]";//XPATH
    public static final String WEB_ELEMENT_SELECT_SERIES_X3M = "a[analytics-event='overview.overview.x3-m.link'] .standalone-vehicle-tile-cmp__vehicle-name";//CSS

//***********CHOOSE COLORS
    public static final String WEB_ELEMENT_X3M_GRAPHITE = "//button[@aria-label='Dark Graphite Metallic']";//XPATH
    public static final String WEB_ELEMENT_X3M_BLUE = "//button[@aria-label='Phytonic Blue Metallic']";//XPATH
    public static final String WEB_ELEMENT_X3M_RED = "//button[@aria-label='Toronto Red Metallic']";//XPATH

//***********
    public static final String WEB_ELEMENT_MY_BMW_LINK = "//div[@class='globalnav-primary-my-bmw__portal-holder']/a[contains(.,'My BMW')]";//xpath
    public static final String WEB_ELEMENT_AGREE_BUTTON = "//button[@id='agreeBtn']";//XPATH
    public static final String WEB_ELEMENT_MY_BMW_TITLE = "//div[@class='title']";//XPATH
    public static final String WEB_ELEMENT_NEED_HELP = "//button[@id='needHelpBtn']";//XPATH

//***********

//***********


}
