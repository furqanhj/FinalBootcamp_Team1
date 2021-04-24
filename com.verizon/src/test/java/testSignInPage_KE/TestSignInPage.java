package testSignInPage_KE;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import verizonSignInPage_KE.SignInPage;

import java.util.List;

public class TestSignInPage extends BaseAPI {

        SignInPage signInPage;

        @Test(priority = 1,enabled = false)
    public void testClickSignInBtn(){
            signInPage = new SignInPage();
            signInPage.clickSignInBtn();
            final boolean b = !isElementEnabled(signInPage.signINBtn2);
            Assert.assertTrue(b);
        }
    @Test(priority = 2,enabled = false)
    public void testEnterUserId(){

            testClickSignInBtn();
            signInPage.enterUserId();
    }
    @Test(priority = 3,enabled = false)
    public void testEnterPassword(){

        testEnterUserId();
        signInPage.enterPassword();
    }

    @Test (priority = 4,enabled = false)
    public void testClickSignInBtn2(){
            testEnterPassword();
            signInPage.clickSignBtn2();
            String str1=getTextFromElement(signInPage.validateSIgnIn);
            System.out.println(str1);
            String str2="gig@gmail.com";
            compareStrings(str1,str2);
    }
    @Test(priority = 5,enabled = false)
    public void testClickRegisterLink (){
            testClickSignInBtn();
            signInPage.clickRegisterLink();
            isElementSelected(signInPage.wirelessRadioButton);
  }
  @Test(priority = 6, enabled = false)
    public void testSelectInHomeRadioButton(){
            testClickRegisterLink();
            signInPage.selectInHomeRadioButton();
            isElementSelected(signInPage.inHomeRadioButton);


  }
    @Test(priority = 7,enabled = false)
    public void testSubmitInHomeSelection(){
           testSelectInHomeRadioButton();
           signInPage.submitInHomeSelection();
        final boolean b = !isElementEnabled(signInPage.continueBtn1);
        Assert.assertTrue(b);


    }
    @Test(priority = 8,enabled = false )
    public void testSelectRegistrationMethodOptions(){
            testSubmitInHomeSelection();
            signInPage.selectRegistrationMethodOptions();
            isElementSelected(signInPage.option1);

    }
    @Test(priority = 9,enabled = true)
    public void testCountRegistrationMethodOptions (){
            testSubmitInHomeSelection();
            clickElement(signInPage.selectRegistrationMethod);

            signInPage.countRegistrationMethodOptions();
        List<WebElement> options1 =driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div/ul/li"));
        waitForVisibilityOfElement(signInPage.selectRegistrationMethod);
        System.out.println(options1.size());
        int actualCount = options1.size();
        int expectedCount =7 ;
        Assert.assertEquals(actualCount, expectedCount, "COUNT OF CATEGORIES DOES NOT MATCH");
    }


}
