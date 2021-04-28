package verizonHomepageFJ;

import static verizonHomepageFJ.VerizonHomepageLocators.*;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VerizonHomepage extends BaseAPI {

    @FindBy(css = WEB_ELEMENT_BUTTON_SIGN_IN_HEADER_TWO)
    public WebElement signInButtonOnHeaderTwo;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_TAB_MOBILE_OPTION)
    public WebElement buttonTabMobileOption;
    @FindBy(xpath = WEB_ELEMENTS_TOTAL_DRAGGABLE_OPTIONS_UNDER_MOBILE)
    public List<WebElement> totalDraggableOptionsUnderMobile;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_TAB_HOME_INTERNET_OPTION)
    public WebElement buttonTabHomeInternetOption;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_SCROLL_THROUGH_TAB_OPTIONS)
    public WebElement buttonScrollThroughTabOptions;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_SHOP_DROPDOWN_HEADER_TWO)
    public WebElement buttonShopDropdownHeaderTwo;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_WHY_VERIZON_DROPDOWN_HEADER_TWO)
    public WebElement buttonWhyVerizonDropdownHeaderTwo;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_SUPPORT_DROPDOWN_HEADER_TWO)
    public WebElement buttonSupportDropdownHeaderTwo;

    /**
     * Initialization of elements required for Assertions
     */
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_ON_HEADER_ONE)
    public List<WebElement> actualNumOfLinksOnHeaderOne;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_ON_HEADER_TWO)
    public List<WebElement> actualNumOfLinksOnHeaderTwo;
    @FindBy(xpath = WEB_ELEMENT_USER_ID_FIELD_ON_SIGN_IN_PAGE)
    public WebElement userIdFieldOnSignInPage;
    @FindBy(xpath = WEB_ELEMENT_TO_VALIDATE_ELEMENT_AFTER_NUM_OF_CLICKS)
    public WebElement toValidateElementAfterNumOfClicks;
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_NUMBER_OF_LINKS_IN_SHOP_DROPDOWN)
    public List<WebElement> actualNumOfLinksInShopDropdown;
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_NUMBER_OF_LINKS_IN_WHY_VERIZON_DROPDOWN)
    public List<WebElement> actualNumOfLinksInWhyVerizonDropdown;
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_NUMBER_OF_LINKS_IN_SUPPORT_DROPDOWN)
    public List<WebElement> actualNumOfLinksInSupportDropdown;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_NUMBER_OF_MENUS_ON_FOOTER_ONE)
    public List<WebElement> actualNumberOfMenusOnFooterOne;

    /**
     *  Initialization of elements required for Assertions via Excel Reader
     */
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_SHOP_MENU_FOOTER_ONE)
    public List<WebElement> actualTextsSubMenuItemsUnderShopMenuFooterOne;
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_TOP_DEVICE_BRANDS_MENU_FOOTER_ONE)
    public List<WebElement> actualTextsSubMenuItemsInTopDeviceBrandsMenuFooterOne;
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_SUPPORT_MENU_FOOTER_ONE)
    public List<WebElement> actualTextsSubMenuItemsInSupportMenuFooterOne;
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_ABOUT_VERIZON_MENU_FOOTER_ONE)
    public List<WebElement> actualTextsSubMenuItemsInAboutVerizonMenuFooterOne;
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_MOST_POPULAR_MENU_FOOTER_ONE)
    public List<WebElement> actualTextsSubMenuItemsInMostPopularMenuFooterOne;
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_TOP_ACCESSORY_BRANDS_MENU_FOOTER_ONE)
    public List<WebElement> actualTextsSubMenuItemsInTopAccessoryBrandsMenuFooterOne;
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_IMPORTANT_CONSUMER_INFORMATION_MENU_FOOTER_ONE)
    public List<WebElement> actualTextsSubMenuItemsInImportantConsumerInfoMenuFooterOne;

    /**
     * Constructing GETTERS for list of web elements required for Assertions via Excel Reader
     */
    public String GET_WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_SHOP_MENU_FOOTER_ONE(){
        return WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_SHOP_MENU_FOOTER_ONE;
    }
    public String GET_WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_TOP_DEVICE_BRANDS_MENU_FOOTER_ONE(){
        return WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_TOP_DEVICE_BRANDS_MENU_FOOTER_ONE;
    }
    public String GET_WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_SUPPORT_MENU_FOOTER_ONE(){
        return WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_SUPPORT_MENU_FOOTER_ONE;
    }
    public String GET_WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_ABOUT_VERIZON_MENU_FOOTER_ONE(){
        return WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_ABOUT_VERIZON_MENU_FOOTER_ONE;
    }
    public String GET_WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_MOST_POPULAR_MENU_FOOTER_ONE(){
        return WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_MOST_POPULAR_MENU_FOOTER_ONE;
    }
    public String GET_WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_TOP_ACCESSORY_BRANDS_MENU_FOOTER_ONE(){
        return WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_TOP_ACCESSORY_BRANDS_MENU_FOOTER_ONE;
    }
    public String GET_WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_IMPORTANT_CONSUMER_INFORMATION_MENU_FOOTER_ONE(){
        return WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_IMPORTANT_CONSUMER_INFORMATION_MENU_FOOTER_ONE;
    }

    public VerizonHomepage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToSignInPage() {
        mouseHoverJScript(signInButtonOnHeaderTwo);
        clickJScript(signInButtonOnHeaderTwo);
    }

    public void scrollThroughTheMobileOptionsInTab() throws InterruptedException {
        robotScrollDown(17);
        clickElement(buttonTabMobileOption);
        int numberOfOptionsInTab = totalDraggableOptionsUnderMobile.size();
        for(int i=0; i<=numberOfOptionsInTab; i++) {
            waitTimeUsingImplicit(3);
            clickElement(buttonScrollThroughTabOptions);
        }
    }

    public void clickOnShopDropdownOnHeaderTwo(){
        clickElement(buttonShopDropdownHeaderTwo);
    }

    public void clickWhyVerizonDropdownOnHeaderTwo(){
        clickElement(buttonWhyVerizonDropdownHeaderTwo);
    }

    public void clickSupportDropdownOnHeaderTwo(){
        clickElement(buttonSupportDropdownHeaderTwo);
    }

    public void scrollToBottomOfVerizonHomepage(){
        scrollToBottomOfPage();
    }

}
