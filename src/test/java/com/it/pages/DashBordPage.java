package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBordPage extends BasePage{

	@FindBy(xpath = "//span[@class='sn_menu_title']")
	private WebElement labelUserEmail;



	public String getUserEmail() {
	 return 	labelUserEmail.getText();
	}


}
