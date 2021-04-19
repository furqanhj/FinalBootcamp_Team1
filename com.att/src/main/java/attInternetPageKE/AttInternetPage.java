package attInternetPageKE;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static attInternetPageKE.InternetPageWebElements.*;



public class AttInternetPage extends BaseAPI {


    @FindBy(xpath = WEB_ELEMENT_INTERNET_IMAGE_LINK)
    public WebElement internetImageLink;
    @FindBy(xpath = WEB_ELEMENT_ACCOUNT_Text_LINK)
    public WebElement accountTextLink;
    @FindBy(xpath = WEB_ELEMENT_MANAGE_PROFILE_TEXT_LINK)
    public WebElement manageProfileTextLink;

    @FindBy(xpath = WEB_ELEMENT_CHECK_AVAILABILTY_BTN)
    public WebElement checkAvailabilityButton;
    @FindBy(xpath = WEB_ELEMENT_TEXT)
    public WebElement textCheckForService;
    @FindBy(xpath=WEB_ELEMENT_TEXT_FIELD)
    public WebElement textFieldInput;
    @FindBy(xpath = WEB_ELEMENT_CHECK_AVAILABILTY_BTN2)
    public WebElement checkAvailabilityButton2;
    @FindBy(xpath = WEB_ELEMENT_CLICK)
    public WebElement tabClick;
    @FindBy(xpath = WEB_ELEMENT_TEXT_MessAGE)
    public WebElement textMessage;

    @FindBy(xpath = WEB_ELEMENT_Hover_Sign_ME_UP)
    public WebElement hoverSignMeUpButton;

    @FindBy(xpath=WEB_ELEMENT_FIND_STORE)
    public WebElement findStoreTextLink;


    public AttInternetPage() {
        PageFactory.initElements(driver, this);


    }
    public void clickInternetImageLink(){

       // internetImageLink.click();
       clickElement(internetImageLink);
        System.out.println("pass");


    }
    public void clickAccountTextLink(){

        clickElement(accountTextLink);
    }
    public void clickCheckAvailabilityButton(){
        clickElement(checkAvailabilityButton);

    }
    public void sendAddressTOTextField(){

        sendKeysToElement(textFieldInput,"1200 E Longview Dr, Woodbridge, VA 22191");

    }
    public void clickCheckAvailabilityButton2(){
        clickElement(tabClick);
        checkAvailabilityButton2.click();

        //clickElement(checkAvailabilityButton2);

    }

    public void hoverOverSignMeUpButton() {

        hoverOverElement(hoverSignMeUpButton);


    }
    public void clickFindStoreTextLink(){

        findStoreTextLink.click();
        //clickElement(findStoreTextLink);
    }



}