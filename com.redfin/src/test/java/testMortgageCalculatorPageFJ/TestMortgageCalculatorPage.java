package testMortgageCalculatorPageFJ;

import common.BaseAPI;
import mortgageCalculatorPageFJ.MortgageCalculatorPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import redfinHomepageFJ.RedfinHomepage;

public class TestMortgageCalculatorPage extends BaseAPI {

    RedfinHomepage homepage;
    MortgageCalculatorPage mortgageCalculatorPage;

    //TestCase#1: Validate number of options in LoanType dropdown menu (3options)
    @Test(priority = 1, enabled = true)
    public void testValidateNumberOfOptionsInLoanTypeDropdownMenu(){
        homepage = new RedfinHomepage();
        mortgageCalculatorPage = new MortgageCalculatorPage();
        homepage.navigateToMortgageCalculatorPage().clickOnLoanTypeDropdownMenu();

        int actualNumOfOptions = mortgageCalculatorPage.actualNumOfElementsInLoanTypeDropdown.size();
        int expectedNumOfOptions = 3;

        Assert.assertTrue(compareIntegers(actualNumOfOptions, expectedNumOfOptions));
        System.out.println("ACTUAL NUMBER OF OPTIONS = " + actualNumOfOptions);
        System.out.println("EXPECTED NUMBER OF OPTIONS = " + expectedNumOfOptions);
    }

    //TestCase#2: enter text in home price option and validate via change in element
    @Test(priority = 2, enabled = true)
    public void testSendKeysToHomePriceInputBox(){
        homepage = new RedfinHomepage();
        mortgageCalculatorPage = new MortgageCalculatorPage();
        homepage.navigateToMortgageCalculatorPage().sendKeysToHomePriceInputBox("300000");

        String actualValue = getTextFromElement(mortgageCalculatorPage.calculatorResultForMonthlyPayments);
        String initialValue = "$1,315 per month";
        Assert.assertFalse(compareStrings(actualValue, initialValue));
        System.out.println("ACTUAL VALUE = " + actualValue);
        System.out.println("INITIAL VALUE = " + initialValue);
    }

    //TestCase#3: enter text in down payment using amount option and validate via change in element
    @Test(priority = 3, enabled = true)
    public void testSendKeysToDownPaymentUsingAmountInputBox(){
        homepage = new RedfinHomepage();
        mortgageCalculatorPage = new MortgageCalculatorPage();
        homepage.navigateToMortgageCalculatorPage().sendKeysToDownPaymentUsingAmountInputBox("20000");

        String actualValue = getTextFromElement(mortgageCalculatorPage.calculatorResultForMonthlyPayments);
        String initialValue = "$1,315 per month";

        Assert.assertFalse(compareStrings(actualValue, initialValue));
        System.out.println("ACTUAL VALUE = " + actualValue);
        System.out.println("INITIAL VALUE = " + initialValue);
    }

    //TestCase#4: enter text in down payment using percent input box and validate via change in element
    @Test(priority = 4, enabled = true)
    public void testSendKeysToDownPaymentUsingPercentInputBox(){
        homepage = new RedfinHomepage();
        mortgageCalculatorPage = new MortgageCalculatorPage();
        homepage.navigateToMortgageCalculatorPage().sendKeysToDownPaymentUsingPercentInputBox("25");

        String actualValue = getTextFromElement(mortgageCalculatorPage.calculatorResultForMonthlyPayments);
        String initialValue = "$1,315 per month";

        Assert.assertFalse(compareStrings(actualValue, initialValue));
        System.out.println("ACTUAL VALUE = " + actualValue);
        System.out.println("INITIAL VALUE = " + initialValue);
    }

    //TestCase#5: Change the option in loan-type dropdown and validate via change in element
    @Test(priority = 5, enabled = true)
    public void testSelectAnOptionFromLoanTypeDropdown(){
        homepage = new RedfinHomepage();
        mortgageCalculatorPage = new MortgageCalculatorPage();
        homepage.navigateToMortgageCalculatorPage().selectAnOptionFromLoanTypeDropdown(2);

        String actualValue = getTextFromElement(mortgageCalculatorPage.calculatorResultForMonthlyPayments);
        String initialValue = "$1,315 per month";

        Assert.assertFalse(compareStrings(actualValue, initialValue));
        System.out.println("ACTUAL VALUE = " + actualValue);
        System.out.println("INITIAL VALUE = " + initialValue);
    }

    //TestCase#6: Drag and release the HomePrice slider and validate via change in element
    @Test(priority = 6, enabled = true)
    public void testDragAndDropHomePriceOptionsSlider(){
        homepage = new RedfinHomepage();
        mortgageCalculatorPage = new MortgageCalculatorPage();
        homepage.navigateToMortgageCalculatorPage().dragAndDropHomePriceOptionSlider(5);

        String actualValue = getTextFromElement(mortgageCalculatorPage.calculatorResultForMonthlyPayments);
        String initialValue = "$1,315 per month";

        Assert.assertFalse(compareStrings(actualValue, initialValue));
        System.out.println("ACTUAL VALUE = " + actualValue);
        System.out.println("INITIAL VALUE = " + initialValue);
    }

    //TestCase#7: Drag and release the DownPayment slider and validate via change in element
    @Test(priority = 7, enabled = true)
    public void testDragAndDropDownPaymentOptionsSlider(){
        homepage = new RedfinHomepage();
        mortgageCalculatorPage = new MortgageCalculatorPage();
        homepage.navigateToMortgageCalculatorPage().dragAndDropDownPaymentOptionSlider(5);

        String actualValue = getTextFromElement(mortgageCalculatorPage.calculatorResultForMonthlyPayments);
        String initialValue = "$1,315 per month";

        Assert.assertFalse(compareStrings(actualValue, initialValue));
        System.out.println("ACTUAL VALUE = " + actualValue);
        System.out.println("INITIAL VALUE = " + initialValue);
    }

    //TestCase#8: Enter text in Where are you buying input field and validate via element present
    @Test(priority = 8, enabled = true)
    public void testSendKeysToWhereAreYouBuyingInputField(){
        homepage = new RedfinHomepage();
        mortgageCalculatorPage = new MortgageCalculatorPage();
        homepage.navigateToMortgageCalculatorPage().sendKeysToFourthInputBoxWhereAreYouBuyingField("california");

        Assert.assertTrue(isElementDisplayed(mortgageCalculatorPage.mortgageProvidersInChosenCity));
    }

    //TestCase#9: enter city in where are you buying and then click on View All Rates link, validate via text
    @Test(priority = 9, enabled = true)
    public void testClickViewAllRatesLinkAfterEnteringCity(){
        homepage = new RedfinHomepage();
        mortgageCalculatorPage = new MortgageCalculatorPage();
        homepage.navigateToMortgageCalculatorPage().clickViewAllRatesButtonAfterEnteringCity("california");

        String actualText = getTextFromElement(mortgageCalculatorPage.actualTextViewAllRatesLandedPage);
        String expectedText = "Compare Loan Options";

        Assert.assertTrue(compareStrings(actualText, expectedText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }

    //TestCase#10: click on get prequalified button and validate via text on new window
    @Test(priority = 10, enabled = true)
    public void testClickOnGetPrequalifiedButtonAfterEnteringCity(){
        homepage = new RedfinHomepage();
        mortgageCalculatorPage = new MortgageCalculatorPage();
        homepage.navigateToMortgageCalculatorPage().clickOnGetPrequalifiedButtonAfterEnteringCity("california");

        String actualText = getTextFromElement(mortgageCalculatorPage.actualTextGetPrequalifiedLandedPage);
        String expectedText = "Receive your customized rate quote";

        Assert.assertTrue(compareStrings(actualText, expectedText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }
}
