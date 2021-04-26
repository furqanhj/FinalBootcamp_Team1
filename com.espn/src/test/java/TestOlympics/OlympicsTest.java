package TestOlympics;

import OlympicsMA.OlympicsLocators;
import OlympicsMA.OlympicsPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OlympicsTest extends BaseAPI {

    OlympicsPage olympicsPage;

    // Test 1

    @Test (enabled = true,priority = 1)
    public void testClickWatch (){
        olympicsPage = new OlympicsPage();
        olympicsPage. clickWatch();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Olympic Sports Schedule, News, and Results - Olympic Games - ESPN";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 2
    @Test (enabled = false,priority = 2)
    public void testDropDownSport (){
        olympicsPage = new OlympicsPage();
        olympicsPage.dropDownSport();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "2018 Winter Olympics Sports - ESPN";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 3
    @Test (enabled = false,priority = 3)
    public void testSignup (){
        olympicsPage = new OlympicsPage();
        olympicsPage.signUp();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Olympic Sports Schedule, News, and Results - Olympic Games - ESPN";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 4
    @Test (enabled = false,priority = 4)
    public void testLogin (){
        olympicsPage = new OlympicsPage();
        olympicsPage.logIn();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Olympic Sports Schedule, News, and Results - Olympic Games - ESPN";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    // Test 5
    @Test (enabled = false,priority = 5)
    public void testContactUs (){
        olympicsPage = new OlympicsPage();
        olympicsPage.contactUs();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Contact ESPN";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
}
