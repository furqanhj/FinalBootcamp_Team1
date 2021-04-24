package redfinMortgageRatesPage_KE;

import common.BaseAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static redfinMortgageRatesPage_KE.MortgageRatesPageWebElementsLocators.*;

public class MortgageRatesPage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_MORTGAGE_TEXT_LINK)
    public WebElement mortgageTextLink;
    @FindBy(xpath = WEB_ELEMENT_REDFIN_LOGO)
    public WebElement redfinLogo;
    @FindBy(css = WEB_ELEMENT_LOCATION_BOX_INPUT)
    public WebElement locationBoxInput;
    @FindBy(xpath = WEB_ELEMENT_HOme_PRICE_INPUT)
    public WebElement homePriceInput;
    @FindBy(xpath = WEB_ELEMENT_DOWN_PAYMENT_PERCENTAGE)
    public WebElement downPaymentPercentage;
    @FindBy(xpath = WEB_ELEMENT_UPDATE_RATES_BTN)
    public WebElement updateRatesBtn;
    @FindBy(xpath = WEB_ELEMENT_GET_PRE_APPROVED_BTN)
    public WebElement getPreApprovedBtn;
    @FindBy(css = WEB_ELEMENT_FACEBOOK_ICON)
    public WebElement facebookIcon;




    public MortgageRatesPage (){
        PageFactory.initElements(driver,this);

    }

    public void navigateMortgagePage(){
        clickElement(mortgageTextLink);

    }
    public void fillLocationBoxInput() {

        sendKeysToElement(locationBoxInput, "22192");
    }
    public void enterPrice(){
        actions = new Actions(driver);
        actions.doubleClick(homePriceInput).sendKeys(Keys.BACK_SPACE).build().perform();
        sendKeysToElement(homePriceInput, "450000");
                }
    public void enterDownPaymentPercentage() {
        downPaymentPercentage.clear();
        sendKeysToElement(downPaymentPercentage, "10");



    }
    public void clickUpdateRatesBtn() {

        clickJScript(updateRatesBtn);

    }
    public void clickPreApprovedBtn(){
        clickElement(getPreApprovedBtn);


    }
}
