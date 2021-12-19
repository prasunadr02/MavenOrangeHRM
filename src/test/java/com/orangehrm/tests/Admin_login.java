package com.orangehrm.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.constants.OrangeHrmConstants;
import com.orangehrm.pages.AdminPage;
import com.orangehrm.pages.Home_Page;

public class Admin_login extends OrangeHrmConstants {
	
	@Test
	public void adminlogin() {
		Home_Page hp = PageFactory.initElements(driver,Home_Page.class);
		hp.login("admin", "Qedge123!@#");
		AdminPage ap = PageFactory.initElements(driver, AdminPage.class);
		boolean res=ap.isDisplayed();
		Assert.assertTrue(res);		
	}

}
