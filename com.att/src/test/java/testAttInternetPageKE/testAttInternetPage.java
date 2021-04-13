package testAttInternetPageKE;

import attInternetPageKE.AttInternetPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testAttInternetPage extends BaseAPI {
    AttInternetPage attInternetPage;

@Test(priority = 1,enabled = false)
    public void testClickInternetImageLink(){
    attInternetPage = new AttInternetPage();
    attInternetPage.clickInternetImageLink();

    String actualTitle = driver.getTitle();
    String expectedTitle = "AT&T INTERNET | Internet for your Home including AT&T Fiber";
    Assert.assertEquals(actualTitle, expectedTitle, "Text Not Matching");
    System.out.println(actualTitle);

}
    @Test(priority =2,enabled = false)
    public void testClickAccountTextLink (){
    testClickInternetImageLink();
    attInternetPage.clickAccountTextLink();

    String expectedText="Manage profile";
    String actualText = getTextFromElement(attInternetPage.manageProfileTextLink);
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Actual is :" + actualText);



    }
    @Test(priority = 3,enabled = false)
    public void testClickCheckAvailabilityButton(){
    testClickInternetImageLink();
    attInternetPage.clickCheckAvailabilityButton();

        String expectedText="Check for service";
        String actualText = getTextFromElement(attInternetPage.textCheckForService);
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Actual is :" + actualText);

    }
    @Test(priority = 4,enabled = false)
    public void testSendAddressTOTextField(){
    testClickCheckAvailabilityButton();
    attInternetPage.sendAddressTOTextField();

    }
     @Test(priority = 5,enabled = true)
    public void testClickCheckAvailabilityButton2(){
    testSendAddressTOTextField();
    attInternetPage.clickCheckAvailabilityButton2();
    String actualText=getTextFromElement(attInternetPage.textMessage);
    String expectedText="Looks like high-speed internet isn’t available at your address. However, you can still get great TV service.";
    Assert.assertEquals(actualText,expectedText);
         System.out.println(actualText);

     }






}
