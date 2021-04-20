package homePageAB;

public class HomePageWebElement {

        // search for deals.
    public static final String WEB_ELEMENT_BUTTON_DEALS ="a[title='Deals']"; //css


        //Search for search Bar(box)
    public static final String WEB_ELEMENT_INPUT_SEARCH_BAR = "#globalSearchInputField"; //css
    public static final String WEB_ELEMENT_BUTTON_SEARCH_SEARCH_BAR="/html//button[@id='searchSubmit']";//xpath
    public static final String WEB_ELEMENT_EXPECTED_TEXT_SEARCH_RESULT="#resultsFoundMessage > h1"; //css


    //For log in
    public static final String WEB_ELEMENT_SIGN_BUTTON="#myRewardsLabel-status > span:nth-child(1)";//CSS
    public static final String WEB_ELEMENT_EMAIL_ADDRESS="input#email";//CSS
    public static final String WEB_ELEMENT_PASSWORD="input#pw-input";//CSS
    public static final String WEB_ELEMENT_SIGN_IN_BUTTON="input#sign-in";//css
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ERROR_MESSAGE="#ul-msg-section > div > div > div.message > div > p";//CSS


    //For Macy's Logo

    public static final String WEB_ELEMENT_MACYS_LOGO="#logo > a > svg";//css

    //For Macys "My account"

    public static final String WEB_ELEMENT_MACYS_MY_ACCOUNT= "#myRewardsLabel-status > span.tier-status";//CSS
    public static final String WEB_ELEMENT_MACYS_EMAIL= "#email";//CSS
    public static final String WEB_ELEMENT_MACYS_PASSWORD= "input#pw-input";//CSS
    public static final String WEB_ELEMENT_MACYS_SIGN_IN= "#sign-in";
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ERROR_MESSAGE1 = "#ul-msg-section > div > div > div.message > div > p";


    //For bag count/add to cart

    public static final String WEB_ELEMENT_MY_SHOPPING_CART= "//*[@id=\"bagCount\"]"; //xpath
    public static final String WEB_ELEMENT_ACTUAL_TEXT_ERROR_MESSAGE3="#empty-bag-message > div.text.centerDiv.large-6.medium-10.small-12";





}
