package testEspnPlusAR;

import common.BaseAPI;
import espnPlusAR.EspnPlus;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestEspnPlus extends BaseAPI {


    @Test(priority = 1, enabled = false)
    public void testEspnPlus(){
        EspnPlus espn = new EspnPlus();
        espn.navigateToEspnPlus();
        String actualResult = driver.getTitle();
        String expectedResult = "https://www.espn.com/espnplus/";

        Assert.assertEquals(actualResult, expectedResult, "PAGE NOT FOUND");
    }

    @Test(priority = 2, enabled = false)
    public void testFeatured() {
        EspnPlus espn = new EspnPlus();
        espn.navigateToFeatured();
        softAssertAssertEqualsGetCurrentURL("https://www.espn.com/espnplus/");
    }

    @Test(priority = 2, enabled = true)
    public void testOriginals(){
        EspnPlus espn = new EspnPlus();
        espn.navigateToOriginals();
        String actualResult = driver.getTitle();
        String expectedResult = "Watch ESPN Originals";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    @Test(priority = 3,enabled = false)
    public void testTrailers(){
        EspnPlus espn = new EspnPlus();
        espn.navigateToTrailers();
        softAssertAssertEqualsGetCurrentURL("https://www.espn.com/espnplus/collections/24971/trailers");
    }

    @Test(priority = 3,enabled = false)
    public void testBrowseBasketBall(){
        EspnPlus espn = new EspnPlus();
        espn.browseToBasketBall();
        softAssertAssertEqualsGetCurrentURL("https://www.espn.com/espnplus/catalog/cd70a58e-a830-330c-93ed-52360b51b632/basketball#bucketId=29446&sourceCollection=Featured_Sports_");
    }


    @Test (enabled = false)
    public void testVerifyPageTitle(){
        EspnPlus espn = new EspnPlus();
        espn.navigateToEspnPlus();
        espn.navigateToOriginals();
        String exp = "Watch ESPN Originals";
        String act = driver.getTitle();
        //Compares 2 Strings -->equalsIgnoreCase will Compare Strings even if in upper or lower case
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

    @Test (enabled = false)
    public void testPageTitleInspection() {
        String expectedTitle = "";
        String actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        softAssert.assertNotSame(actualTitle, expectedTitle);
        softAssert.assertAll();


    }

















