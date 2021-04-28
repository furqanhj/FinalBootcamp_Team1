package testBankOfAmericaAboutUsKE;

import bankOfAmericaAboutUsKE.AboutUsPage;


import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAboutUsPage extends BaseAPI {


    AboutUsPage AboutUsPage;


    @Test(priority = 1)
    public void testClickAboutUsMenu() {
        AboutUsPage = new AboutUsPage();
        AboutUsPage.clickAboutUsMenu();
        Assert.assertTrue(AboutUsPage.bankLogo.isDisplayed());
    }

    @Test(priority = 2)
    public void testClickBankLogo() {


        testClickAboutUsMenu();
        AboutUsPage.clickBankLogo();
        System.out.println(driver.getTitle());
        String actualHeadlineText = driver.getTitle();
        String expectedHeadlineText = "About Bank of America - Our People, Our Passion, Our Purpose";
        Assert.assertEquals(actualHeadlineText, expectedHeadlineText, "Text Not Matching");

    }

    @Test(priority = 3)
    public void testHoverOurCompanyLinks() {
        // AboutUsPage = new AboutUsPage();
        //AboutUsPage.clickAboutUsMenu();
        testClickAboutUsMenu();
        AboutUsPage.hoverOurCompanyTextLink();
        String actualHeadlineText = AboutUsPage.responsible_GrowthLink.getText();
        String expectedHeadlineText = "Responsible growth";
        Assert.assertEquals(actualHeadlineText, expectedHeadlineText, "Text Not Matching");
        System.out.println(actualHeadlineText);

    }

    @Test(priority = 4)
    public void testClickOurCompanyTextLink() {

        testClickAboutUsMenu();
        AboutUsPage.clickOurCompanyTextLink();
        Assert.assertTrue(AboutUsPage.menInMeetingImage.isDisplayed());


    }

    @Test(priority = 5)
    public void testClickResponsibleGrowthTextLink() {

//        AboutUsPage.clickAboutUsMenu();
//        AboutUsPage.hoverOurCompanyTextLink();
        testHoverOurCompanyLinks();
        AboutUsPage.clickResponsibleGrowthTextLink();
        String actualHeadlineText = driver.getTitle();
        String expectedHeadlineText = "Bank of America's Focus on Responsible & Sustainable Growth";
        System.out.println(actualHeadlineText);
        Assert.assertEquals(actualHeadlineText, expectedHeadlineText, "Text Not Matching");

    }

    @Test(priority = 6)
    public void testClickBusinessPracticesTextLink() {

        testHoverOurCompanyLinks();
        AboutUsPage.clickBusinessPracticesTextLink();
        Assert.assertTrue(AboutUsPage.businessPracticesImage.isDisplayed());

    }

    @Test(priority = 7)
    public void testClickWhatWeOffer() {

        testHoverOurCompanyLinks();
        AboutUsPage.clickWhatWeOffer();
        Assert.assertTrue(AboutUsPage.whatWeOfferImage.isDisplayed());

    }


//    @Test (priority = 2)
//    public void testWomanImage() throws InterruptedException {
//        Thread.sleep(2000);
//        testAboutUsPage.AboutUsPage.validateWomenLookingAtComputerImage();
//      // AboutUsPage.validateWomenLookingAtComputerImage();
//    }
//    @Test(priority = 3)
//    public void testWomanLeaderLearnMoreLink()  {
//        //testAboutUsPage.AboutUsPage.clickWomanLeaderLearnMoreLink();
//
//        AboutUsPage.clickWomanLeaderLearnMoreLink();
//        String actualHeadlineText =AboutUsPage.headlineText.getText();
//        String expectedHeadlineText ="Celebrating a decade of advancing women leaders";
//        Assert.assertEquals(actualHeadlineText, expectedHeadlineText,"Text Not Matching");
//        System.out.println(actualHeadlineText);
//    }
//
//    @Test(priority = 4)
//    public void testVideoPlayButton() throws InterruptedException {
//        Thread.sleep(3000);
//        AboutUsPage.clickVideoPlayButton();
//    }
//    @Test(priority = 5)
//        public void testVideoPauseButton() throws InterruptedException {
//
//
//        Thread.sleep(5000);
//        AboutUsPage.clickVideoPauseButton();
//    }


}
