package testHomePageAB;

import common.BaseAPI;
import homePageAB.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Text;

public class testHomePage extends BaseAPI {

    HomePage homePage;

    @Test(enabled = false)
    public void TestNevigateDealsPage(){
        homePage = new HomePage();
        homePage.navigateToDealsPage();
        String actualTitle=driver.getTitle();
        String expectedTitle="Macy's Coupons, Deals and Promotions - SAVE NOW!";
        Assert.assertEquals(actualTitle, expectedTitle, "Title DoNot Match");

    }


    @Test(enabled = false)
    public void testDoSearch(){
        homePage= new HomePage();
        String searchKeys="boys shoe";
        homePage.doSearch(searchKeys);

        String actualText=getTextFromElement(homePage.expectedTextSearchResult);
        System.out.println(actualText);

//        String expectedText="We found 975 results for boys shoe";

        Assert.assertEquals(actualText,searchKeys);
    }

    @Test (enabled = false)
    public void testPageTitle(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Macy's - Shop Fashion Clothing & Accessories - Official Site - Macys.com";
        Assert.assertEquals(actualTitle,expectedTitle,"Title do not match");
    }

    @Test (enabled = false)
    public void testDoInValidSighIn() throws InterruptedException {
        homePage=new HomePage();
        homePage.doInvalidLogIn("abc@gmail.com", "12345");
        Thread.sleep(1000);
        String actualText= homePage.actualTextErrorMessage.getText();
        String expectedText="Sorry, it looks like there's a problem on our end. For assistance, please call 1-800-289-6229.";
        Assert.assertEquals(actualText, expectedText, "Text Donot Match");
    }

    @Test (enabled = false)
    public void testLogoPresent(){
        homePage=new HomePage();
        boolean logoPresent=homePage.MacysLogo.isDisplayed();
        Assert.assertTrue(logoPresent);
    }
    @Test (enabled = false)

    public void testDoInValidMyAccount() throws InterruptedException {
        homePage=new HomePage();
        homePage.doInvalidMyAccount("abc@gmail.com", "12345");
        Thread.sleep(1000);
        String actualText=homePage.actualTextErrorMessage.getText();
        String expectedText="Sorry, it looks like there's a problem on our end. For assistance, please call 1-800-289-6229.";
        Assert.assertEquals(actualText,expectedText, "Text Donot Match");
    }
    @Test
    public void testDoCheckMyShoppingCart() throws InterruptedException {

        homePage=new HomePage();
        homePage.doCheckMyShoppingCart();
        Thread.sleep(1000);

        System.out.println(driver.getTitle());
        String actualTitle= driver.getTitle();
        String expectedTitle= "Macy's Shopping Bag";
       //String actualText=homePage.actualTextErrorMessage.getText();
        //System.out.println(actualText);
//       String expectedText="Hi! Your Shopping Bag is empty.Have saved items? Sign in to see them";
//       Assert.assertEquals(actualText,expectedText, "Text Donot Match");
        Assert.assertEquals(actualTitle,expectedTitle, "Text Donot Match");
    }



}
