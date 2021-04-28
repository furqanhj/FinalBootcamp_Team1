package mortgageCalculatorPageFJ;

import static mortgageCalculatorPageFJ.MortgageCalculatorPageLocators.*;

import common.BaseAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MortgageCalculatorPage extends BaseAPI {
    Actions actions;

    @FindBy(xpath = WEB_ELEMENT_FIRST_INPUT_BOX_HOME_PRICE_OPTION)
    public WebElement firstInputBoxHomePriceOption;
    @FindBy(xpath = WEB_ELEMENT_FIRST_SLIDER_HOME_PRICE_OPTION)
    public WebElement firstSliderHomePriceOption;
    @FindBy(xpath = WEB_ELEMENT_SECOND_INPUT_BOX_DOWN_PAYMENT_USING_AMOUNT)
    public WebElement secondInputBoxDownPaymentUsingAmount;
    @FindBy(xpath = WEB_ELEMENT_THIRD_INPUT_BOX_DOWN_PAYMENT_USING_PERCENT)
    public WebElement thirdInputBoxDownPaymentUsingPercent;
    @FindBy(xpath = WEB_ELEMENT_SECOND_SLIDER_DOWN_PAYMENT_OPTION)
    public WebElement secondSliderDownPaymentOption;
    @FindBy(css = WEB_ELEMENT_FOURTH_INPUT_BOX_CITY_OR_ZIP)
    public WebElement fourthInputBoxCityOrZipOption;
    @FindBy(xpath = WEB_ELEMENT_LOAN_TYPE_DROPDOWN_MENU)
    public WebElement loanTypeDropdownMenu;
    @FindBy(xpath = WEB_ELEMENT_FIRST_OPTION_IN_LOAN_TYPE_DROPDOWN)
    public WebElement firstOptionInLoanTypeDropdown;
    @FindBy(xpath = WEB_ELEMENT_SECOND_OPTION_IN_LOAN_TYPE_DROPDOWN)
    public WebElement secondOptionInLoanTypeDropdown;
    @FindBy(xpath = WEB_ELEMENT_THIRD_OPTION_IN_LOAN_TYPE_DROPDOWN)
    public WebElement thirdOptionInLoanTypeDropdown;
    @FindBy(xpath = WEB_ELEMENT_DID_YOU_MEAN_POPUP)
    public WebElement popUpDidYouMean;
    @FindBy(xpath = WEB_ELEMENT_FIRST_OPTION_TO_SELECT_IN_DID_YOU_MEAN_POPUP)
    public WebElement firstOptionInDidYouMeanPopup;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_VIEW_ALL_RATES_LINK)
    public WebElement buttonViewAllRates;
    @FindBy(xpath = WEB_ELEMENT_MORTGAGE_PROVIDERS_IN_CHOSEN_CITY_SLIDER)
    public WebElement mortgageProvidersInChosenCitySlider;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_GET_PREQUALIFIED)
    public WebElement buttonGetPrequalified;

    /**
     * Initialization of elements required for Assertions
     */
    @FindBy(xpath = WEB_ELEMENTS_ACTUAL_NUM_OF_ELEMENTS_IN_LOAN_TYPE_DROPDOWN)
    public List<WebElement> actualNumOfElementsInLoanTypeDropdown;
    @FindBy(xpath = WEB_ELEMENT_CALCULATOR_RESULT_FOR_MONTHLY_PAYMENTS)
    public WebElement calculatorResultForMonthlyPayments;
    @FindBy(className = WEB_ELEMENT_MORTGAGE_PROVIDERS_IN_CHOSEN_CITY_SLIDER)
    public WebElement mortgageProvidersInChosenCity;
    @FindBy(className = WEB_ELEMENT_ACTUAL_TEXT_VIEW_ALL_RATES_LANDED_PAGE)
    public WebElement actualTextViewAllRatesLandedPage;
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_GET_PREQUALIFIED_LANDED_PAGE)
    public WebElement actualTextGetPrequalifiedLandedPage;


    public MortgageCalculatorPage() {
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToHomePriceInputBox(String homePriceAmount) {
        actions = new Actions(driver);
//        actions.click(firstInputBoxHomePriceOption).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
//                .sendKeys(Keys.BACK_SPACE).build().perform();
        actions.doubleClick(firstInputBoxHomePriceOption).sendKeys(Keys.BACK_SPACE).build().perform();
//        robot.keyPress(KeyEvent.VK_DELETE);
//        clickElement(firstInputBoxHomePriceOption);
        sendKeysToElement(firstInputBoxHomePriceOption, homePriceAmount);
        clickElement(secondInputBoxDownPaymentUsingAmount);

    }

    public void sendKeysToDownPaymentUsingAmountInputBox(String downPaymentAmount) {
        actions = new Actions(driver);
        actions.doubleClick(secondInputBoxDownPaymentUsingAmount).sendKeys(Keys.BACK_SPACE).build().perform();
        sendKeysToElement(secondInputBoxDownPaymentUsingAmount, downPaymentAmount);
        clickElement(firstInputBoxHomePriceOption);
    }

    public void sendKeysToDownPaymentUsingPercentInputBox(String downPaymentPercent) {
        actions = new Actions(driver);
        actions.doubleClick(thirdInputBoxDownPaymentUsingPercent).sendKeys(Keys.BACK_SPACE).build().perform();
        sendKeysToElement(thirdInputBoxDownPaymentUsingPercent, downPaymentPercent);
        clickElement(secondInputBoxDownPaymentUsingAmount);
    }

    public void sendKeysToFourthInputBoxWhereAreYouBuyingField(String cityOrState) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        clickElement(fourthInputBoxCityOrZipOption);
        sendKeysToElement(fourthInputBoxCityOrZipOption, cityOrState + Keys.ENTER);
        waitTimeUsingFluent(3);

        if (isElementDisplayed(popUpDidYouMean))
            clickElement(firstOptionInDidYouMeanPopup);
    }

    public void clickOnGetPrequalifiedButtonAfterEnteringCity(String cityOrState){
        sendKeysToFourthInputBoxWhereAreYouBuyingField(cityOrState);
        clickElement(mortgageProvidersInChosenCitySlider);
        clickElement(buttonGetPrequalified);
        switchToNewTab(1);
    }

    public void clickViewAllRatesButtonAfterEnteringCity(String cityOrState) {
        sendKeysToFourthInputBoxWhereAreYouBuyingField(cityOrState);
        clickElement(buttonViewAllRates);
        switchToNewTab(1);
    }

    public void clickOnLoanTypeDropdownMenu() {
        clickElement(loanTypeDropdownMenu);
    }

    public void selectAnOptionFromLoanTypeDropdown(int dropdownOption) {
        clickOnLoanTypeDropdownMenu();
        switch (dropdownOption) {
            case 1:
                clickElement(firstOptionInLoanTypeDropdown);
                break;
            case 2:
                clickElement(secondOptionInLoanTypeDropdown);
                break;
            case 3:
                clickElement(thirdOptionInLoanTypeDropdown);
                break;
            default:
                System.out.println("INVALID OPTION SELECTED !");
                break;
        }
    }

    public void dragAndDropHomePriceOptionSlider(int xOffSet) {
        actions = new Actions(driver);
        actions.dragAndDropBy(firstSliderHomePriceOption, xOffSet, 0).perform();
    }

    public void dragAndDropDownPaymentOptionSlider(int xOffSet) {
        actions = new Actions(driver);
        actions.dragAndDropBy(secondSliderDownPaymentOption, xOffSet, 0).perform();
    }

}
