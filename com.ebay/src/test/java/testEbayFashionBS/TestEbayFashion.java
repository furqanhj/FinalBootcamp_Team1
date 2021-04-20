package testEbayFashionBS;

import common.BaseAPI;
import ebayFashionBS.EbayFashion;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static ebayFashionBS.EbayFashionWebElements.*;

public class TestEbayFashion extends BaseAPI {

    EbayFashion ebay;

    //Test 1
    @Test(priority = 1, enabled = false)
    public void testNavigateToFashion() {
        ebay = new EbayFashion();
        ebay.navigateToFashionLink();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Fashion products for sale | eBay";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //TEST 2
    @Test(priority = 2, enabled = false)
    public void testNavigateToAddSomeSparkle() {
        ebay = new EbayFashion();
        ebay.navigateToAddSomeSparkle();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Up to 80% off jewelry | eBay. exclusive collections for a limited time.";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //TEST 3
    @Test(priority = 3, enabled = false)
    public void testNavigateToFramedEarrings() {
        ebay = new EbayFashion();
        ebay.navigateToFramedEarrings();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Framed Square Stud Earrings with Diamonds in 18K Gold-Plated Bronze | eBay";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //TEST 4
    @Test(priority = 4, enabled = false)
    public void testProtectionPlanCheckBox() {
        ebay = new EbayFashion();
        ebay.clickProtectionPlanCheckbox();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Framed Square Stud Earrings with Diamonds in 18K Gold-Plated Bronze | eBay";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //TEST 5
    @Test(priority = 5, enabled = false)
    public void testNavigateToHandbagsAccessories() {
        ebay = new EbayFashion();
        ebay.navigateToHandbagsAccessoriesPage();
        assertEqualsGetTextUsingXpath("Women's Bags & Handbags", WEB_ELEMENT_HANDBAGS_ACCESSORIES_HEADER);

    }

    //TEST 6
    @Test(priority = 6, enabled = false)
    public void testNavigateToChanel() {
        ebay = new EbayFashion();
        ebay.navigateToChanel();
        assertEqualsGetTextUsingXpath("CHANEL Bags & Handbags for Women", WEB_ELEMENT_CHANEL_HEADER);
    }

    //TEST 7- fix
    @Test(priority = 7, enabled = false)
    public void testClickOnBeigeColor() {
        ebay = new EbayFashion();
        ebay.navigateToBeigeColor();
        assertEqualsGetTextUsingXpath("CHANEL Bags & Handbags for Women", WEB_ELEMENT_CHANEL_HEADER);
    }

    //TEST 8 - fix
    @Test(priority = 8, enabled = false)
    public void testClickOnShoulderBag() {
        ebay = new EbayFashion();
        ebay.navigateToShoulderBag();
        assertEqualsGetTextUsingXpath("CHANEL Bags & Handbags for Women", WEB_ELEMENT_CHANEL_HEADER);
    }

    //TEST 9-fix
    @Test(priority = 9, enabled = false)
    public void testLargeSize() {
        ebay = new EbayFashion();
        ebay.navigateToLargeSize();
        assertEqualsGetTextUsingXpath("CHANEL Bags & Handbags for Women", WEB_ELEMENT_CHANEL_HEADER);
    }

    //TEST 10
    @Test(priority = 10, enabled = false)
    public void testHoverOverFashion() throws InterruptedException {
        ebay = new EbayFashion();
        ebay.hoverOverFashion();
        assertEqualsGetAttribute("hl-cat-nav__js-tab hl-cat-nav__js-show", WEB_ELEMENT_FASHION,"class");
    }
    //TEST 11
    @Test(priority = 11, enabled = false)
    public void testHoverAndClickWatches(){
        ebay = new EbayFashion();
        ebay.hoverAndClickWatches();
        softAssertAssertEqualsGetCurrentURL("https://www.ebay.com/b/Watches-Parts-Accessories/260324/bn_2408535/");
    }
    //TEST 12
    @Test(priority = 12, enabled = false)
    public void testSearchDiamondRing() throws AWTException, InterruptedException {
        ebay = new EbayFashion();
        ebay.searchForDiamondRing();
        assertEqualsGetAttribute("Diamond ring",WEB_ELEMENT_FASHION_SEARCH,"value");
    }

    }

