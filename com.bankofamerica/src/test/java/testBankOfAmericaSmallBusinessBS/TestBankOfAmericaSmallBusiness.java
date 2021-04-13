package testBankOfAmericaSmallBusinessBS;

import bankOfAmericaSmallBusinessBS.BankOfAmericaSmallBusiness;
import common.BaseAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static bankOfAmericaSmallBusinessBS.BankOfAmericaSmallBusinessWebElements.*;

public class TestBankOfAmericaSmallBusiness extends BaseAPI {

    BankOfAmericaSmallBusiness bank;

    //Test #1 (working)
    @Test(enabled = false)
    public void testNavigateToSmallBusiness() {
        BankOfAmericaSmallBusiness bank = new BankOfAmericaSmallBusiness();
        bank.navigateToSmallBusiness();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.bankofamerica.com/smallbusiness/";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test #2 (working)
    @Test(enabled = false)
    public void testNavigateToResources() throws InterruptedException {
        BankOfAmericaSmallBusiness bank = new BankOfAmericaSmallBusiness();

        bank.navigateToResourcesLink();
        String actualResult = driver.getTitle();
        String expectedResult = "Small Business Resources";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test #3
    @Test(enabled = false)
    public void testClickRateDropDownMenu() throws InterruptedException {
        BankOfAmericaSmallBusiness bank = new BankOfAmericaSmallBusiness();
        bank.navigateToSmallBusiness();
        bank.navigateToSavingsLink();
        bank.navigateToBusinessAdvantageSavings();
        bank.enterZipcode();
        bank.clickZipCodeGoButton();
        bank.clickRateDropDownMenu();
        String actualResult = driver.getTitle();
        String expectedResult = "Business Advantage Savings Account from Bank of America";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test #4
    @Test(enabled = true)
    public void testRecommendation(){
        BankOfAmericaSmallBusiness bank = new BankOfAmericaSmallBusiness();
        bank.goToRecommendation();
        assertEqualsGetTextUsingXpath("Small Business Loans & Financing",WEB_ELEMENT_HEADING);
    }



}
