package testCommercialBankingAB;

import commercialBankingAB.CommercialBanking;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCommercialBanking extends BaseAPI {


    CommercialBanking commercialBanking;
    @Test
    public void testNavigateToCommercialBanking(){
        commercialBanking=new CommercialBanking();

        commercialBanking.navigateToCommercialBanking();
        String actualTitle=driver.getTitle();
        String expectedTitle="Commercial Banking | JPMorgan Chase";
        Assert.assertEquals(actualTitle,expectedTitle,"Title Do not Match");
        System.out.println(actualTitle);

    }



}
