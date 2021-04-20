package testMusicPageAB;

import common.BaseAPI;
import musicPageAB.MusicPage;
import org.apache.hc.core5.reactor.Command;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testMusicPage extends BaseAPI {

    MusicPage musicPage;

    @Test(priority = 1, enabled = false)
    public void testTNavigateToMusicPage() {
        musicPage = new MusicPage();
        musicPage.navigateToMusicPage();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Music products for sale | eBay";
        Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");

    }


    @Test(priority = 2, enabled = false)
    public void testToMusicBanner() {
        musicPage = new MusicPage();
        musicPage.navigateToMusicPage();
        String actualText =getTextFromElement(musicPage.MusicBanner);
        String expectedText = "Music";
        Assert.assertEquals(actualText, expectedText, "Title do not match");
    }

    @Test(priority = 3,enabled = false)
    public void testLogoPresent(){
        musicPage=new MusicPage();
//        boolean logoPresent=driver.findElement(By.cssSelector("headerModule > div.main-nav-top-logo > div.logo-container > img")).isDisplayed();
        waitForVisibilityOfElement(musicPage.vinylRecordsImage);
        boolean vinylRecordsImagePresent=musicPage.vinylRecordsImage.isDisplayed();
        //Assert.assertTrue(isElementDisplayed(homePage.bankOfAmericaLogo));
        Assert.assertTrue(vinylRecordsImagePresent);
    }

    @Test(priority = 4, enabled = false)
    public void testMusicPageNavigationStat() {
        musicPage = new MusicPage();
        musicPage.navigateToMusicPage();
        String actualText =getTextFromElement(musicPage.musicPageNavigationStat);
        String expectedText = "Music";
        Assert.assertEquals(actualText, expectedText, "Title do not match");
    }

    @Test(priority = 5, enabled = true)
    public void testNavigateToFolfMusicCdPage() {
        musicPage = new MusicPage();
        musicPage.navigateToMusicPage();
        musicPage.navigateToMusicCategory();
        musicPage.navigateToFolkCdPage();

        String actualText =getTextFromElement(musicPage.bannerTitleFolkMusicCdPage);
        String expectedText = "Folk Music CDs";
        Assert.assertEquals(actualText, expectedText, "Title do not match");
    }

}