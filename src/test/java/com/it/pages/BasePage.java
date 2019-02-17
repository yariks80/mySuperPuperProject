package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static com.it.common.Constants.BASE_URL;

public class BasePage {
    static protected WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
