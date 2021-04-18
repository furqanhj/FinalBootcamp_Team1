package testAirBnbExperiencesAR;


import static airBnbExperiencesAR.AirBnbExperiences.*;
import static airBnbExperiencesAR.AirBnbExperiencesWebElements.*;

import airBnbExperiencesAR.AirBnbExperiences;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAirBnbExperiences extends BaseAPI {

    @Test (enabled = false)
    public void testBecomeAHostButton(){
        AirBnbExperiences airBnbExperiencesAR = new AirBnbExperiences();
        airBnbExperiencesAR.clickExperiencesLink();
        airBnbExperiencesAR.clickBecomeAHostButton();

        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Host your home on Airbnb";
        Assert.assertEquals(actualResult, expectedResult, "PAGE NOT FOUND");
    }


   @Test (enabled = false)    //only running up until it clicks Experiences link.???
    public void testTypeInLocationField() throws InterruptedException {
        AirBnbExperiences airBnbExperiencesAR = new AirBnbExperiences();
        airBnbExperiencesAR.enterALocation();

        String actualResult = BaseAPI.driver.getTitle();
       String expectedResult = "Things to Do in Mexico | 5-Star Authentic Experiences";
       Assert.assertEquals(actualResult, expectedResult, "PAGE NOT FOUND");
    }


    @Test (enabled = false)
    public void testClickOnHostYourHome(){
        AirBnbExperiences airBnbExperiencesAR = new AirBnbExperiences();
        airBnbExperiencesAR.clickExperiencesLink();
        airBnbExperiencesAR.clickSideMenuBar();
        airBnbExperiencesAR.clickHostYourHome();

        assertEqualsGetText("A space to share, a world to gain", WEB_ELEMENT_HOST_YOUR_HOME_HEADER);
    }

    //Add number of guests in Guests drop down, after searching for a location on Experiences page
    @Test (enabled = false)
    public void testAddNumberOfGuests() throws InterruptedException {
        AirBnbExperiences experiences = new AirBnbExperiences();
        experiences.enterALocation();
        experiences.addNumberOfGuests();

        assertEqualsGetText("",WEB_ELEMENT_1_GUEST_BUTTON);
//        /the Guests button updated to "1 Guest"?????
    }

    @Test (enabled = false)    //how to select a date????
    public void testSelectADate() throws InterruptedException {
        AirBnbExperiences experiences = new AirBnbExperiences();
        experiences.selectADate();

    }
    @Test (enabled = true)
    public void testVerifyPageTitle(){
        String exp = "";
        String act = driver.getTitle();
        //Compares 2 Strings -->equalsIgnoreCase will Compare Strings even if in upper or lower case
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }
    @Test (enabled = false)
    public void testPageTitleInspection() {
        String expectedTitle = "";
        String actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        softAssert.assertNotSame(actualTitle, expectedTitle);
        softAssert.assertAll();


    }


}
