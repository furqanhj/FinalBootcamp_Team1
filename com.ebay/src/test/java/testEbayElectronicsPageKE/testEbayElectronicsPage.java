package testEbayElectronicsPageKE;

import common.BaseAPI;
import ebayElectronicsPageKE.EbayElectronicsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class testEbayElectronicsPage extends BaseAPI {
    EbayElectronicsPage ebayElectronicsPage;

    @Test(priority = 1, enabled = false)
    public void testClickElectronicsTextLink() {
        ebayElectronicsPage = new EbayElectronicsPage();

        ebayElectronicsPage.clickElectronicsTextLink();
        System.out.println(driver.getTitle());
        String actualHeadlineText = driver.getTitle();
        String expectedHeadlineText = "Electronics products for sale | eBay";
        Assert.assertEquals(actualHeadlineText, expectedHeadlineText, "Text Not Matching");

    }

    @Test(priority = 2, enabled = false)
    public void testCountMenuBarTextLinks() {
        testClickElectronicsTextLink();
        ebayElectronicsPage.countLeftMenuBarTextLinks();

        Assert.assertTrue(ebayElectronicsPage.leftMenuBarTextLinks.getText().contains("Hi! Sign in or register Daily Deals Brand Outlet Help & Contact"));
        System.out.println(ebayElectronicsPage.leftMenuBarTextLinks.getText());
    }

    @Test(priority = 3,enabled = false)
    public void testRightCountMenuBarTextLinks() {
        testClickElectronicsTextLink();
        ebayElectronicsPage.countRightMenuBarTextLinks();

        Assert.assertTrue(ebayElectronicsPage.iconCart.isDisplayed());
       //System.out.println(ebayElectronicsPage.rightMenuBarTextLinks.getText());


    }
    @Test(priority = 4,enabled = false)
    public void testCountShopCategorySectionTextLinks(){
        ebayElectronicsPage = new EbayElectronicsPage();

        testClickElectronicsTextLink();
        ebayElectronicsPage.countShopCategorySectionTextLinks();




    }
    @Test(priority = 5,enabled = false)
    public void testClickCamerasPhotoLinks(){

        testClickElectronicsTextLink();
        ebayElectronicsPage.clickCamerasPhotoLinks();

        Assert.assertTrue(ebayElectronicsPage.seeTextLinkSeeAllCameras.getText().contains("See all Cameras & Photo"));
        System.out.println(ebayElectronicsPage.seeTextLinkSeeAllCameras.getText());

    }
    @Test(priority = 6,enabled = false)
    public void testCountCamerasPhotoSectionTextLinks(){
        testClickCamerasPhotoLinks();
        ebayElectronicsPage.countCamerasPhotoSectionTextLinks();

        Assert.assertTrue(ebayElectronicsPage. verifyingCamerasPhotoSectionTextLink.getText().contains("Film Cameras"));
        System.out.println(ebayElectronicsPage.verifyingCamerasPhotoSectionTextLink.getText());
        System.out.println("******************************************");


    }
    @Test(priority = 7,enabled = false)
    public void testClickRegisterTextLink(){
        ebayElectronicsPage = new EbayElectronicsPage();
        ebayElectronicsPage.clickRegisterTextLink();

        String centerTitle = "Create an account";


        String actualText = getTextFromElement(ebayElectronicsPage.verifyingRegisterPage);
        System.out.println(actualText);
        Assert.assertEquals(actualText, centerTitle);
        System.out.println(actualText);

    }
    @Test(priority = 8,enabled = false)
    public void testCreateEBayAccount () throws IOException {
        testClickRegisterTextLink();
        ebayElectronicsPage.createEBayAccount();


    }
    @Test(priority = 9,enabled = false)
    public void testClickCreateAccBtn() throws IOException, InterruptedException {
        EbayElectronicsPage ebayElectronicsPage;
        ebayElectronicsPage = new EbayElectronicsPage();

        testCreateEBayAccount();
        ebayElectronicsPage.clickCreateAccBtn();


        String expectedText1 ="An account already exists with the email address gigi48@gmail.com";
        String actualText1 = getTextFromElement(ebayElectronicsPage.verifyingCreateAccBtn);
       Thread.sleep(3000);
       System.out.println("CreateAccBtn :" + actualText1);
      Assert.assertEquals(actualText1,expectedText1);


    }

    @Test(priority = 10,enabled = false)

    public void testClickBusinessAccRadioBtn () throws InterruptedException {

        testClickRegisterTextLink();

        ebayElectronicsPage.clickBusinessAccRadioBtn();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Register: Create a business account";
        Assert.assertEquals(actualTitle, expectedTitle, "Text Not Matching");
        System.out.println(actualTitle);

    }
        @Test(priority = 11,enabled = false)
    public void testClickQmImageInHelp() throws InterruptedException {
        testClickBusinessAccRadioBtn();
        ebayElectronicsPage.clickQmImageInHelp();

            String expectedText1 ="Do I need a business account?";
            String actualText1 = getTextFromElement(ebayElectronicsPage.faqsTabText);
            //Thread.sleep(3000);
            System.out.println("Actual is :" + actualText1);
            Assert.assertEquals(actualText1,expectedText1);
        }
        @Test(priority = 12,enabled = false)
    public void testClickSurveyImageLink() throws InterruptedException {

        testClickBusinessAccRadioBtn();
        ebayElectronicsPage.clickSurveyImageLink();

            String expectedText1 ="Experiencing issues?";
            String actualText1 = getTextFromElement(ebayElectronicsPage.verifyingSurveyImageLink);
            //Thread.sleep(3000);
            System.out.println("Actual is :" + actualText1);
            Assert.assertEquals(actualText1,expectedText1);

        }
        @Test(priority = 13,enabled = false)
    public void testSendTextToSurveyBox () throws InterruptedException {
        testClickSurveyImageLink();
        ebayElectronicsPage.sendTextToSurveyBox();

            Assert.assertTrue(ebayElectronicsPage.verifyingSurveyBox.isEnabled());//Send Btn

        }
        @Test(priority = 14,enabled = false)
    public void testVerifyImagesLink(){

        testClickElectronicsTextLink();
        ebayElectronicsPage.verifyImagesLink();

        }
        @Test(priority = 15,enabled = true)
    public void testClickTitleImage1Link(){
          testClickElectronicsTextLink();
          ebayElectronicsPage.clickTitleImage1Link();

            Assert.assertTrue(ebayElectronicsPage.rightImage1Link.isDisplayed());

        }

}
