package KidsAndBaby;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static KidsAndBaby.KidsAndBabyLocators.*;

public class KidsAndBabyPage extends BaseAPI {

    public KidsAndBabyPage() { PageFactory.initElements(driver,this);
    }

    @FindBy (xpath =WEB_ELEMENT_CHECK_SIZE )
    public  WebElement size;
    @FindBy (xpath = WEB_ELEMENT_CLICK_APPAREL_TYPE)
    public WebElement clickApparelType;
    @FindBy (xpath = WEB_ELEMENT_DROP_DOWN_MY_ACCOUNT)
    public WebElement myAccount;
    @FindBy (xpath =WEB_ELEMENT_CLICK_GIFTS )
    public WebElement gifts;
    @FindBy (xpath = WEB_ELEMENT_SIGN_UP)
    public WebElement signUp;


    @FindBy (xpath = WEB_ELEMENT_LISTS )
    public WebElement lists;
    @FindBy (xpath = WEB_ELEMENT_DISNEY)
    public WebElement disney;
    @FindBy (xpath = WEB_ELEMENT_DISNEY_FROZEN)
    public WebElement disneyFrozen;
    @FindBy (xpath = WEB_ELEMENT_HELLO_KITTY)
    public WebElement helloKitty;
    @FindBy (xpath = WEB_ELEMENT_MARVEL)
    public WebElement marvel;

    public void checkSize (){
        implicitWait();
        size.click();
        implicitWait();
    }

    public void clickApparelType (){
        implicitWait();
        clickApparelType.click();
        implicitWait();
    }

    public void dropDownMyAccount (){
        implicitWait();
        myAccount.click();
        implicitWait();
    }

    public void clickGift (){
        implicitWait();
        gifts.click();
        implicitWait();
    }

    public void signUp (){
        implicitWait();
        signUp.click();
        implicitWait();
    }

    public void lists (){
        implicitWait();
        lists.click();
    }

    public void disney (){
        implicitWait();
        disney.click();
    }

    public void disneyFrozen (){
        implicitWait();
        disneyFrozen.click();
        implicitWait();
    }

    public void helloKitty (){
        implicitWait();
        helloKitty.click();
    }

    public void marvel (){
        implicitWait();
        marvel.click();
    }
}
