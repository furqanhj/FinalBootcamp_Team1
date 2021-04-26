package TestFinancialServices;

import FinancialServicesMA.FinancialServicesPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FinancialServicesTest extends BaseAPI {

    FinancialServicesPage financialServicesPage;

    // Test 1

    @Test (enabled = false,priority = 1)
    public void testOpenAnAccount () {
        financialServicesPage = new FinancialServicesPage();
        financialServicesPage.clickCompareNow();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Lease vs Finance | Mercedes- Benz-Financial Services | Mercedes-Benz USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    // Test 2
    @Test (enabled = false, priority = 2)
    public void testClickLearnMore (){
        financialServicesPage = new FinancialServicesPage();
        financialServicesPage.clickLearnMore();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "End of Lease Options | Mercedes-Benz Financial Services | Mercedes-Benz USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    // Test 3
    @Test (enabled = false,priority = 3)
    public void testGoToEstimator (){
        financialServicesPage = new FinancialServicesPage();
        financialServicesPage.goToEstimator();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Car Payment Estimator | Mercedes-Benz USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 4
    @Test (enabled = false,priority = 4)
    public void testGetStarted (){
        financialServicesPage = new FinancialServicesPage();
        financialServicesPage.getStarted();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Credit Application | Mercedes-Benz USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 5
    @Test (enabled = false, priority = 5)
    public void testFindDealer (){
        financialServicesPage = new FinancialServicesPage();
        financialServicesPage .findDealer();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Find a Mercedes-Benz Dealer | Mercedes-Benz USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }




    }
