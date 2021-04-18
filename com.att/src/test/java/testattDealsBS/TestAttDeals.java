package testattDealsBS;

import attDealsBS.AttDeals;
import common.BaseAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static attDealsBS.AttDealsWebElements.*;

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
    public void testNavigateToExploreWirelessPage() {
        attDealsBS = new AttDeals();
        attDealsBS.navigateToDealsPage();
        attDealsBS.navigateToWirelessPage();
        attDealsBS.navigateToExploreWirelessPage();

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Wireless – Latest Phones & Best Wireless Plans";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test #4
    @Test(enabled = false)
    public void testNavigateToInternetAndTvShopNow() {
        attDealsBS = new AttDeals();
        attDealsBS.navigateToDealsPage();
        attDealsBS.navigateToInternetAndTvPage();
        attDealsBS.navigateToShopNowPage();

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Shop AT&T Bundles";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test #5
    @Test(enabled = false)
    public void testAccessoriesHeaderDisplays() {
        attDealsBS = new AttDeals();
        attDealsBS.accessoriesHeaderDisplays();
        boolean act = driver.findElement(By.xpath(WEB_ELEMENT_ACCESSORIES)).isEnabled();
        Assert.assertTrue(act);
    }

    //Test #6
    @Test(enabled = false)
    public void testHeadphonesHeaderDisplays() {
        attDealsBS = new AttDeals();
        attDealsBS.headphonesHeaderDisplays();
        boolean act = driver.findElement(By.xpath(WEB_ELEMENT_HEADPHONES)).isSelected();
        Assert.assertFalse(act);
    }

    //Test #7
    @Test(enabled = false)
    public void testCasesDisplays() {
        attDealsBS = new AttDeals();
        attDealsBS.casesHeaderDisplays();
        boolean act = driver.findElement(By.xpath(WEB_ELEMENT_CASES)).isDisplayed();
        Assert.assertTrue(act);
    }

    //Test #8
    @Test(enabled = false)
    public void testChargersHeaderDisplays() {
        attDealsBS = new AttDeals();
        attDealsBS.chargersHeaderDisplays();
        boolean act = driver.findElement(By.xpath(WEB_ELEMENT_CHARGERS)).isSelected();
        Assert.assertFalse(act);
    }

    //Test #9
    @Test(enabled = true)
    public void testIphone12Search() throws InterruptedException {
        attDealsBS = new AttDeals();
        attDealsBS.searchForIphone12();
        assertEqualsGetAttribute("IPhone 12", WEB_ELEMENT_IPHONE12_SEARCH, "value");

    }

    //Test #10
    @Test(enabled = true)
    public void testIphone12ProMaxSearch() throws InterruptedException {
        attDealsBS = new AttDeals();
        attDealsBS.searchForIphone12ProMax();
        assertEqualsGetAttribute("IPhone 12 Pro max", WEB_ELEMENT_IPHONE12PRO_MAX_SEARCH, "value");
    }


}















