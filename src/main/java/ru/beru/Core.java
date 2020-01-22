package ru.beru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Core {
    protected WebDriver webDriver;
    protected WebDriverWait wait;

    public Core(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
    }

    public WebElement findElement(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return webDriver.findElement(element);
    }

    public void waitForVisibility(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void click(By elementBy) {
        findElement(elementBy).click();
    }

    public void sendKeys(By element, String keys) {
        findElement(element).sendKeys(keys);
    }

    public String getText(By element) {
        return findElement(element).getText();
    }

    public String getTitle(By element) {
        return findElement(element).getAttribute("title");
    }

    public WebElement findById(String name) {
        return (wait.until(ExpectedConditions.presenceOfElementLocated(By.id(name))));
    }

}
