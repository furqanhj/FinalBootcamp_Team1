package testVerizonSmartPhonesBS;

import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizonSmartPhonesBS.VerizonSmartPhones;

import static org.testng.AssertJUnit.assertTrue;
import static verizonSmartPhonesBS.VerizonSmartPhonesWebElements.*;

public class TestVerizonSmartPhones extends BaseAPI {

    VerizonSmartPhones verizon;

    //TEST 1
    @Test(priority = 1, enabled = false)
    public void testNavigateToSmartPhones() {
        verizon = new VerizonSmartPhones();
        verizon.navigateToSmartPhones();
        String exp = "5G Smartphones | Get it at Verizon";
        String act = driver.getTitle();

        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

    //TEST 2
    @Test(priority = 1, enabled = false)
    public void testClickOnIphone() {
        verizon = new VerizonSmartPhones();
        verizon.navigateAndClickOnIphone();
        String exp = "New Apple iPhone 12 Pro Max: Features, Price & Colors | Shop Now";
        String act = driver.getTitle();

        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

    //TEST 3
    @Test(priority = 3, enabled = false)
    public void testMobileArrowsClick() throws InterruptedException {
        verizon = new VerizonSmartPhones();
        verizon.clickOnNextArrow();
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_SLIDE_THREE));
    }

    //TEST 4
    @Test(priority = 4, enabled = false)
    public void testPricingDropDown() throws InterruptedException {
        verizon = new VerizonSmartPhones();
        verizon.pricingDropDown();
        Assert.assertTrue(isElementSelected(WEB_ELEMENT_2_YEAR_CONTRACT));

    }

    //TEST 5
    @Test(priority = 5, enabled = false)
    public void testSortByDropDown() throws InterruptedException {
        verizon = new VerizonSmartPhones();
        verizon.sortByDropDown();
        Assert.assertTrue(isElementSelected(WEB_ELEMENT_SORT_BY_BEST_SELLERS));
    }

    //TEST 6
    @Test(priority = 6, enabled = false)
    public void testIphone12SearchUsingRobot() {
        verizon = new VerizonSmartPhones();
        verizon.clickOnSearchField();
        Assert.assertEquals(getAttributeFromElement(WEB_ELEMENT_SEARCH_FIELD, "value"), "iphone 12");
    }

    //TEST 7
    @Test(priority = 7, enabled = false)
    public void testHoverOverSignInButton() {
        verizon = new VerizonSmartPhones();
        verizon.hoverOverSignInLink();
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_SIGN_IN));
    }

    //TEST 8
    @Test(priority = 8,enabled = false)
    public void testMobileSolutionsClick() {
        verizon = new VerizonSmartPhones();
        verizon.clickMobileSolutionsCart();
        String exp = "VERIZON HOMEPAGE";
        String act = driver.getTitle();

        Assert.assertFalse(exp.equalsIgnoreCase(act));

    }
    //TEST 9
    @Test(priority = 9, enabled = false)
    public void testHomeSolutionsClick() {
        verizon = new VerizonSmartPhones();
        verizon.clickHomeSolutionsCart();
        Assert.assertTrue(isUrlTrue("https://www.verizon.com/home/?xpsid=emptycart#check-availability"));
    }
    //TEST 10
    @Test(priority = 10, enabled = false)
    public void testCovid19FAQExpandAll(){
        verizon = new VerizonSmartPhones();
        verizon.navigateToCovidPageAndExpand();
        Assert.assertTrue(isTitleTrue("COVID-19 (Coronavirus) FAQs - Verizon wireless customer service"));
    }
    //TEST 11
    @Test(priority = 11, enabled = true)
    public void testLookUpVerizonStore() throws InterruptedException {
        verizon = new VerizonSmartPhones();
        verizon.lookUpVerizonStore();
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_FIND_VERIZON_STORE));
    }
    //TEST 12


}
