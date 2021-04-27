package testHomePageAB;

import common.BaseAPI;
import homePageAB.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testHomePage extends BaseAPI {

    HomePage homePage;

    @Test(priority = 1,enabled = false)
    public void testDoSearch(){
        homePage=new HomePage();
        String searchKeys= "Erica";
        homePage.doSearch(searchKeys);

//        driverWait.until(ExpectedConditions.visibilityOf(homePage.expectedTextSearchResult));
        String actualText= getTextFromElement(homePage.expectedTextSearchResult);
        System.out.println(actualText);
//        Assert.assertTrue(compareStrings(actualText,searchKeys));
        Assert.assertEquals(actualText, searchKeys);
    }
//  *************************************************************************

    @Test(priority = 2, enabled = false)
    public void testLogoPresent(){
        homePage=new HomePage();
//        boolean logoPresent=driver.findElement(By.cssSelector("headerModule > div.main-nav-top-logo > div.logo-container > img")).isDisplayed();
        boolean logoPresent=homePage.bankOfAmericaLogo.isDisplayed();
        //Assert.assertTrue(isElementDisplayed(homePage.bankOfAmericaLogo));
        Assert.assertTrue(logoPresent);
    }

//    Invalid login
    @Test(priority = 3, enabled = false)
    public void testInvalidLogIn() throws InterruptedException {
        homePage=new HomePage();
        homePage.doInvalidLogIn("abcd","wyx4ss");
        String actualText=getTextFromElement(homePage.actualTextErrorMessage);
        Thread.sleep(3000);
        String expectedText="Having problems signing in or resetting your Passcode?";
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "Error Message Does not Match");

    }

    //For Credit Card Page
    @Test(priority = 4,enabled = false)
    public void testnevigateToCreditCard() throws InterruptedException {
        homePage=new HomePage();
        homePage.nevigateToCreditCard();
        String actualText=getTextFromElement(homePage.buttonHomeLoans);
        Thread.sleep(1000);
        String expectedText="Bank of America - Banking, Credit Cards, Loans and Merrill Investing";
        Assert.assertEquals(actualText, expectedText, "Title Does not Match");

    }

    @Test(priority = 5,enabled = false)
    public void testNavigateToHomeLoans(){
        homePage=new HomePage();
        homePage.nevigateToHomeLoans();
        String actualTitle=driver.getTitle();
        String expectedTitle="Bank of America - Banking, Credit Cards, Loans and Merrill Investing";
        Assert.assertEquals(actualTitle,expectedTitle, "Title Donot Match");
    }


        @Test(priority = 6,enabled = false)
        public void testNavigateToHomeLoans1(){
        homePage=new HomePage();
        homePage.nevigateToHomeLoans();
        String actualtext= getTextFromElement(homePage.buttonHomeLoans);
        String expectedText="Home Loans";
        Assert.assertEquals(actualtext,expectedText, "Title Donot Match");
    }


}
