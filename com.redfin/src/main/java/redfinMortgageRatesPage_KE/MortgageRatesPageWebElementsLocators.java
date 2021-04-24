package redfinMortgageRatesPage_KE;

public class MortgageRatesPageWebElementsLocators {
    public static final String WEB_ELEMENT_MORTGAGE_TEXT_LINK ="//*[@id=\"header-content\"]/header[2]/div[2]/div[4]/a"; //xpath
    public static final String WEB_ELEMENT_REDFIN_LOGO ="//span[@class='Svg RedfinLogo']//*[local-name()='svg']"; // xpath
    //Location Box input , located by : css
    public static final String WEB_ELEMENT_LOCATION_BOX_INPUT = "[placeholder='State, City, County, ZIP']";
    //Home price Box input , located by :xpath
    public static final  String WEB_ELEMENT_HOme_PRICE_INPUT = "//input[@name='homePrice']";
    //Down Payment percentage , located by :
    public static final String WEB_ELEMENT_DOWN_PAYMENT_PERCENTAGE = "//input[@name='percent']";
    // Update Rates Button , located by :xpath
    public static final String WEB_ELEMENT_UPDATE_RATES_BTN ="//span[normalize-space()='Update Rates']";
    // Get Pre-Approved Button , located by :xpath
    public static final String WEB_ELEMENT_GET_PRE_APPROVED_BTN ="//span[.='Get Pre-Approved']";
    //Facebook icon   located by : css
    public static final String WEB_ELEMENT_FACEBOOK_ICON =".facebookIcon";

}
