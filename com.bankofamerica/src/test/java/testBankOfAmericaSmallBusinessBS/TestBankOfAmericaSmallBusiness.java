package testBankOfAmericaSmallBusinessBS;

import bankOfAmericaSmallBusinessBS.BankOfAmericaSmallBusiness;
import common.BaseAPI;
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
    //Test #3 (working)
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
    //Test #4 (working)
    @Test(enabled = false)
    public void testRecommendation(){
        BankOfAmericaSmallBusiness bank = new BankOfAmericaSmallBusiness();
        bank.goToRecommendation();
        assertEqualsGetTextUsingXpath("Small Business Loans & Financing",WEB_ELEMENT_HEADING);
    }
    //Test #5
    @Test(enabled = false)
    public void testNavigateToSavingsLink(){
        BankOfAmericaSmallBusiness bank = new BankOfAmericaSmallBusiness();
        bank.navigateToSmallBusiness();
        bank.navigateToSavingsLink();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.bankofamerica.com/smallbusiness/";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }
    //Test #6
    @Test(enabled = false)
    public void testNavigateToBusinessAdvantageSavings(){
        BankOfAmericaSmallBusiness bank = new BankOfAmericaSmallBusiness();
        bank.navigateToSmallBusiness();
        bank.navigateToSavingsLink();
        bank.navigateToBusinessAdvantageSavings();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.bankofamerica.com/smallbusiness/deposits/savings-accounts/business-advantage-savings/";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }
    //Test #7 (not working)
    @Test(enabled = false)
    public void testZipcodeEntry() throws InterruptedException {
        BankOfAmericaSmallBusiness bank = new BankOfAmericaSmallBusiness();
        bank.navigateToSmallBusiness();
        bank.navigateToSavingsLink();
        bank.navigateToBusinessAdvantageSavings();
        bank.enterZipcode();
        bank.clickZipCodeGoButton();
        assertEqualsGetAttribute("11214", WEB_ELEMENT_ZIP_CODE, "value");

    }
    //Test #8 (working)
    @Test(enabled = false)
    public void testNavigateToPopularCards(){
        BankOfAmericaSmallBusiness bank = new BankOfAmericaSmallBusiness();
        bank.navigateToPopularCards();
        assertEqualsGetTextUsingXpath("Popular Business Credit Cards",WEB_ELEMENT_HEADING_POPULAR_CARDS);
    }
    //Test #9
    @Test(enabled = false)
    public void testNavigateToEnrollPage(){
        BankOfAmericaSmallBusiness bank = new BankOfAmericaSmallBusiness();
        bank.navigateToEnrollPage();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://secure.bankofamerica.com/auth/enroll/enroll-entry/";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }
    //Test #10
    @Test(enabled = true)
    public void testNavigateToDontHaveSsn(){
        BankOfAmericaSmallBusiness bank = new BankOfAmericaSmallBusiness();
        bank.navigateToDontHaveSsn();
        String actualResult = driver.getTitle();
        String expectedResult = "Bank of America | Online Banking | Enroll in Online & Mobile Banking";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }


}