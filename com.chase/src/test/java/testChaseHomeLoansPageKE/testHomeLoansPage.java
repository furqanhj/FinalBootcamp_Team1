package testChaseHomeLoansPageKE;

import chaseHomeLoansPageKE.HomeLoansPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testHomeLoansPage extends BaseAPI {

    HomeLoansPage homeLoansPage;

    @Test(priority = 1, enabled = false)
    public void testClickHomeLoansTextLink() {
        homeLoansPage = new HomeLoansPage();
        homeLoansPage.clickHomeLoansTextLink();

        Assert.assertTrue(homeLoansPage.familyImage.isDisplayed());

    }

    @Test(priority = 2, enabled = false)
    public void testClickSignInBtn() throws InterruptedException {
        testClickHomeLoansTextLink();
        homeLoansPage.clickSignInBtn();
        waitForVisibilityOfElement(homeLoansPage.chaseLogo);

        //   Assert.assertTrue(homeLoansPage.chaseLogo.isDisplayed());
//         String str1= homeLoansPage.footerText.getText();
//         String str2="Follow us:";
//        compareStrings(str1,str2);

    }

    @Test(dataProvider = "TestData", dataProviderClass = HomeLoansPage.class, priority = 3, enabled = false)
    public void testEnterUserNameAndPassword(String userName, String password) throws InterruptedException {
        testClickSignInBtn();
        driver.switchTo().frame(homeLoansPage.logonFrame);


        homeLoansPage.userNameField.sendKeys(userName);
        homeLoansPage.passwordField.sendKeys(password);
        homeLoansPage.signInBtn2.click();


        System.out.println(userName + "      " + password);
        //  }
        //homeLoansPage.enterUserNameAndPassword();
        waitForVisibilityOfElement(homeLoansPage.logonMessage);
        String str1 = homeLoansPage.logonMessage.getText();
        String str2 = "Please try again later. Thanks for your patience.";
        compareStrings(str1, str2);

    }

    @Test
    public void testPlayVideo() throws InterruptedException {
        testClickHomeLoansTextLink();
        homeLoansPage.PlayVideo();
        isElementDisplayed(homeLoansPage.validateVideoPlayed);

    }

    @Test(priority = 4, enabled = false)
    public void testVideoPlayBtn() throws InterruptedException {
        testClickHomeLoansTextLink();
        //Thread.sleep(5000);
        //waitForElementToBeClickable(homeLoansPage.videoPlayBtn);
        homeLoansPage.PlayVideo();


    }

    @Test(priority = 5, enabled = false)
    public void testClickEstimateYourRateTextLink() {
        testClickHomeLoansTextLink();
        homeLoansPage.clickEstimateYourRateTextLink();
        String str1 = homeLoansPage.mortgageText.getText();
        String str2 = "Mortgage Calculator";
        System.out.println(str1);
        compareStrings(str1, str2);


    }

    // this method has 7 test cases
    @Test(priority = 6, enabled = false)
    public void testGetMyOptions() {
        testClickEstimateYourRateTextLink();
        homeLoansPage.getMyOptions();

        waitForVisibilityOfElement(homeLoansPage.validateGetMyOptions);
        String str1 = homeLoansPage.validateGetMyOptions.getText();
        String str2 = "15 Year Fixed";
        compareStrings(str1, str2);


    }


}
