package ru.beru;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", );
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://beru.ru/");
    }
}
