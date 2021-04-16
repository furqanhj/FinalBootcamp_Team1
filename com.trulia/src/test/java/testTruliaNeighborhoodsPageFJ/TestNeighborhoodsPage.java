package testTruliaNeighborhoodsPageFJ;

import common.BaseAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import truliaHomepageFJ.TruliaHomepage;
import truliaNeighborhoodsPageFJ.NeighborhoodsPage;

//TOTAL TEST CASES = 8
public class TestNeighborhoodsPage extends BaseAPI {

    TruliaHomepage homepage;
    NeighborhoodsPage neighborhoodsPage;

    @Test(priority = 1, enabled = true)
    public void testSearchForACityOrNeighborhood() {
        homepage = new TruliaHomepage();
        homepage.navigateToNeighborhoodsPage().searchForACityOrNeighborhood("Las Vegas");

        Assert.assertTrue(isTitleTrue(driver.getTitle()));
    }

    // First attempt to use actions class to move over an element then click it.
    @Test(priority = 2, enabled = true)
    public void testWaitForAndClickOnAustinLink() {
        homepage = new TruliaHomepage();
        neighborhoodsPage = new NeighborhoodsPage();
        homepage.navigateToNeighborhoodsPage().waitForAndClickOnAustinLink();

        String actualText = getTextFromElement(neighborhoodsPage.actualTextOnSearchResultPageAustin);
        String expectedText = "Austin, TX Homes For Sale & Real Estate";

        Assert.assertTrue(compareStrings(actualText, expectedText));
    }

    @Test(priority = 3, enabled = true, dependsOnMethods = "testWaitForAndClickOnAustinLink")
    public void testClickOnPriceRangeMinimumDropdown() {
        homepage = new TruliaHomepage();
        neighborhoodsPage = new NeighborhoodsPage();

        homepage.navigateToNeighborhoodsPage().clickOnPriceRangeMinimumDropdown();

        int actualNumOfOptions = neighborhoodsPage.actualNumberOfOptionsInMinPriceRange.size();
        int expectedNumOfOptions = 45;

        Assert.assertEquals(actualNumOfOptions, expectedNumOfOptions);
    }

    // Test Failing - need to work on it later on !!
    @Test(priority = 4, enabled = true, dependsOnMethods = "testClickOnPriceRangeMinimumDropdown")
    public void testClickOnPriceRangeMaximumDropdown() {
        homepage = new TruliaHomepage();
        homepage.navigateToNeighborhoodsPage().clickOnPriceRangeMaximumDropdown();

        int actualNumOfOptions = neighborhoodsPage.actualNumberOfOptionsInMaxPriceRange.size();
        int expectedNumOfOptions = 45;

        Assert.assertEquals(actualNumOfOptions, expectedNumOfOptions);
    }

    @Test(priority = 5, enabled = true)
    public void testResultPageChangesAfterMinAndMaxPriceRangeUsingIndex() {
        homepage = new TruliaHomepage();
        neighborhoodsPage = new NeighborhoodsPage();

        homepage.navigateToNeighborhoodsPage().selectMinAndMaxPriceRangeInSearchResultPage(4, 7);
        new WebDriverWait(driver, 20).until(ExpectedConditions.urlToBe("https://www.trulia.com/for_sale/Austin,TX/50000-150000_price/"));

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.trulia.com/for_sale/Austin,TX/50000-150000_price/";
        Assert.assertEquals(actualURL, expectedURL, "URLs DO NOT MATCH");
    }

    @Test(priority = 6, enabled = true)
    public void testSwitchToRentOptionEnterTextAndSearch() {
        homepage = new TruliaHomepage();
        homepage.navigateToNeighborhoodsPage().selectRentOptionEnterTextAndSearchBottomOfNeighborhoodPage("67401");

        String actualText = getTextFromElement(new NeighborhoodsPage().getActualTextOnSearchResultPage67401);
        String expectedText = "Apartments For Rent in 67401";

        Assert.assertTrue(compareStrings(actualText, expectedText));
    }

    @Test(priority = 7, enabled = true)
    public void testEnterValidEmailAddressForLatestOnTrulia(){
        homepage = new TruliaHomepage();
        homepage.navigateToNeighborhoodsPage().enterValidEmailAddressForLatestOnTrulia("dummy@gmail.com");

        String actualText = new NeighborhoodsPage().actualTextWithValidEmailRegistration.getText();
        String expectedText = "Hold tight...";

        Assert.assertTrue(compareStrings(actualText, expectedText));
    }

    @Test(priority = 8, enabled = true)
    public void testEnterInvalidEmailAddressForLatestOnTrulia(){
        homepage = new TruliaHomepage();
        homepage.navigateToNeighborhoodsPage().enterInvalidEmailAddressForLatestOnTrulia("FSDdkjk");

        String actualText = new NeighborhoodsPage().actualTextWithInvalidEmailRegistration.getText();
        String expectedText = "* A valid email address is required.";

//        Assert.assertTrue(compareStrings(actualText, expectedText));
        Assert.assertEquals(actualText, expectedText, "TEXT DO NOT MATCH");
    }

}
