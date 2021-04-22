package testRedfinHomepageFJ;

import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import redfinHomepageFJ.RedfinHomepage;

public class TestRedfinHomepage extends BaseAPI {

    RedfinHomepage homepage;

    //TestCase#1: Validate navigation to Mortgage Calculator Page via Text
    @Test(priority = 1, enabled = true)
    public void testNavigateToMortgageCalculatorPage(){
        homepage = new RedfinHomepage();
        homepage.navigateToMortgageCalculatorPage();

        String actualText = getTextFromElement(homepage.actualTextMortgageCalculatorPage);
        String expectedText = "Mortgage Calculator";

        Assert.assertTrue(compareStrings(actualText, expectedText));
        System.out.println("ACTUAL TEXT = " + actualText);
        System.out.println("EXPECTED TEXT = " + expectedText);
    }
}
