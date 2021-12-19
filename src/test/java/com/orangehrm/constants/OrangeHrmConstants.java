package com.orangehrm.constants;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmConstants {
	final static Logger log = Logger.getLogger(OrangeHrmConstants.class);
	public  WebDriver driver;

	public OrangeHrmConstants() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
}
