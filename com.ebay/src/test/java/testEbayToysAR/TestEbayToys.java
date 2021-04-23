package testEbayToysAR;

import common.BaseAPI;
import ebayToysAR.EbayToys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static ebayToysAR.EbayToysWebElements.*;

public class TestEbayToys extends BaseAPI {

    @Test(enabled = false)
    public void testTypeInToysSearchBox() {
        EbayToys ebayToys = new EbayToys();
        ebayToys.typeInToysSearchBox();
        String expected = "Lol dolls in Toys and Hobbies | eBay";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual, "TITLES DO NOT MATCH");
    }

    @Test(enabled = false)
    public void testNavigateToToysPage() {
        implicitWait(20);
        EbayToys ebayToys = new EbayToys();
        ebayToys.navigateToToysPage();
        assertEqualsGetText("Toys & Hobbies", WEB_ELEMENT_TOYS_HOBBIES_HEADER);
    }

    @Test(enabled = false)
    public void testClickSeeAllEducationalLink() {
        EbayToys ebayToys = new EbayToys();
        implicitWait(20);
        ebayToys.clickSeeAllEducationalLink();
        implicitWait(20);
        assertEqualsGetText("Educational Toys", "WEB_ELEMENT_EDUCATIONAL_TOYS_HEADER ");
    }

    @Test(enabled = false)
    public void testClickCartImage() {
        EbayToys ebayToys = new EbayToys();
        implicitWait(20);
        ebayToys.clickCartImage();
        implicitWait(20);
        assertEqualsGetTitle("eBay shopping cart");
    }

    @Test(enabled = false) //failed
    public void testVerifyPageTitle() {
        EbayToys ebayToys = new EbayToys();
        ebayToys.navigateToToysPage();
        String exp = "Toys & Hobbies products for sale | eBay";
        String act = driver.getTitle();
        //Compares 2 Strings -->equalsIgnoreCase will Compare Strings even if in upper or lower case
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

    @Test(enabled = false)
    public void testPageTitleInspection() {
        String expectedTitle = "";
        String actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        softAssert.assertNotSame(actualTitle, expectedTitle);
        softAssert.assertAll();


    }
    @Test(enabled = true)
    public void testClickMyEbayDropDownLink(){
        EbayToys ebayToys = new EbayToys();
        ebayToys.clickMyEbayDropDownLink();
        assertEqualsGetTitle("Security Measure");
    }
}















