package testMercedesHomepageFJ;

import common.BaseAPI;
import mercedesHomepageFJ.MercedesHomepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMercedesHomepage extends BaseAPI {

    MercedesHomepage homepage;

    //TestCase#1: Validate number of elements on the homepage header (6 elements)
    @Test(priority = 1, enabled = false)
    public void testValidateNumOfLinksOnHomepageHeader(){
        homepage = new MercedesHomepage();

        int actualNumOfLinks = homepage.actualNumberOfElementsOnHomepageHeader.size();
        int expectedNumOfLinks = 6;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
        System.out.println("ACTUAL NUMBER OF LINKS = " + actualNumOfLinks);
        System.out.println("EXPECTED NUMBER OF LINKS = " + expectedNumOfLinks);
    }

    //TestCase#2: Validate navigation to Inventory page, via Element present
    @Test(priority = 2, enabled = false)
    public void testNavigateToInventoryPage(){
        homepage = new MercedesHomepage();
        homepage.navigateToInventoryPage();

        String actualText = getTextFromElement(homepage.actualTextFindLocalInventory);
        String expectedText = "Find Local Inventory";

        Assert.assertTrue(compareStrings(actualText, expectedText));
    }

    //TestCase#3: Validate navigation to Request A Quote page, via Element Present
    @Test(priority = 3, enabled = true)
    public void testNavigateToRequestAQuotePage(){
        homepage = new MercedesHomepage();
        homepage.navigateToRequestAQuotePage();

        Assert.assertTrue(isTitleTrue("Request a Quote | Mercedes-Benz USA"));
    }
}
