package TestThe8;

import The8MA.The8Page;
import common.BaseAPI;
import io.cucumber.java.af.En;
import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import org.testng.annotations.Test;

public class The8Test extends BaseAPI {

    The8Page the8Page;

    // Test 1
    @Test (enabled = true,priority = 1)
    public void testExplore (){
        the8Page = new The8Page();
        the8Page. clickExplore();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "8 Series Luxury Sports Coupe | BMW USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 2
    @Test (enabled = false,priority = 2)
    public void testGetAQuote (){
        the8Page = new The8Page();
        the8Page. getAQuote();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Request a Quote - Pricing, Offers & Product Information - BMW USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 3
    @Test (enabled = false,priority = 3)
    public void testDropDownShopping (){
        the8Page = new The8Page();
        the8Page. dropDownShopping();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "8 Series Overview | BMW USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 4
    @Test (enabled = false,priority = 4)
    public void testBuildYourOwn (){
        the8Page = new The8Page();
        the8Page.buildYourOwn();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Build Your Own – Start Here – Choose A Series – BMW USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 5
    @Test (enabled = false,priority = 5)
    public void testShopNewInventory (){
        the8Page = new The8Page();
        the8Page.shopYourNewInventory();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Find Your New BMW Luxury Vehicle Online | BMW USA - Loading";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 6
    @Test (enabled = false,priority = 6)
    public void testApplyForFinancing (){
        the8Page = new The8Page();
        the8Page. applyForFinancing();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Apply for Financing - BMW Credit Application";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 7
    @Test (enabled = false,priority = 7)
    public void testShopOnline (){
        the8Page = new The8Page();
        the8Page . shopOnline();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Shop From Home – Online Retail Experience | BMW USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 8

    @Test (enabled = false,priority = 8)
    public void testClickConceptVehicles (){
        the8Page = new The8Page();
        the8Page . clickConceptVehicles();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Shop From Home – Online Retail Experience | BMW USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 9
    @Test (enabled = false,priority = 9)
    public void testBmwCertified (){
        the8Page = new The8Page();
        the8Page. bmwCertified();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Shop From Home – Online Retail Experience | BMW USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 10
    @Test (enabled = false,priority = 10)
    public void testEstimatePayment (){
        the8Page = new The8Page();
        the8Page .estimatePayment();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Shop From Home – Online Retail Experience | BMW USA";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

}
