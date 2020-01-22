package ru.beru;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage extends Core {
    private Logger logger = new Logger();
    private By login = By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div[3]/div[1]");
    private By home = By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/div/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div/div[1]/button/span");
    private By city = By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/div/div/div/div[3]/div[3]/div/div/div/div/div/div/span/span[2]");

    public HomePage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    @Step("Press city")
    public void  pressCityButton() {
        click(city);
    }

    @Step("Assert login button change")
    public void assertLoginBtnChange() {
        logger.info("Checking a button from home directory: " + getText(home));
        Assert.assertEquals(
                getText(home),
                "Мой профиль"
        );
    }

    @Step("Click login button on home page")
    public void clickLoginBtn() {
        click(login);
    }



}
