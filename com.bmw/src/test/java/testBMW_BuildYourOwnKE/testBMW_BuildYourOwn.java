package testBMW_BuildYourOwnKE;
import bmwBuildYourOwnKE.BMW_BuildYourOwn;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static bmwBuildYourOwnKE.BMW_BuildYourOwn.hexBackColor;

public class testBMW_BuildYourOwn extends BaseAPI {
    BMW_BuildYourOwn bmw_buildYourOwn;


    @Test(priority = 1,enabled = false)
    public void testClickBuildYourOwn (){
    bmw_buildYourOwn = new BMW_BuildYourOwn();

    bmw_buildYourOwn.clickBuildYourOwn();

    waitForVisibilityOfElement(bmw_buildYourOwn.validateCosyImage);
    Assert.assertTrue(bmw_buildYourOwn.validateCosyImage.isDisplayed());

}
    @Test(priority = 2,enabled = false)
    public void testBackgroundColor() throws InterruptedException {

        testClickBuildYourOwn();
        bmw_buildYourOwn.backgroundColor();
        Thread.sleep(2000);
        Assert.assertTrue(true,hexBackColor);

    }
    @Test(priority = 3,enabled = false)
    public void testClickSeriesX5TextLink(){
        testClickBuildYourOwn();
        bmw_buildYourOwn.clickSeriesX5TextLink();
        waitForVisibilityOfElement(bmw_buildYourOwn.backTopBtn);
        Assert.assertTrue(bmw_buildYourOwn.backTopBtn.isDisplayed());
    }
    @Test(priority = 4,enabled = false)
    public void testClickSeriesConverSelecBtn(){
        testClickSeriesX5TextLink();
        bmw_buildYourOwn.clickSeriesConverSelecBtn();
        waitForVisibilityOfElement(bmw_buildYourOwn.whiteConvertible430i);
        Assert.assertTrue(bmw_buildYourOwn.whiteConvertible430i.isDisplayed());


    }
    @Test(priority = 5,enabled = true)
    public void testClickDesignBtn(){
        testClickSeriesConverSelecBtn();
        bmw_buildYourOwn.clickDesignBtn();
        waitForVisibilityOfElement(bmw_buildYourOwn.zipCodeAlert);
        Assert.assertTrue(bmw_buildYourOwn.zipCodeAlert.isDisplayed());


    }
    @Test(priority = 6,enabled = true)
    public void testEnterZipCode() throws InterruptedException {
        testClickDesignBtn();
        bmw_buildYourOwn.enterZipCode();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //Thread.sleep(2000);
        Assert.assertTrue(bmw_buildYourOwn.validatingEnteringZipCode.isDisplayed());


    }
}
