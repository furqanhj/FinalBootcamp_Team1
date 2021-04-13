package onlineExperiencesPageAB;

import common.BaseAPI;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static onlineExperiencesPageAB.OnlineExperiencesPageWebElements.*;
public class OnlineExperiencesPage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_BUTTON_ONLINE_EXPERIENCES_LINK)
    public WebElement buttonOnlineExperience;

    public OnlineExperiencesPage(){
        PageFactory.initElements(driver,this);

    }

    public void navigateToOnlineExperiencePage(){
        driverWait.until(ExpectedConditions.visibilityOf(buttonOnlineExperience));
      clickElement(buttonOnlineExperience);

        WebDriverWait wait= new WebDriverWait(driver, 10);

    }









    }
