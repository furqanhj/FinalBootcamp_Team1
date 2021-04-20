package expediaCarsPage_KE;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static expediaCarsPage_KE.ExpediaCarsWebElementsLocators.*;

public class ExpediaCarsPage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_CARS_ICON_LINK)
    public WebElement carsIconLink;
    @FindBy(xpath = WEB_ELEMENT_BACK_TO_PAGE)
    public WebElement backToMainPage;

    public ExpediaCarsPage (){
        PageFactory.initElements(driver, this);
    }
    public void clickCarsIconLink (){
        clickElement(backToMainPage);
        clickElement(carsIconLink);




    }


}
