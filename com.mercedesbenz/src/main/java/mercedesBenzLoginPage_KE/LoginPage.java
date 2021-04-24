package mercedesBenzLoginPage_KE;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static mercedesBenzLoginPage_KE.LoginPageWebElementLocators.*;

public class LoginPage extends BaseAPI {
    @FindBy(xpath = WEB_ELEMENT_MY_ACCOUNT_TEXT_LINK)
    public WebElement myAccountTextLink;
    @FindBy(css = WEB_ELEMENT_LOGIN_BTN)
    public WebElement loginBtn;
    @FindBy(xpath = WEB_ELEMENT_CONTINUE_BTN)
    public WebElement continueBtn;
    @FindBy(css = WEB_ELEMENT_USERNAME_INPUT)
    public WebElement userNameInput;
    @FindBy(xpath=WEB_ELEMENT_ERROR_MESSAGE_TEXT)
    public WebElement loginErrorMessage;
    @FindBy(css = WEB_ELEMENT_MoBILE_SWITCH_BTN)
    public WebElement mobileSwitchBtn;
    @FindBy(xpath = WEB_ELEMENT_MESSAGE_INPUT_AFTER_MOBILE_SWITCH)
    public WebElement messageInputAfterMobileSwitch;
    @FindBy(xpath = WEB_ELEMENT_RegisterTextLink)
    public WebElement registerTextLink;
    @FindBy(css = WEB_ELEMENT_FIRST_NAME_INPUT)
    public WebElement firstName1;
    @FindBy(css = WEB_ELEMENT_LAST_NAME_INPUT)
    public WebElement lastName1;
    @FindBy(xpath = WEB_ELEMENT_PASSWORD_INPUT)
    public WebElement password1;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickLoginBtn(){
        clickElement(myAccountTextLink);
        clickElement(loginBtn);
    }
    public void enterUserName() {
        sendKeysToElement(userNameInput, "gigi@gmail.com");
    }
    public void clickContinueBtn(){
        clickElement(continueBtn);

    }
    public void clickMobileSwitchBtn(){
        clickJScript(mobileSwitchBtn);


    }
    public void doRegister(){
        clickElement(registerTextLink);

    }


//    @DataProvider(name="register")
//    public Object [] getData(){
//        String[] data={"gigi@gmail.com","Gigi","Saidi","abc123"};
//        return data;
//    }
//    @Test(dataProvider = "register")
//    public void createUserAccount(String email,String firstName,String lastName,String password){
//
//        sendKeysToElement(userNameInput,email);
//        sendKeysToElement(firstName1, firstName);
//        sendKeysToElement(lastName1, lastName);
//        sendKeysToElement(password1, password);
//
//
//}
}