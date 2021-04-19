package bmwHomepageFJ;

public class BMWHomepageWebElements {

    /**
     * Locators on homepage
     */
    //Owners dropdown on homepage: (XPATH - custom)
    public static final String WEB_ELEMENT_OWNERS_DROPDOWN = "//ul[@class='globalnav-primary__links']/li[5]/button";


    /**
     * Locators required for Assertions
     */
    //Number of links under BMW OWNERS inside Owners dropdown (3 links): (XPATH - custom)
    public static final String WEB_ELEMENTS_NUMBER_OF_LINKS_BMW_OWNERS = "//div[@class='globalnav-primary-drop-down-nav__title-section']/div/a";
    //Number of links under "Get to know your BMW" inside Owners dropdown (4 links): (XPATH)
    public static final String WEB_ELEMENTS_NUMBER_OF_LINKS_KNOW_YOUR_BMW = "/html/body/div[1]/div/div/div[5]/div[3]/div/div/div/div[2]/div[2]/nav[1]/ul/li";
    //Number of links under "Caring for your BMW" inside Owners dropdown (5 links): (XPATH)
    public static final String WEB_ELEMENTS_NUMBER_OF_LINKS_CARING_FOR_YOUR_BMW = "//div[1]/div/div/div[5]/div[3]/div/div/div/div[2]/div[2]/nav[2]/ul/li";

}
