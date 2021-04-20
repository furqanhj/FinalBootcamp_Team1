package testMercedesAllVehiclesBS;

import common.BaseAPI;
import mercedesAllVehiclesBS.MercedesAllVehicles;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class TestMercedesAllVehicles extends BaseAPI {

MercedesAllVehicles mercedes;

//TEST 1
    @Test(priority = 1, enabled = false)
    public void testNavigateToAllVehicles(){
        mercedes = new MercedesAllVehicles();
        mercedes.navigateToAllVehicles();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.mbusa.com/en/all-vehicles";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //TEST 2
    @Test(priority = 2, enabled = false)
    public void testClickSedanAClass(){
        mercedes = new MercedesAllVehicles();
        mercedes.clickOnAClassSedan();
        String actualResult = driver.getTitle();
        String expectedResult = "A-Class Sedan | Mercedes-Benz USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
}
    //TEST 3
    @Test(priority = 3,enabled = true)
    public void testZipCodeSearch() throws AWTException {
        mercedes = new MercedesAllVehicles();
        mercedes.searchByZipcode();
        softAssertAssertEqualsGetCurrentURL("Mercedes Inventory | Mercedes Benz");
    }


}
