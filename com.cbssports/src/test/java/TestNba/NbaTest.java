package TestNba;

import NbaMA.NbaHomePage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NbaTest extends BaseAPI {

    NbaHomePage nbaHomePage;

    // Test 1
    @Test (enabled = false,priority = 1)
    public void testClickScores (){
        nbaHomePage = new NbaHomePage();
        nbaHomePage . clickScores();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "NBA Game Scores - CBSSports.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    // Test 2
    @Test (enabled = false,priority = 2)
    public void testVerifyStandings (){
        nbaHomePage = new NbaHomePage();
        nbaHomePage. verifyStandings();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "2020-21 NBA Basketball Standings - CBSSports.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    //Test 3
    @Test (enabled = false,priority = 3)
    public void testCheckSchedule (){
        nbaHomePage = new NbaHomePage();
        nbaHomePage. checkSchedule();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "2020-21 NBA Schedule - National Basketball Association - CBSSports.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 4
    @Test (enabled = false,priority = 4)
    public void testSortTeams (){
        nbaHomePage = new NbaHomePage();
        nbaHomePage.sortTeams();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "NBA Teams - Schedules, Rosters, Stats - CBSSports.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 5
    @Test (enabled = false,priority = 5)
    public void testCountStats (){
        nbaHomePage = new NbaHomePage();
        nbaHomePage.countStats();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "NBA Stat Leaders 2020-21 regular season - Top basketball players - CBSSports.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 6
    @Test (enabled = false,priority = 6)
    public void testClickOdds (){
        nbaHomePage = new NbaHomePage();
        nbaHomePage. clickOdds();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "NBA Stat Leaders 2020-21 regular season - Top basketball players - CBSSports.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 7
    @Test (enabled = false,priority = 7)
    public void testDropDownNbaScores (){
        nbaHomePage = new NbaHomePage();
        nbaHomePage .dropDownNbaScores();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "NBA Stat Leaders 2020-21 regular season - Top basketball players - CBSSports.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 8
    @Test (enabled = false,priority = 8)
    public void testCheckPodcasts (){
        nbaHomePage = new NbaHomePage();
        nbaHomePage . checkPodcasts();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "NBA Stat Leaders 2020-21 regular season - Top basketball players - CBSSports.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 9
    @Test (enabled = false,priority = 9)
    public void testAboutUS (){
        nbaHomePage = new NbaHomePage();
        nbaHomePage . aboutUs();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "NBA Stat Leaders 2020-21 regular season - Top basketball players - CBSSports.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }


}
