package truliaBuyPage_KE;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static truliaBuyPage_KE.TruliaBuyPageWebElementsLocators.*;

public class TruliaBuyPage  extends BaseAPI {
    @FindBy(xpath =WEB_ELEMENT_BUY_Btn)
    public WebElement buyBtn;
    @FindBy(xpath = WEB_ELEMENT_BUY_Btn)
    public WebElement firstHouseImg;
    @FindBy(xpath = WEB_ELEMENT_ANY_BEDROOMS)
    public WebElement bedroomSelect;
    @FindBy(xpath = WEB_ELEMENT_VALIDATE_DROP_DOWN)
    public WebElement validateDropDown;




    public TruliaBuyPage (){

        PageFactory.initElements(driver,this);
    }

    public void navigateBuyPage(){
        clickElement(buyBtn);
    }
    public void clickFirstHousePictureLink(){
        waitForElementToBeClickable(firstHouseImg);
        actions = new Actions(driver);
        actions.click(firstHouseImg).build().perform();
       // clickJScript(firstHouseImg);


    }
    public void selectBeds(){


    }


}
