package testMacysWeddingRegistryBS;

import common.BaseAPI;
import macysWeddingRegistryBS.MacysWeddingRegistry;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class TestMacysWeddingRegistry extends BaseAPI {

    MacysWeddingRegistry macys;

    //TEST 1
    @Test(priority = 1, enabled = false)
    public void testNavigateToWeddingRegistry() {
        macys = new MacysWeddingRegistry();
        macys.navigateToWeddingRegistry();
        softAssertAssertEqualsGetCurrentURL("https://www.macys.com/s/registry-top-reasons/");
    }

    //TEST 2
    @Test(priority = 2, enabled = false)
    public void testFindARegistry() throws AWTException {
        macys = new MacysWeddingRegistry();
        macys.searchWeddingRegistry();
        softAssertAssertEqualsGetCurrentURL("https://www.macys.com/s/registry-top-reasons/");
    }

    //TEST 3
    @Test(priority = 3, enabled = true)
    public void testWeddingRegistryPerks(){
        macys = new MacysWeddingRegistry();
        macys.navigateToWeddingRegistryPerks();
        String exp = "Wedding & Registry - Macy's";
        String act = driver.getTitle();

        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

}