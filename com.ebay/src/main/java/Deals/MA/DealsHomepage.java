package Deals.MA;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.seleniumhq.jetty9.server.PushBuilder;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import static Deals.MA.DealsLocators.*;

public class DealsHomepage extends BaseAPI {
    @FindBy(xpath = example)
   public WebElement imagesLink;
    @FindBy(xpath = WEB_ELEMENT_LINK_SECURITY_CAMERA)
   public WebElement SecurityCamera;
    @FindBy(xpath = WEB_ELEMENT_LINK_OAKLEY_SUNGLASSES)
    WebElement oakleySunglasses;
    @FindBy(xpath = WEB_ELEMENT_ADIDAS_ORIGINAL)
    WebElement adidasShoes;
    @FindBy (xpath = WEB_ELEMENT_DEALS_LINK)
    WebElement deals;


    public DealsHomepage(){
        PageFactory.initElements(driver, this);
    }


    public void hoverAndClickOnVacuum(){
        scrollToElementUsingJavaScript(WEB_ELEMENT_LINK_VACUUM);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement Vacuum = driver.findElement(By.xpath(WEB_ELEMENT_LINK_VACUUM));
        Actions actions = new Actions(driver);
        actions.moveToElement(Vacuum);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement Click = driver.findElement(By.xpath(WEB_ELEMENT_LINK_VACUUM));
        actions.moveToElement(Click);
        actions.click().build().perform();
    }

    public void ClickSecurityCamera(){
        driver.findElement(By.xpath(WEB_ELEMENT_LINK_SECURITY_CAMERA)).click();
    }

    public void ClickHeadPhones() throws InterruptedException, AWTException {
        driver.findElement(By.xpath(WEB_ELEMENT_LINK_HEADPHONES)).click();

        driver.findElement(By.xpath(WEB_ELEMENT_SELECT_COLOR)).click();

        driver.findElement(By.xpath(WEB_ELEMENT_SELECT_COLOR)).sendKeys(WEB_ELEMENT_COLOR_BLACK);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);

        driver.findElement(By.xpath(WEB_ELEMENT_ADD_TO_CART)).click();



    }

    public void ClickLaptop () {
        driver.findElement(By.xpath(WEB_ELEMENT_LINK_LAPTOP)).click();
        driver.findElement(By.xpath(WEB_ELEMENT_VERIFY_LAPTOP)).click();
        driver.findElement(By.xpath(WEB_ELEMENT_CLICK_FOR_NEXT_PICTURE)).click();
        driver.findElement(By.xpath(WEB_ELEMENT_TWO_YEAR_PROTECTION_PLAN)).click();


    }

    public void ClickMonitor (){
        driver.findElement(By.xpath(WEB_ELEMENT_LINK_MONITOR)).click();
        driver.findElement(By.xpath(WEB_ELEMENT_VERIFY_MONITOR)).click();
        driver.findElement(By.xpath(WEB_ELEMENT_ADD_TO_WATCHLIST)).click();
    }

    public void ClickBracelet () throws InterruptedException {
        driver.findElement(By.xpath(WEB_ELEMENT_LINK_BRACELET)).click();
        driver.findElement(By.xpath(WEB_ELEMENT_VERIFY_BRACELET)).click();
        driver.findElement(By.xpath(WEB_ELEMENT_QUANTITY)).click();


    }

    public void clickingOakleySunglasses (){
        deals.click();
        implicitWait();
        oakleySunglasses.click();
    }

    public void clickingAdidasShoes (){
        deals.click();
        implicitWait();
        adidasShoes.click();
    }

    public void clickOnDeals (){
        implicitWait();
        deals.click();


    }






}
