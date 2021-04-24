package verizonSignInPage_KE;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static verizonSignInPage_KE.SignInPageWebElementLocators.*;

public class SignInPage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_SIGN_IN_BTN1)
    public WebElement signInBtn1;
    @FindBy(xpath = WEB_ELEMENT_SIGN_IN_BTN2)
    public WebElement signINBtn2;
    @FindBy(css = WEB_ELEMENT_USER_ID_INPUT)
    public WebElement userIdInput;
    @FindBy(css = WEB_ELEMENT_PASSWORD_INPUT)
    public WebElement password;
    @FindBy(xpath = WEB_ELEMENT_Validate_SIGN_IN)
    public WebElement validateSIgnIn;
    @FindBy(xpath = WEB_ELEMENT_REGISTER_LINK)
    public WebElement registerLink;
    @FindBy(xpath = WEB_ELEMENT_WIRELESS_RADIO_BUTTON)
    public WebElement wirelessRadioButton;
    @FindBy(xpath = WEB_ELEMENT_IN_HOME_RADIO_BUTTON)
    public WebElement inHomeRadioButton;
    @FindBy(xpath = WEB_ELEMENT_CONTINUE_BTN)
    public WebElement continueBtn;
    @FindBy(xpath = WEB_ELEMENT_CONTINUE_BTN1)
    public WebElement continueBtn1;
    @FindBy(xpath = WEB_ELEMENT_SELECT_OPTION1)
    public WebElement selectRegistrationMethod;
    @FindBy(xpath = WEB_ELEMENT_SELECT_OPTION1)
   public WebElement option1;
    @FindBy(xpath=WEB_ELEMENT_OPTIONS)
   public List<WebElement> options;

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }



    public void clickSignInBtn() {

        clickElement(signInBtn1);


    }

    public void enterUserId() {


        sendKeysToElement(userIdInput, "gig@gmail.com");

    }

    public void enterPassword() {

        sendKeysToElement(password, "Abcd@1234");

    }
    public void clickSignBtn2(){

        clickElement(signINBtn2);
    }
    public void clickRegisterLink(){

        clickElement(registerLink);
    }
    public void selectInHomeRadioButton(){
        clickJScript(inHomeRadioButton);
    }
    public void submitInHomeSelection(){

        clickElement(continueBtn);
    }
    public void selectRegistrationMethodOptions(){


        Select option1= new Select(selectRegistrationMethod);
        option1.selectByIndex(2);
        System.out.println(option1);

    }
    public void countRegistrationMethodOptions(){
        Select count = new Select(selectRegistrationMethod);
        List<WebElement> list = count.getOptions();
        for(WebElement we : list)
        {

        System.out.println(we.getText());

    }
}
}