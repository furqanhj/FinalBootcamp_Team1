package mercedesHomepageFJ;

import org.openqa.selenium.WebElement;

public class MercedesHomepageLocators {

    /**
     * Locators on homepage
     */
    //Inventory dropdown on the header of homepage: (XPATH - custom)
    public static final String WEB_ELEMENT_DROPDOWN_INVENTORY_HOMEPAGE_HEADER = "//div[@class='global-header__menu-l1__inner']/ul[1]/li[3]";
    //View new Inventory button in Inventory dropdown: (XPATH)
    public static final String WEB_ELEMENT_BUTTON_VIEW_NEW_INVENTORY = "//*[@id=\"js-modal-page\"]/div[1]/header/nav/ul/li[3]/div/div[1]/ul/li[1]/div/div[1]/ul/li[1]/a";
    //Shopping dropdown on the header of homepage: (XPATH)
    public static final String WEB_ELEMENT_DROPDOWN_SHOPPING = "//*[@id=\"js-modal-page\"]/div[1]/header/nav/div[2]/ul[1]/li[2]/button";
    //Request A Quote button in Shopping dropdown: (XPATH)
    public static final String WEB_ELEMENT_BUTTON_REQUEST_A_QUTOTE = "//*[@id=\"js-modal-page\"]/div[1]/header/nav/ul/li[2]/div/div[1]/ul/li[1]/div/div[1]/ul/li[5]/a";



    /**
     * Locators required for Assertions
     */
    //Actual number of elements available on homepage (6): (XPATH - custom)
    public static final String WEB_ELEMENT_ACTUAL_NUMBER_OF_ELEMENTS_ON_HOMEPAGE_HEADER = "//div[@class='global-header__menu-l1__inner']/ul/li";
    //Actual Text Find Local Inventory on View New Inventory landed page: (XPATH)
    public static final String WEB_ELEMENT_ACTUAL_TEXT_FIND_LOCAL_INVENTORY = "//div[@class='dealer-locator-module__search-container']/h1";

}
