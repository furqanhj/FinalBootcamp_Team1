package testEspnWatchOriginalsKE;

import common.BaseAPI;
import espnWatchOriginalsKE.EspnWatchOriginalsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testEspnWatchOriginalsPage extends BaseAPI {
    EspnWatchOriginalsPage espnWatchOriginalsPage;

    @Test(priority = 1,enabled = false)
    public void testSelectOriginalsPage(){
        espnWatchOriginalsPage=new EspnWatchOriginalsPage();
        espnWatchOriginalsPage.selectOriginalsPage();
        String str1 = driver.getTitle();
        System.out.println( str1);
        String str2 ="Watch ESPN Originals";
        compareStrings(str1,str2);


    }
    @Test(priority = 2,enabled = false)
    public void testClickRightCaretIcon(){
        testSelectOriginalsPage();
        espnWatchOriginalsPage.clickRightCaretIcon();
       // waitForVisibilityOfElement(espnWatchOriginalsPage.validateImage1);
        Assert.assertTrue(espnWatchOriginalsPage.validateImage1.isDisplayed());


    }
    @Test(priority = 3,enabled = false)
    public void testPlayAmericaCaddieTrailer(){
        testSelectOriginalsPage();
        espnWatchOriginalsPage.playAmericaCaddieTrailer();

    }
    @Test(priority = 4,enabled = true)
    public void testClickBlackHistoryImageLink(){
        testSelectOriginalsPage();
        waitForElementToBeClickable(espnWatchOriginalsPage.blackHistoryImageLink);
        espnWatchOriginalsPage.clickBlackHistoryImageLink();

        String str1 = espnWatchOriginalsPage.validateTextBlackHistoryPage.getText();
        System.out.println(str1);
        String str2 ="Not Conventional. Never Boring.";
        compareStrings(str1,str2);

    }


}
