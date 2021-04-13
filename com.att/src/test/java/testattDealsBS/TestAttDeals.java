package testattDealsBS;

import attDealsBS.AttDeals;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAttDeals extends BaseAPI {

    AttDeals attDealsBS;

    //Test #1
    @Test(enabled = false)
    public void testNavigateToDealsPage() {
        attDealsBS = new AttDeals();
        attDealsBS.navigateToDealsPage();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Deals on Phones, Wireless Plans, Internet & TV Services";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test #2
    @Test(enabled = false)
    public void testNavigateToWirelessPage() {
        attDealsBS = new AttDeals();
        attDealsBS.navigateToDealsPage();
        attDealsBS.navigateToWirelessPage();

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Phone Deals & Wireless Offers from AT&T";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test #3
    @Test(enabled = false)
    public void testNavigateToExploreWirelessPage(){
        attDealsBS = new AttDeals();
        attDealsBS.navigateToDealsPage();
        attDealsBS.navigateToWirelessPage();
        attDealsBS.navigateToExploreWirelessPage();

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Wireless – Latest Phones & Best Wireless Plans";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test #4
    @Test(enabled = true)
    public void testNavigateToInternetAndTvShopNow(){
        attDealsBS = new AttDeals();
        attDealsBS.navigateToDealsPage();
        attDealsBS.navigateToInternetAndTvPage();
        attDealsBS.navigateToShopNowPage();

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Shop AT&T Bundles";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test #5

}















