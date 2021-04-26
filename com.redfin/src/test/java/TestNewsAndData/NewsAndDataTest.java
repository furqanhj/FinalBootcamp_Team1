package TestNewsAndData;

import NewsAndDataMA.NewsAndDataPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewsAndDataTest extends BaseAPI {

    NewsAndDataPage newsAndDataPage;

    //Test 1
    @Test (enabled = false,priority = 1)
    public void testDropDownBuy (){
        newsAndDataPage = new NewsAndDataPage();
        newsAndDataPage. NavigateDropDownBuy ();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Redfin Real Estate News";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    //Test 2
    @Test (enabled = false,priority = 2)
    public void testNavigateDropDownSell (){
        newsAndDataPage = new NewsAndDataPage();
        newsAndDataPage. navigateDropDownSell();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Redfin Real Estate News";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    //Test 3
    @Test (enabled = false,priority = 3)
    public void testVerifyInvalidEmail (){
        newsAndDataPage = new NewsAndDataPage();
        newsAndDataPage. verifyInvalidEmail();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Redfin Real Estate News";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 4
    @Test (enabled = false,priority = 4)
    public void testClickContact (){
        newsAndDataPage = new NewsAndDataPage();
        newsAndDataPage . clickContact();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Redfin Real Estate News";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 5
    @Test (enabled = false,priority = 5)
    public void testValidEmail (){
        newsAndDataPage = new NewsAndDataPage();
        newsAndDataPage. validEmail();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Redfin Real Estate News";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 6
    @Test (enabled = false,priority = 6)
    public void testInvalidEmail (){
        newsAndDataPage = new NewsAndDataPage();
        newsAndDataPage. invalidEmail();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Redfin Real Estate News";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }
}
