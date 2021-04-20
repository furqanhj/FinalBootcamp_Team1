package redfinHomePageAB;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static redfinHomePageAB.RedfinHomePageWebElement.*;

public class RedfinHomePage extends BaseAPI {


    @FindBy(css=WEB_ELEMENT_BUTTON_BUY)
    public WebElement buttonBuy;

    @FindBy(xpath= WEB_ELEMENT_GET_TEXT)
    public WebElement getText;

    @FindBy(css = WEB_ELEMENT_REDFIN_LOGO)
    public WebElement redfinLogo;




    public RedfinHomePage(){
        PageFactory.initElements(driver,this);
    }


    public void navigateToBuyPage(){
        clickElement(buttonBuy);

    }

    public void showGetText(){

    }

    public void doRedfinLogo() {

    }


}
