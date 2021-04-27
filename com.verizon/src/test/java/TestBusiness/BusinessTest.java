package TestBusiness;

import BusinessMA.BusinessPage;
import common.BaseAPI;
import io.cucumber.java.af.En;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BusinessTest extends BaseAPI {

    BusinessPage business;

    //Test 1
    @Test (enabled = false,priority = 1)
    public void testDropDownProduct (){
        business = new BusinessPage();
        business.clickDeals();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Business Products | Verizon";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 2
    @Test (enabled = false,priority = 2)
    public void testVerifyStores (){
        business = new BusinessPage();
        business. verifyStores();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Find & Locate Verizon Stores in Your Area | Verizon";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 3
    @Test (enabled = false,priority = 3)
    public void testWhyVerizon (){
        business = new BusinessPage();
        business. whyVerizon();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Why Verizon | Verizon";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 4
    @Test (enabled = false,priority = 4)
    public void testRequestACall (){
        business = new BusinessPage();
        business. requestACall();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Contact Us | Verizon";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 5
    @Test (enabled = false,priority = 5)
    public void testAboutUS (){
        business = new BusinessPage();
        business. aboutUs();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Official Verizon Corporate Web site | About Verizon";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

  ////////////////////////////////////////////////////////////////////

    //Test 6
    @Test (enabled = false,priority = 6)
    public void testSeeOurSolutions (){
        business = new BusinessPage();
        business.seeOurSolutions();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Business Technology Solutions | Verizon";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 7
    @Test (enabled = false,priority = 7)
    public void testPublicSector (){
        business = new BusinessPage();
        business.publicSector();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Public Sector Solutions | Verizon";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 8
    @Test (enabled = false,priority = 8)
    public void testClickPlans (){
        business = new BusinessPage();
        business.clickPlans();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Plans for Business: Phone, Internet, Data, Security & More | Verizon";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 9

    @Test (enabled = false,priority = 9)
    public void testVerizonBusinessDeals (){
        business = new BusinessPage();
        business.verizonBusinessDeals();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Business Phone Deals and More | Verizon";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 10
    @Test (enabled = false,priority = 10)
    public void testNavigateNews (){
        business = new BusinessPage();
        business.navigateNews();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "https://www.verizon.com/about/news-center";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
}
