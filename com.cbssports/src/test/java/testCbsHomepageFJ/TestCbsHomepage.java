package testCbsHomepageFJ;

import cbsHomepageFJ.CbsHomepage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCbsHomepage extends BaseAPI {

    CbsHomepage homepage;

    //TestCase#1: navigate to Login page validation via text
    @Test (priority = 1, enabled = true)
    public void testNavigateToLoginPage(){
        homepage = new CbsHomepage();
        homepage.navigateToLoginPage();

        Assert.assertTrue(isTitleTrue("Sign In - CBSSports.com "));
    }

}
