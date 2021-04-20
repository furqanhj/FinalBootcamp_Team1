package testTruliaHomepageBS;

import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import truliaHomepageBS.TruliaHomepage;

public class TestTruliaHomepage extends BaseAPI {

    TruliaHomepage trulia;

    //TEST 1
    @Test(priority = 1, enabled = false)
    public void testBuyLink() {
        trulia = new TruliaHomepage();
        trulia.hoverOverBuyLink();
        String exp = "Trulia: Real Estate Listings, Homes For Sale, Housing Data";
        String act = driver.getTitle();

        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

    //TEST 2
    @Test(priority = 2, enabled = false)
    public void testRentLink() {
        trulia = new TruliaHomepage();
        trulia.hoverOverRentLink();
        String exp = "Trulia: Real Estate Listings, Homes For Sale, Housing Data";
        String act = driver.getTitle();

        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

    //TEST 3
    @Test(priority = 3, enabled = true)
    public void testFindAHome() {
        trulia = new TruliaHomepage();
        trulia.clickOnFindAHome();
        String exp = "https://www.trulia.com/houses-for-sale-near-me/";
        String act = driver.getCurrentUrl();

        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }
}