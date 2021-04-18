package testAirbnbEntireHomesBS;

import airbnbEntireHomesBS.AirbnbEntireHomes;
import common.BaseAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static airbnbEntireHomesBS.AirbnbEntireHomesWebElements.*;


public class TestAirbnbEntireHomes extends BaseAPI {

    AirbnbEntireHomes airbnb;

    //Test 1
    @Test(enabled = false)
    public void testVisitHelpCenter() {
        airbnb = new AirbnbEntireHomes();
        airbnb.visitHelpCenter();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Home - Airbnb Help Center";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test 2
     @Test(enabled = false)
     public void testExploreMiramarBeach(){
         airbnb = new AirbnbEntireHomes();
         airbnb.exploreMiramarBeach();
         String actualResult = BaseAPI.driver.getTitle();
         String expectedResult = "Stays in Miramar Beach";

         Assert.assertEquals(actualResult, expectedResult, "Page not Found");
        }
     //Test 3 (new tab opens up sometimes)
     @Test(enabled = false)
     public void testSignUpPopUp(){
        airbnb = new AirbnbEntireHomes();
        airbnb.verifySignUpPopUp();
         String actualResult = BaseAPI.driver.getCurrentUrl();
         String expectedResult = "https://www.airbnb.com/s/Four-Corners/homes?room_types%5B%5D=Entire%20home%2Fapt&property_type_id%5B%5D=2&search_type=section_navigation&title_type=NONE&refinement_paths%5B%5D=%2Fhomes&flexible_trip_dates%5B%5D=april&flexible_trip_dates%5B%5D=may&flexible_trip_lengths%5B%5D=weekend_trip&date_picker_type=calendar&click_referer=t%3ASEE_ALL%7Csid%3A0be2e06d-83c4-45af-96e0-29f429eedad8%7Cst%3ASTAYS_LARGE_AREA_DESTINATION_CAROUSELS&search_mode=regular_search&place_id=ChIJT_i8jod83YgRttNxhAdub9M&query=Four%20Corners&last_search_session_id=0be2e06d-83c4-45af-96e0-29f429eedad8";

         Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test 4 (switches to a new tab during test)
    @Test(enabled = false)
    public void testTypeOfPlace(){
        airbnb = new AirbnbEntireHomes();
        airbnb.typeOfPlace();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Stays around the world";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }
    //Test 5
    @Test(enabled = false)
    public void testShowStaysAfterFilters() throws InterruptedException {
        airbnb = new AirbnbEntireHomes();
        airbnb.showStaysAfterFilters();
        String actualResult = BaseAPI.driver.getCurrentUrl();
        String expectedResult = "https://www.airbnb.com/";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test 6
    @Test(enabled = false)
    public void testFoundersLetterPage(){
        airbnb = new AirbnbEntireHomes();
        airbnb.founderLetterPage();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "What Makes Airbnb, Airbnb";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test 7
    @Test(enabled = false)
    public void testNavigateToSecFilings(){
        airbnb = new AirbnbEntireHomes();
        airbnb.navigateSecFilings();
        String actualResult = BaseAPI.driver.getCurrentUrl();
        String expectedResult = "https://investors.airbnb.com/financials/default.aspx#sec";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
    //Test 8
    @Test(enabled = false)
    public void testSearchFieldIsEnabled(){
        airbnb = new AirbnbEntireHomes();
        airbnb.searchFieldInspection();
        boolean act = driver.findElement(By.xpath(WEB_ELEMENT_LOCATION_FIELD)).isEnabled();
        Assert.assertTrue(act);
    }
    //Test 9
    @Test(enabled = false)
    public void testSearchFieldIsDisplayed(){
        airbnb = new AirbnbEntireHomes();
        airbnb.searchFieldInspection();
        boolean act = driver.findElement(By.xpath(WEB_ELEMENT_LOCATION_FIELD)).isDisplayed();
        Assert.assertTrue(act);
    }
    //Test 10
    @Test(enabled = false)
    public void testSearchFieldIsNotSelected(){
        airbnb = new AirbnbEntireHomes();
        airbnb.searchFieldInspection();
        boolean act = driver.findElement(By.xpath(WEB_ELEMENT_LOCATION_FIELD)).isSelected();
        Assert.assertFalse(act);

    }
    //Test 11
    @Test(enabled = true)
    public void testLocationSendKeys() throws InterruptedException {
        airbnb = new AirbnbEntireHomes();
        airbnb.sendKeysToField();
        assertEqualsGetAttribute("Miami",WEB_ELEMENT_LOCATION_FIELD,"value");
    }



    }


