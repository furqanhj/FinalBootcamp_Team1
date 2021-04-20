package testRedfinHomePageAB;


import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import redfinHomePageAB.RedfinHomePage;



public class TestRedfinHomepage extends BaseAPI {


    RedfinHomePage redfinHomePage;

        @Test(priority = 1,enabled = false)

    public void testnavigateToBuyPage(){
        redfinHomePage=new RedfinHomePage();
        redfinHomePage.navigateToBuyPage();
        String actualTitle=driver.getTitle();
        String expectedTitle="Houses For Sale Near Me - Redfin";
        Assert.assertEquals(actualTitle,expectedTitle,"Did not Pass");

    }


//        @Test(priority = 2,enabled = // FIXME: 4/20/2021 )
//
//    public void testshowGetText(){
//            redfinHomePage=new RedfinHomePage();
//            redfinHomePage.showGetText();
//            String actualText=w
//        }



                @Test (priority = 3, enabled = false)
                public void testLogoPresent(){
                redfinHomePage=new RedfinHomePage();
                boolean logoPresent=redfinHomePage.redfinLogo.isDisplayed();
                Assert.assertTrue(logoPresent);
                }

}
