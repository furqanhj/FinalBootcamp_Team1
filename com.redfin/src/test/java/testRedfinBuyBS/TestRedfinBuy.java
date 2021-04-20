package testRedfinBuyBS;

import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import redfinBuyBS.RedfinBuy;



public class TestRedfinBuy extends BaseAPI {

    RedfinBuy redfin;


    //TEST 1
    @Test(priority = 1, enabled = false)
    public void testNavigateToBuyPage() {
        redfin = new RedfinBuy();
        redfin.navigateToBuyPage();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.redfin.com/houses-near-me";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //TEST 2
    @Test(priority = 2, enabled = false)
    public void testHoverOverBuy() {
        redfin = new RedfinBuy();
        redfin.hoverOverBuyLink();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.redfin.com/";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    //TEST 3
    @Test(priority = 3, enabled = true)
    public void testLocationSearch(){
        redfin = new RedfinBuy();
        redfin.locationSendKeys();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.redfin.com/houses-near-me";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

}
