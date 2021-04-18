package testChaseBusinessBS;

import chaseBusinessBS.ChaseBusiness;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import static chaseBusinessBS.ChaseBusinessWebElements.*;

public class TestChaseBusiness extends BaseAPI {

    ChaseBusiness chase;

    //Test 1
    @Test(priority = 1, enabled = false)
    public void testBusinessLink(){
        chase = new ChaseBusiness();
        chase.navigateToBusinessPage();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Business Banking: Business Loans & Lending | Chase for Business";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    //Test 2
    @Test(priority = 2, enabled = false)
    public void testSideMenu(){
        chase = new ChaseBusiness();
        chase.sideMenu();
        String actualResult = BaseAPI.driver.getCurrentUrl();
        String expectedResult = "https://www.chase.com/business";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 3
    @Test(priority = 3, enabled = false)
    public void testBusinessChecking(){
        chase = new ChaseBusiness();
        chase.navigateToBusinessChecking();
        String actualResult = BaseAPI.driver.getCurrentUrl();
        String expectedResult = "https://www.chase.com/business/checking";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 4
    @Test(priority = 4, enabled = false)
    public void testMerchantServices(){
        chase = new ChaseBusiness();
        chase.navigateToMerchantServices();
        assertEqualsGetTitle("Merchant Services", WEB_ELEMENT_MERCHANT_TITLE);

    }
    //Test 5
    @Test(priority = 5, enabled = false)
    public void testPppLearnMore(){
        chase = new ChaseBusiness();
        chase.navigateToPppLearnMore();
        String exp = "PPP LOANS INFORMATION";
        String act = driver.getTitle();
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }
    //TEST 6
    @Test(priority = 6, enabled = false)
    public void testCheckListFAQ(){
        chase = new ChaseBusiness();
        chase.clickChecklistFaq();
        String exp = "PPP LOANS INFORMATION";
        String act = driver.getTitle();
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }
    //TEST 7
    @Test(priority = 7, enabled = false)
    public void testClickApply(){
        chase = new ChaseBusiness();
        chase.clickApply();
        assertEqualsGetTitle("", WEB_ELEMENT_PPP_TITLE);
    }
    //TEST 8
    @Test(priority = 8, enabled = false)
    public void testClickWebinar(){
        chase = new ChaseBusiness();
        chase.clickWebinar();
        assertEqualsGetTitle("", WEB_ELEMENT_PPP_TITLE);
    }
    //TEST 9
    @Test(priority = 9, enabled = false)
    public void testNavigateTo750CashBackPage(){
        chase = new ChaseBusiness();
        chase.navigateTo750CashBack();
        String actualResult = BaseAPI.driver.getCurrentUrl();
        String expectedResult = "https://creditcards.chase.com/business-credit-cards/ink/business-preferred?CELL=6VFQ&jp_aid_a=T_61494&jp_aid_p=bizbankhome_3/trip2";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //TEST 10
    @Test(priority = 10, enabled = false)
    public void testNavigateToWomenOnTheMove(){
        chase = new ChaseBusiness();
        chase.navigateToWomenOnTheMove();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Business Banking: Business Loans & Lending | Chase for Business";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test 11
    @Test (enabled = false)
    public void testHoverOver() throws Exception {
        chase = new ChaseBusiness();
        Thread.sleep(4000);

        String actualAttributeValue = chase.exploreProducts.getAttribute("class");
        String expectedAttributeValue = "btn cta cta--primary cta--large cta--btn-green-aloe";

        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "COLOR DOES NOT MATCH");
    }
    //Test 12
    @Test(enabled = true)
    public void testOpenAccountHoverOver() throws Exception {
        chase = new ChaseBusiness();
        Thread.sleep(4000);

        String actualAttributeValue = chase.openAccountHover.getAttribute("class");
        String expectedAttributeValue = "header__section--dropdown__title__link chaseanalytics-track-link";

        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "COLOR DOES NOT MATCH");
    }

}


















