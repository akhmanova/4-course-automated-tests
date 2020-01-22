package ru.beru;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Core {

    public static final String BERU_LOGIN = "beru-test";
    public static final String BERU_PASSWORD = "beru-test-ba019mege";

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @Step("Enter login")
    public void enterLogin() {
        sendKeys(By.id("passp-field-login"), BERU_LOGIN);
    }

    @Step("Enter password")
    public void enterPassword() {
        sendKeys(By.id("passp-field-passwd"), BERU_PASSWORD);
    }


    @Step("Click submit button on login page")
    public void clickSubmitBtn() {
        click(By.className("button2_type_submit"));
    }
}
