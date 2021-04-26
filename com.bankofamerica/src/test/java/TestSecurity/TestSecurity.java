package TestSecurity;

import SecurityMA.SecurityPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Security;

public class TestSecurity extends BaseAPI {

    SecurityPage security;


    // Test 1

    @Test (enabled = false, priority = 1)
    public void testClickDropMenu(){
        security = new SecurityPage();
        security.clickDropMenu();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Bank of America Privacy Notices and Policies";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");


    }


    // Test 3
    @Test (enabled = false,priority = 3)
    public void testVerifyCareersLink (){
        security = new SecurityPage();
        security.verifyCareersClick();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Bank of America Careers Site - Apply at Bank of America";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    // Test 3
    @Test (enabled = false,priority = 3)
    public void testLinkSearchBar (){
        security = new SecurityPage();
        security.linkSearchBar();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Privacy & Security Center at Bank of America";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 4
    @Test (enabled = true,priority = 4)
    public void testFraudProtectionClick (){
        security = new SecurityPage();
        security.fraudProtectionClick();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "How to Recognize and Prevent Bank Fraud to Avoid Becoming a Victim";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    // Test 5
    @Test (enabled = false,priority = 5)
    public void testNavigateCareers (){
        security = new SecurityPage();
        security . navigateCareers();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Bank of America Careers Site - Apply at Bank of America";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 6
    @Test (enabled = false,priority = 6)
    public void testClickSitemap (){
        security = new SecurityPage();
        security .clickSitemap();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Bank of America Personal Banking Site Map";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

}
