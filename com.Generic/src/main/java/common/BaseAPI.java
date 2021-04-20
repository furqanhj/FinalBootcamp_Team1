package common;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Optional;
import org.testng.asserts.SoftAssert;
import reporting.ExtentManager;
import reporting.ExtentTestManager;
import utilities.DataReader;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseAPI {

    public static WebDriver driver;
    public static WebDriverWait driverWait;
    public static Actions actions;
    public static ExtentReports extent;
    public static EventFiringWebDriver eventFiringWebDriver;

    public DataReader dataReader = new DataReader();
    public Properties properties = new Properties();

    @BeforeSuite(alwaysRun = true)
    public static void beforeSuiteExtentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod(alwaysRun = true)
    public static void beforeEachMethodExtentInit(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName();

        ExtentTestManager.startTest(methodName);
        ExtentTestManager.getTest().assignCategory(className);

        System.out.println("\n\t***" + methodName + "***\n");
    }

    // Parameterization via .xml runner files in each module
    @Parameters({"browserName", "browserVersion", "url"})
    @BeforeMethod(alwaysRun = true)
    public static void setUp(@Optional("chrome") String browserName, @Optional("90") String browserVersion,
                             @Optional("") String url, Method method) {

        driver = getLocalDriver(browserName);
        driverWait = new WebDriverWait(driver, 10);
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        actions = new Actions(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void afterEachTestMethod(ITestResult result) {

        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == ITestResult.FAILURE) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, "TEST CASE FAILED: " + result.getName());
            ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable());
            captureScreenshot(driver, result.getName());
        } else if (result.getStatus() == ITestResult.SKIP) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "TEST CASE SKIPPED: " + result.getName());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "TEST CASE PASSED: " + result.getName());
        }

        ExtentTestManager.endTest();
        extent.flush();
    }

    @AfterMethod(alwaysRun = true)
    public static void tearDown() {
        driver.close();
        driver.quit();
    }

    @AfterSuite(alwaysRun = true)
    private void afterSuiteCloseExtent() {
        extent.close();
    }

    /**
     * Driver + ExtentReport Helper Methods
     */
    public static WebDriver getLocalDriver(String browserName) {
        if (browserName.toLowerCase().equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.toLowerCase().equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.toLowerCase().equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browserName.toLowerCase().equals("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        } else if (browserName.toLowerCase().equals("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }

        return driver;
    }

    private static void captureScreenshot(WebDriver driver, String testName) {
        String fileName = testName + ".png";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File newScreenshotFile = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator +
                "main" + File.separator + "java" + File.separator + "reporting" + File.separator + "screenshots" + File.separator + fileName);

        try {
            FileHandler.copy(screenshot, newScreenshotFile);
            System.out.println("SCREENSHOT TAKEN");
        } catch (Exception e) {
            System.out.println("ERROR TAKING SCREENSHOT: " + e.getMessage());
        }
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }


    /**
     * Action Helper Methods
     */

    public void hoverOverElement(WebElement elementToHoverOver) {
        try {
            waitForVisibilityOfElement(elementToHoverOver);
            actions.moveToElement(elementToHoverOver).build().perform();

        } catch (ElementNotInteractableException elementNotInteractableException) {
            elementNotInteractableException.printStackTrace();
            System.out.println("ELEMENT IS NOT INTERACTABLE");

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("UNABLE TO HOVER OVER ELEMENT");
        }
    }

    public void selectElement(WebElement elementToSelect) {
        waitForElementToBeClickable(elementToSelect);
        clickElement(elementToSelect);
    }

    public void sendKeysToElement(WebElement element, String keysToSend) {

        try {
            waitForVisibilityOfElement(element);
            element.sendKeys(keysToSend);

        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENT IS STALE");

        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO SEND KEYS TO WEB ELEMENT");
        }
    }

    public void clickElement(WebElement elementToClick) {

        try {
            waitForElementToBeClickable(elementToClick);
            elementToClick.click();
        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENT IS STALE");

        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO CLICK ON WEB ELEMENT");
        }
    }

    public String getTextFromElement(WebElement element) {
        String elementText = "";

        waitForVisibilityOfElement(element);

        try {
            elementText = element.getText();
            return elementText;
        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENT IS STALE");
        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO GET TEXT FROM WEB ELEMENT");
        }

        return elementText;
    }

    public String getAttributeFromElement(WebElement element, String attribute) {
        String elementText = "";

        waitForVisibilityOfElement(element);

        try {
            elementText = element.getAttribute(attribute);
            return elementText;
        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENT IS STALE");
        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO GET ATTRIBUTE FROM WEB ELEMENT");
        }

        return elementText;
    }

    // 3 Methods to help with selecting from SELECT Dropdown
    public void selectOptionByIndex(WebElement dropdown, int index) {
        Select select = new Select(dropdown);

        try {
            waitForElementToBeClickable(dropdown);
            select.selectByIndex(index);

        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENT IS STALE");

        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO SELECT OPTION " + index + " FROM DROPDOWN");
        }
    }

    public void selectOptionByVisibleText(WebElement dropdown, String visibleText) {
        Select select = new Select(dropdown);

        try {
            waitForElementToBeClickable(dropdown);
            select.selectByVisibleText(visibleText);

        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENT IS STALE");

        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO SELECT OPTION (" + visibleText + ") FROM DROPDOWN");
        }
    }

    public void selectOptionByValue(WebElement dropdown, String value) {
        Select select = new Select(dropdown);

        try {
            waitForElementToBeClickable(dropdown);
            select.selectByValue(value);

        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENT IS STALE");

        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO SELECT OPTION FROM DROPDOWN BY VALUE: " + value);
        }
    }

    public List<WebElement> getListOfWebElements(By by) {
        List<WebElement> elementList = new ArrayList<>();

        driverWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(by)));

        try {
            elementList = driver.findElements(by);
            return elementList;
        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENTS ARE STALE");
        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENTS ARE NOT VISIBLE IN THE DOM");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO LOCATE WEB ELEMENTS");
        }

        return elementList;
    }

    public void switchToNewWindow() {
        String parentWindow = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            if (!(handle.equals(parentWindow))) {
                driver.switchTo().window(handle);
            }
        }
    }

    public void switchToNewTab(int tabIndexToSwitchTo) {

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        try {
            driver.switchTo().window(tabs.get(tabIndexToSwitchTo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void switchToParentTabOrWindow() {
        driver.switchTo().defaultContent();
    }

    public void switchToIFrameUsingIndex(int index) {
        driver.switchTo().frame(index);
    }

    public void switchToIFrameUsingElement(WebElement element) {
        waitForVisibilityOfElement(element);
        driver.switchTo().frame(element);
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    /**
     * Javascript Helper Methods
     */

    public static void clickJScript(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            js.executeScript("arguments[0].click();", element);

        } catch (NoSuchElementException e) {
            System.out.println("NO SUCH ELEMENT - " + element);
            e.printStackTrace();

        } catch (StaleElementReferenceException e) {
            System.out.println("STALE ELEMENT - " + element);
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("COULD NOT CLICK ON ELEMENT - " + element);
            e.printStackTrace();
        }
    }

    public void scrollToElementJScript(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            js.executeScript("arguments[0].scrollIntoView();", element);
        } catch (NoSuchElementException e) {
            System.out.println("NO SUCH ELEMENT - " + element);
            e.printStackTrace();
        } catch (StaleElementReferenceException e) {
            System.out.println("STALE ELEMENT - " + element);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("COULD NOT SCROLL TO ELEMENT - " + element);
            e.printStackTrace();
        }
    }

    public void mouseHoverJScript(WebElement element) {
        try {

            if (isElementDisplayed(element)) {
                String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
                ((JavascriptExecutor) driver).executeScript(mouseOverScript, element);
                System.out.println("Hover performed\n");
            } else {
                System.out.println("UNABLE TO HOVER OVER ELEMENT\n");
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("ELEMENT WITH " + element
                    + " IS NOT ATTACHED TO THE PAGE DOCUMENT");
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            System.out.println("ELEMENT " + element + " WAS NOT FOUND IN DOM");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("ERROR OCCURED WHILE HOVERING\n");
            e.printStackTrace();
        }
    }

    /**
     * Synchronization Helper Methods
     */

    public void waitForVisibilityOfElement(WebElement element) {
        try {
            driverWait.until(ExpectedConditions.visibilityOf(element));

        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT NOT VISIBLE");

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("UNABLE TO LOCATE ELEMENT");
        }
    }

    public void waitForElementToBeClickable(WebElement element) {
        try {
            driverWait.until(ExpectedConditions.elementToBeClickable(element));

        } catch (ElementNotInteractableException elementNotInteractableException) {
            elementNotInteractableException.printStackTrace();
            System.out.println("ELEMENT NOT INTERACTABLE");

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("UNABLE TO LOCATE ELEMENT");
        }
    }

    public void waitForElementToBeSelected(WebElement element) {
        try {
            driverWait.until(ExpectedConditions.elementSelectionStateToBe(element, true));

        } catch (ElementNotInteractableException elementNotInteractableException) {
            elementNotInteractableException.printStackTrace();
            System.out.println("ELEMENT NOT INTERACTABLE");

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("UNABLE TO LOCATE ELEMENT");
        }
    }

    public void waitForPageLoad(String URL) {
        driverWait.until(ExpectedConditions.urlToBe(URL));
    }


    /**
     * Assertion Helper Methods
     */

    public boolean isElementDisplayed(WebElement element) {
        boolean flag = false;

        try {
            waitForVisibilityOfElement(element);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO DETERMINE IF ELEMENT IS VISIBLE");
        }

        if (element.isDisplayed()) {
            flag = true;
            return flag;
        }

        return flag;

    }

    public boolean isElementSelected(WebElement element) {
        boolean flag = false;

        try {
            waitForElementToBeSelected(element);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO DETERMINE IF ELEMENT IS SELECTED");
        }

        if (element.isSelected()) {
            flag = true;
            return flag;
        }

        return flag;
    }

    public boolean compareStrings(String str1, String str2) {
        boolean flag = false;

        if (str1.toLowerCase().equals(str2)) {
            flag = true;
            return flag;
        }

        return flag;
    }

    // Gets text from List<WebElements> and compares against expected String array from Excel workbook
    public boolean compareAttributeListToExpectedStringArray(By by, String attribute, String path, String sheetName) throws IOException {
        List<WebElement> actualList = driver.findElements(by);
        String[] expectedList = dataReader.fileReaderStringXSSF(path, sheetName);

        String[] actual = new String[actualList.size()];

        for (int j = 0; j < actualList.size(); j++) {
            actual[j] = actualList.get(j).getAttribute(attribute).replaceAll("&amp;", "&").replaceAll("’", "'").replaceAll("<br>", "\n").trim();
            actual[j].replaceAll("&amp;", "&").replaceAll("’", "'").replaceAll("<br>", "\n").trim();
//            escapeHtml4(actual[j]);
//            escapeHtml3(actual[j]);
        }

        int falseCount = 0;
        boolean flag = false;

        for (int i = 0; i < expectedList.length; i++) {
            if (actual[i].equalsIgnoreCase(expectedList[i])) {
                flag = true;
                System.out.println("ACTUAL " + attribute.toUpperCase() + " " + (i + 1) + ": " + actual[i]);
                System.out.println("EXPECTED " + attribute.toUpperCase() + " " + (i + 1) + ": " + expectedList[i] + "\n");
            } else {
                System.out.println("FAILED AT INDEX " + (i + 1) + "\nEXPECTED " + attribute.toUpperCase() + ": " + expectedList[i] +
                        "\nACTUAL " + attribute.toUpperCase() + ": " + actual[i] + "\n");
                falseCount++;
            }
        }
        if (falseCount > 0) {
            flag = false;
        }
        return flag;
    }

    public void typeOnElement(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex) {
            driver.findElement(By.xpath(locator)).sendKeys(value);
        }


    }

    public void clickByXpathOrCssUsingJavaScript(String locator) {
        try {
            //explicit wait
            WebDriverWait wait10 = new WebDriverWait(driver, 20);
            //for any web elements found by xpath
            WebElement element = driver.findElement(By.xpath(locator));
            //converting Javascriptexecutor to driver, to give it access. so its able to click on anything without issues
            JavascriptExecutor js = (JavascriptExecutor) driver;
            //Telling javascript to execute a script, telling it to click the element
            js.executeScript("arguments[0].click()", element);
        } catch (Exception e) {
            e.printStackTrace();     //info on the exception and what went wrong
            System.out.println("FIRST ATTEMPT FAILED");
            try {
                //explicit wait
                WebDriverWait wait10 = new WebDriverWait(driver, 20);
                //for any web elements found by xpath
                WebElement element = driver.findElement(By.cssSelector(locator));
                //converting Javascriptexecutor to driver, to give it access. so its able to click on anything without issues
                JavascriptExecutor js = (JavascriptExecutor) driver;
                //Telling javascript to execute a script, telling it to click the element
                js.executeScript("arguments[0].click()", element);
            } catch (Exception e1) {
                e1.printStackTrace();
            }


        }
    }

    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void waitTimeUsingFluent() {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("Time out after 30 seconds")
                .ignoring(NoSuchElementException.class);

    }

    public void assertEqualsGetTextUsingXpath(String exp, String loc) {
        String actualText = driver.findElement(By.xpath(loc)).getText();
        Assert.assertEquals(actualText, exp);
    }


    public void switchWindows() {
        try {
            String parentWindow = driver.getWindowHandle();
            Set<String> windowHandle = driver.getWindowHandles();
            for (String handle : windowHandle) {
                if (!(handle.equals(parentWindow))) {
                    driver.switchTo().window(handle);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n*** Window Switch Failed ***");
        } finally {
            System.out.println(driver.getTitle());
        }
    }

    public void switchHandlesExample() {
// Get Parent window handle
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
// Switch to child window
            driver.switchTo().window(winHandle);
        }
// Do some operation on child window and get child window handle.
        String winHandleAfter = driver.getWindowHandle();
//switch to child window of 1st child window.
        for (String winChildHandle : driver.getWindowHandles()) {
// Switch to child window of the 1st child window.
            if (!winChildHandle.equals(winHandleBefore)
                    && !winChildHandle.equals(winHandleAfter)) {
                driver.switchTo().window(winChildHandle);
            }
        }
    }


    public void assertEqualsGetAttribute(String expected, String locator, String attribute) throws
            InterruptedException {
        try {
            String icon = driver.findElement(By.xpath(locator)).getAttribute(attribute);
            Assert.assertEquals(icon, expected, "\n*** Error Icon Not Displayed ***");
        } catch (Exception e) {
            System.out.println("\n*** First Attempt Unsuccessful ***");
            try {
                String icon = driver.findElement(By.cssSelector(locator)).getAttribute(attribute);
                Assert.assertEquals(icon, expected, "\n*** Error Icon Not Displayed ***");
            } catch (Exception ex) {
                System.out.println("\n*** Second Attempt Unsuccessful ***");
                try {
                    String icon = driver.findElement(By.className(locator)).getAttribute(attribute);
                    Assert.assertEquals(icon, expected, "\n*** Error Icon Not Displayed ***");
                } catch (Exception ex1) {
                    System.out.println("\n*** Third Attempt Unsuccessful ***");
                    try {
                        String icon = driver.findElement(By.id(locator)).getAttribute(attribute);
                        Assert.assertEquals(icon, expected, "\n*** Error Icon Not Displayed ***");
                    } catch (Exception ex2) {
                        System.out.println("\n*** Fourth Attempt Unsuccessful ***");
                        try {
                            String icon = driver.findElement(By.tagName(locator)).getAttribute(attribute);
                            Assert.assertEquals(icon, expected, "\n*** Error Icon Not Displayed ***");
                        } catch (Exception ex3) {
                            System.out.println("\n*** Last Attempt Unsuccessful ***");
                        }
                    }
                }
            }
        }
    }

    public void cancelAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
            System.out.println(alert.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void assertEqualsGetTitle(String exp, String loc) {
        try {
            String actualResult = driver.findElement(By.xpath(loc)).getText();
            Assert.assertEquals(actualResult, exp, "TEST FAILED");
        } catch (Exception e) {
            e.printStackTrace();
            try {
                String actualResult = driver.findElement(By.cssSelector(loc)).getText();
                Assert.assertEquals(actualResult, exp, "TEST FAILED");
            } catch (Exception e1) {


            }
        }
    }

    public void assertEqualsGetText(String exp, String loc) {
        try {
            String actualResult = driver.findElement(By.xpath(loc)).getText();
            Assert.assertEquals(actualResult, exp, "TEST FAILED");
        } catch (Exception e) {
            e.printStackTrace();
            try {
                String actualResult = driver.findElement(By.cssSelector(loc)).getText();
                Assert.assertEquals(actualResult, exp, "TEST FAILED");
            } catch (Exception e1) {
            }
        }
    }

    public void basicHoverUsingXpath(String loc) {
        //Hover over Like-New Cams link using Actions
        WebElement ele = driver.findElement(By.xpath(loc));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
    }

    public static void hoverOverNClickUsingXpath(String main, String sub) {
        implicitWait(20);
        WebElement mainMenu = driver.findElement(By.xpath(main));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).build().perform();
        WebElement subMenu = driver.findElement(By.xpath(sub));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
    }

    public static void implicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public static void softAssertAssertEqualsGetCurrentURL(String exp) {
        String expected = exp;
        String actual = driver.getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual, expected, "TEST FAILED");

    }

    public static void enterKey() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    public boolean compareTwoIntegers(int int1, int int2) {
        boolean flag = false;
        if (int1 != int2)
            flag = false;
        else if (int1 == int2)
            flag = true;

        return flag;
    }

    public boolean isTitleTrue(String title) {
        boolean flag = false;

        try {
            title = driver.getTitle();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO GET TITLE FROM PAGE");
        }
        if (title != null)
            flag = true;
        else
            return flag;

        return flag;
    }

    public void fluentWait(long seconds) {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(seconds))
                .pollingEvery(Duration.ofSeconds(5))
                .withMessage("Time out after 30 seconds")
                .ignoring(NoSuchElementException.class);


    }
}



