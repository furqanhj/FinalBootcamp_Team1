package testAttInternetPageKE;

import attInternetPageKE.AttInternetPage;
import common.BaseAPI;
import org.openqa.selenium.JavascriptExecutor;
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
     @Test(priority = 5,enabled = false)
    public void testClickCheckAvailabilityButton2(){
    testSendAddressTOTextField();
    attInternetPage.clickCheckAvailabilityButton2();
    String actualText=getTextFromElement(attInternetPage.textMessage);
    String expectedText="Looks like high-speed internet isn’t available at your address. However, you can still get great TV service.";
   Assert.assertEquals(actualText,expectedText);

         System.out.println(actualText);

     }

    @Test (priority = 6,enabled = false)
    public void testHover() throws Exception {
        testClickInternetImageLink();
        attInternetPage = new AttInternetPage();
        attInternetPage.hoverOverSignMeUpButton();

        String actualAttributeValue = attInternetPage.hoverSignMeUpButton.getAttribute("style");
       // String expectedAttributeValue = "color: rgb(1, 113, 143); border-color: rgb(255, 255, 255); box-shadow: rgb(255, 255, 255) 0px 0px 0px 70px inset;";

        System.out.println(actualAttributeValue);
        //System.out.println(expectedAttributeValue);

      //  Assert.assertEquals(actualAttributeValue, expectedAttributeValue, "COLOR DOES NOT MATCH");
    }
    @Test(priority = 7,enabled = false)
    public void testClickFindStoreTextLink()  {

    testClickInternetImageLink();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent" +
                "('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
                + "arguments[0].dispatchEvent(evt);", attInternetPage.findStoreTextLink);

       // attInternetPage.clickFindStoreTextLink();
        waitForVisibilityOfElement(attInternetPage.findStoreTextLink);

        String actualText=getTextFromElement(attInternetPage.findStoreTextLink);
        String expectedText="AT&T Stores Near You";
        Assert.assertEquals(actualText,expectedText);
        System.out.println(actualText);





    }




}
