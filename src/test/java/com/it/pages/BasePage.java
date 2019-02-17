package com.it.pages;

import com.it.Drevers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static com.it.common.Constants.BASE_URL;

public class BasePage {
    static protected WebDriver driver = DriverFactory.getDriver();


    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
