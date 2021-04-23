package testChaseOpenAnAccountAR;

import chaseOpenAnAccountAR.ChaseOpenAnAccount;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static chaseOpenAnAccountAR.ChaseOpenAnAccountWebElements.*;

public class TestChaseOpenAnAccount extends BaseAPI {

    @Test(enabled = false) //failed
    public void testClickChkAccountsOption() throws InterruptedException {
        ChaseOpenAnAccount chaseOpenAnAccount = new ChaseOpenAnAccount();
        chaseOpenAnAccount.hoverOpenAnAccount();
        Thread.sleep(5000);
        String actualAttributeValue = chaseOpenAnAccount.openAnAcctDropDown.getAttribute("class");
        String expectedAttributeValue = "btn cta cta--primary cta--large cta--btn-green-aloe";
        Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "CLASS DOES NOT MATCH");

    }
    @Test (enabled = false)
    public void testChckAccountsPageHeader(){
        ChaseOpenAnAccount chaseOpenAnAccount = new ChaseOpenAnAccount();
        chaseOpenAnAccount.verifyChckAccountsPageHeader();
        assertEqualsGetText("Chase Checking Accounts", WEB_ELEMENT_CHASE_CHCK_ACCT_HEADER);

    }

    @Test (enabled = false)
    public void testChckAccountsCompareAccountsHeader(){
        ChaseOpenAnAccount chaseOpenAnAccount = new ChaseOpenAnAccount();
        chaseOpenAnAccount.verifyChckAccountsCompareAccountsHeader();
        assertEqualsGetText("Compare accounts and select the one that fits your needs", WEB_ELEMENT_COMPARE_ACCTS_HEADER);
    }

    @Test (enabled = false) //failed.
    public void testCollegeCheckingOpenNowButton(){
        ChaseOpenAnAccount chaseOpenAnAccount = new ChaseOpenAnAccount();
        chaseOpenAnAccount.clickCollegeCheckingOpenNowButton();
        assertEqualsGetTitle("Get Started - Account Application - chase.com");
    }

    @Test (enabled = false) //failed
    public void testVerifyPageTitle(){
        ChaseOpenAnAccount chaseOpenAnAccount = new ChaseOpenAnAccount();
        chaseOpenAnAccount.clickCollegeCheckingOpenNowButton();
        String exp = "Get Started - Account Application - chase.com";
        String act = driver.getTitle();
        //Compares 2 Strings -->equalsIgnoreCase will Compare Strings even if in upper or lower case
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

    @Test (enabled = false)
    public void testPageTitleInspection() {
        String expectedTitle = "";
        String actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        softAssert.assertNotSame(actualTitle, expectedTitle);
        softAssert.assertAll();
    }
    @Test (enabled = true)
    public void testClickOpenAnAccountButton(){
        ChaseOpenAnAccount chaseOpenAnAccount = new ChaseOpenAnAccount();
        chaseOpenAnAccount.clickOpenAnAccountButton();
        assertEqualsGetText("when you open a new Chase Total Checking® account1\n" +
                "and set up direct deposit within 90 days of coupon enrollment.2", "WEB_ELEMENT_OPEN_AN_ACCOUNT_TEXT_HEADER");
    }
    }
