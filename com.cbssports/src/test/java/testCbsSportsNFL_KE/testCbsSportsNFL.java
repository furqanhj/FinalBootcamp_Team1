package testCbsSportsNFL_KE;

import cbsSportsNFL_KE.CbsSportsNFL;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCbsSportsNFL extends BaseAPI {
    CbsSportsNFL cbsSportsNFL;

    @Test(priority = 1,enabled = false)
    public void testClickNFLTextLink (){
        cbsSportsNFL = new CbsSportsNFL();
        cbsSportsNFL.clickNFLTextLink();
        String actualTitle = driver.getTitle();
        String expectedTitle ="NFL Football - News, Scores, Stats, Standings, and Rumors - National Football League - CBSSports.com";
        Assert.assertEquals(actualTitle,expectedTitle,"Title Not Matching");
    }

    @Test(priority = 2,enabled = false)
    public void testClickTopFreeAgentLeft(){
        testClickNFLTextLink();
        cbsSportsNFL.clickTopFreeAgentLeft();

        Assert.assertTrue(cbsSportsNFL.validateTopFreeAgent.isDisplayed());

    }
//    @Test(priority = 3,enabled = false)
//    public void testMegaPlayBtn(){
//        testClickTopFreeAgentLeft();
//        waitForElementToBeClickable(cbsSportsNFL.megaPlayBtn);
//        cbsSportsNFL.MegaRadioPlayBtn();


   // }
    @Test(priority = 3,enabled = false)
    public void testHoverOverDotIcon(){
        testClickNFLTextLink();
        cbsSportsNFL.hoverOverDotIcon();


    }
    @Test(priority = 4,enabled = true)
    public void testTotalNumberOfLinksWhileHoverOverDotIcon(){
        testHoverOverDotIcon();
        cbsSportsNFL.totalNumberOfLinksWhileHoverOverDotIcon();

    }
}
