package TestWireless;

import WirelessMA.WirelessPage;
import common.BaseAPI;
import io.cucumber.java.af.En;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WirelessTest extends BaseAPI {

    WirelessPage wirelessPage;

    //Test 1
    @Test (enabled = false,priority = 1)
    public void testClickShopNow (){
        wirelessPage = new WirelessPage();
        wirelessPage.clickShopNow();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Apple iPhone 12 Pro Max 128 GB in Pacific Blue - $700 Off at AT&T";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 2
    @Test (enabled = false,priority = 2)
    public void testPlanAndPrices () {
        wirelessPage = new WirelessPage();
        wirelessPage.planAndPrices ();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Wireless Plans | Official Site";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 3
    @Test (enabled = false,priority = 3)
    public void testVerifyDropDownAccount (){
        wirelessPage = new WirelessPage();
        wirelessPage.verifyDropDownAccount();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Official Site - Unlimited Data Plans, Internet Service, & TV";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 4
    @Test (enabled = false,priority = 4)
    public void testShopAllPhones (){
        wirelessPage = new WirelessPage();
        wirelessPage.setShopAllPhones();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Phones, Cell Phones, & Smartphones from AT&T";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 5
    @Test (enabled = true,priority = 5)
    public void testContactUs (){
        wirelessPage = new WirelessPage();
        wirelessPage.ContactUs();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Customer Service - Phone Numbers & Live Chat";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 6
    @Test (enabled = false,priority = 6)
    public void testBringYourOwn (){
        wirelessPage = new WirelessPage();
        wirelessPage. bringYourOWn();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Bring Your Own Phone (BYOP & BYOD) - $250 Reward Card - AT&T";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }


    // Test 7
    @Test (enabled = false,priority = 7)
    public void testClickSupport (){
        wirelessPage = new WirelessPage();
        wirelessPage. clickSupport();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Customer Service & Support - AT&T Official Site";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

  ///////////////////////////////////////////////

    //Test 8
    @Test (enabled = false,priority = 8)
    public void testWirelessDeals (){
        wirelessPage = new WirelessPage();
        wirelessPage.wirelessDeals();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Customer Service & Support - AT&T Official Site";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 9
    @Test (enabled = false,priority = 9)
    public void testShopAll (){
        wirelessPage = new WirelessPage();
        wirelessPage.shopAll();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Customer Service & Support - AT&T Official Site";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    // Test 10
    @Test (enabled = false,priority = 10)
    public void testAttPrepaid (){
        wirelessPage= new WirelessPage();
        wirelessPage. AttPrepaid();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Customer Service & Support - AT&T Official Site";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }


    // Test 11
    @Test (enabled = false,priority = 11)
    public void testCoverageMaps (){
        wirelessPage = new WirelessPage();
        wirelessPage . coverageMaps();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Customer Service & Support - AT&T Official Site";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }


}
