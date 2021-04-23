package testMacysDealsAR;

import common.BaseAPI;
import macysDealsAR.MacysDeals;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static macysDealsAR.MacysDealsWebElements.*;

public class TestMacysDeals extends BaseAPI {


    @Test(enabled = false)
    public void testNavigateToDealsPage() {
        MacysDeals macysDeals = new MacysDeals();
        macysDeals.navigateToDealsPage();
        assertEqualsGetText("Offers", "WEB_ELEMENT_OFFERS_HEADER");
    }


    @Test(enabled = false)
    public void testVerifyPageTitle() {
        MacysDeals macysDeals = new MacysDeals();
        macysDeals.navigateToDealsPage();
        String exp = "Macy's Coupons, Deals and Promotions - SAVE NOW!";
        String act = driver.getTitle();
        //Compares 2 Strings -->equalsIgnoreCase will Compare Strings even if in upper or lower case
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

    @Test(enabled = false)
    public void testPageTitleInspection() {
        MacysDeals macysDeals = new MacysDeals();
        macysDeals.clickFindOutMoreLink();
        String expectedTitle = "My Wallet - Manage Offers & Payment Options - Macy's";
        String actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        softAssert.assertNotSame(actualTitle, expectedTitle);
        softAssert.assertAll();
    }

    @Test(enabled = false)
    public void testNavigateToAllWomensClothingDeals() throws InterruptedException {
        MacysDeals macysDeals = new MacysDeals();
        macysDeals.navigateToAllWomensClothingDeals();
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_WOMEN_DROP_DOWN_OPTION));
    }

    @Test(enabled = false)
    public void testTypeInDealsPageSearchBox() throws InterruptedException {
        MacysDeals macysDeals = new MacysDeals();
        macysDeals.typeInDealsPageSearchBox();
        Assert.assertTrue(isTitleTrue("Access Denied"));
        //assertEqualsGetTitle("Access Denied");
    }
    @Test (enabled = false)
    public void testVerifyWalletImage(){
        MacysDeals macysDeals = new MacysDeals();
        macysDeals.verifyWalletImage();

    }
}