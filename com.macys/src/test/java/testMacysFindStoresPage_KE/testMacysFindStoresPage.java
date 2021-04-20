package testMacysFindStoresPage_KE;

import common.BaseAPI;
import macysFindStoresPage_KE.MacysFindStoresPage;
import org.testng.annotations.Test;

public class testMacysFindStoresPage extends BaseAPI {

    MacysFindStoresPage macysFindStoresPage;
    @Test(priority = 1,enabled = true)
    public void testClickStoresTextLink() throws InterruptedException {
        macysFindStoresPage=new MacysFindStoresPage();
        macysFindStoresPage.clickStoresTextLink();


    }
}
