package testHomePageAB;

import common.BaseAPI;
import homePageAB.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testHomePage extends BaseAPI {

    HomePage homePage;
    @Test

    public void testDoSearch(){
        homePage=new HomePage();
        String searchKeys= "Erica";
        homePage.doSearch(searchKeys);

//        driverWait.until(ExpectedConditions.visibilityOf(homePage.expectedTextSearchResult));
        String actualText= getTextFromElement(homePage.expectedTextSearchResult);
        System.out.println(actualText);
//        Assert.assertTrue(compareStrings(actualText,searchKeys));
        Assert.assertEquals(actualText, searchKeys);

    }




}
