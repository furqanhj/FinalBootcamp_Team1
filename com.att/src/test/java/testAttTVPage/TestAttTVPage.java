package testAttTVPage;

import attHomepageFJ.AttHomepage;
import attTVPageFJ.AttTVPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAttTVPage extends BaseAPI {

    AttHomepage homepage;
    AttTVPage tvPage;

    //TestCase#1: click on Order Online Now link, validate via text
    @Test(priority = 1, enabled = false)
    public void testClickOrderOnlineNowLink(){
        homepage = new AttHomepage();
        tvPage = new AttTVPage();
        homepage.navigateToTVLink().clickOrderOnlineNowLink();

        String actualText = getTextFromElement(tvPage.actualTextOrderOnlineNowPage);
        String expectedText = "TV your way";

        Assert.assertEquals(actualText, expectedText, "TEXT DO NOT MATCH");
    }

    //TestCase#2: Is video played on TV Page, validate via boolean
    @Test (priority = 2, enabled = false)
    public void testIsVideoPlayedOnTVPage(){
        homepage = new AttHomepage();
        tvPage = new AttTVPage();
        homepage.navigateToTVLink();

        Assert.assertTrue(isElementDisplayed(tvPage.videoAutoplayOnTVPage));
    }

    //TestCase#3: Validate number of packages options on TV Page (3 options)
    @Test (priority = 3, enabled = false)
    public void testNumberOfPackagesOptionsOnTVPage() throws InterruptedException {
        homepage = new AttHomepage();
        tvPage = new AttTVPage();
        homepage.navigateToTVLink().checkNumberOfPackagesOptionsOnTVPage();

        int actualNumOfOptions = tvPage.actualNumberOfPackagesOptionsTVPage.size();
        int expectedNumOfOptions = 3;

        Assert.assertTrue(compareIntegers(actualNumOfOptions, expectedNumOfOptions));
    }

    //TestCase#4: Validate number of links on header of TV Page (7 links)
    @Test (priority = 4, enabled = false)
    public void testValidateNumOfLinksOnHeaderOfTVPage(){
        homepage = new AttHomepage();
        tvPage = new AttTVPage();
        homepage.navigateToTVLink();

        int actualNumOfLinks = tvPage.actualNumOfLinksOnHeaderOfTVPage.size();
        int expectedNumOfLinks = 7;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
    }

    //TestCase#5: click Choose this package button under ENTERTAINMENT, validate via Text
    @Test (priority = 5, enabled = true)
    public void testClickOnEntertainmentPackageButton() throws InterruptedException {
        homepage = new AttHomepage();
        tvPage = new AttTVPage();
        homepage.navigateToTVLink().clickOnEntertainmentPackageOption();

        String actualText = getTextFromElement(tvPage.actualTextEntertainmentPackagePage);
        String expectedText = "1. Your TV package";

        Assert.assertTrue(compareStrings(actualText, expectedText));
    }

    //TestCase#6: click Choose this package button under CHOICE, validate via text
    @Test (priority = 6, enabled = true)
    public void testClickOnChoicePackageButton() throws InterruptedException {
        homepage = new AttHomepage();
        tvPage = new AttTVPage();
        homepage.navigateToTVLink().clickOnChoicePackageOption();

        String actualText = getTextFromElement(tvPage.actualTextChoicePackagePage);
        String expectedText = "1. Your TV package";

        Assert.assertTrue(compareStrings(actualText, expectedText));
    }

    //TestCase#7: click Choose this package button under ULTIMATE, validate via Text
    @Test (priority = 7, enabled = true)
    public void testClickOnUltimatePackageButton() throws InterruptedException {
        homepage = new AttHomepage();
        tvPage = new AttTVPage();
        homepage.navigateToTVLink().clickOnUltimatePackageOption();

        String actualText = getTextFromElement(tvPage.actualTextUltimatePackagePage);
        String expectedText = "1. Your TV package";

        Assert.assertTrue(compareStrings(actualText, expectedText));
    }


}
