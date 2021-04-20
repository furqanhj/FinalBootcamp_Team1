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

    @FindBy(xpath = webElementInputSearch)
    WebElement inputSearchBox;

    @FindBy (xpath = webElementButtonSearch)
    WebElement buttonSearch;


    public OnlineExperiencesPage(){
        PageFactory.initElements(driver,this);

    }

    public void navigateToOnlineExperiencePage(){
        driverWait.until(ExpectedConditions.visibilityOf(buttonOnlineExperience));
      clickElement(buttonOnlineExperience);

        WebDriverWait wait= new WebDriverWait(driver, 10);

    }

    //*****************************************************************************************************



    public void sendKeysToSearchBox(String keysToSend) {
        inputSearchBox.sendKeys(keysToSend);
    }

    public void clickSearchButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //clickByXpathUsingJavaScript(webElementButtonSearch);

    }

    public void doSearch() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
       //typeOnElement(webElementInputSearch, webElementText);
       WebDriverWait wait2 = new WebDriverWait(driver, 10);
        clickSearchButton();


    }
    //***********************************************************************************

    @FindBy (css = webElementFieldGuide)
    WebElement fieldGuideToggle;

    @FindBy (css = webElementSignUp)
    WebElement signUpSearch;


    public void clickToggleButton() { fieldGuideToggle.click();}

    public void clickSignUpButton() { signUpSearch.click();}

    public void doToggleClick(){
        clickToggleButton();
    }

    public void doSignUp(){
        clickSignUpButton();
    }




}
