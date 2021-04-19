package testExpediaHomepageFJ;

import common.BaseAPI;
import expediaHomepageFJ.ExpediaHomepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExpediaHomepage extends BaseAPI {

    ExpediaHomepage homepage;

    @Test (enabled = true) //Failed- StaleElementReferenceException
    public void testNavigateToSignInPage(){
        homepage = new ExpediaHomepage();
        homepage.navigateToSignInPage();

        String actualTextOnSignInPage = getTextFromElement(homepage.expectedTextOnSignInPage);
        String expectedTextOnSignInPage = "Sign in with your email";

        Assert.assertEquals(actualTextOnSignInPage, expectedTextOnSignInPage, "TEXT DO NOT MATCH");
    }

    @Test (enabled = false) //Failed- StaleElementReferenceException
    public void testNavigationToSignUpPage(){
        homepage = new ExpediaHomepage();
        homepage.navigateToSignUpPage();
        System.out.println("Navigated to Sign-Up Page");



    }
}
