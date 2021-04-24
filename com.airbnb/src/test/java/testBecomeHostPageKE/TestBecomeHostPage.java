package testBecomeHostPageKE;

import becomeHostPageKE.BecomeHostPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBecomeHostPage extends BaseAPI {
    BecomeHostPage becomeHostPage;

    @Test(priority = 1,enabled = true)
    public void testClickBecomeHostButton ()  {
        becomeHostPage = new BecomeHostPage();
        becomeHostPage.clickBecomeHostButton();

        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "Host your home on Airbnb";
        Assert.assertEquals(actualTitle, expectedTitle, "Text Not Matching");

    }
    @Test(priority = 2,enabled = true)
            public void testCountriesScroll()  {
        testClickBecomeHostButton();
        becomeHostPage.login();
        System.out.println(becomeHostPage.countriesSelection.getText());
        Assert.assertTrue(becomeHostPage.countriesSelection.getText().contains("Morocco (+212)"));

        }
    @Test(priority = 3,enabled = true)
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

        @Test(priority = 7,enabled = true)
    public void testClickNextBtn() throws InterruptedException {
        testClickBecomeHostButton();
        becomeHostPage.clickNextBtn();

        Assert.assertTrue(becomeHostPage.pageDot.isDisplayed());


        }




    }


