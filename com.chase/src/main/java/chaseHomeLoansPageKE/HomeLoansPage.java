package chaseHomeLoansPageKE;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static chaseHomeLoansPageKE.HomeloansWebElementsLocators.*;

public class HomeLoansPage extends BaseAPI {
    @FindBy(xpath = WEB_ELEMENT_HOME_LOANS_TEXT_LINK)
    public WebElement homeLoansTextLink;
    @FindBy(xpath = WEB_ELEMENT_FAMILY_IMAGE)
    public WebElement familyImage;
    @FindBy(css = WEB_ELEMENT_SIGN_IN_BTN)
    public WebElement signInBtn;
    @FindBy(xpath = WEB_ELEMENT_CHASE_LOGO)
    public WebElement chaseLogo;
    @FindBy(xpath = WEB_ELEMENT_FOOTER_TEXT)
    public WebElement footerText;
    @FindBy(xpath = WEB_ELEMENT_USERNAME_FIELD)
    public WebElement userNameField;
    @FindBy(xpath = WEB_ELEMENT_PASSWORD_FIELD)
    public WebElement passwordField;
    @FindBy(xpath = WEB_EME_ELEMENT_SIGN_BTN2)
    public WebElement signInBtn2;
    @FindBy(xpath = WEB_ELEMENT_LOGON_FRAME)
    public WebElement logonFrame;
    @FindBy(xpath = WEB_ELEMENT_LOGON_MESSAGE)
    public WebElement logonMessage;
    @FindBy(xpath  = WEB_ELEMENT_VIDEO_PLAY_BTN)
    public WebElement videoPlayBtn;
    @FindBy(xpath = WEB_ELEMENT_VIDEO_ICON_CLOSE)
    public WebElement videoIconClose;
    @FindBy(xpath = WEB_ELEMENT_ESTIMATE_YOUR_RATE)
    public WebElement estimateYourRate;
    @FindBy(xpath = WEB_ELEMENT_MORTGAGE_TEXT)
    public WebElement mortgageText;
    @FindBy(css = WEB_ELEMENT_IFRAME)
    public WebElement iFrame;
    @FindBy(css = WEB_ELEMENT_HOME_PRICE_FIELD)
    public WebElement homePriceField;
    @FindBy(xpath = WEB_ELEMENT_DOWN_PAYMENT_FIELD)
    public WebElement downPayment;
    @FindBy(css = WEB_ELEMENT_ZIPCODE_FIELD)
    public WebElement zipCode;
    @FindBy(css = WEB_ELEMENT_CREDIT_SCORE)
    public WebElement creditScoreSel;
    @FindBy(css = WEB_ELEMENT_SCORE)
    public WebElement selectScore;
    @FindBy(css = WEB_ELEMENT_CHOSE_ONE_SEL)
    public WebElement choseOneSelector;
    @FindBy(css = WEB_ELEMENT_LowInterest)
    public WebElement lowInterest;
    @FindBy(css = WEB_ELEMENT_GET_MyOPTION_BTN)
    public WebElement getMyOptionsBtn;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE_GetMyOptions)
    public WebElement validateGetMyOptions;



    public HomeLoansPage(){
        PageFactory.initElements(driver, this);

    }

    public void clickHomeLoansTextLink(){

        clickElement(homeLoansTextLink);
    }
    public void clickSignInBtn(){
        clickElement(signInBtn);



    }
    public void enterUserNameAndPassword(){
        driver.switchTo().frame(logonFrame);
        userNameField.sendKeys("Kamal");
        passwordField.sendKeys("test@123");
        signInBtn2.click();
       // sendKeysToElement(userNameField,"Kamal");
//        sendKeysToElement(passwordField,"Test@123");
//        clickElement(signInBtn2);


    }
        public void PlayVideo() throws InterruptedException {

            Thread.sleep(3000);
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js .executeScript("document.videoPlayBtn.play()");

//            Actions action = new Actions(driver);
//
//            action.moveToElement(videoPlayBtn).click().perform();

//            //videoPlayBtn.click();
//            //Thread.sleep(3000);
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent ('click',true, true, window,0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);",videoPlayBtn);
//            driverWait.wait(5000);
//            clickElement(videoIconClose);


    //      clickElement(videoPlayBtn);



        }
        public void clickEstimateYourRateTextLink(){

        clickElement(estimateYourRate);
        }

        public void getMyOptions()  {
            driver.switchTo().frame(iFrame);
         sendKeysToElement(homePriceField,"350000");

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          sendKeysToElement(downPayment,"15");
            sendKeysToElement(zipCode,"22192");
            clickElement(creditScoreSel);
            clickElement(selectScore);
            clickElement(choseOneSelector);
            clickElement(lowInterest);
            clickElement(getMyOptionsBtn);

    }




}
