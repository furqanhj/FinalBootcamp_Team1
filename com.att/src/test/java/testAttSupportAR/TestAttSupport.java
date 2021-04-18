package testAttSupportAR;

import attSupportAR.AttSupport;
import common.BaseAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static attSupportAR.AttSupportWebElements.*;

public class TestAttSupport extends BaseAPI {


//    AttSupport attSupportAR;

    @Test(enabled = false)
    public void testNavigateToSupportPage() {

        AttSupport attSupportAR = new AttSupport();
        attSupportAR.navigateToAttSupportPage();

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Customer Service & Support - AT&T Official Site";

        Assert.assertEquals(actualResult, expectedResult, "PAGE NOT FOUND");
    }

    @Test(enabled = false)
    public void testDoSearch() {
        AttSupport attSupportAR = new AttSupport();
        attSupportAR.navigateToAttSupportPage();

        attSupportAR.doSearch();

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "AT&T Customer Service & Support - AT&T Official Site";
        Assert.assertEquals(actualResult, expectedResult, "PAGE NOT FOUND");
    }

    @Test(enabled = false)
    public void testClickManageDataUseLink() {
        AttSupport attSupportAR = new AttSupport();
        attSupportAR.navigateToAttSupportPage();
        attSupportAR.clickManageDataUseLink();

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Login Screen";
        Assert.assertEquals(actualResult, expectedResult, "PAGE NOT FOUND");
    }

    @Test(enabled = false)
    public void testClickAccountDropDown() throws InterruptedException {
        AttSupport att = new AttSupport();
        att.selectAccountDropdown();
        assertEqualsGetText("Sign in", WEB_ELEMENT_SIGN_IN_HEADER);
    }

    @Test(enabled = true)
    public void testViewYourBillPeriod() {
        AttSupport att = new AttSupport();
        att.viewYourBillPeriod();
        assertEqualsGetText("View your bill period", WEB_ELEMENT_VIEW_YOUR_BILL_PERIOD_HEADER);
    }

    @Test(enabled = false)
    public void testVerifyPageTitle() {
        String exp = "";
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
}
