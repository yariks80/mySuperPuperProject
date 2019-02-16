package com.it;

import com.it.pages.DashBord;
import com.it.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class MyTest {
    private WebDriver driver;

    @BeforeClass
    public void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @AfterClass
    public void tearDownClass() {
        driver.quit();

    }


    @Test
    public void testMyTest() {
  /*    validLogin=ittest2
        validPassword=337774a
        validEmail=ittest2@i.ua*/
        driver.get("https://www.i.ua/");
        new LoginPage(driver).login("ittest2", "337774a");
        String userEmail = new DashBord(driver).getUserEmail();
        Assert.assertEquals(userEmail, "ittest2@i.ua");

    }
}
