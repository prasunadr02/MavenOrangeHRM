package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page {

	@FindBy(id="txtUsername")
	WebElement uname;
	@FindBy(id="txtPassword")
	WebElement pwrd;
	@FindBy(id="btnLogin")
	WebElement login;

	public void login(String uid, String pswrd) {
		uname.sendKeys(uid);
		pwrd.sendKeys(pswrd);
		login.click();
	}

}
