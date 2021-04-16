package testEbaySignInPageFJ;

import common.BaseAPI;
import ebayHomepageFJ.EbayHomepage;
import org.testng.Assert;
import org.testng.annotations.Test;

// TOTAL TEST CASES = 2
public class TestEbaySignInPage extends BaseAPI {

    EbayHomepage ebayHomepage;

    //TestCase#1: Test login using valid credentials
    @Test(priority = 1, enabled = false)
    public void testDoValidLogin() {
        ebayHomepage = new EbayHomepage();
        ebayHomepage.navigateToSignInPage().doValidLogin(properties.getProperty("EbayUsername"));
    }

    //TestCase#2: Navigate back to homepage, validate with current URL method.
    @Test
    public void testReturnToHomepage() {
        ebayHomepage = new EbayHomepage();
        ebayHomepage.navigateToSignInPage().returnToHomepage();

        String expectedURL = "https://www.ebay.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL, "URL DO NOT MATCH");
    }
}
