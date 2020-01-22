package ru.beru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverSetup {
    private static EventFiringWebDriver eventDriver;
    private static WebDriverWait wait;
    public static Logger logger = new Logger();

    public static WebDriver getEventDriver() {
        return eventDriver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    @BeforeMethod
    public void setup() {
        logger.info("Setting Chrome driver");
        System.setProperty("webdriver.chrome.driver", "/home/eakhmanova/git/4-course-automated-tests/lib/chromedriver");
        logger.info("Chrome driver was set successful.");

        logger.info("Setting EventFiringWebDriver");
        eventDriver = new EventFiringWebDriver(new ChromeDriver());
        logger.info("Register web driver");
        eventDriver.register(new WebDriverEventListener());
        logger.info("Get main mage");
        eventDriver.get("https://beru.ru/");
        logger.info("Maximize main page");
        eventDriver.manage().window().maximize();

        wait = new WebDriverWait(eventDriver, 10);
        logger.info("Set WebDriverWait");
    }

//    @AfterMethod
//    public void teardown() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.header2-nav__user")));
//
//        if (eventDriver.findElement(By.cssSelector("div.header2-nav__user")).getText().equals("Мой профиль")) {
//            eventDriver.findElement(By.className("header2-nav__user")).click();
//            eventDriver.findElement(By.xpath("//a[text()='Выход']")).click();
//        }
//
//        eventDriver.quit();
//    }
    @AfterMethod
    public void close() {
        if (eventDriver.findElement(By.cssSelector(".header2-nav__user"))
                .getAttribute("textContent").contains("Мой профиль")) {
            eventDriver.findElement(By.cssSelector(".header2-nav__user")).click();
            eventDriver.findElement(By.cssSelector("[class*='type_logout']")).click();
        }
        eventDriver.quit();
    }

}
