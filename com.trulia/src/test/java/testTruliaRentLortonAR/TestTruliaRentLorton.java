package testTruliaRentLortonAR;

import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import truliaRentLortonAR.TruliaRentLorton;

import static truliaRentLortonAR.TruliaRentLortonWebElements.*;

public class TestTruliaRentLorton extends BaseAPI {

    @Test(enabled=true)
    public void testClickRentButton() throws InterruptedException {
        TruliaRentLorton truliaRentLorton = new TruliaRentLorton();
        truliaRentLorton.clickRentButton();
        Assert.assertEquals((driver.getTitle()),"Rental Listings in Your Neighborhood | Trulia.com");
        //assertEqualsGetTitle("Rental Listings in Your Neighborhood | Trulia.com");
    }
    @Test (enabled = true)
    public void testTypeInLocationSearchBox(){
        TruliaRentLorton truliaRentLorton = new TruliaRentLorton();
        truliaRentLorton.TypeInLocationSearchBox();
        implicitWait(20);
        Assert.assertEquals(isElementDisplayed(WEB_ELEMENT_GOOGLE_MAP));


    }

}
