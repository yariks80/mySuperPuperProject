package com.it;

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
    public void testMyTest(String url) {
  /*    validLogin=ittest2
        validPassword=337774a
        validEmail=ittest2@i.ua*/
       

    }
}
