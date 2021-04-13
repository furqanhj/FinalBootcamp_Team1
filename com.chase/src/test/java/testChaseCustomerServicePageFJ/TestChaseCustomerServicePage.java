package testChaseCustomerServicePageFJ;

import chaseCustomerServicePageFJ.ChaseCustomerServicePage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChaseCustomerServicePage extends BaseAPI {

    ChaseCustomerServicePage customerServicePage;

    @Test(priority = 1)
    public void testClickOnGetHelpWithYourAccountLink(){
        customerServicePage = new ChaseCustomerServicePage();
        customerServicePage.clickOnGetHelpWithYourAccountPage();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Chase Customer Service: We can help you! | Chase";

        Assert.assertTrue(compareStrings(actualTitle.toLowerCase(), expectedTitle.toLowerCase()));
    }

    @Test(priority = 2)
    public void testClickOnFindATMOrBranchLink(){
        customerServicePage = new ChaseCustomerServicePage();
        customerServicePage.clickOnFindATMOrBranchLink();

        Assert.assertTrue(isElementDisplayed(customerServicePage.searchBoxToFindNearestATM));
    }

    @Test (priority = 3)
    public void testClickOnDisputeAChargeLink(){
        customerServicePage = new ChaseCustomerServicePage();
        customerServicePage.clickOnDisputeAChargeLink();

        //NOT COMPLETE - YET TO ASSERT !
    }
}
