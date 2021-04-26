package FinancialServicesMA;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static FinancialServicesMA.FinancialServicesLocators.*;

public class FinancialServicesPage extends BaseAPI {


    public FinancialServicesPage() { PageFactory.initElements(driver,this); }

    @FindBy (xpath = WEB_ELEMENT_CLICK_COMPARE_NOW)
    public WebElement clickCompareNow;
    @FindBy (xpath =WEB_ELEMENT_CLICK_LEARN_MORE )
    public WebElement clickLearnMore;
    @FindBy (xpath =WEB_ELEMENT_GO_TO_ESTIMATOR )
    public WebElement goToEstimator;
    @FindBy (xpath = WEB_ELEMENT_GET_STARTED)
    public WebElement getStarted;
    @FindBy (xpath = WEB_ELEMENT_FIND_DEALER)
    public WebElement findDealer;



    public void  clickCompareNow () {
        implicitWait();
        clickCompareNow.click();
        implicitWait();

    }

    public void clickLearnMore (){
        implicitWait();
        clickLearnMore.click();
        implicitWait();

    }

    public void goToEstimator (){
        implicitWait();
        goToEstimator.click();
        implicitWait();
    }

    public void getStarted (){
        implicitWait();
        getStarted.click();
        implicitWait();
    }

    public void findDealer (){
        implicitWait();
        findDealer.click();
        implicitWait();
    }

}
