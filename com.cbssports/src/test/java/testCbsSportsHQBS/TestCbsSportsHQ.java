package testCbsSportsHQBS;

import cbsSportsHQBS.CbsSportsHQ;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import static cbsSportsHQBS.CbsSportsHQWebElements.*;

public class TestCbsSportsHQ extends BaseAPI {


    CbsSportsHQ cbs;

    //Test 1
    @Test(enabled = false)
    public void navigateToSportsHQ(){
        CbsSportsHQ cbs = new CbsSportsHQ();
        cbs.sportsHQClick();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.cbssports.com/live/?ftag=SHQ-16-10aaa0a";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test 2 - check to see if more videos click works under different video types
    @Test(enabled = false)
    public void moreTopVideos(){
        CbsSportsHQ cbs = new CbsSportsHQ();
        cbs.clickMoreTopVideos();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.cbssports.com/live/?ftag=SHQ-16-10aaa0a";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test 3
    @Test(enabled = false)
    public void moreNflVideos(){
        CbsSportsHQ cbs = new CbsSportsHQ();
        cbs.clickMoreNflVideos();
        String actualResult = driver.getTitle();
        String expectedResult = "Watch CBS Sports HQ Online - Free Live Stream & News - CBSSports.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test 4
    @Test(enabled = false)
    public void moreFootballVideos(){
        CbsSportsHQ cbs = new CbsSportsHQ();
        cbs.clickMoreFootballVideos();
        String actualResult = driver.getTitle();
        String expectedResult = "Watch CBS Sports HQ Online - Free Live Stream & News - CBSSports.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test 5
    @Test(enabled = false)
    public void moreNbaVideos(){
        CbsSportsHQ cbs = new CbsSportsHQ();
        cbs.clickMoreNbaVideos();
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.cbssports.com/live/?ftag=SHQ-16-10aaa0a";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test 6
    @Test(enabled = false)
    public void moreBasketballVideos(){
        CbsSportsHQ cbs = new CbsSportsHQ();
        cbs.clickMoreBasketballVideos();
        String actualResult = driver.getTitle();
        String expectedResult = "Watch CBS Sports HQ Online - Free Live Stream & News - CBSSports.com";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test 7
    @Test(enabled = false)
    public void moreGolfVideos(){
        CbsSportsHQ cbs = new CbsSportsHQ();
        cbs.clickMoreGolfVideos();
        assertEqualsGetTitle("MORE VIDEOS +",WEB_ELEMENT_MORE_GOLF_VIDEOS);
    }
    //Test 8- switching tabs
    @Test(enabled = false)
    public void clickOnFirstVideo(){
        CbsSportsHQ cbs = new CbsSportsHQ();
        cbs.clickOnTopVideo();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Breaking: Lamarcus Aldridge Retires From The NBA - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "Titles do not match");

    }
    //Test 9- switching tabs when clicking on video
    @Test(enabled = false)
    public void clickNflVideo(){
        CbsSportsHQ cbs = new CbsSportsHQ();
        cbs.clickOnNflVideo();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Bills War Room - CBSSports.com";

        Assert.assertEquals(actualTitle, expectedTitle, "Titles do not match");
    }
    //Test 10
    @Test(enabled = true)
    public void clickNbaVideo(){
        CbsSportsHQ cbs = new CbsSportsHQ();
        cbs.clickOnNbaVideo();
        assertEqualsGetTitle("NBA Mock Draft: Wizards Select Scottie Barnes at No. 6",WEB_ELEMENT_NBA_VIDEO_TITLE);
    }
}
