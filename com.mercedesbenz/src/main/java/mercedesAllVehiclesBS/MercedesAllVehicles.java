package mercedesAllVehiclesBS;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

import static mercedesAllVehiclesBS.MercedesAllVehiclesWebElements.*;

public class MercedesAllVehicles extends BaseAPI {

    public MercedesAllVehicles() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_ALL_VEHICLES)
    WebElement allVehicles;
    @FindBy(xpath = WEB_ELEMENT_SEDANS_AND_WAGONS)
    WebElement sedansWagons;
    @FindBy(xpath = WEB_ELEMENT_A_CLASS_SEDAN)
    WebElement sedanAClass;
    @FindBy(xpath = WEB_ELEMENT_FIND_SEARCH_BAR)
    WebElement searchBar;


    public void navigateToAllVehicles() {
        allVehicles.click();
    }

    public void clickOnAClassSedan() {
        allVehicles.click();
        implicitWait(5);
        sedansWagons.click();
        implicitWait();
        sedanAClass.click();
        implicitWait(10);
        implicitWait();
    }

    public void searchByZipcode() throws AWTException {
        allVehicles.click();
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_INVENTORY);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_VIEW_NEW_INVENTORY);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FIND_SEARCH_BAR);
        searchBar.sendKeys(WEB_ELEMENT_SENDKEYS_ZIPCODE);
        enterKey();
        implicitWait();
    }

}
