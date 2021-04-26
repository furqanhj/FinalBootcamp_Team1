package SecurityMA;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static SecurityMA.SecurityLocators.*;

public class SecurityPage extends BaseAPI {


    public SecurityPage() {
        PageFactory.initElements(driver,this);
    }


    @FindBy (xpath = WEB_ELEMENT_MENU_DROP_DOWN)
    public WebElement menu;
    @FindBy (xpath = WEB_ELEMENT_LINK_PRIVACY )
    public WebElement privacy;
    @FindBy (xpath = WEB_ELEMENT_VERIFY_CAREERS)
    public WebElement verifyCareers;
    @FindBy (xpath = WEB_ELEMENT_LINK_SEARCH_BAR)
    public WebElement searchBar;
    @FindBy (xpath = WEB_ELEMENT_LINK_FRAUD_PROTECTION)
    public WebElement fraudProtection;
    @FindBy (xpath = WEB_ELEMENT_NAVIGATE_CAREERS )
    public WebElement navigateCareers;
    @FindBy (xpath = WEB_ELEMENT_CLICK_SITEMAP)
    public WebElement clickSiteMap;


    public void clickDropMenu (){
        implicitWait();
        menu.click();
            implicitWait();
            privacy.click();
        }

        public void verifyCareersClick (){
        implicitWait();
        verifyCareers.click();
        implicitWait();
    }

    public void linkSearchBar (){
        implicitWait();
        searchBar.click();
        implicitWait();
    }

    public void fraudProtectionClick (){
        implicitWait();
       fraudProtection.click();
        implicitWait();
    }

    public void navigateCareers (){
        implicitWait();
        navigateCareers.click();
        implicitWait();
    }

    public void clickSitemap (){
        implicitWait();
        clickSiteMap.click();

    }














}
