package testBmwCertifiedBS;

import bmwCertifiedBS.BmwCertified;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static bmwCertifiedBS.BmwCertifiedWebElements.*;

public class TestBmwCertified extends BaseAPI {

    BmwCertified bmw;

    //Test #1
    @Test(enabled = false)
    public void navigateToPreOwnedPage(){
        bmw = new BmwCertified();
        bmw.preOwnedPage();
        String actualResult = BaseAPI.driver.getCurrentUrl();
        String expectedResult = "https://www.bmwusa.com/certified-preowned.html";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test #2
    @Test(enabled = false)
    public void testSpecialOffersPage(){
        bmw = new BmwCertified();
        bmw.specialOffersPage();
        String expectedTitle = "Certified Pre-Owned Luxury Vehicles | BMW USA";
        String actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle);
        softAssert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        softAssert.assertNotSame(actualTitle,expectedTitle);
        softAssert.assertAll();

    }

    //Test #3
    @Test(enabled = false)
    public void testSearchPreOwned(){
        bmw = new BmwCertified();
        bmw.searchPreOwnedByZipcode();
        assertEqualsGetTextUsingXpath("21,130 Vehicles",WEB_ELEMENT_RESULTS);
    }

    //Test #4
    @Test(enabled = false)
    public void testSpecialOffers(){
        bmw = new BmwCertified();
        bmw.specialOffersImportantInfo();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Explore Special Offers and Financing for Your Certified Pre-Owned BMW | BMW USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test #5 (not working)
    @Test(enabled = false)
    public void testImportantInfo500(){
        bmw = new BmwCertified();
        bmw.navigateImportantInfo();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Explore Special Offers and Financing for Your Certified Pre-Owned BMW | BMW USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test #6
    @Test(enabled = false)
    public void testSelectSeries(){
        bmw = new BmwCertified();
        bmw.selectSeries();
        String actualResult = BaseAPI.driver.getCurrentUrl();
        String expectedResult = "https://www.bmwusa.com/vehicles/x-models/x3/sports-activity-vehicle/overview.html";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }
    //Test #7 (not working)
    @Test(enabled = false)
    public void testSelectX3mColor(){
        bmw = new BmwCertified();
        bmw.selectX3mColor();
        String actualResult = BaseAPI.driver.getCurrentUrl();
        String expectedResult = "https://www.bmwusa.com/vehicles/m-models/x3-m/overview.html";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }
    //Test #8
    @Test(enabled = false)
    public void testNavigateToBmwLink(){
        bmw = new BmwCertified();
        bmw.navigateToMyBmwLink();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Certified Pre-Owned Luxury Vehicles | BMW USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }
    //Test #9
    @Test(enabled = true)
    public void testIAgreeButton(){
        bmw = new BmwCertified();
        bmw.clickAgreeButton();
        String expectedTitle = "My BMW";
        String actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle);
        softAssert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        softAssert.assertNotSame(actualTitle,expectedTitle);
        softAssert.assertAll();
    }
    //Test #10
    @Test(enabled = false)
    public void testNeedHelpButton(){
        bmw = new BmwCertified();
        bmw.clickNeedHelpButton();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "My BMW";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }



}
