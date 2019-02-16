package com.it;

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
        driver.findElement(By.name("login")).sendKeys("ittest2");
        driver.findElement(By.name("pass")).sendKeys("337774a");
        driver.findElement(By.xpath("//input[@tabindex='5']")).click();
        String email = driver.findElement(By.xpath("//span[@class='sn_menu_title']")).getText();
        Assert.assertEquals(email, "ittest2@i.ua");

    }
}
