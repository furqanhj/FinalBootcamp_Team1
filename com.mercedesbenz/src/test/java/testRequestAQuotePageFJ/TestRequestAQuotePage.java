package testRequestAQuotePageFJ;

import common.BaseAPI;
import mercedesHomepageFJ.MercedesHomepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import requestAQuotePageFJ.RequestAQuotePage;

public class TestRequestAQuotePage extends BaseAPI {

    MercedesHomepage homepage;
    RequestAQuotePage requestAQuotePage;

    //TestCase#1: Validate image displayed after selecting class and model from dropdown
    @Test (priority = 1, enabled = true)
    public void testSelectAVehicleClassAndModelAndSearch(){
        homepage = new MercedesHomepage();
        requestAQuotePage = new RequestAQuotePage();
        homepage.navigateToRequestAQuotePage().selectAVehicleClassAndModelAndSearch();

        Assert.assertTrue(isElementDisplayed(requestAQuotePage.actualImageOfAMGSClassAfterSearch));
    }

    //TestCase#2: Validate number of options in Class dropdown (15 options)
    @Test (priority = 2, enabled = true)
    public void testValidateNumOfOptionsInClassDropdown(){
        homepage = new MercedesHomepage();
        requestAQuotePage = new RequestAQuotePage();
        homepage.navigateToRequestAQuotePage().clickOnVehicleClassDropdown();

        int actualNumOfElements = requestAQuotePage.actualNumOfElementsInClassDropdown.size();
        int expectedNumOfElements = 15;

        Assert.assertTrue(compareIntegers(actualNumOfElements, expectedNumOfElements));
        System.out.println("ACTUAL NUMBER OF ELEMENTS = " + actualNumOfElements);
        System.out.println("EXPECTED NUMBER OF ELEMENTS = " + expectedNumOfElements);
    }

    //TestCase#3: Validate number of options in Model dropdown (12 options)
    @Test (priority = 3, enabled = true)
    public void testValidateNumOfOptionsInModelDropdown(){
        homepage = new MercedesHomepage();
        requestAQuotePage = new RequestAQuotePage();
        homepage.navigateToRequestAQuotePage().clickOnVehicleModelDropdown();

        int actualNumOfElements = requestAQuotePage.actualNumOfElementsInModelDropdown.size();
        int expectedNumOfElements = 12;

        Assert.assertTrue(compareIntegers(actualNumOfElements, expectedNumOfElements));
        System.out.println("ACTUAL NUMBER OF ELEMENTS = " + actualNumOfElements);
        System.out.println("EXPECTED NUMBER OF ELEMENTS = " + expectedNumOfElements);
    }
}
