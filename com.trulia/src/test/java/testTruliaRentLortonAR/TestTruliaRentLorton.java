package testTruliaRentLortonAR;

import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import truliaRentLortonAR.TruliaRentLorton;

import static truliaRentLortonAR.TruliaRentLortonWebElements.*;

public class TestTruliaRentLorton extends BaseAPI {

    @Test(enabled = false)
    public void testClickRentButton() throws InterruptedException {
        TruliaRentLorton truliaRentLorton = new TruliaRentLorton();
        truliaRentLorton.clickRentButton();
        Assert.assertEquals((driver.getTitle()), "Rental Listings in Your Neighborhood | Trulia.com");
        //assertEqualsGetTitle("Rental Listings in Your Neighborhood | Trulia.com");
    }

    @Test(enabled = false)
    public void testTypeInLocationSearchBox() {
        TruliaRentLorton truliaRentLorton = new TruliaRentLorton();
        truliaRentLorton.TypeInLocationSearchBox();
        implicitWait(20);
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_GOOGLE_MAP));
    }


    @Test(enabled = false)
    public void testClickSaveSearchButton() {
        TruliaRentLorton truliaRentLorton = new TruliaRentLorton();
        truliaRentLorton.clickSaveSearchButton();
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_SIGN_IN_WINDOW));
    }

    @Test(enabled = false)
    public void testCatsAllowedCheckBox() {
        TruliaRentLorton truliaRentLorton = new TruliaRentLorton();
        truliaRentLorton.checkCatsAllowedCheckBox();
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_PETS_1_BUTTON));
    }

    @Test(enabled = false)
    public void testVerifyPageTitle() throws InterruptedException {
        TruliaRentLorton truliaRentLorton = new TruliaRentLorton();
        truliaRentLorton.clickRentButton();
        String exp = "Rental Listings in Your Neighborhood | Trulia.com";
        String act = driver.getTitle();
        //Compares 2 Strings -->equalsIgnoreCase will Compare Strings even if in upper or lower case
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }
}