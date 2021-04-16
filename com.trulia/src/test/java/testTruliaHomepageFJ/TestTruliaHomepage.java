package testTruliaHomepageFJ;

import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import truliaHomepageFJ.TruliaHomepage;

//TOTAL TEST CASES = 1
public class TestTruliaHomepage extends BaseAPI {
    TruliaHomepage truliaHomepage;

    @Test(priority = 1)
    public void testNavigateToNeighborhoodsPage(){
        truliaHomepage = new TruliaHomepage();
        truliaHomepage.navigateToNeighborhoodsPage();

        String actualText = getTextFromElement(truliaHomepage.actualTextOnNeighborhoodsPage);
        String expectedText = "Trulia Neighborhoods";

        Assert.assertTrue(compareStrings(actualText, expectedText));
    }
}
