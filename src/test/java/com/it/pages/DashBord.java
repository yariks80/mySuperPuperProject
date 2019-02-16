package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBord {

	@FindBy(xpath = "//span[@class='sn_menu_title']")
	private WebElement labelUserEmail;

	public DashBord(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public String getUserEmail() {
	 return 	labelUserEmail.getText();
	}


}
