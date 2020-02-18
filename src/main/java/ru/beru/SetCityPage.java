package ru.beru;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class SetCityPage extends Core {
    Logger logger = new Logger();
    public static final By FIELD_PATH = By.xpath("/html/body/div[9]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/input");
    public static final By DELETE = By.xpath("/html/body/div[9]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div/div[2]/ul/li/div/div/div[1]");
    public static final By CONFIRM_BUTTON = By.xpath("/html/body/div[9]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/button");

    public SetCityPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    @Step("Enter region")
    public void enterRegion(String region) {
        logger.info("Click the field with cities.");
        click(FIELD_PATH);
        click(FIELD_PATH);

        logger.info("Enter the name of city.");
        sendKeys(FIELD_PATH, region);
        logger.info("Delete old city name.");
        click(DELETE);
        click(DELETE);
        logger.info("");
        sendKeys(FIELD_PATH, region);

        click(CONFIRM_BUTTON);
    }

}
