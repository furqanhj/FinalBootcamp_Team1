package bmwCertifiedBS;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static bmwCertifiedBS.BmwCertifiedWebElements.*;

public class BmwCertified extends BaseAPI {

    public BmwCertified() {
        PageFactory.initElements(driver, this);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FindBy(xpath = WEB_ELEMENT_PREOWNED)
    WebElement preOwned;

    @FindBy(xpath = WEB_ELEMENT_ZIPCODE)
    WebElement zipcodeField;

    @FindBy(xpath = WEB_ELEMENT_SHOP_CLICK)
    WebElement shopClick;

    public void searchPreOwnedByZipcode(){
        preOwned.click();
        implicitWait();
        zipcodeField.sendKeys(WEB_ELEMENT_ZIPCODE_ENTRY);
        implicitWait();
        shopClick.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FindBy(xpath = WEB_ELEMENT_SPECIAL_OFFERS)
    WebElement specialOffers;

    @FindBy(xpath = WEB_ELEMENT_IMPORTANT_INFO)
    WebElement importantInfo;

    @FindBy(xpath = WEB_ELEMENT_IMPORTANT_INFO_CLOSE)
    WebElement importantInfoClose;

    public void specialOffersImportantInfo(){
        specialOffers.click();
        implicitWait();
        importantInfo.click();
        implicitWait();
        importantInfoClose.click();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FindBy(xpath = WEB_ELEMENT_IMPORTANT_INFO_500)
    WebElement importantInfo500;

    @FindBy(xpath = WEB_ELEMENT_IMPORTANT_INFO_500_CLOSE)
    WebElement importantInfo500Close;

    public void navigateImportantInfo(){
        specialOffers.click();
        implicitWait();
        importantInfo500.click();
        implicitWait();
        importantInfo500Close.click();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FindBy(xpath = WEB_ELEMENT_SELECT_SERIES_X3)
    WebElement selectSeriesX3;
    @FindBy(css = WEB_ELEMENT_SELECT_SERIES_X3M)
    WebElement selectSeriesX3M;

    public void selectSeries(){
        selectSeriesX3.click();
        implicitWait();
        selectSeriesX3M.click();

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FindBy(xpath = WEB_ELEMENT_X3M_GRAPHITE)
    WebElement x3mGraphite;
    @FindBy(xpath = WEB_ELEMENT_X3M_BLUE)
    WebElement x3mBlue;
    @FindBy(xpath = WEB_ELEMENT_X3M_RED)
    WebElement x3mRed;

    public void selectX3mColor(){
        selectSeriesX3.click();
        implicitWait();
        selectSeriesX3M.click();
        implicitWait();
        x3mGraphite.click();
        implicitWait();
        x3mBlue.click();
        implicitWait();
        x3mRed.click();


    }


    }

