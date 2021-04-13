package airBnbExperiencesAR;

public class AirBnbExperiencesWebElements {


// *****Elements on Airbnb homepage*****

    // 'Experiences' link: located by CSS
    public static final String WEB_ELEMENT_EXPERIENCES_LINK = "label:nth-of-type(2) > ._1ea7qej";
    // 'Location' field: located by Rel XPath
    public static final String WEB_ELEMENT_LOCATION_FIELD = "///input[@id='bigsearch-query-detached-query']";
    // 'Date' field: Located by XPath
    public static final String WEB_ELEMENT_DATE_FIELD = "//div[@class='_uh2dzp']";
    // 'Search button: Located by CSS
    public static final String WEB_ELEMENT_SEARCH_BUTTON = "._m9v25n";


    //****Elements on Experiences page***

    // 'Guests' button: Located by XPath
    public static final String WEB_ELEMENT_GUESTS_BUTTON = "//button[@class='_qc44h1f']";
    // + button in Guests button drop down
    public static final String WEB_ELEMENT_PLUS_SIGN = "//div[@class='_1jxqgljf']/div[1]/div[1]//button[2]/span[@class='_8ovatg']";
    public static final String WEB_ELEMENT_SAVE_BUTTON = "//button[@id='filter-panel-save-button']";


    // 'Price' button: Located by XPath
    public static final String WEB_ELEMENT_PRICE_BUTTON = "//div[@id='menuItemButton-price_range']//span[@class='_hk8epad']";// 'Time of day' button: Located by CSS
    public static final String WEB_ELEMENT_TIME_OF_DAY_BUTTON = "#menuItemButton-experience_time_of_day > ._t6p96s > ._w37zq5 ._36rlri";
    // 'Transportation activities' button : Located by Class
    public static final String WEB_ELEMENT_TRANSPORT_ACTIVITIES = "._7pdaz34";
    // 'Become a host' button : Located by XPath
    public static final String WEB_ELEMENT_BECOME_A_HOST_BUTTON = "//a[.='Become a host']";
    // 'Learn More' link : Located by XPath
    public static final String WEB_ELEMENT_LEARN_MORE_LINK = "//span[@class='_1a5re9s']";
    // 'Review Covid-19 travel restrictions...' text: Located by Rel XPath
    public static final String WEB_ELEMENT_COVID19_TRAVEL_RESTRICTIONS = "//div[contains(text(),'Review COVID-19 travel restrictions before you boo')]";
    // 'Discover Experiences' header : Located by CSS
    public static final String WEB_ELEMENT_DISCOVER_EXPERIENCES_HEADER = "._19qnt1y > div:nth-of-type(5) div:nth-of-type(2) div:nth-of-type(2) h1:nth-of-type(1) span:nth-of-type(1)";
    public static final String WEB_ELEMENT_EXPERIENCES_SEARCH_BUTTON = "//span[@class='_m9v25n']"; //css



}

