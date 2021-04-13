package testAttSupportAR;

import attSupportAR.AttSupport;
import common.BaseAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

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

    @Test (enabled = true)
    public void testClickAccountDropDown() throws InterruptedException {
        AttSupport att = new AttSupport();
        att.selectAccountDropdown();
        assertEqualsGetText("Sign in",WEB_ELEMENT_SIGN_IN_HEADER);
    }

    @Test (enabled = true)
    public void testViewYourBillPeriod()
    AttSupport att1 = new AttSupport();






}
