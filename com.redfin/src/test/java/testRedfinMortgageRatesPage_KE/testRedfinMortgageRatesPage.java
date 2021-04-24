package testRedfinMortgageRatesPage_KE;

import common.BaseAPI;
import org.testng.annotations.Test;
import redfinMortgageRatesPage_KE.MortgageRatesPage;

public class testRedfinMortgageRatesPage extends BaseAPI {
    MortgageRatesPage mortgageRatesPage;

    @Test(priority = 1, enabled = false)
    public void testNavigateMortgagePage() {
        mortgageRatesPage = new MortgageRatesPage();
        mortgageRatesPage.navigateMortgagePage();

        isElementDisplayed(mortgageRatesPage.redfinLogo);

    }

    @Test(priority = 2, enabled = false)
    public void testFillLocationBoxInput() {
        testNavigateMortgagePage();
        mortgageRatesPage.fillLocationBoxInput();
    }

    @Test(priority = 3, enabled = false)
    public void testEnterPrice() {
        testFillLocationBoxInput();
        mortgageRatesPage.enterPrice();

    }

    @Test(priority = 4, enabled = false)
    public void testEnterDownPaymentPercentage() {
        testEnterPrice();
        mortgageRatesPage.enterDownPaymentPercentage();

    }
    @Test(priority = 5, enabled = false)
    public void testClickUpdateRatesBtn() {
        testEnterDownPaymentPercentage();
        mortgageRatesPage.clickUpdateRatesBtn();
        String str1=driver.getCurrentUrl();
        System.out.println(str1);
        String str2="https://www.redfin.com/mortgage-rates?homePrice=450000";
        compareStrings(str1,str2);


    }
    @Test(priority = 6,enabled = true)
    public void testClickPreApprovedBtn(){
        testClickUpdateRatesBtn();
        mortgageRatesPage.clickPreApprovedBtn();
        isElementDisplayed(mortgageRatesPage.facebookIcon);


    }
}