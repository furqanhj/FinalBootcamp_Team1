package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.DataReader;

import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseAPI {

    public static WebDriver driver;
    public static WebDriverWait driverWait;
    public DataReader dataReader;
    public Properties properties;
    public static Actions actions;

    String propertiesFilePath = "src/main/resources/secret.properties";

    // Constructor for BaseAPI Class (Whenever BaseAPI is called or extended, an object of dataReader will be created)
    public BaseAPI() {

//        try {
//            properties = new Properties();
//            FileInputStream fis = new FileInputStream(propertiesFilePath);
//            properties.load(fis);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            dataReader = new DataReader();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    // Parameterization via .xml runner files in each module
    @Parameters({"browserName", "browserVersion", "url"})
    @BeforeMethod
    public static void setUp(@Optional("chrome") String browserName, @Optional("90") String browserVersion,
                             @Optional("") String url) {

        driver = getLocalDriver(browserName);
        driverWait = new WebDriverWait(driver, 10);
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public static void tearDown() {
        driver.close();
        driver.quit();
    }

    // Method to get local driver, based on the browserName parameter in testNG.xml runner file
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

    /**
     * Helper Methods
     */

    public void sendKeysToElement(WebElement element, String keysToSend) {

        try {
            driverWait.until(ExpectedConditions.visibilityOf(element));
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
            driverWait.until(ExpectedConditions.elementToBeClickable(elementToClick));
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

        driverWait.until(ExpectedConditions.visibilityOf(element));

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

        driverWait.until(ExpectedConditions.visibilityOf(element));

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

    /**
     * Assertion Helper Methods
     */

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

    public void typeOnElement(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex) {
            driver.findElement(By.xpath(locator)).sendKeys(value);
        }
    }


    //helper method to combine the assertion code into one method.
    //To get
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
                e1.printStackTrace();
            }
        }
    }

    public void assertEqualsGetTitle(String exp) {
        try {
            String actualResult = driver.getTitle();
            Assert.assertEquals(actualResult, exp, "TEST FAILED");
        } catch (Exception e) {
            e.printStackTrace();
            try {
                String actualResult = driver.getTitle();
                Assert.assertEquals(actualResult, exp, "TEST FAILED");
            } catch (Exception e1) {
                e1.printStackTrace();

            }
        }

    }

    public void assertEqualsGetAttribute(String exp, String loc, String attribute) {
        try {
            String expectedText = exp;
            String actualText = driver.findElement(By.xpath(loc)).getAttribute(attribute);
            Assert.assertEquals(actualText, expectedText, "ATTRIBUTE NOT FOUND");
        } catch (Exception e) {
            e.printStackTrace();
            String expectedText = exp;
            String actualText = driver.findElement(By.cssSelector(loc)).getAttribute(attribute);
            Assert.assertEquals(actualText, expectedText, "ATTRIBUTE NOT FOUND");
        }
    }


    public static void implicitWait(long seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }


    public static void typeOnElementNEnter(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }

    public void find(String locator) {
        driver.findElement(By.xpath(locator));
    }

    public void explicitWaitUntilClickable(long seconds, String locator) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));


    }

    public void click(String locator) {
        try {
            driver.findElement(By.xpath(locator)).click();
        } catch (Exception e) {
            e.printStackTrace();
            driver.findElement(By.cssSelector(locator)).click();
            try {
                driver.findElement(By.id(locator)).click();
            } catch (Exception e1) {
                e1.printStackTrace();
                driver.findElement(By.className(locator)).click();
            }


        }
    }


    public void fluentWait(long seconds) {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(seconds))
                .pollingEvery(Duration.ofSeconds(5))
                .withMessage("Time out after 30 seconds")
                .ignoring(NoSuchElementException.class);
    }


    public void waitTimeUsingFluentUsingXNCss(long seconds, String locator) {
        try {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(seconds))
                    .pollingEvery(Duration.ofSeconds(5))
                    .withMessage("Time out after 30 seconds")
                    .ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        } catch (Exception e) {
            e.printStackTrace();
            try {
                Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(seconds))
                        .pollingEvery(Duration.ofSeconds(5))
                        .withMessage("Time out after 30 seconds")
                        .ignoring(NoSuchElementException.class);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

    }

    public void scrollToElementUsingJavaScript(String loc) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
//Find element by link text and store in variable "Element"
            WebElement Element = driver.findElement(By.xpath(loc));
//This will scroll the page till the element is found
            js.executeScript("arguments[0].scrollIntoView();", Element);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                JavascriptExecutor js = (JavascriptExecutor) driver;
//Find element by link text and store in variable "Element"
                WebElement Element = driver.findElement(By.cssSelector(loc));
//This will scroll the page till the element is found
                js.executeScript("arguments[0].scrollIntoView();", Element);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    //iFrame Handle
    public void iframeHandle(WebElement element) {
        driver.switchTo().frame(element);
    }


    public void basicHoverUsingXpath(String loc) {
        //Hover over Like-New Cams link using Actions
        WebElement ele = driver.findElement(By.xpath(loc));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
    }
        public static void hoverOverNClickUsingXpath (String main, String sub){
            implicitWait(20);
            WebElement mainMenu = driver.findElement(By.xpath(main));
            Actions actions = new Actions(driver);
            actions.moveToElement(mainMenu).build().perform();
            WebElement subMenu = driver.findElement(By.xpath(sub));
            actions.moveToElement(subMenu);
            actions.click().build().perform();

        }

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
    }
