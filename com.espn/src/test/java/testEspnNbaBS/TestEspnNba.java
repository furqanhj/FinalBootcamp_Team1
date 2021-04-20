package testEspnNbaBS;

import common.BaseAPI;
import espnNbaBS.EspnNba;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class TestEspnNba extends BaseAPI {

    EspnNba espn;

    //Test 1
    @Test(priority = 1,enabled = false)
    public void testNavigateToNbaPage(){
        espn = new EspnNba();
        espn.navigateToNbaPage();
        softAssertAssertEqualsGetCurrentURL("https://www.espn.com/");
    }
    //TEST 2
    @Test(priority = 2, enabled = false)
    public void testNavigateToScoresPage(){
        espn = new EspnNba();
        espn.navigateToScoresPage();
        softAssertAssertEqualsGetCurrentURL("https://www.espn.com/nba/scoreboard");
    }
    //TEST 3
    @Test(priority = 3, enabled = false)
    public void testNavigateToSchedule(){
        espn = new EspnNba();
        espn.navigateToSchedule();
        softAssertAssertEqualsGetCurrentURL("https://www.espn.com/nba/schedule");
    }
    //TEST 4
    @Test(priority = 4,enabled = false)
    public void testNavigateToBrooklynCeltics(){
        espn = new EspnNba();
        espn.navigateToBrooklynCeltics();
        softAssertAssertEqualsGetCurrentURL("https://www.espn.com/nba/team/_/name/bos/boston-celtics");
    }
    //TEST 5
    @Test(priority = 5, enabled = false)
    public void testNavigateToNbaHome(){
        espn = new EspnNba();
        espn.navigateToNbaHome();
        String actualResult = driver.getTitle();
        String expectedResult = "ESPN: Serving sports fans. Anytime. Anywhere.";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //TEST 6
    @Test(priority = 6, enabled = false)
    public void testBrooklynNetsSearch() throws AWTException {
        espn = new EspnNba();
        espn.brooklynNetsSearch();
        softAssertAssertEqualsGetCurrentURL("https://www.espn.com/search/_/q/brooklyn%20nets");
    }
    //TEST 7
    @Test(priority = 7, enabled = false)
    public void testNewYorkKnicks(){
        espn = new EspnNba();
        espn.clickOnNewYorkKnicks();
        softAssertAssertEqualsGetCurrentURL("https://www.espn.com/nba/team/_/name/ny/new-york-knicks");
    }
    //TEST 8
    @Test(priority = 8, enabled = true)
    public void testPlayVideo(){
        espn = new EspnNba();
        espn.playVideo();
        softAssertAssertEqualsGetCurrentURL("https://www.espn.com/nba/");
    }

    }
