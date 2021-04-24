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
     @Test(priority = 2,enabled = true)
    public void testEnterPickUpLocation()  {
         testClickCarsIconLink();
         expediaCarsPage.enterPickUpLocation();


     }
     @Test(priority = 3,enabled = true)
    public void testSelectPickUpDatesCalender()  {
         testEnterPickUpLocation();
         expediaCarsPage.selectPickUpDatesCalender();

     }
     @Test(priority = 4,enabled = true)
    public void testSelectPickUpDate (){
         testSelectPickUpDatesCalender();
         expediaCarsPage.selectPickUpDate();
       //  implicitWait();
        // isElementSelected(expediaCarsPage.validatePickUpDate);

     }
     @Test(priority = 5,enabled = true)
    public void testSelectDropOffDay(){
         testSelectPickUpDate();
         expediaCarsPage.selectDropOffDay();
         String str1=getTextFromElement(expediaCarsPage.validateDropOffDay);
         String str2="May 21";
         compareStrings(str1,str2);

     }

}
