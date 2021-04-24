package macysFindStoresPage_KE;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static macysFindStoresPage_KE.MacysFindStoresPageWebELementsLocators.*;


public class MacysFindStoresPage extends BaseAPI {
    @FindBy(xpath = WEB_ELEMENT_STORES_TEXT_LINK)
    public WebElement storesTextLink;
    @FindBy(xpath = WEB_ELEMENT_SEARCH_BTN)
    public WebElement searchBtn;
    @FindBy(xpath = WEB_ELEMENT_SHOP_BY_DEPARTMENT)
    public WebElement shopByDepartment;
    @FindBy(xpath = WEB_ELEMENT_BEAUTY_LINK)
    public WebElement beautyLink;
    @FindBy(xpath = WEB_ELEMENT_SHOP_BY_DEPARTMENT)
    public List<WebElement> expectedDepartmentHoverOverShopBYDep;



    public MacysFindStoresPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void clickStoresTextLink()  {
        clickElement(storesTextLink);
    }

    public void hoverOnShopByDepartmentTextLink(){
        mouseHoverJScript(shopByDepartment);
    }

}
