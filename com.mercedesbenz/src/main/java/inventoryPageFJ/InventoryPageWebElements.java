package inventoryPageFJ;

public class InventoryPageWebElements {

    /**
     * Locators on Inventory main page
     */
    // Enter Zip code input field: (CSS)
    public static final String WEB_ELEMENT_INPUT_ZIP_CODE = ".dealer-locator-module__search-bar.wrapper  .dealer-search-bar__location-search div[role='combobox'] > .form__input-label";
    // Find Dealer search button: (XPATH - custom)
    public static final String WEB_ELEMENT_BUTTON_FIND_DEALER = "//div[@class='dealer-search-bar__cta']/button[contains(text(),'Find')]";


}
