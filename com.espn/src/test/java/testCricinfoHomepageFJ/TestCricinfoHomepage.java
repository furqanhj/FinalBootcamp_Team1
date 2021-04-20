package testCricinfoHomepageFJ;

import common.BaseAPI;
import cricinfoHomepageFJ.CricinfoHomepage;
import espnHomepageFJ.ESPNHomepage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCricinfoHomepage extends BaseAPI {

    ESPNHomepage espn;
    CricinfoHomepage cricinfo;

    //TestCase#1: validate number of dropdown links on header, via assert
    @Test (priority = 1, enabled = false)
    public void testValidateNumOfDropdownLinksOnHeader(){
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage();

        int actualNumOfLinks = cricinfo.actualNumOfLinksCricketPageHeader.size();
        int expectedLinks = 8;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedLinks));
        System.out.println("ACTUAL LINKS = " + actualNumOfLinks);
        System.out.println("EXPECTED LINKS = " + expectedLinks);
    }

    //TestCase#2: validate number of links in "Live Score" dropdown, via Excel file
    @Test (priority = 2, enabled = true)
    public void testNumberOfLinksInLiveScoreDropdodown() throws IOException {
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage();

        hoverOverElement(cricinfo.hoverOverLiveScoresButton);

//        if (isElementDisplayed(cricinfo.modalWindowLatestUpdates))
//            cancelAlert();

        String rootPath = "/src/test/resources/TestData/CricinfoHomepageHeader.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(cricinfo.GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_LIVE_SCORES_DROPDOWN()),
                "text", sheetPath, "LiveScores"));
    }

    //TestCase#3: validate number of links in "Series" dropdown, via Excel file
    @Test (priority = 3, enabled = false)
    public void testNumberOfLinksInSeriesDropdodown() throws IOException {
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage();

        hoverOverElement(cricinfo.hoverOverSeriesButton);

        String rootPath = "/src/test/resources/TestData/CricinfoHomepageHeader.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(cricinfo.GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_SERIES_DROPDOWN()),
                "text", sheetPath, "Series"));
    }

    //TestCase#4: validate number of links in "Teams" dropdown, via Excel file
    @Test (priority = 4, enabled = false)
    public void testNumberOfLinksInTeamsDropdodown() throws IOException {
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage();

        hoverOverElement(cricinfo.hoverOverTeamsButton);

        String rootPath = "/src/test/resources/TestData/CricinfoHomepageHeader.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(cricinfo.GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_TEAMS_DROPDOWN()),
                "text", sheetPath, "Teams"));
    }

    //TestCase#5: validate number of links in "News" dropdown, via Excel file
    @Test (priority = 5, enabled = false)
    public void testNumberOfLinksInNewsDropdodown() throws IOException {
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage();

        hoverOverElement(cricinfo.hoverOverNewsButton);

        String rootPath = "/src/test/resources/TestData/CricinfoHomepageHeader.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(cricinfo.GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_NEWS_DROPDOWN()),
                "text", sheetPath, "News"));
    }

    //TestCase#6: validate number of links in "Features" dropdown, via Excel file
    @Test (priority = 6, enabled = false)
    public void testNumberOfLinksInFeaturesDropdodown() throws IOException {
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage();

        hoverOverElement(cricinfo.hoverOverFeaturesButton);

        String rootPath = "/src/test/resources/TestData/CricinfoHomepageHeader.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(cricinfo.GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_FEATURES_DROPDOWN()),
                "text", sheetPath, "Features"));
    }

    //TestCase#7: validate number of links in "Videos" dropdown, via Excel file
    @Test (priority = 7, enabled = false)
    public void testNumberOfLinksInVideosDropdodown() throws IOException {
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage();

        hoverOverElement(cricinfo.hoverOverVideosButton);

        String rootPath = "/src/test/resources/TestData/CricinfoHomepageHeader.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(cricinfo.GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_VIDEOS_DROPDOWN()),
                "text", sheetPath, "Videos"));
    }

    //TestCase#8: validate number of links in "Videos2" dropdown, via Excel file
    @Test (priority = 8, enabled = false)
    public void testNumberOfLinksInVideos2Dropdodown() throws IOException {
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage();

        hoverOverElement(cricinfo.hoverOverVideos2Button);

        String rootPath = "/src/test/resources/TestData/CricinfoHomepageHeader.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(cricinfo.GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_VIDEOS2_DROPDOWN()),
                "text", sheetPath, "Videos2"));
    }

    //TestCase#9: validate number of links in "Stats" dropdown, via Excel file
    @Test (priority = 9, enabled = false)
    public void testNumberOfLinksInStatsDropdodown() throws IOException {
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage();

        hoverOverElement(cricinfo.hoverOverStatsButton);

        String rootPath = "/src/test/resources/TestData/CricinfoHomepageHeader.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(cricinfo.GET_WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_IN_STATS_DROPDOWN()),
                "text", sheetPath, "Stats"));
    }

    //TestCase#10: click on first video on cricinfo homepage, video plays in modal window, validate via text
    @Test (priority = 10, enabled = false)
    public void testclickPlayButtonFirstVideoCricinfoHomepage(){
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage().clickPlayButtonFirstVideoCricinfoHomepage();

        String actualText = getTextFromElement(cricinfo.actualTextModalWindowFirstVideo);
        String expectedText = "Steyn: Rajasthan Royals really need Shivam Dube to get going";

        Assert.assertTrue(compareStrings(actualText, expectedText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }

    //TestCase#11: verify action buttons in video being played in modal window
    @Test (priority = 11, enabled = false)
    public void testUseVideoControlsInModalWindowVideo(){
        actions = new Actions(driver);
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage().clickPlayButtonFirstVideoCricinfoHomepage();

        hoverOverElement(cricinfo.modalWindowBodyToHoverOver);
        waitTimeUsingImplicit(6);
        clickElement(cricinfo.playPauseButtonInModalWindow);
        hoverOverElement(cricinfo.modalWindowBodyToHoverOver);
        clickElement(cricinfo.fastForwardButtonInModalWindow);
        hoverOverElement(cricinfo.modalWindowBodyToHoverOver);
        clickElement(cricinfo.rewindButtonInModalWindow);
        hoverOverElement(cricinfo.modalWindowBodyToHoverOver);
        clickElement(cricinfo.playPauseButtonInModalWindow);




//        waitTimeUsingFluent(5);
//        for (int i = 0; i < 10; i++) {
//            hoverOverElement(cricinfo.modalWindowBodyToHoverOver);
//            if (isElementDisplayed(cricinfo.skipAdButtonInModalWindow)){
//                hoverOverElement(cricinfo.modalWindowBodyToHoverOver);
//                waitForElementToBeClickable(cricinfo.skipAdButtonInModalWindow);
//                cricinfo.skipAdButtonInModalWindow.click();
//            } else {
//                hoverOverElement(cricinfo.modalWindowBodyToHoverOver);
//                clickElement(cricinfo.playPauseButtonInModalWindow);
//                clickElement(cricinfo.fastForwardButtonInModalWindow);
//                clickElement(cricinfo.rewindButtonInModalWindow);
//                clickElement(cricinfo.playPauseButtonInModalWindow);
//            }
//        }
    }

    //TestCase#12: click on IPL2021 link under Series dropdown, validate via text
    @Test (priority = 12, enabled = false)
    public void testClickIPL2021LinkInSeriesDropdown(){
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage().clickIPL2021LinkInSeriesDropdown();

        String actualText = getTextFromElement(cricinfo.actualTextIPL2021Page);
        String expectedText = "Indian Premier League 2021";

        Assert.assertTrue(compareStrings(actualText, expectedText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }

    //TestCase#13: click on Pakistan Link under Teams dropdown, validate via Text
    @Test (priority = 13, enabled = true)
    public void testClickPakistanLinkInTeamsDropdown(){
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage().clickPakistanLinkInTeamsDropdown();

        String actualText = getTextFromElement(cricinfo.actualTextPakistanPage);
        String expectedText = "Pakistan";

        Assert.assertTrue(compareStrings(actualText,expectedText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }

    //TestCase#14: click on India Link under Teams dropdown, validate via Text
    @Test (priority = 14, enabled = false)
    public void testClickIndiaLinkInTeamsDropdown(){
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage().clickIndiaLinkInTeamsDropdown();

        String actualText = getTextFromElement(cricinfo.actualTextIndiaPage);
        String expectedText = "India";

        Assert.assertTrue(compareStrings(actualText, expectedText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }

    //TestCase#15: click On News Home link under News dropdown, validate via element present
    @Test (priority = 15, enabled = true)
    public void testClickOnNewsHomeUnderNewsDropdown(){
        espn = new ESPNHomepage();
        cricinfo = new CricinfoHomepage();
        espn.navigateToCricketPage().clickNewsHomeInNewsDropdown();

        Assert.assertTrue(isElementDisplayed(cricinfo.filterButtonOnNewsHomePage));
    }
}
