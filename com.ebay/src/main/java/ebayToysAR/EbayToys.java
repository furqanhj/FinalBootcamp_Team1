package ebayToysAR;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static ebayToysAR.EbayToysWebElements.*;

public class EbayToys extends BaseAPI{

    @FindBy ( xpath = WEB_ELEMENT_TOYS_SEARCH_BOX)
    WebElement toysSearchBox;


    public void navigateToToysPage(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TOYS_LINK);
        implicitWait(20);
    }
    public void verifyToysAndHobbiesHeader(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TOYS_LINK);
        implicitWait(20);
    }
    public void typeInToysSearchBox(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TOYS_LINK);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TOYS_SEARCH_BOX);
        toysSearchBox.sendKeys(WEB_ELEMENT_INPUT_TEXT_SEARCH_BOX_);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);
    }

    public void clickSeeAllEducationalLink(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TOYS_LINK);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_EDUCATIONAL_LINK);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SEE_ALL_EDUCATIONAL_LINK);
    }
    public void clickCartImage(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TOYS_LINK);
        implicitWait(20);
        click(WEB_ELEMENT_CART);
    }

    public void clickMyEbayDropDownLink(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TOYS_LINK);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MY_EBAY_DROP_DOWN);
        implicitWait(20);
    }

    public void sendKeysToSearchFieldUsingExcel() throws Exception {
        List<String> toys = DataSource.getItemsListFromExcel();
        String search = toys.get(0);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TOYS_SEARCH_BOX);
        WebElement searchBox = driver.findElement(By.xpath(WEB_ELEMENT_TOYS_SEARCH_BOX));
        sendKeysToElement(searchBox, search);

    }










}















