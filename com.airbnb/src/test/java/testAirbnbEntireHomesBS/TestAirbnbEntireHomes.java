package testAirbnbEntireHomesBS;

import airbnbEntireHomesBS.AirbnbEntireHomes;
import common.BaseAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestAirbnbEntireHomes extends BaseAPI {

    AirbnbEntireHomes airbnbEntireHomes;

    @Test

    public void testAirbnbEntireHomesPage() throws InterruptedException {
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        airbnbEntireHomes = new AirbnbEntireHomes();
        airbnbEntireHomes.clickEntireHomesLink();

    }

}
