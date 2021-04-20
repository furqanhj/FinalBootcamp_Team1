package bmwBuildYourOwnKE;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static bmwBuildYourOwnKE.WebElementsLocatorsBuildYourOwn.*;

public class BMW_BuildYourOwn extends BaseAPI {
    @FindBy(xpath = WEB_ELEMNT_BUILD_YourOwn)
    public WebElement buildYourOwn;
    @FindBy(xpath = WEB_ELEMENT_COSY_IMAGE)
    public WebElement validateCosyImage;

    @FindBy(xpath = WEB_ELEMENT_SELECT_SERIES_BTN)
    public WebElement selectSeriesBtn;

    @FindBy(xpath = WEB_ELEMENT_SERIES_X5)
    public WebElement seriesX5TextLink;
    @FindBy(xpath = WEB_ELEMENT_BACK_TOP_BTN)
    public WebElement backTopBtn;
    @FindBy(css = WEB_ELEMENT_4SERIES_CONVERTIBLE_SEL_BTN)
    public WebElement seriesConverSelecBtn;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE)
    public WebElement whiteConvertible430i;
    @FindBy(xpath = WEB_ELEMENT_DESIGN_BTN)
    public WebElement designBtn;
    @FindBy(xpath=WEB_ELEMENT_VALIDATE_DESIGN_BTN)
    public WebElement zipCodeAlert;
    @FindBy(css=WEB_ELEMENT_ZIP_CODE_FIELD)
    public WebElement zipCodeField;
    @FindBy(xpath = WEB_ELEMENT_SUBMIT_TEXT_LINK)
    public WebElement submitTextLink;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE_ENTERING_ZIP_CODE)
    public WebElement validatingEnteringZipCode;








    public BMW_BuildYourOwn() {
        PageFactory.initElements(driver, this);
    }
    public void clickBuildYourOwn (){

        clickElement(buildYourOwn);
    }
    public static String hexBackColor;
    public void backgroundColor(){

        String backColor= selectSeriesBtn.getCssValue("background-color");
        System.out.println(backColor);
        String hexBackColor = Color.fromString(backColor).asHex();
        System.out.println(hexBackColor);
    }
    public void clickSeriesX5TextLink (){
        clickElement(seriesX5TextLink);

    }

    public void clickSeriesConverSelecBtn(){
        clickElement(seriesConverSelecBtn);

    }
    public void clickDesignBtn(){
                designBtn.click();

    }
    public void enterZipCode(){

        sendKeysToElement(zipCodeField,"22192");
        clickElement(submitTextLink);
    }

}
