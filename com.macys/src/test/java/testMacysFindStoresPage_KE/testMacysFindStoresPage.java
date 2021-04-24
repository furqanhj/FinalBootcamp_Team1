package testMacysFindStoresPage_KE;

import common.BaseAPI;
import macysFindStoresPage_KE.MacysFindStoresPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class testMacysFindStoresPage extends BaseAPI {

    MacysFindStoresPage macysFindStoresPage;
    @Test(priority = 1,enabled = false)
    public void testClickStoresTextLink()  {
        macysFindStoresPage=new MacysFindStoresPage();
        macysFindStoresPage.clickStoresTextLink();
        isElementDisplayed(macysFindStoresPage.searchBtn);


    }
    @Test(priority = 2,enabled = true)
    public void testHoverOnShopByDepartmentTextLink(){
        testClickStoresTextLink();
        macysFindStoresPage.hoverOnShopByDepartmentTextLink();
        String str1=getTextFromElement(macysFindStoresPage.beautyLink);
        String str2="Beauty";
        compareStrings(str1,str2);

    }
    @Test ( priority = 3,enabled = true)
    public void testCountOfCategoryDropdownOptions() {
        testHoverOnShopByDepartmentTextLink();


        List<WebElement> elementList = macysFindStoresPage.expectedDepartmentHoverOverShopBYDep;

        int actualCount = elementList.size();
        int expectedCount = 16;

        Assert.assertEquals(actualCount, expectedCount, "COUNT OF CATEGORIES DOES NOT MATCH");
    }


}
