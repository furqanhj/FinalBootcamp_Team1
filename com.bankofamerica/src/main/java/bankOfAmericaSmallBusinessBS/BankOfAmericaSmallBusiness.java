package bankOfAmericaSmallBusinessBS;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static bankOfAmericaSmallBusinessBS.BankOfAmericaSmallBusinessWebElements.*;

public class BankOfAmericaSmallBusiness extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_HOMEPAGE_SMALL_BUSINESS)
    WebElement smallBusinessLink;

    public BankOfAmericaSmallBusiness() {
        PageFactory.initElements(driver, this);
    }
    public void navigateToSmallBusiness() {
        driver.getCurrentUrl();
        System.out.println("Current URL is: " + driver.getCurrentUrl());
    }
    //***********************************************************************************

    @FindBy(xpath = WEB_ELEMENT_SMALL_BUSINESS_RESOURCES)
    WebElement smallBusinessResourcesLink;
        public void navigateToSmallBusinessResources() {
            smallBusinessResourcesLink.click();
        }


    @FindBy(xpath = WEB_ELEMENT_VISIT_RESOURCES)
    WebElement visitResourcesLink;
        public void navigateToResourcesLink() throws InterruptedException {
            smallBusinessResourcesLink.click();
            implicitWait();
            visitResourcesLink.click();
            Thread.sleep(5000);

        }

    //***********************************************************************************
    @FindBy(xpath = WEB_ELEMENT_SAVINGS_LINK)
    WebElement smallBusinessSavingsLink;
        public void navigateToSavingsLink() {
            smallBusinessSavingsLink.click();
        }

    @FindBy(xpath = WEB_ELEMENT_BUSINESS_ADVANTAGE_SAVINGS_LINK)
    WebElement businessAdvantageSavingsLink;
        public void navigateToBusinessAdvantageSavings(){
            businessAdvantageSavingsLink.click();
        }
    @FindBy(xpath = WEB_ELEMENT_ENTER_ZIPCODE)
    WebElement enterZipCodeField;
        public void enterZipcode(){
            enterZipCodeField.sendKeys(WEB_ELEMENT_ZIP_CODE);
        }
    @FindBy(xpath = WEB_ELEMENT_ZIPCODE_GO_BUTTON)
    WebElement zipCodeGoButton;
        public void clickZipCodeGoButton(){
            zipCodeGoButton.click();
        }

    @FindBy(css = WEB_ELEMENT_OVERVIEW_LINK)
    WebElement smallBusinessOverviewLink;
        public void navigateToOverviewLink(){
            smallBusinessOverviewLink.click();
        }
    @FindBy(xpath = WEB_ELEMENT_RATE_DROPDOWN)
    WebElement rateDropDownMenu;
        public void clickRateDropDownMenu() throws InterruptedException {
            Thread.sleep(5000);
            smallBusinessOverviewLink.click();
            Thread.sleep(5000);
            rateDropDownMenu.click();
            Thread.sleep(5000);
        }
    @FindBy(xpath = WEB_ELEMENT_LENDING)
    public WebElement lending;
    @FindBy(xpath = WEB_ELEMENT_RECOMMENDATION)
    public WebElement recommendation;
    public void goToRecommendation()    {
            clickElement(lending);
            clickElement(recommendation);
    }
    @FindBy(xpath = WEB_ELEMENT_CREDIT_CARDS)
    WebElement creditCards;
    @FindBy(xpath = WEB_ELEMENT_POPULAR_CARDS)
    WebElement popularCards;
    @FindBy(xpath = WEB_ELEMENT_HEADING_POPULAR_CARDS)
    WebElement headingPopularCards;

    public void navigateToPopularCards(){
        creditCards.click();
        popularCards.click();
        headingPopularCards.isDisplayed();
    }
    @FindBy(xpath = WEB_ELEMENT_ENROLL)
    WebElement enroll;
    @FindBy(xpath = WEB_ELEMENT_DONT_HAVE_SSN)
    WebElement dontHaveSsn;

    public void navigateToEnrollPage(){
        enroll.click();
    }
    public void navigateToDontHaveSsn(){
        enroll.click();
        implicitWait();
        dontHaveSsn.click();
    }


    }




