package inventoryPageFJ;

import static inventoryPageFJ.InventoryPageWebElements.*;
import common.BaseAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BaseAPI {

    JavascriptExecutor js;

    @FindBy(css = WEB_ELEMENT_INPUT_ZIP_CODE)
    public WebElement zipCodeInputField;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_FIND_DEALER)
    public WebElement findDealerSearchButton;

    public InventoryPage(){
        PageFactory.initElements(driver, this);
    }

    public void enterZipCodeOrCityAndFindDealer(String zipCodeOrCity){
        js = (JavascriptExecutor) driver;
        clickElement(zipCodeInputField);
//        zipCodeInputField.sendKeys(zipCodeOrCity);
//        js.executeScript("arguments[0].value='"+zipCodeOrCity+"'", zipCodeInputField);
        js.executeScript("arguments[0].value=arguments[1]", zipCodeInputField, zipCodeOrCity);
        clickElement(findDealerSearchButton);
    }

}
