package ru.beru;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;


public class CoreUtils {
    public static Logger logger = new Logger();
    public ChromeDriver chromeDriver;
    public static final String CHROME_DRIVER_NAME = "webdriver.chrome.driver";
    public static final String CHROME_DRIVER_LOCATION = "/usr/bin/chromedriver";

    @Before
    public void setChromeDriver() {
        logger.info("Setting Chrome Driver.");
        System.setProperty(CHROME_DRIVER_NAME, CHROME_DRIVER_LOCATION);
        chromeDriver = new ChromeDriver();
        logger.info("Chrome Driver: " + CHROME_DRIVER_LOCATION + " was set successfully.");
    }

    @After
    public void closeChromeDriver() {
        logger.info("Closing Chrome Driver.");
        chromeDriver.close();
        logger.info("Chrome Driver was closed successfully.");
    }
}
