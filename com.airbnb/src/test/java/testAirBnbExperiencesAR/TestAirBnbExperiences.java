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


   @Test (enabled = false)
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

    @Test (enabled = false)
    public void testAddNumberOfGuests() throws InterruptedException {
        AirBnbExperiences experiences = new AirBnbExperiences();
        experiences.enterALocation();
        experiences.addNumberOfGuests();

        assertEqualsGetText("",WEB_ELEMENT_1_GUEST_BUTTON);

    }

    @Test (enabled = false)
    public void testSelectADate() throws InterruptedException {
        AirBnbExperiences experiences = new AirBnbExperiences();
        experiences.selectADate();

    }
    @Test (enabled = false)
    public void testVerifyPageTitle() {
        AirBnbExperiences airBnbExperiences = new AirBnbExperiences();
        airBnbExperiences.clickExperiencesLink();
        String exp = "Vacation Rentals, Homes, Hotels, Experiences & More - Airbnb";
        String act = driver.getTitle();
        //Compares 2 Strings -->equalsIgnoreCase will Compare Strings even if in upper or lower case
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

    @Test (enabled = false)
    public void testBecomeAHostPageTitleInspection() {
        AirBnbExperiences airBnbExperiences = new AirBnbExperiences();
        airBnbExperiences.clickBecomeAHostButton();
        String expectedTitle = "Host your home on Airbnb";
        String actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        softAssert.assertNotSame(actualTitle, expectedTitle);
        softAssert.assertAll();
    }
    @Test(enabled = false)
    public void testSendKeysToLocationSearchBoxUsingExcel() throws Exception {
        AirBnbExperiences airBnbExperiences = new AirBnbExperiences();
        airBnbExperiences.sendKeysToLocationSearchBoxUsingExcel();
        Assert.assertTrue(isTitleTrue("Things to Do in Ohio | 5-Star Authentic Experiences"));
    }
    @Test (enabled = false)
    public void testAveragePriceDropDownMenu() throws InterruptedException {
        AirBnbExperiences airBnbExperiences = new AirBnbExperiences();
        airBnbExperiences.enterALocation();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_PRICE_BUTTON);
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_AVERAGE_PRICE_DROPDOWN));
    }
    @Test (enabled = true)
    public void testTimeOfDayMorningCheckbox() throws InterruptedException {
        AirBnbExperiences airBnbExperiences = new AirBnbExperiences();
        airBnbExperiences.enterALocation();
        airBnbExperiences.clickTimeOfDayMorningCheckbox();
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_MORNING_BUTTON));
    }

}
