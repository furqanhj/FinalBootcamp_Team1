package testMercedesBenzLoginPage_KE;
import common.BaseAPI;
import mercedesBenzLoginPage_KE.LoginPage;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseAPI {
    LoginPage loginPage;

    @Test(priority = 1, enabled = false)
    public void testClickLoginBtn() {
        loginPage = new LoginPage();
        loginPage.clickLoginBtn();
        isElementDisplayed(loginPage.continueBtn);

    }

    @Test(priority = 2, enabled = false)
    public void testEnterUserName() {

        testClickLoginBtn();
        loginPage.enterUserName();

//       String str1 = loginPage.loginErrorMessage.getText();
//        System.out.println(str1);
//       String str2 ="No account was found for this user name";
//        compareStrings(str1,str2);
    }
    @Test(priority = 3, enabled = false)
    public void testContinueBtn() {
        testClickLoginBtn();
        loginPage.clickContinueBtn();
    }
    @Test(priority = 4, enabled = false)
    public void testClickMobileSwitchBtn() {
        testClickLoginBtn();
        loginPage.clickMobileSwitchBtn();
        String str1 = getTextFromElement(loginPage.messageInputAfterMobileSwitch);
        System.out.println(str1);
        String str2 = "Mobile phone number *";
        compareStrings(str1, str2);

    }

    @Test(priority = 5, enabled = false)
    public void testDoRegister() {
        testClickLoginBtn();
        loginPage.doRegister();
        isElementDisplayed(loginPage.continueBtn);


//    }
//    @Test
//    public void testCreateUserAccount (){
//       testDoRegister();
//       loginPage.createUserAccount(String "email",String "firstName",String "lastName",String "password");
//
//
//    }

    }
}








