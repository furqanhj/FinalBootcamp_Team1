package testChaseBusinessBS;

import chaseBusinessBS.ChaseBusiness;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChaseBusiness extends BaseAPI {

    ChaseBusiness chase;

    //Test #1
    @Test(enabled = true)
    public void testSideMenuOptions(){
        chase = new ChaseBusiness();
        chase.sideMenuOptions();
        String actualResult = BaseAPI.driver.getCurrentUrl();
        String expectedResult = "https://www.chase.com/business/sitemap";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

}
