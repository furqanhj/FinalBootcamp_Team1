package testESPNHomepageFJ;

import common.BaseAPI;
import espnHomepageFJ.ESPNHomepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestESPNHomepage extends BaseAPI {

    ESPNHomepage homepage;

    //TestCase#1: navigate to Cricinfo page, validate via logo present
    @Test (priority = 1, enabled = true)
    public void testNavigateToCricketPage(){
        homepage = new ESPNHomepage();
        homepage.navigateToCricketPage();

        Assert.assertTrue(isElementDisplayed(homepage.actualLogoOnCricinfoPage));
    }

}
