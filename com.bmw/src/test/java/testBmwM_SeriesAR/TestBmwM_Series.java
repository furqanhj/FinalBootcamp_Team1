package testBmwM_SeriesAR;

import bmwM_SeriesAR.BmwM_Series;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;

import static bmwM_SeriesAR.BmwM_SeriesWebElements.*;

public class TestBmwM_Series extends BaseAPI {

    @Test(enabled = false) //
    public void testMModelHeader() throws InterruptedException {
        BmwM_Series bmwMSeries = new BmwM_Series();
        bmwMSeries.clickMModels();
        assertEqualsGetText("BMW M", WEB_ELEMENT_BMW_M_HEADER);

    }

    @Test(enabled = false) //failed
    public void testLimitedEditionsExploreButton() throws InterruptedException, AWTException {
        BmwM_Series bmwMSeries = new BmwM_Series();
        bmwMSeries.clickMModels();
        bmwMSeries.clickLimitedEditionsExploreButton();
        assertEqualsGetText("Limited Editions",WEB_ELEMENT_LIMITED_EDITIONS_HEADER);
    }

    @Test(enabled = false)
    public void testM3SedanLearnMoreLink() throws InterruptedException {
        BmwM_Series bmwMSeries = new BmwM_Series();
        bmwMSeries.clickMModels();
        implicitWait(20);
    }

    @Test(enabled = false) //passed, but not clicking Models link or the rest..?
    public void testAllModelsPageBmwMLink() {
        BmwM_Series bmwMSeries = new BmwM_Series();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MODELS_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ALL_MODELS_PAGE_BMW_M_LINK);
    }

    @Test(enabled = false)
    public void testNavigateToM3Page() {
        BmwM_Series bmwMSeries = new BmwM_Series();
        bmwMSeries.navigateToM3Page();
        implicitWait(20);
    }

    @Test (enabled = false)
    public void testVerifyPageTitle(){
        String exp = "";
        String act = driver.getTitle();
        //Compares 2 Strings -->equalsIgnoreCase will Compare Strings even if in upper or lower case
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }
    @Test (enabled = false)
    public void testPageTitleInspection(){
        String expectedTitle = "";
        String actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        softAssert.assertNotSame(actualTitle,expectedTitle);
        softAssert.assertAll();
    }




}







