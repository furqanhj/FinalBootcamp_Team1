package testVerizonSupportPageAB;

import common.BaseAPI;
import org.apache.hc.core5.reactor.Command;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizonSupportPageAB.VerizonSupportPage;

public class TestVerizonSupportPage extends BaseAPI {
    VerizonSupportPage verizonSupportPage;


    @Test(priority = 1, enabled = true)
    public void TestNavigateToSupportPage(){
        verizonSupportPage= new VerizonSupportPage();
        verizonSupportPage.navigateToSupportLink();
        String actualMessage=getTextFromElement(verizonSupportPage.supportWelcomeMessage);
        String expectedMessage="Verizon Support";
        Assert.assertEquals(actualMessage, expectedMessage,"Does not Match");
    }

    @Test(priority = 2, enabled = false)

    public void TestSupportOverViewURL(){
        verizonSupportPage= new VerizonSupportPage();
        verizonSupportPage.navigateToSupportLink();
        String ActualURL=driver.getCurrentUrl();
        String ExpectedURL="https://www.verizon.com/digital/nsa/nos/ui/support/nonsigninlanding";
        Assert.assertEquals(ActualURL, ExpectedURL,"Does not Match");
    }

    @Test(priority = 3, enabled = false)
    public void TestVerizonLOGO(){
        verizonSupportPage= new VerizonSupportPage();
        boolean logoPresent=verizonSupportPage.verizonLogo.isDisplayed();
        Assert.assertTrue(logoPresent);
    }
    @Test(priority = 4, enabled = false)
    public void TestSupportSearchUrl(){
        verizonSupportPage= new VerizonSupportPage();
        verizonSupportPage.navigateToSupportLink();
        String searchText="hotspot";
        verizonSupportPage.sendKeysToElement(verizonSupportPage.supportSearchTextBox, searchText);
        clickElement(verizonSupportPage.supportSearchButton);
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.verizon.com/onesearch/search?q=hotspot&source=support";
        Assert.assertEquals(actualUrl, expectedUrl, "Link Does not match");
    }

        @Test(priority = 5, enabled =false )
        public void TestVerizonSignIn(){
            verizonSupportPage= new VerizonSupportPage();
            verizonSupportPage.navigateToSupportLink();
            clickElement(verizonSupportPage.signInLink);
            String userId="abegum";
            String password="12345c";
            sendKeysToElement(verizonSupportPage.userIdBox,userId);
            sendKeysToElement(verizonSupportPage.passWordBox, password);
            clickElement(verizonSupportPage.signInButton);
            driver.switchTo();
            String actualMessage=getTextFromElement(verizonSupportPage.failLogInMessage);
            String expectedMessage="Hey there, I'm your Verizon digital assistant.";
            Assert.assertEquals(actualMessage,expectedMessage,"Log In failure Does not match");



        }








}
