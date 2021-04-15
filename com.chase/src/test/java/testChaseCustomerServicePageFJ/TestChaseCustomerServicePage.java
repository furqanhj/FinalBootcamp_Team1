package testChaseCustomerServicePageFJ;

import chaseCustomerServicePageFJ.ChaseCustomerServicePage;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WebEventListener;

import java.util.List;

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

        List<WebElement> sizeOfElement = customerServicePage.actualLinksOnDisputeChargePage;
        int actualNumOfLinks = sizeOfElement.size();
        int expectedNumOfLinks = 4;

        Assert.assertEquals(actualNumOfLinks, expectedNumOfLinks, "LINKS ON PAGE DO NOT MATCH");
    }

    @Test (priority = 4)
    public void testClickOnReplaceLostDamagedCardLink(){
        customerServicePage = new ChaseCustomerServicePage();
        customerServicePage.clickOnReplaceLostOrDamagedCardLink();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Card Replacement | Digital | Chase.com";

        Assert.assertTrue(compareStrings(actualTitle, expectedTitle));
    }

    @Test (priority = 5)
    public void testClickOnMakeAPaymentLink(){
        customerServicePage = new ChaseCustomerServicePage();
        customerServicePage.clickOnMakeAPaymentLink();

        String actualText = getTextFromElement(customerServicePage.actualTextOnMakeAPaymentPage);
        String expectedText = "Looking to make a payment? You’ve come to the right place.";
    }

    @Test (priority = 6)
    public void testClickOnResetUsernamePasswordLink(){
        customerServicePage = new ChaseCustomerServicePage();
        customerServicePage.clickOnResetUsernamePasswordLink();

        String actualText = getTextFromElement(customerServicePage.actualTextOnResetUsernamePswdPage);
        String expectedText = "Forgot username or password";

        Assert.assertTrue(compareStrings(actualText, expectedText));
    }

}
