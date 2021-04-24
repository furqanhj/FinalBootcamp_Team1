package testTruliaBuyPage_KE;

import common.BaseAPI;
import org.testng.annotations.Test;
import truliaBuyPage_KE.TruliaBuyPage;

public class TestTruliaBuyPage extends BaseAPI {
    TruliaBuyPage truliaBuyPage;

    @Test(priority = 1,enabled = false)
    public void testNavigateBuyPage(){
        truliaBuyPage = new TruliaBuyPage();
        truliaBuyPage.navigateBuyPage();
        isElementDisplayed(truliaBuyPage.firstHouseImg);


    }
    @Test(priority = 2,enabled = true)
    public void testClickFirstHousePictureLink(){
            testNavigateBuyPage();
            truliaBuyPage.clickFirstHousePictureLink();

    }

}
