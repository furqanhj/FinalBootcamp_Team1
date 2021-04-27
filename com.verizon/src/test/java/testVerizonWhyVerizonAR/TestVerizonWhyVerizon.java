package testVerizonWhyVerizonAR;

import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import verizonWhyVerizonAR.VerizonWhyVerizon;

import static verizonWhyVerizonAR.VerizonWhyVerizonWebElements.*;

public class TestVerizonWhyVerizon extends BaseAPI {


    @Test(enabled = false)
    public void testWhyVerizonPageHeader() {
        VerizonWhyVerizon whyVerizon = new VerizonWhyVerizon();
        whyVerizon.verifyWhyVerizonPageHeader();
        Assert.assertEquals(getTextFromElement(WEB_ELEMENT_WHY_VERIZON_PAGE_HEADER), "Why Verizon");
    }

    @Test(enabled = false)
    public void testWhyVerizonOverviewTitle() {
        VerizonWhyVerizon whyVerizon = new VerizonWhyVerizon();
        whyVerizon.verifyWhyVerizonOverviewTitle();
        Assert.assertTrue(isTitleTrue("Best Phone Carrier, Best Wireless, Best Internet & TV | Why Verizon"));
    }

    @Test(enabled = false)
    public void testWhyVerizonOverviewImage() {
        VerizonWhyVerizon whyVerizon = new VerizonWhyVerizon();
        whyVerizon.verifyWhyVerizonOverviewImage();
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_WHY_VERIZON_OVERVIEW_IMAGE));
    }

    @Test(enabled = false)
    public void testNetworkLinkSubmenu() {
        VerizonWhyVerizon whyVerizon = new VerizonWhyVerizon();
        whyVerizon.verifyNetworkLinkSubmenu();
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_NETWORK_SUBMENU));
    }

    @Test(enabled = false)
    public void testVerifyPageTitle() throws InterruptedException {
        VerizonWhyVerizon whyVerizon = new VerizonWhyVerizon();
        whyVerizon.verifyWhyVerizonOverviewTitle();
        String exp = "Best Phone Carrier, Best Wireless, Best Internet & TV | Why Verizon";
        String act = driver.getTitle();
        //Compares 2 Strings -->equalsIgnoreCase will Compare Strings even if in upper or lower case
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

    @Test(enabled = false)
    public void testPageTitleInspection() {
        VerizonWhyVerizon whyVerizon = new VerizonWhyVerizon();
        whyVerizon.verifyWhyVerizonOverviewTitle();
        String expectedTitle = "Best Phone Carrier, Best Wireless, Best Internet & TV | Why Verizon";
        String actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        softAssert.assertNotSame(actualTitle, expectedTitle);
        softAssert.assertAll();

    }

}
