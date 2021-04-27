package testCruisesPageAB;

import common.BaseAPI;
import cruisesPageAB.CruisesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCruisesPage extends BaseAPI {
    CruisesPage cruisesPage;

    @Test(priority = 1)
    public void testCruisesLink() {
        cruisesPage = new CruisesPage();
        cruisesPage.clickCruisesPageLink();
        String actualUrl=driver.getCurrentUrl();
        String expectedRrl="https://www.expedia.com/";

        Assert.assertEquals(actualUrl, expectedRrl,"Did not match");

    }




}
