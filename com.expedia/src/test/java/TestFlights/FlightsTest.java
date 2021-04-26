package TestFlights;

import FlightsMA.FlightsPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightsTest extends BaseAPI {

    FlightsPage flightsPage;

    // Test 1
    @Test (enabled = false,priority = 1)
    public void testClickSearch (){
        flightsPage = new FlightsPage();
        flightsPage.clickSearch();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Flight search";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 2
    @Test (enabled = false,priority = 2)
    public void testAddTraveler (){
        flightsPage = new FlightsPage();
        flightsPage.addTraveler();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Cheap Flights: Airline Tickets, Airfare Deals & One Way Flights | Expedia";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 3
    @Test (enabled = false,priority = 3)
    public void testClickSupport (){
        flightsPage = new FlightsPage();
        flightsPage.clickSupport();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Customer Service Portal";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 4
    @Test (enabled = false,priority = 4)
    public void testLeavingFrom (){
        flightsPage = new FlightsPage();
        flightsPage.leavingFrom();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Cheap Flights: Airline Tickets, Airfare Deals & One Way Flights | Expedia";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 5
    @Test (enabled = false,priority = 5)
    public void testGoingTo (){
        flightsPage = new FlightsPage();
        flightsPage.goingTo();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Cheap Flights: Airline Tickets, Airfare Deals & One Way Flights | Expedia";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");

    }

    // Test 6
    @Test (enabled = false,priority = 6)
    public void testGetTheApp (){
        flightsPage = new FlightsPage();
        flightsPage. getTheApp();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Cheap Flights: Airline Tickets, Airfare Deals & One Way Flights | Expedia";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 7
    @Test (enabled = false,priority = 7)
    public void testClickNewsroom (){
        flightsPage = new FlightsPage();
        flightsPage . clickNewsroom();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Cheap Flights: Airline Tickets, Airfare Deals & One Way Flights | Expedia";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 8
    @Test (enabled = false,priority = 8)
    public void testAdvertising (){
        flightsPage = new FlightsPage();
        flightsPage. advertising();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Cheap Flights: Airline Tickets, Airfare Deals & One Way Flights | Expedia";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 9
    @Test (enabled = false,priority = 9)
    public void testInvestorRelations (){
        flightsPage = new FlightsPage();
        flightsPage. investorRelations();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Cheap Flights: Airline Tickets, Airfare Deals & One Way Flights | Expedia";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 10

    @Test (enabled = false,priority = 10)
    public void testTermsOfUse (){
        flightsPage = new FlightsPage();
        flightsPage. termsOfUse();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Cheap Flights: Airline Tickets, Airfare Deals & One Way Flights | Expedia";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }
}
