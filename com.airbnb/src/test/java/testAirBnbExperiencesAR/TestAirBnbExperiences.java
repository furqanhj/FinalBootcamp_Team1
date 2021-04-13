package testAirBnbExperiencesAR;


import airBnbExperiencesAR.AirBnbExperiences;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

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


   @Test (enabled = true)
    public void testTypeInLocationField(){
        AirBnbExperiences airBnbExperiencesAR = new AirBnbExperiences();
        airBnbExperiencesAR.clickExperiencesLink();
        airBnbExperiencesAR.enterALocation("Mexico");

       String actualResult = BaseAPI.driver.getTitle();
       String expectedResult = "Things to Do in Mexico | 5-Star Authentic Experiences";
       Assert.assertEquals(actualResult, expectedResult, "PAGE NOT FOUND");
    }












}
