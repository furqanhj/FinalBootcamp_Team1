package testAttHomepageFJ;

import attHomepageFJ.AttHomepage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAttHomepage extends BaseAPI {

    AttHomepage homepage;

    //Test Case#1: navigate to TV page, validate via title
    @Test (priority = 1, enabled = true)
    public void testNavigateToTVLink(){
        homepage = new AttHomepage();
        homepage.navigateToTVLink();

        Assert.assertTrue(isTitleTrue("AT&T TV - Live Streaming TV - Call 855-696-1226"));
    }
}
