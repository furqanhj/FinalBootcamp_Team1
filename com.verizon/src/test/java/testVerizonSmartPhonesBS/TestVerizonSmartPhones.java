package testVerizonSmartPhonesBS;

import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizonSmartPhonesBS.VerizonSmartPhones;

public class TestVerizonSmartPhones extends BaseAPI {

    VerizonSmartPhones verizon;

    //TEST 1
    @Test(priority = 1, enabled = true)
    public void testNavigateToSmartPhones() {
        verizon = new VerizonSmartPhones();
        verizon.navigateToSmartPhones();
        String exp = "5G Smartphones | Get it at Verizon";
        String act = driver.getTitle();

        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

    //TEST 2
    @Test(priority = 1, enabled = false)
    public void testClickOnIphone() {
        verizon = new VerizonSmartPhones();
        verizon.navigateAndClickOnIphone();
        String exp = "New Apple iPhone 12 Pro Max: Features, Price & Colors | Shop Now";
        String act = driver.getTitle();

        Assert.assertTrue(exp.equalsIgnoreCase(act));


    }
}
