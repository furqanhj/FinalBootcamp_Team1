package testChaseHomePageMA;

import Homepage.MA.ChaseHomePage;
import common.BaseAPI;
import org.apache.commons.math3.stat.inference.OneWayAnova;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChaseHomePage extends BaseAPI {

    ChaseHomePage chase;

    //Test 1

    @Test (enabled = false,priority = 1)
    public void testClickSignIn(){
        chase = new ChaseHomePage();
        chase.clickSignIn();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Chase Online";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 2

    @Test (enabled = false,priority = 2)
    public void testOpenAnAccount (){
        chase = new ChaseHomePage();
        chase. setClickOpenAccount();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "$225 Chase Checking | Chase";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    //Test 3

    @Test (enabled = false, priority = 3)
    public void verifyCreditCard (){
        chase = new ChaseHomePage();
        chase. verifyCreditCard();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Credit Cards - Compare Credit Card Offers and Apply Online | Chase";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    //Test 4
    @Test (enabled = false,priority = 4)
    public void clickSearchBar (){
        chase = new ChaseHomePage();
        chase. setClickSearchBar();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    //Test 5
    @Test (enabled = false, priority = 5)
    public void clickPrivacy (){
        chase = new ChaseHomePage();
        chase.clickPrivacy();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Security Center | Privacy & Security | Chase.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    // Test 6
    @Test (enabled = false,priority = 6)
    public void testNavigateBusiness (){
        chase = new ChaseHomePage();
        chase . navigateBusiness();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Security Center | Privacy & Security | Chase.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 7
    @Test (enabled = false, priority = 7)
    public void testClickChecking (){
        chase = new ChaseHomePage();
        chase . clickChecking();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Security Center | Privacy & Security | Chase.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 8
    @Test (enabled = false,priority = 8)
    public void testSavings (){
        chase = new ChaseHomePage();
        chase . savings();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Security Center | Privacy & Security | Chase.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 9
    @Test (enabled = false, priority = 9)
    public void testHomeLoans (){
        chase = new ChaseHomePage();
        chase . navigateHomeLoans();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Security Center | Privacy & Security | Chase.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 10
    @Test (enabled = false,priority = 10)
    public void testCareers (){
        chase = new ChaseHomePage();
        chase . careers();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Security Center | Privacy & Security | Chase.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");



    }
}
