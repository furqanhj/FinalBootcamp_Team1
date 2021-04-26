package DealsTestpage;

import Deals.MA.DealsHomepage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

import static Deals.MA.DealsLocators.*;

public class DealsTestpage extends BaseAPI {


    DealsHomepage deals = new DealsHomepage();


    @Test(enabled = true)
    public void testExample() throws AWTException {
       implicitWait();
        deals.hoverAndClickOnVacuum();
        assertEqualsGetTextUsingXpath(WEB_ELEMENT_VERIFY_VACUUM,"Dyson V7 Fluffy HEPA Cordless Vacuum Cleaner | Blue | New" );
    }

    @Test (enabled = false)
    public void testCamera (){
        deals.ClickSecurityCamera();
        String expectedText = "Arlo VMC4040P-100NAR Pro3 WireFree Security 2K Camera 193108139182 | eBay";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"test Failed");
    }

    @Test (enabled = false)
    public void testItemInTheCart () throws InterruptedException, AWTException {
        deals.ClickHeadPhones();
        assertEqualsGetTextUsingXpath(WEB_ELEMENT_VERIFY_ITEM,"1 item added to cart");
    }

    @Test (enabled = false)
    public void testFindLaptop () {
        deals.ClickLaptop();
        assertEqualsGetTitle("Lenovo IdeaPad 5 Laptop, 14\" FHD 300 nits, AMD Ryzen 5 4500U, 8GB, 256GB SSD 194632946314 | eBay");

    }

    @Test (enabled = false)
    public void testFindMonitor (){
        deals.ClickMonitor();
        assertEqualsGetTitle("Acer Nitro XZ2 - 31.5\" Monitor WQHD 2560x1440 144Hz 16:9 400Nit 841631183881 | eBay");
    }

    @Test (enabled = false)
    public void testFindBracelet() throws InterruptedException {
        deals.ClickBracelet();
        assertEqualsGetTitle("1/4 ct Diamond Tennis Bracelet in Sterling Silver-Plated Brass, 7\" 749165266028 | eBay");
    }

    @Test (enabled = false)
    public void testFindOakleySunglasses () {
        deals.clickingOakleySunglasses();
        assertEqualsGetTitle("Oakley Fuel Cell POLARIZED Sunglasses OO9096-K060 Black Ink W/ PRIZM Ruby Lens 888392407832 | eBay");


    }

    @Test (enabled = false)
    public void testNavigateToDeals (){
    deals.clickOnDeals();
    assertEqualsGetTitle("Daily Deals on eBay | Best deals and Free Shipping");
    }



}