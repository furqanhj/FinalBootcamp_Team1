package requestAQuotePageFJ;

import static requestAQuotePageFJ.RequestAQuoteWebElements.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RequestAQuotePage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_VEHICLE_CLASS_DROPDOWN_MENU)
    public WebElement dropdownVehicleClassMenu;
    @FindBy(xpath = WEB_ELEMENT_S_CLASS_OPTION_IN_CLASS_DROPDOWN)
    public WebElement sClassOptionInClassDropdown;
    @FindBy(xpath = WEB_ELEMENT_VEHICLE_MODEL_DROPDOWN_MENU)
    public WebElement dropdownVehicleModelMenu;
    @FindBy(xpath = WEB_ELEMENT_AMG_S_63_COUPE_OPTION_IN_MODEL_DROPDOWN)
    public WebElement amgS63CoupeOptionInModelDropdown;
    @FindBy(xpath = WEB_ELEMENT_CONTINUE_BUTTON)
    public WebElement continueButton;

    /**
     * Initialization of Elements required for Assertions
     */
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_IMAGE_OF_AMG_S_CLASS_SEARCH_RESULT)
    public WebElement actualImageOfAMGSClassAfterSearch;
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_NUM_OF_ELEMENTS_IN_CLASS_DROPDOWN)
    public List<WebElement> actualNumOfElementsInClassDropdown;
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_NUM_OF_ELEMENTS_IN_MODEL_DROPDOWN)
    public List<WebElement> actualNumOfElementsInModelDropdown;

    public RequestAQuotePage(){
        PageFactory.initElements(driver, this);
    }

    public void selectAVehicleClassAndModelAndSearch(){
//        clickElement(dropdownVehicleClassMenu);
//        clickElement(sClassOptionInClassDropdown);
//        clickElement(dropdownVehicleModelMenu);
//        clickElement(amgS63CoupeOptionInModelDropdown);
//        clickElement(continueButton);

        clickJScript(dropdownVehicleClassMenu);
        clickJScript(sClassOptionInClassDropdown);
        clickJScript(dropdownVehicleModelMenu);
        clickJScript(amgS63CoupeOptionInModelDropdown);
        clickJScript(continueButton);
    }

    public void clickOnVehicleClassDropdown(){
        clickJScript(dropdownVehicleClassMenu);
    }

    public void clickOnVehicleModelDropdown(){
        clickJScript(dropdownVehicleModelMenu);
    }

}
