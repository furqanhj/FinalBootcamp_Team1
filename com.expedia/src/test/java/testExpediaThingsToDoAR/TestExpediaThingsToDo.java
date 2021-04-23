package testExpediaThingsToDoAR;

import common.BaseAPI;
import expediaThingsToDoAR.ExpediaThingsToDo;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestExpediaThingsToDo extends BaseAPI {

    @Test(enabled = false)
    public void testThingsToDoDropDownOption() {
        ExpediaThingsToDo expediaThingsToDo = new ExpediaThingsToDo();
        expediaThingsToDo.selectThingsToDoDropDownOption();
        assertEqualsGetText("Search things to do", "WEB_ELEMENT_SEARCH_THINGS_TO_DO_HEADER");
    }

    @Test(enabled = false)
    public void testSearchEventTicketsLink() {
        ExpediaThingsToDo expediaThingsToDo = new ExpediaThingsToDo();
        expediaThingsToDo.clickSearchEventTicketsLink();
        assertEqualsGetTitle("Event Tickets for Concerts, Sports & Theater 2021 | Expedia.com");
    }

    @Test(enabled = false)
    public void testEnterLocationField() {
        ExpediaThingsToDo expediaThingsToDo = new ExpediaThingsToDo();
        expediaThingsToDo.enterLocationField();
        implicitWait(20);
    }

    @Test(enabled = false)
    public void testVerifyPageTitle() {
        ExpediaThingsToDo expediaThingsToDo = new ExpediaThingsToDo();
        expediaThingsToDo.selectThingsToDoDropDownOption();
        String exp = "THINGS TO DO NEAR ME: FIND FUN ACTIVITIES NEARBY | EXPEDIA";
        String act = driver.getTitle();
        //Compares 2 Strings -->equalsIgnoreCase will Compare Strings even if in upper or lower case
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

    @Test(enabled = false)
    public void testPageTitleInspection() {
        ExpediaThingsToDo expediaThingsToDo = new ExpediaThingsToDo();
        expediaThingsToDo.clickSearchEventTicketsLink();
        String expectedTitle = "Event Tickets for Concerts, Sports & Theater 2021 | Expedia.com";
        String actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        softAssert.assertNotSame(actualTitle, expectedTitle);
        softAssert.assertAll();
    }
    @Test (enabled = false) //failed
    public void testClickSearchButton(){
        ExpediaThingsToDo expediaThingsToDo = new ExpediaThingsToDo();
        expediaThingsToDo.clickSearchButton();
        assertEqualsGetText("To continue, please correct the error below.", "WEB_ELEMENT_TO_CONTINUE_ERROR_MESSAGE");
    }
    @Test (enabled = true)
    public void testVerifyFindYourNextDestinationHeader(){
        ExpediaThingsToDo expediaThingsToDo = new ExpediaThingsToDo();
        expediaThingsToDo.verifyFindYourNextDestinationHeader();
        assertEqualsGetText("Find your next destination", "WEB_ELEMENT_FIND_YOUR_NEXT_DESTINATION_HEADER");

    }



}
