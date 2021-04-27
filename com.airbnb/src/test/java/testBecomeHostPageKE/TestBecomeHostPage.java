package testBecomeHostPageKE;

import becomeHostPageKE.BecomeHostPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBecomeHostPage extends BaseAPI {
    BecomeHostPage becomeHostPage;

    @Test(priority = 1,enabled = false)
    public void testClickBecomeHostButton ()  {
        becomeHostPage = new BecomeHostPage();
        becomeHostPage.clickBecomeHostButton();

        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "Host your home on Airbnb";
        Assert.assertEquals(actualTitle, expectedTitle, "Text Not Matching");

    }
    @Test(priority = 2,enabled = false)
            public void testCountriesScroll()  {
        testClickBecomeHostButton();
        becomeHostPage.login();
        System.out.println(becomeHostPage.countriesSelection.getText());
        Assert.assertTrue(becomeHostPage.countriesSelection.getText().contains("Morocco (+212)"));

        }
    @Test(priority = 3,enabled = false)
    public void testExploreTheWorldOfHostingTextLink()  {
        testClickBecomeHostButton();
        becomeHostPage.clickExploreTheWorldOfHostingTextLink();

        switchToNewWindow();
        waitForVisibilityOfElement(becomeHostPage.blueLivingRoom);
        Assert.assertTrue(becomeHostPage.blueLivingRoom.isDisplayed());

    }

    @Test(priority = 4,enabled = false)
    public void testClickWomanSmilingVideo(){
        testExploreTheWorldOfHostingTextLink();
       // waitForElementToBeClickable(becomeHostPage.womanSmiling);

        becomeHostPage.clickWomanSmilingVideo();


    }
    @Test(priority = 5,enabled = false)
    public void testPlayMoviePlayerBtn() throws InterruptedException {
        testClickWomanSmilingVideo();
        becomeHostPage.playMoviePlayerBtn();






       // waitForElementToBeClickable(becomeHostPage.moviePlayerBtn);
//
//       JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        js.executeScript("document.getElementByXpath(\"//*[@id=\"movie_player\"]/div[4]\").play()");
        //becomeHostPage.clickMoviePlayerBtn();

    }

        @Test(priority = 6,enabled = false)
    public void testClickHowWeEstimateTextLink()  {
         testClickBecomeHostButton();
         becomeHostPage.clickHowWeEstimateTextLink();
         driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
         String actualText= becomeHostPage.validateHowWeEstimateTextLink.getText();
            System.out.println(actualText);
            Assert.assertTrue(actualText.contains("How we estimate your earning potential"));


        }

        @Test(priority = 7,enabled = false)
    public void testClickNextBtn() throws InterruptedException {
        testClickBecomeHostButton();
        becomeHostPage.clickNextBtn();

        Assert.assertTrue(becomeHostPage.pageDot.isDisplayed());


        }

    @Test(priority = 8,enabled = false)
    public void testClickHowWeSupportHostLink (){
        testClickBecomeHostButton();
        becomeHostPage.clickHowWeSupportHostLink();
        switchToNewWindow();
        isElementDisplayed(becomeHostPage.turquoiseCouch);

/**
 * In HomePage
 */
    }
    @Test(priority = 9,enabled = false)
    public void testEnterLocation (){
        becomeHostPage=new BecomeHostPage();
        becomeHostPage.enterLocation();
        isElementDisplayed(becomeHostPage.validateLocation);
    }
    @Test(priority = 10, enabled = false)
    public void testClickOnCheckInDate(){
      //  becomeHostPage=new BecomeHostPage();
        testEnterLocation();
        becomeHostPage.clickOnCheckInDate();
        isElementDisplayed(becomeHostPage.validateDate_CheckIn);
    }
    @Test(priority = 11,enabled = true)
    public void testClickOnSelectedDayCheckOut(){
        testClickOnCheckInDate();
        becomeHostPage.clickOnSelectedDayCheckOut();
        isElementDisplayed(becomeHostPage.validateDateCheckOut);

    }
    @Test(priority = 12,enabled = false)
    public void testClickOnAddGuest(){
        testClickOnSelectedDayCheckOut();
        becomeHostPage.clickOnAddGuest();
    }

    @Test(priority = 13,enabled = false)
    public void testAddAdultGuest(){
       testClickOnAddGuest();
        becomeHostPage.addAdultGuest();
        isElementDisplayed(becomeHostPage.validateAddAdult);

    }
    @Test(priority = 14,enabled = false)

    public void testAddChildrenGuest(){
        testAddAdultGuest();
        becomeHostPage.addChildrenGuest();
        isElementDisplayed(becomeHostPage.validateAddChildren);


    }
    @Test(priority =15,enabled = false )
    public void testAddEnfantGuest (){

        testAddChildrenGuest();
        becomeHostPage.addEnfantGuest();
        isElementDisplayed(becomeHostPage.validateAddEnfant);
    }
    @Test(priority = 16,enabled = false)
    public void testClickSearchButton(){
        testAddEnfantGuest();
        becomeHostPage.clickSearchBtn();
        isElementDisplayed(becomeHostPage.validateSearch);
    }



    }


