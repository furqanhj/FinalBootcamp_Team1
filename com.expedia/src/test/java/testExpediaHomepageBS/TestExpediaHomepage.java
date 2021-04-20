package testExpediaHomepageBS;

import common.BaseAPI;
import expediaHomepageBS.ExpediaHomepage;
import org.testng.annotations.Test;

public class TestExpediaHomepage extends BaseAPI {

    ExpediaHomepage expedia;

    //TEST 1
    @Test(priority = 1, enabled = false)
    public void testBookNow() {
        expedia = new ExpediaHomepage();
        expedia.clickOnBookNow();
        softAssertAssertEqualsGetCurrentURL("https://www.expedia.com/lp/b/beach-getaways");
    }

    //TEST 2
    @Test(priority = 2, enabled = false)
    public void testTakeALook() {
        expedia = new ExpediaHomepage();
        expedia.clickOnTakeALook();
        softAssertAssertEqualsGetCurrentURL("https://www.expedia.com/lp/b/unique-beaches");
    }

    //TEST 3
    @Test(priority = 3, enabled = true)
    public void testDiscoverMore() {
        expedia = new ExpediaHomepage();
        expedia.clickOnTakeALook();
        expedia.navigateToDiscoverMore();
        softAssertAssertEqualsGetCurrentURL("https://www.expedia.com/gmp/19631?pwaLob=wizard-hotel-pwa");
    }

}
