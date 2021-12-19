package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage

{
	@FindBy(id = "welcome")
	WebElement welcome;

	public boolean isDisplayed() {
		if (welcome.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
}
