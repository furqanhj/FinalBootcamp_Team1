package testBmwCertifiedBS;

import bmwCertifiedBS.BmwCertified;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import static bmwCertifiedBS.BmwCertifiedWebElements.*;

public class TestBmwCertified extends BaseAPI {

    BmwCertified bmw;

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Test #1
    @Test(enabled = false)
    public void testSearchPreOwned(){
        bmw = new BmwCertified();
        bmw.searchPreOwnedByZipcode();
        assertEqualsGetTextUsingXpath("21,130 Vehicles",WEB_ELEMENT_RESULTS);
    }

    //Test #2
    @Test(enabled = false)
    public void testSpecialOffers(){
        bmw = new BmwCertified();
        bmw.specialOffersImportantInfo();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Explore Special Offers and Financing for Your Certified Pre-Owned BMW | BMW USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test #3 (not working)
    @Test(enabled = false)
    public void testImportantInfo500(){
        bmw = new BmwCertified();
        bmw.navigateImportantInfo();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Explore Special Offers and Financing for Your Certified Pre-Owned BMW | BMW USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test #4
    @Test(enabled = false)
    public void testSelectSeries(){
        bmw = new BmwCertified();
        bmw.selectSeries();
        String actualResult = BaseAPI.driver.getCurrentUrl();
        String expectedResult = "https://www.bmwusa.com/vehicles/x-models/x3/sports-activity-vehicle/overview.html";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }
    //Test #5 (not working)
    @Test(enabled = true)
    public void testSelectX3mColor(){
        bmw = new BmwCertified();
        bmw.selectX3mColor();
        String actualResult = BaseAPI.driver.getCurrentUrl();
        String expectedResult = "https://www.bmwusa.com/vehicles/m-models/x3-m/overview.html";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }


}
