package testInventoryPageFJ;

import common.BaseAPI;
import inventoryPageFJ.InventoryPage;
import mercedesHomepageFJ.MercedesHomepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInventoryPage extends BaseAPI {

    MercedesHomepage homepage;
    InventoryPage inventoryPage;

    //TestCase#1: Validate enter zipcode and find dealer
    @Test(priority = 1, enabled = true)
    public void testEnterZipCodeAndFindDealer(){
        homepage = new MercedesHomepage();
        inventoryPage = new InventoryPage();
        homepage.navigateToInventoryPage().enterZipCodeOrCityAndFindDealer("67401");

        Assert.assertTrue(isElementDisplayed(inventoryPage.findDealerSearchButton));
    }
}
