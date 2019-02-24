package com.it.pages;

import com.it.Drevers.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    static protected MyDriver driver = MyDriver.getInstance();


    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
