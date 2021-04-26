package TestKidsAndBaby;

import KidsAndBaby.KidsAndBabyPage;
import common.BaseAPI;
import io.cucumber.java.af.En;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KidsAndBabyTest extends BaseAPI {

    KidsAndBabyPage kidsAndBabyPage;

    //Test 1
    @Test (enabled = false,priority = 1)
    public void testCheckSize (){
        kidsAndBabyPage = new KidsAndBabyPage();
        kidsAndBabyPage.checkSize();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Little Girls (4-6x) Girls (4-16) - Macy's";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 2
    @Test (enabled = false,priority = 2)
    public void testClickApparelType (){
        kidsAndBabyPage = new KidsAndBabyPage();
        kidsAndBabyPage.clickApparelType();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Bank of America Privacy Notices and Policies";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }


    // Test 3
    @Test (enabled = false,priority = 3)
    public void testMyAccount (){
        kidsAndBabyPage = new KidsAndBabyPage();
        kidsAndBabyPage.dropDownMyAccount();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Little Girls (4-6x) Girls (4-16) - Macy's";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 4
    @Test (enabled = false,priority = 4)
    public void testGift (){
        kidsAndBabyPage = new KidsAndBabyPage();
        kidsAndBabyPage.clickGift();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Online Gift Cards at Macy's - Shop Gift Cards and E-Gift Cards Online - Macy's";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 5
    @Test (enabled = false,priority = 5)
    public void testSignup (){
        kidsAndBabyPage = new KidsAndBabyPage();
        kidsAndBabyPage. signUp();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "https://emails.macys.com/pub/sf/FormLink?_ri_=X0Gzc2X%3DAQpglLjHJlTQGN82hKOeOuDC35cLBy3puzffN97mv2qzazc4Nh5hDhqmOVXyjLNpLOfhKLX%3DVXMtX%3DAQpglLjHJlTQGhE7Ozb7omGcR6cNzbP8RUNOwzcP7XvHfn7eMB7zc6mC8ePb&=lgt4pi6p69umicncst43b3cb8tbh0e245bia1qnhic937ntqcek0";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 6
    @Test (enabled = false,priority = 6)
    public void testLists (){
        kidsAndBabyPage = new KidsAndBabyPage();
        kidsAndBabyPage. lists();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Macy's Lists";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 7
    @Test (enabled = false,priority = 7)
    public void testDisney (){
        kidsAndBabyPage = new KidsAndBabyPage();
        kidsAndBabyPage. disney();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Disney Kids Character Shirts & Clothing - Macy's";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 8
    @Test (enabled = false,priority = 8)
    public void testDisneyFrozen (){
        kidsAndBabyPage = new KidsAndBabyPage();
        kidsAndBabyPage. disneyFrozen();

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Frozen Kids Character Shirts & Clothing - Macy's";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 9
    @Test (enabled = false,priority = 9)
    public void testHelloKitty (){
        kidsAndBabyPage = new KidsAndBabyPage();
        kidsAndBabyPage. helloKitty();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Hello Kitty Kids Character Shirts & Clothing - Macy's";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 10
    @Test (enabled = false,priority = 10)
    public void testMarvel (){
        kidsAndBabyPage= new KidsAndBabyPage();
        kidsAndBabyPage. marvel();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Avengers Kids Character Shirts & Clothing - Macy's";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
}

