package testAdvancedSearchPageFJ;

import common.BaseAPI;
import ebayAdvancedSearchPageFJ.EbayAdvancedSearchPage;
import ebayHomepageFJ.EbayHomepage;
import org.testng.Assert;
import org.testng.annotations.Test;

// TOTAL TEST CASES = 2
public class TestAdvancedSearchPage extends BaseAPI {

    EbayHomepage ebayHomepage;
    EbayAdvancedSearchPage advancedSearchPage;

    //TestCase#1: Entering text in searchBox and excluding keywords, then validating via Text
    @Test (priority = 1, enabled = false)
    public void testDoSearchInAdvancedSearchPage(){
        ebayHomepage = new EbayHomepage();
        advancedSearchPage = new EbayAdvancedSearchPage();

        ebayHomepage.navigateToAdvancedSearchPage().doSearchInAdvancedSearchPage(
                "samsung watch 3",
                "active");

        String actualText = getTextFromElement(advancedSearchPage.expectedTextFromSearchResult);
        String expectedText = "results for samsung watch 3 -active";

        Assert.assertEquals(actualText, expectedText, "TEXT DO NOT MATCH");
    }

    //TestCase#2: click on searchTips Link and validate via
    @Test (priority = 1, enabled = true)
    public void testClickOnSearchTipsLink(){
        ebayHomepage = new EbayHomepage();
        ebayHomepage.navigateToAdvancedSearchPage().clickOnSearchTipsLink();

        Assert.assertTrue(isTitleTrue("General search tips"));
    }
}
