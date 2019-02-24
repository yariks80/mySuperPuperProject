package com.it.pages;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBordPage extends BasePage{

	@FindBy(xpath = "//span[@class='sn_menu_title']")
	private WebElement labelUserEmail;



	public String getUserEmail() {
		driver.scrollDown();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.scrollUp();
				return 	labelUserEmail.getText();
	}


}
