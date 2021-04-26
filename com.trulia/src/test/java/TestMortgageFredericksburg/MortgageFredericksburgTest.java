package TestMortgageFredericksburg;

import MortgageFredericksburgMA.MortgageFredericksburgPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MortgageFredericksburgTest extends BaseAPI {

    MortgageFredericksburgPage mortgageFredericksburgPage;

    //Test 1
    @Test (enabled = false,priority = 1)
    public void testDropDownAnyPrice (){
        mortgageFredericksburgPage = new MortgageFredericksburgPage();
        mortgageFredericksburgPage. dropDownAnyPrice();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Fredericksburg, VA Newly Constructed 3 Bed Homes For Sale | Trulia";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    // Test 2
    @Test (enabled = false,priority = 2)
    public void testDropDownBuy (){
        mortgageFredericksburgPage = new MortgageFredericksburgPage();
        mortgageFredericksburgPage.dropDownBuy();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Fredericksburg, VA Newly Constructed 3 Bed Homes For Sale | Trulia";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 3
    @Test (enabled = false,priority = 3)
    public void testClickRent (){
        mortgageFredericksburgPage = new MortgageFredericksburgPage();
        mortgageFredericksburgPage.clickRent();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Fredericksburg, VA Newly Constructed 3 Bed Homes For Sale | Trulia";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 4
    @Test (enabled = false,priority = 4)
    public void testClickAgentsListing (){
        mortgageFredericksburgPage = new MortgageFredericksburgPage();
        mortgageFredericksburgPage. clickAgentsListing();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Fredericksburg, VA Newly Constructed 3 Bed Homes For Sale | Trulia";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 5
    @Test (enabled = false,priority = 5)
    public void testNavigateTownhomes (){
        mortgageFredericksburgPage = new MortgageFredericksburgPage();
        mortgageFredericksburgPage. navigateTownhomes();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Fredericksburg, VA Newly Constructed 3 Bed Homes For Sale | Trulia";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

}
