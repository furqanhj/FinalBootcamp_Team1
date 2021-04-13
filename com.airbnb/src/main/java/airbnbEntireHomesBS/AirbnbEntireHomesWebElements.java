package airbnbEntireHomesBS;

public class AirbnbEntireHomesWebElements {

//---> Elements related to search:

    //ENTIRE HOMES CLICK
    public static final String WEB_ELEMENT_ENTIRE_HOMES = "//a[.='Entire homes']";  //xpath

    //START YOUR SEARCH FIELD
    public static final String WEB_ELEMENT_START_YOUR_SEARCH_FIELD = "div#littleSearchLabel"; //css

    //OPTIONS UNDER START YOU SEARCH FIELD
    public static final String WEB_ELEMENT_LOCATION = "div[class='_fmav2so']"; //css
    public static final String WEB_ELEMENT_CHECK_IN_DATE = "div[class='_th2fvde'] div[class='_uh2dzp']"; //css
    public static final String WEB_ELEMENT_CHECK_OUT = "div[class='_th2fvde'] div[class='_uh2dzp']"; //css
    public static final String WEB_ELEMENT_ADD_GUESTS = "//div[normalize-space()='Add guests']"; //xpath
    public static final String WEB_ELEMENT_ADULTS = "//button[@data-testid='stepper-adults-increase-button']//span[@class='_8ovatg']//*[local-name()='svg']"; //xpath
    public static final String WEB_ELEMENT_CHILDREN = "//button[@data-testid='stepper-children-increase-button']//span[@class='_8ovatg']//*[local-name()='svg']"; //xpath
    public static final String WEB_ELEMENT_INFANTS = "//button[@data-testid='stepper-infants-increase-button']//span[@class='_8ovatg']//*[local-name()='svg']//*[name()='path' and contains(@d,'m2 16h28m-')]"; //xpath
    public static final String WEB_ELEMENT_START_SEARCH_BUTTON = "//span[@class='_m9v25n']"; //xpath

    //ADDING CANCELLATION FILTERS
    public static final String WEB_ELEMENT_CANCELLATION_FLEXIBILITY = "div[id='menuItemButton-flexible_cancellation'] button[type='button']"; //css
    public static final String WEB_ELEMENT_ONLY_SHOW_CANCELLATION = "div[class='_nbd4yy8']"; //css
    public static final String WEB_ELEMENT_CANCELLATION_SAVE_BUTTON = "//button[normalize-space()='Save']"; //xpath


    //ADDING TYPE OF PLACE FILTERS
    public static final String WEB_ELEMENT_ENTIRE_PLACE = "div[id='menuItemButton-room_type'] button[type='button']"; //css
    public static final String WEB_ELEMENT_ENTIRE_PLACE_CLEAR = "//button[contains(text(),'Clear')]"; //xpath
    public static final String WEB_ELEMENT_ENTIRE_PLACE_CHECKBOX = "//input[@id='filterItem-room_type-checkbox-room_types-Entire_home_apt']"; //xpath
    public static final String WEB_ELEMENT_PRIVATE_ROOM_CHECKBOX = "label[for='filterItem-room_type-checkbox-room_types-Private_room'] span[class='_167krry']"; //css
    public static final String WEB_ELEMENT_SHARED_ROOM_CHECKBOX = "label[for='filterItem-room_type-checkbox-room_types-Shared_room'] span[class='_167krry']"; //css
    public static final String WEB_ELEMENT_ENTIRE_PLACE_SAVE_BUTTON = "#filter-panel-save-button"; //css


    //deleting default values in text field = driver.findElement("locator").clear();
    //PRICE FILTERS
    public static final String WEB_ELEMENT_PRICE_BUTTON = "div#menuItemButton-price_range > ._qc44h1f"; //css
    public static final String WEB_ELEMENT_MINIMUM_PRICE_BUTTON = "input#price_filter_min"; //css
    public static final String WEB_ELEMENT_MAXIMUM_PRICE_BUTTON = "input#price_filter_max"; //css
    public static final String WEB_ELEMENT_PRICE_SAVE_BUTTON = "//button[normalize-space()='Save']"; //xpath


    //ROOMS AND BEDS FILTERS
    public static final String WEB_ELEMENT_ROOMS_AND_BEDS_BUTTON = "div#menuItemButton-rooms_and_beds > ._t6p96s > ._w37zq5 > ._jro6t0 > ._36rlri"; //css
    public static final String WEB_ELEMENT_ADD_BEDS_BUTTON = "div#menuItemButton-rooms_and_beds > ._t6p96s > ._w37zq5 > ._jro6t0 > ._36rlri"; //css
    public static final String WEB_ELEMENT_ADD_BEDROOMS_BUTTON = "div:nth-of-type(2) > ._15dmj15 > ._3zlfom > button:nth-of-type(2)  svg[role='presentation'] > path"; //css
    public static final String WEB_ELEMENT_ADD_BATHROOMS_BUTTON = "div:nth-of-type(3) > ._15dmj15 > ._3zlfom > button:nth-of-type(2)  svg[role='presentation']"; //css
    public static final String WEB_ELEMENT_BEDS_BATHS_SAVE_BUTTON = "button#filter-panel-save-button"; //css


    //AMENITIES FILTERS
    public static final String WEB_ELEMENT_MORE_FILTERS_BUTTON = "div#menuItemButton-dynamicMoreFilters > ._qc44h1f"; //css
    public static final String WEB_ELEMENT_CLEAR_ALL_BUTTON = "div[class='_6s3rid'] button[type='button']"; //css
    public static final String WEB_ELEMENT_SHOW_ALL_AMENITIES = "//span[normalize-space()='Show all amenities']"; //xpath
    public static final String WEB_ELEMENT_KITCHEN_CLICK = "#filterItem-amenities-checkbox-amenities-8"; //css
    public static final String WEB_ELEMENT_TV_CLICK = "label[for='filterItem-amenities-checkbox-amenities-58'] span[class='_167krry']"; //css
    public static final String WEB_ELEMENT_SHAMPOO_CLICK = "#filterItem-amenities-checkbox-amenities-41"; //css
    public static final String WEB_ELEMENT_BREAKFAST_CLICK = "#filterItem-amenities-checkbox-amenities-16"; //css
    public static final String WEB_ELEMENT_CLOSE_AMENITIES = "//span[normalize-space()='Close amenities']"; //xpath

    //PROPERTY TYPE FILTERS
    public static final String WEB_ELEMENT_PROPERTY_TYPES_CLICK = "div:nth-of-type(7) ._jro6t0"; //css
    public static final String WEB_ELEMENT_HOUSE_CLICK = "#filterItem-property_types-checkbox-property_type_id-2"; //css
    public static final String WEB_ELEMENT_BOUTIQUE_HOTEL_CLICK = "//input[@id='filterItem-property_types-checkbox-property_type_id-43']"; //xpath
    public static final String WEB_ELEMENT_LOFT_CLICK = "#filterItem-property_types-checkbox-property_type_id-2"; //css

    //ADDITIONAL FILTERS- RULES AND LANGUAGES
    public static final String WEB_ELEMENT_BARN_CLICK = "#filterItem-unique_homes-checkbox-property_type_id-57"; //css
    public static final String WEB_ELEMENT_PETS_ALLOWED_CLICK = "//label[@for='filterItem-house_rules-checkbox-amenities-12']//span[@class='_167krry']"; //xpath
    public static final String WEB_ELEMENTS_ENGLISH_CLICK = "#filterItem-host_language-checkbox-languages-1"; //css
    public static final String WEB_ELEMENT_FRENCH_CLICK = "#filterItem-host_language-checkbox-languages-2"; //css
    public static final String WEB_ELEMENT_SHOW_STAYS_CLICK = "//button[normalize-space()='Show 300+ stays']"; //xpath

    public static final String WEB_ELEMENT_EXPECTED_TEXT_ENTIRE_HOMES = "/html//div[@id='ExploreLayoutController']/div[@class='_e296pg']//div[@class='_rrw786']/section//h1[@class='_14i3z6h']"; //xpath


}






