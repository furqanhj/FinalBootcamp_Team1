package NewsAndDataMA;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static NewsAndDataMA.NewsAndDataLocators.*;

public class NewsAndDataPage extends BaseAPI {

    public NewsAndDataPage () { PageFactory.initElements(driver,this); }

    @FindBy (xpath = WEB_ELEMENT_NAVIGATE_DROP_DOWN_BUY)
    public WebElement navigateDropDownBuy;
    @FindBy (xpath = WEB_ELEMENT_NAVIGATE_DROP_DOWN_SELL)
    public WebElement navigateDropDownSell;
    @FindBy (xpath = WEB_ELEMENT_INPUT_EMAIL)
    public WebElement verifyInputEmail;
    @FindBy (xpath =WEB_ELEMENT_CLICK_CONTACT )
    public WebElement clickContact;




    public void NavigateDropDownBuy (){
        implicitWait();
        navigateDropDownBuy.click();
        implicitWait();
    }


    public void navigateDropDownSell (){
        implicitWait();
        navigateDropDownSell.click();
        implicitWait();
    }

    public void verifyInvalidEmail (){
        implicitWait();
        verifyInputEmail.click();
        implicitWait();
    }

    public void clickContact (){
        implicitWait();
        clickContact.click();
        implicitWait();
    }

    public void validEmail (){
        implicitWait();
        validEmail();
        implicitWait();
    }

    public void invalidEmail (){
        implicitWait();
        invalidEmail();
    }







}
