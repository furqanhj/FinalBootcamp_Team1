import HelpCenterMA.HelpCenterPage;
import common.BaseAPI;
import io.cucumber.java.af.En;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpCenterTest extends BaseAPI {

    HelpCenterPage helpCenterPage;


    // Test 1
    @Test(enabled = true, priority = 1)
    public void testClickLogIn() {
        helpCenterPage = new HelpCenterPage();
        helpCenterPage.clickLogIn();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Log In / Sign Up";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 2
    @Test(enabled = false, priority = 2)
    public void testSignUp() {
        helpCenterPage = new HelpCenterPage();
        helpCenterPage.signUp();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Log In / Sign Up";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 3
    @Test(enabled = false, priority = 3)
    public void testBookingTraveling() {
        helpCenterPage = new HelpCenterPage();
        helpCenterPage.bookingTraveling();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Log In / Sign Up";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 4
    @Test(enabled = false, priority = 4)
    public void testSafetyConcerns() {
        helpCenterPage = new HelpCenterPage();
        helpCenterPage.safetyConcerns();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Safety concerns - Airbnb Help Center";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 5
    @Test(enabled = false, priority = 5)
    public void testPrivacyPolicy() {
        helpCenterPage = new HelpCenterPage();
        helpCenterPage.privacyPolicy();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Privacy Policy - Airbnb Help Center";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }


    // Test 6
    @Test(enabled = false, priority = 6)
    public void testHostingStays() {
        helpCenterPage = new HelpCenterPage();
        helpCenterPage.hostingStays();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Hosting stays - Airbnb Help Center";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 7
    @Test(enabled = false, priority = 7)
    public void testReportingIssues() {
        helpCenterPage = new HelpCenterPage();
        helpCenterPage.reportingIssues();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Hosting stays - Airbnb Help Center";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 8
    @Test(enabled = false, priority = 8)
    public void testTermsOfServices() {
        helpCenterPage = new HelpCenterPage();
        helpCenterPage.termsOfServices();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Hosting stays - Airbnb Help Center";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    //Test 9
    @Test(enabled = false, priority = 9)
    public void testViewReviews() {
        helpCenterPage = new HelpCenterPage();
        helpCenterPage.viewReviews();
        String actualResult = BaseAPI.driver.getTitle();
        String expectedResult = "Hosting stays - Airbnb Help Center";

        Assert.assertEquals(actualResult, expectedResult, "Page not Found");
    }

    // Test 10
    @Test(enabled = false, priority = 10)
    public void testAccountSecurity() {
            helpCenterPage = new HelpCenterPage();
            helpCenterPage.accountSecurity();
            String actualResult = BaseAPI.driver.getTitle();
            String expectedResult = "Hosting stays - Airbnb Help Center";

            Assert.assertEquals(actualResult, expectedResult, "Page not Found");
        }
    }



