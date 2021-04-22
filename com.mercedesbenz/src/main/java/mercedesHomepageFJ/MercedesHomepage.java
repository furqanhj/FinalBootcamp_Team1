package mercedesHomepageFJ;

import static mercedesHomepageFJ.MercedesHomepageWebElements.*;
import common.BaseAPI;
import inventoryPageFJ.InventoryPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import requestAQuotePageFJ.RequestAQuotePage;

import java.util.List;

public class MercedesHomepage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_INVENTORY_HOMEPAGE_HEADER)
    public WebElement inventoryDropdownButtonOnHomepage;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_VIEW_NEW_INVENTORY)
    public WebElement viewNewInventoryButton;
    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_SHOPPING)
    public WebElement shoppingDropdownMenu;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_REQUEST_A_QUTOTE)
    public WebElement requestAQuoteButton;


    /**
     * Initialization of elements required for Assertions
     */
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_NUMBER_OF_ELEMENTS_ON_HOMEPAGE_HEADER)
    public List<WebElement> actualNumberOfElementsOnHomepageHeader;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_FIND_LOCAL_INVENTORY)
    public WebElement actualTextFindLocalInventory;

    public MercedesHomepage(){
        PageFactory.initElements(driver, this);
    }

    public InventoryPage navigateToInventoryPage(){
        clickElement(inventoryDropdownButtonOnHomepage);
        clickElement(viewNewInventoryButton);

        return new InventoryPage();
    }

    public RequestAQuotePage navigateToRequestAQuotePage(){
        clickElement(shoppingDropdownMenu);
        clickElement(requestAQuoteButton);

        return new RequestAQuotePage();
    }

}
