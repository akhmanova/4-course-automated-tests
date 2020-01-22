package ru.beru;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class ConfirmCityPage extends Core {
    public ConfirmCityPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @Step("Confirm region")
    public void confirmRegion() {

        click(By.xpath("/html/body/div[9]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/button/span"));
//
//        webDriver.
//        click(By.xpath("/html/body/div[9]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div/div[2]/ul/li[1]/div/div/div[1]"));
    }
}
