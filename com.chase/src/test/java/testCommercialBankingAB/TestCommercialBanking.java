package testCommercialBankingAB;

import commercialBankingAB.CommercialBanking;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCommercialBanking extends BaseAPI {


    CommercialBanking commercialBanking;
    @Test(priority = 1,enabled = false)
    public void testNavigateToCommercialBanking(){
        commercialBanking=new CommercialBanking();

        commercialBanking.navigateToCommercialBanking();
        String actualTitle=driver.getTitle();
        String expectedTitle="Commercial Banking | JPMorgan Chase";
        Assert.assertEquals(actualTitle,expectedTitle,"Title Do not Match");
        System.out.println(actualTitle);

    }

    @Test(priority = 2,  enabled = false)
    public void testNavigationToMortgagePage() throws InterruptedException {

        commercialBanking = new CommercialBanking();

        commercialBanking.clickDropDownMenu();
        Thread.sleep(4000);
        commercialBanking.clickMortgagePageLink();
        Thread.sleep(4000);

        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Chase Mortgage | Home Lending | Chase.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }

}
