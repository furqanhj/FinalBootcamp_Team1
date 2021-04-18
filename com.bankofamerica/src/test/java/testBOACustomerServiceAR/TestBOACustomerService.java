package testBOACustomerServiceAR;

import boaCustomerServiceAR.BoaCustomerService;
import common.BaseAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static boaCustomerServiceAR.BoaCustomerServiceWebElements.*;

public class TestBOACustomerService extends BaseAPI {

    @Test(enabled = false)
    public void testCustomerServiceHeader(){
        BoaCustomerService boaCustomerService = new BoaCustomerService();
        boaCustomerService.clickContactUsLink();
        assertEqualsGetText("Bank of America Customer Service", WEB_ELEMENT_CUSTOMER_SERVICE_HEADER);
    }

    @Test (enabled = false)
    public void testSignInLink(){
        BoaCustomerService boaCustomerService = new BoaCustomerService();
        boaCustomerService.clickSignInLink();
        assertEqualsGetText("Personal & Small Business sign-in",WEB_ELEMENT_SIGN_IN_HEADER);
    }

    @Test(enabled = false)
    public void testLocationsLink(){
        BoaCustomerService boaCustomerService = new BoaCustomerService();
        boaCustomerService.clickLocationsLink();
        assertEqualsGetTitle("Bank of America Financial Centers and ATMs");
    }

    @Test (enabled = false)
    public void testHelpSearchBox() throws InterruptedException {
        BoaCustomerService boaCustomerService = new BoaCustomerService();
        boaCustomerService.clickHelpSearchBox();
        assertEqualsGetText("Suggested searches", WEB_ELEMENT_SEARCH_BOX_SUGGESTED_SEARCHES);
    }

    @Test (enabled = true)
    public void testTypeInHelpSearchBox() throws InterruptedException {
        BoaCustomerService boaCustomerService = new BoaCustomerService();
        boaCustomerService.typeInHelpSearchBox();
        assertEqualsGetAttribute("account",WEB_ELEMENT_HELP_SEARCH_BOX,"value");


    }

    @Test (enabled = false)
    public void testVerifyPageTitle(){
        String exp = "";
        String act = driver.getTitle();
        //Compares 2 Strings -->equalsIgnoreCase will Compare Strings even if in upper or lower case
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }
    @Test (enabled = false)
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
