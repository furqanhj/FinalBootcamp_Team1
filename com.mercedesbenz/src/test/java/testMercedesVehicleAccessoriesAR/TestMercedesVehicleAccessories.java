package testMercedesVehicleAccessoriesAR;

import common.BaseAPI;
import mercedesVehicleAccessoriesAR.MercedesVehicleAccessories;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static mercedesVehicleAccessoriesAR.MercedesVehicleAccessoriesWebElements.*;

public class TestMercedesVehicleAccessories extends BaseAPI {

    @Test(enabled = false)
    public void testNavigateToVehicleAccessoriesPage() {
        MercedesVehicleAccessories mercedesVehicleAccessories = new MercedesVehicleAccessories();
        mercedesVehicleAccessories.navigateToVehicleAccessoriesPage();
       //boolean and title
        Assert.assertTrue(isTitleTrue("Mercedes-Benz Accessories | Mercedes-Benz USA"));
        //assertEqualsGetTitle("Mercedes-Benz Accessories | Mercedes-Benz USA");
    }

    @Test(enabled = false)
    public void testVerifyPageTitle() {
        MercedesVehicleAccessories mercedesVehicleAccessories = new MercedesVehicleAccessories();
        mercedesVehicleAccessories.navigateToVehicleAccessoriesPage();
        String exp = "MERCEDES-BENZ ACCESSORIES | MERCEDES-BENZ USA";
        String act = driver.getTitle();
        //Compares 2 Strings -->equalsIgnoreCase will Compare Strings even if in upper or lower case
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

    @Test(enabled = false)
    public void testPageTitleInspection() {
        MercedesVehicleAccessories mercedesVehicleAccessories = new MercedesVehicleAccessories();
        mercedesVehicleAccessories.clickScheduleInstallationLink();
        String expectedTitle = "Find a Mercedes-Benz Dealer | Mercedes-Benz USA";
        String actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        softAssert.assertNotSame(actualTitle, expectedTitle);
        softAssert.assertAll();
    }
    @Test (enabled = false)
    public void testClickPurchaseOnlineLink(){
        MercedesVehicleAccessories mercedesVehicleAccessories = new MercedesVehicleAccessories();
        mercedesVehicleAccessories.clickPurchaseOnlineLink();
        Assert.assertEquals(getTextFromElement(WEB_ELEMENT_PURCHASE_ONLINE_HEADER),"Purchase Online");
        //assertEqualsGetText("Purchase Online", WEB_ELEMENT_PURCHASE_ONLINE_HEADER);
    }
    @Test (enabled = false)
    public void testClickShopNowNSwitchTabs(){
        MercedesVehicleAccessories mercedesVehicleAccessories = new MercedesVehicleAccessories();
        mercedesVehicleAccessories.clickShopNowNSwitchTabs();
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_REPLACEMENT_PARTS_HEADER));
    }
    @Test (enabled = false)
    public void testBrowseAllAvailableAccessoriesHeader(){
        MercedesVehicleAccessories mercedesVehicleAccessories = new MercedesVehicleAccessories();
        mercedesVehicleAccessories.verifyBrowseAllAvailableAccessoriesHeader();
        Assert.assertEquals(getTextFromElement(WEB_ELEMENT_BROWSE_ACCESSORIES_HEADER),"Browse All Available Accessories");
    }
}