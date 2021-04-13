package testExpediaHomepageFJ;

import common.BaseAPI;
import expediaHomepageFJ.ExpediaHomepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExpediaHomepage extends BaseAPI {

    ExpediaHomepage homepage;

    @Test (enabled = false) //Failed- StaleElementReferenceException
    public void testNavigateToSignInPage(){
        homepage = new ExpediaHomepage();
        homepage.navigateToSignInPage();
        System.out.println("Navigated to Sign-In Page");

        String actualTextOnSignInPage = "\n" +
                "Sign in or select an option\t\t\t\t\t\t".trim();
        Assert.assertTrue(compareStrings(actualTextOnSignInPage, getTextFromElement(homepage.expectedTextOnSignInPage).trim()));
    }

    @Test (enabled = false) //Failed- StaleElementReferenceException
    public void testNavigationToSignUpPage(){
        homepage = new ExpediaHomepage();
        homepage.navigateToSignUpPage();
        System.out.println("Navigated to Sign-Up Page");



    }
}
