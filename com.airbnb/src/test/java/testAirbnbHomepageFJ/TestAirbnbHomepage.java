package testAirbnbHomepageFJ;

import airbnbHomepageFJ.AirbnbHomepage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAirbnbHomepage extends BaseAPI {

    AirbnbHomepage homepage;

    //TestCase#1: Validate number of link/ elements in the global dropdown menu (5links)
    @Test(priority = 1, enabled = false)
    public void testValidateNumOfLinksInGlobalDropdown(){
        homepage = new AirbnbHomepage();
        homepage.clickGlobalDropdownMenu();

        int actualNumOfLinks = homepage.actualNumOfLinksInGlobalDropdown.size();
        int expectedNumOfLinks = 5;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
        System.out.println("ACTUAL NUM OF LINKS = " + actualNumOfLinks);
        System.out.println("EXPECTED NUM OF LINKS = " + expectedNumOfLinks);
    }

    //TestCase#2: click signup button in dropdown and validate via text
    @Test (priority = 2, enabled = false)
    public void testClickSignUpButtonInDropdownMenu(){
        homepage = new AirbnbHomepage();
        homepage.clickSignUpButtonInDropdownMenu();

        String actualText = homepage.actualTextInSignUpIframe.getText();
        String expectedText = "Sign up";

        Assert.assertEquals(actualText, expectedText, "TEXT DO NOT MATCH");
    }

    //TestCase#3: Do Signup wth invalid phone number, validate via text
    @Test (priority = 3, enabled = false)
    public void testDoInvalidSignup() throws InterruptedException {
        homepage = new AirbnbHomepage();
        homepage.doSignup("456789");

        String actualText = getTextFromElement(homepage.actualTextPhoneNumberErrorMessage);
        String expectedText = "You'll need to use a different phone number, we can't support this one.";

        Assert.assertTrue(compareStrings(actualText, expectedText));
        System.out.println("ACTUAL NUM OF LINKS = " + actualText);
        System.out.println("EXPECTED NUM OF LINKS = " + expectedText);
    }

    //TestCase#4: Do Signup with Valid phone number, validate with Text
    @ Test (priority = 4, enabled = false)
    public void testDoValidSignup(){
        homepage = new AirbnbHomepage();
        homepage.doSignup("7025822178");

        String actualText = getTextFromElement(homepage.actualTextValidSignupConfirmYourNumber);
        String expectedText = "Didn't get a code?";

        Assert.assertTrue(compareStrings(actualText, expectedText));
        System.out.println("ACTUAL NUM OF LINKS = " + actualText);
        System.out.println("EXPECTED NUM OF LINKS = " + expectedText);
    }

    //TestCase#5: Validating number of countries in Country dropdown:
    @Test (priority = 5, enabled = false)
    public void testNumberOfCountriesInCountryRegionDropdown(){
        homepage = new AirbnbHomepage();
        homepage.clickSignUpButtonInDropdownMenu();
        clickElement(homepage.countryRegionDropdown);

        int actualNumOfCountries = homepage.actualNumOfCountriesInCountryDropdown.size();
        int expectedNumOfCountries = 242;

//        Assert.assertEquals(actualNumOfCountries, expectedNumOfCountries, "NUMBER OF COUNTRIES DO NOT MATCH");
        Assert.assertTrue(compareIntegers(actualNumOfCountries, expectedNumOfCountries));
        System.out.println("ACTUAL NUMBER OF COUNTRIES = " + actualNumOfCountries);
        System.out.println("EXPECTED NUMBER OF COUNTRIES = " + expectedNumOfCountries);
    }

    //TestCase#6: Selecting a country from Country/Region dropdown changes the country code in phone number input field
    @Test (priority = 6, enabled = false)
    public void testSelectDifferentCountryFromDropdown(){
        homepage = new AirbnbHomepage();
        homepage.selectDifferentCountryRegionFromDropdownForSignup("Pakistan (+92)");

        Assert.assertTrue(homepage.countryCodeAutoChangeInsidePhoneNumberInputField.getAttribute("text").equals("+92"));
    }

    //TestCase#7: Change the country to Pakistan and do a valid signup: validate via text
    @Test (priority = 7, enabled = false)
    public void testChangeCountryAndDoValidSignup(){
        homepage = new AirbnbHomepage();
        homepage.changeCountryAndSignup("Pakistan (+92)", "3158448959");

        String actualText = getTextFromElement(homepage.actualTextValidSignupConfirmYourNumber);
        String expectedText = "Didn't get a code?";

        Assert.assertTrue(compareStrings(actualText, expectedText));
    }

    //TestCase#8: Validate continue with Email option on signup window
    @Test (priority = 8, enabled = false)
    public void testClickOnOptionContinueWithEmail(){
        homepage = new AirbnbHomepage();
        homepage.clickOnOptionContinueWithEmail();

        Assert.assertTrue(isElementDisplayed(homepage.emailInputFieldOnContinueWithEmailOption));

    }

    //TestCase#9: Validate continue with Facebook option on signup window
    @Test (priority = 9, enabled = false)
    public void testClickOnOptionContinueWithFacebook(){
        homepage = new AirbnbHomepage();
        homepage.clickOnOptionContinueWithFacebook();

        String actualText = getTextFromElement(homepage.actualTextContinueWithFacebookNewWindow);
        String expectedText = "Log in to use your Facebook account with ";

        Assert.assertEquals(actualText, expectedText, "TEXT DO NOT MATCH");
    }

    //TestCase#10: Validate continue with Google option on signup window
    @Test (priority = 10, enabled = true)
    public void testClickOnOptionContinueWithGoogle(){
        homepage = new AirbnbHomepage();
        homepage.clickOnOptionContinueWithGoogle();

        Assert.assertTrue(isTitleTrue("Sign in - Google Accounts"));

    }
}
