package macysWeddingRegistryBS;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.awt.*;

import static macysWeddingRegistryBS.MacysWeddingRegistryWebElements.*;

public class MacysWeddingRegistry extends BaseAPI {

public MacysWeddingRegistry(){
    PageFactory.initElements(driver, this);
}

@FindBy(xpath = WEB_ELEMENT_WEDDING_REGISTRY)
    WebElement weddingRegistry;
@FindBy(xpath = WEB_ELEMENT_FIND_REGISTRY)
    WebElement findRegistry;
@FindBy(xpath = WEB_ELEMENT_FIRST_NAME)
    WebElement firstName;
@FindBy(xpath = WEB_ELEMENT_LAST_NAME)
    WebElement lastName;
@FindBy(xpath = WEB_ELEMENT_MONTH_DROPDOWN)
    WebElement monthDropDown;
@FindBy(xpath = WEB_ELEMENT_YEAR)
    WebElement year;
@FindBy(xpath = WEB_ELEMENT_WEDDING_REGISTRY_PERKS)
WebElement perks;

public void navigateToWeddingRegistry(){
    implicitWait(5);
    weddingRegistry.click();
    implicitWait();
}
public void searchWeddingRegistry() throws AWTException {
    weddingRegistry.click();
    implicitWait(5);
    findRegistry.click();
    implicitWait(5);
    firstName.sendKeys(WEB_ELEMENT_FIRST_NAME_SEND_KEYS);
    implicitWait();
    lastName.sendKeys(WEB_ELEMENT_LAST_NAME_SEND_KEYS);
    implicitWait();
    year.sendKeys(WEB_ELEMENT_YEAR_SEND_KEYS);
    enterKey();
    implicitWait();
}
public void navigateToWeddingRegistryPerks(){
    weddingRegistry.click();
    implicitWait();
    perks.click();
    implicitWait();
}


}
