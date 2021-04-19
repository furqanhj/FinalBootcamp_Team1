package testCbsLoginPage;

import cbsHomepageFJ.CbsHomepage;
import cbsLoginPageFJ.LoginPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseAPI {

    CbsHomepage homepage;
    LoginPage loginPage;

    //TestCase#1 - Invalid login validate via text
    @Test (priority = 1, enabled = true)
    public void testDoInvalidLogin(){
        homepage = new CbsHomepage();
        loginPage = new LoginPage();

        homepage.navigateToLoginPage().doInvalidLogin("adfdsaf", "asda123");

        String actualText = getTextFromElement(loginPage.actualTextErrorWithInvalidLogin);
        String expectedText = "Sorry, either your email address and/or password was not found. Please try again.";

        Assert.assertTrue(compareStrings(actualText, expectedText));
//        Assert.assertEquals(actualText, expectedText, "TEXT DO NOT MATCH");
    }

    // click forgot your password link validate via element present
    @Test (priority = 2, enabled = true)
    public void testClickForYourPasswordLink(){
        homepage = new CbsHomepage();
        loginPage = new LoginPage();
        homepage.navigateToLoginPage().clickLinkForgotYourPassword();

        Assert.assertTrue(isElementDisplayed(loginPage.inputEmailIdForgotPasswordPage));
    }

    //enter invalid email in Forgot password Page, validate via Text
    @Test (priority = 3, enabled = true)
    public void testEnterEmailAndClickContinueOnForgotPasswordPage(){
        homepage = new CbsHomepage();
        loginPage = new LoginPage();
        homepage.navigateToLoginPage().clickLinkForgotYourPassword();
        homepage.navigateToLoginPage().enterInvalidEmailAndClickContinueInForgotPasswordPage("asdfads");

        String actualText = getTextFromElement(loginPage.actualTextErrorMsgForgotPasswordPage);
        String expectedText = "Not a valid email address.";

        Assert.assertTrue(compareStrings(actualText, expectedText));
    }

    // enter valid, but not a registered email in forgot password page, valid via Text
    @Test (priority = 4, enabled = true)
    public void testEnterValidButUnregisteredEmailAndContinueInForgotPasswordPage(){
        homepage = new CbsHomepage();
        loginPage = new LoginPage();
        homepage.navigateToLoginPage().clickLinkForgotYourPassword();
        loginPage.enterValidButUnregisteredEmailAndClickContinueInForgotPasswordPage("dummy@gmail.com");

        String actualText = getTextFromElement(loginPage.actualTextErrorMsgUnregisteredValidEmail);
        String expectedText = "We're sorry, we cannot find an account for the email address you provided." +
                " Please try logging in with an email address registered to a CBSSports.com account or " +
                "click here to create a new account.";

        Assert.assertEquals(actualText, expectedText, "TEXT DO NOT MATCH");
    }

    // Dont have an account, Signup Link, validate via REGISTER button availability on sign-up page
    @Test (priority = 5, enabled = true)
    public void testClickDontHaveAnAccountSignupLink(){
        homepage = new CbsHomepage();
        loginPage = new LoginPage();
        homepage.navigateToLoginPage().clickDontHaveAnAccountSignupLink();

        Assert.assertTrue(isElementDisplayed(loginPage.registerButtonOnSignUpPage));
    }

    // Test number of links on footer of login page (12 links)
    @Test (priority = 6, enabled = true)
    public void testValidateNumOfLinksOnFooterOfLoginPage(){
        homepage = new CbsHomepage();
        loginPage = new LoginPage();
        homepage.navigateToLoginPage();

        int actualNumOfLinks = loginPage.actualNumberOfLinksOnFooterLoginPage.size();
        int expectedNumOfLinks = 12;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
        System.out.println("ACTUAL: " + actualNumOfLinks);
        System.out.println("EXPECTED: " + expectedNumOfLinks);
    }

    // Test number of Social Networks links on footer of login page (5 links)
    @Test (priority = 7, enabled = true)
    public void testValidateSocialNetworksLinksOnFooterOfLoginPage(){
        homepage = new CbsHomepage();
        loginPage = new LoginPage();
        homepage.navigateToLoginPage();
        scrollToBottomOfPage();

        int actualNumOfLinks = loginPage.actualNumberOfSocialNetworksLinkOnFooterLoginPage.size();
        int expectedNumOfLinks = 5;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
        System.out.println("ACTUAL: " + actualNumOfLinks);
        System.out.println("EXPECTED: " + expectedNumOfLinks);
    }

    // Test number of Partner Links on footer of login page (5 links)
    @Test (priority = 8, enabled = true)
    public void testValidatePartnerLinksOnFooterOfLoginPage(){
        homepage = new CbsHomepage();
        loginPage = new LoginPage();
        homepage.navigateToLoginPage();
        scrollToBottomOfPage();

        int actualNumOfLinks = loginPage.actualNumberOfPartnerLinksOnFooterLoginPage.size();
        int expectedNumOfLinks = 5;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
        System.out.println("ACTUAL: " + actualNumOfLinks);
        System.out.println("EXPECTED: " + expectedNumOfLinks);
    }

    // Test login with facebook link, validate via text on new window
    @Test (priority = 9, enabled = true)
    public void testClickLoginWithFacebookLink(){
        homepage = new CbsHomepage();
        loginPage = new LoginPage();
        homepage.navigateToLoginPage().clickLoginWithFacebook();

        String actualText = getTextFromElement(loginPage.actualTextLoginWithFacebookNewWindow);
        String expectedText = "CBSSports.com Social Login";

        Assert.assertTrue(compareStrings(actualText, expectedText));
//        Assert.assertEquals(actualText, expectedText, "TEXT DO NOT MATCH");
    }

    // Test login with google link, validate via text on new window
    @Test (priority = 10, enabled = true)
    public void testClickLoginWithGoogleLink(){
        homepage = new CbsHomepage();
        loginPage = new LoginPage();
        homepage.navigateToLoginPage().clickLoginWithGoogle();

        String actualText = getTextFromElement(loginPage.actualTextLoginWithGoogleNewWindow);
        String expectedText = "Sign in with Google";

        Assert.assertTrue(compareStrings(actualText, expectedText));
    }

}
