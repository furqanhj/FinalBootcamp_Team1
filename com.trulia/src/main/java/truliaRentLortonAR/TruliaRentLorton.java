package truliaRentLortonAR;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static truliaRentLortonAR.TruliaRentLortonWebElements.*;

public class TruliaRentLorton extends BaseAPI {



    @FindBy(xpath = WEB_ELEMENT_RENT_BUTTON)
    WebElement rentButton;

    @FindBy (xpath= WEB_ELEMENT_GOOGLE_MAP)
    WebElement googleMap;

    public TruliaRentLorton(){
        PageFactory.initElements(driver, this);
    }

    public void clickRentButton() throws InterruptedException {
        implicitWait(20);
        basicHoverUsingXpath(WEB_ELEMENT_RENT_BUTTON);
        driverWait.until(ExpectedConditions.visibilityOf(rentButton));
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_RENT_BUTTON);
    }

    public void TypeInLocationSearchBox(){
        implicitWait(20);
        basicHoverUsingXpath(WEB_ELEMENT_RENT_BUTTON);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_RENT_BUTTON);
        typeOnElement(WEB_ELEMENT_LOCATION_SEARCH_BOX, WEB_ELEMENT_INPUT_LOCATION_SEARCH_BOX);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);
    }
    public void

}
