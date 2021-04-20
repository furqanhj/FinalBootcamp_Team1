package testExpediaCarsPage_KE;

import common.BaseAPI;
import expediaCarsPage_KE.ExpediaCarsPage;
import org.testng.annotations.Test;

public class testExpediaCarsPage extends BaseAPI {
     ExpediaCarsPage expediaCarsPage;

     @Test(priority = 1, enabled = true)
    public  void testClickCarsIconLink(){
         expediaCarsPage= new ExpediaCarsPage();
         expediaCarsPage.clickCarsIconLink();

     }
}
