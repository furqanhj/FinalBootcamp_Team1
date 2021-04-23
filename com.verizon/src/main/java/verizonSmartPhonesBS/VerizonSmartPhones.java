package verizonSmartPhonesBS;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

import static verizonSmartPhonesBS.VerizonSmartPhonesWebElements.*;

public class VerizonSmartPhones extends BaseAPI {

    Robot robot;
    {
        try {
            robot = new Robot();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    @FindBy(xpath = WEB_ELEMENT_MOBILE_ARROW)
    WebElement mobileArrow;
    @FindBy(xpath = WEB_ELEMENT_2_YEAR_CONTRACT)
    WebElement twoYearContract;
    @FindBy(xpath = WEB_ELEMENT_FIND_VERIZON_STORE)
    WebElement findStore;

    public VerizonSmartPhones() {
        PageFactory.initElements(driver, this);
    }
    public void navigateToSmartPhones(){
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOP_HOMEPAGE);
        implicitWait();
    }
    public void navigateAndClickOnIphone(){
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOP_HOMEPAGE);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_PHONE);
        implicitWait();
    }

    public void clickOnNextArrow() throws InterruptedException {
        implicitWait();
        scrollToElementUsingJavaScript(WEB_ELEMENT_SCROLL);
        Thread.sleep(5000);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MOBILE_ARROW);
        Thread.sleep(5000);
    }
    public void pricingDropDown() throws InterruptedException {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOP_HOMEPAGE);
        explicitWaitUntilClickable(10,WEB_ELEMENT_PRICING_DROP_DOWN);
        driver.findElement(By.xpath(WEB_ELEMENT_PRICING_DROP_DOWN)).click();
        selectOptionByIndex(WEB_ELEMENT_PRICING_DROP_DOWN,2);

    }
    public void sortByDropDown() throws InterruptedException {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOP_HOMEPAGE);
        explicitWaitUntilClickable(10,WEB_ELEMENT_SORT_BY_DROP_DOWN);
        driver.findElement(By.xpath(WEB_ELEMENT_SORT_BY_DROP_DOWN)).click();
        selectOptionByIndex(WEB_ELEMENT_SORT_BY_DROP_DOWN,3);
    }
    public void clickOnSearchField(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOP_HOMEPAGE);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SEARCH_CLICK_BUTTON);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SEARCH_FIELD);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_2);
    }

    public void hoverOverSignInLink(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOP_HOMEPAGE);
        basicHoverUsingXpath(WEB_ELEMENT_SIGN_IN);
    }
    public void clickMobileSolutionsCart(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOP_HOMEPAGE);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOPPING_CART);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MOBILE_SOLUTIONS_CART);
    }
    public void clickHomeSolutionsCart(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOP_HOMEPAGE);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOPPING_CART);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_HOME_SOLUTIONS_CART);
    }
    public void navigateToCovidPageAndExpand(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOP_HOMEPAGE);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SEARCH_CLICK_BUTTON);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_COVID_FAQ);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_EXPAND_ALL);
    }
    public void lookUpVerizonStore() throws InterruptedException {
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOP_HOMEPAGE);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_STORES);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FIND_VERIZON_STORE);
        sendKeysToElement(findStore,"34613");
    }


}
