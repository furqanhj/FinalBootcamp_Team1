package testMacysListsPageFJ;

import common.BaseAPI;
import macysHomepageFJ.MacysHomepage;
import macysListPageFJ.MacysListsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMacysListsPage extends BaseAPI {

    MacysHomepage homepage;
    MacysListsPage listsPage;

    //TestCase#1: navigate to sign-in page, validate via text
    @Test (priority = 1, enabled = false)
    public void testNavigateToSignInPage(){
        homepage = new MacysHomepage();
        listsPage = new MacysListsPage();
        homepage.navigateToListsPage().navigateToSignInPage();

        String actualText = listsPage.actualTextOnSignInPage.getText();
        String expectedText = "Secure Sign In";

        Assert.assertTrue(compareStrings(actualText, expectedText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }

    //TestCase#2: click GO Arrow and go to Guest List default page, validate via Text
    // FAILED ! - Will not work as chromeDriver does not have permission to access the intended webpage.
    @Test (priority = 2, enabled = false)
    public void testClickGoArrowInGuestListTable(){
        homepage = new MacysHomepage();
        listsPage = new MacysListsPage();
        homepage.navigateToListsPage().clickGoArrowInGuestListTable();

        String actualText = listsPage.actualTextOnGuestListDefaultPage.getText();
        String expectedText = "Your List is empty - let's fix that!";

        Assert.assertTrue(compareStrings(actualText, expectedText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }

    //TestCase#3: search for NIKE MEN HOODIE using search method, validate via element presence
    // FAILED ! - Will not work as chromeDriver does not have permission to access the intended webpage.
    @Test (priority = 3, enabled = false)
    public void testSearchForAnItem(){
        homepage = new MacysHomepage();
        listsPage = new MacysListsPage();
        homepage.navigateToListsPage().searchForAnItem("Nike Men Hoodie");

        Assert.assertTrue(isElementDisplayed(listsPage.actualElementAfterSearchResultNikeMenHoodie));
    }

    //TestCase#4:
}
