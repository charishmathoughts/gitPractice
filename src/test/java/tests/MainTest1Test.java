package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Login;
import utils.BrowserFactory;
import utils.ConfigReader;

public class MainTest1Test {
	public WebDriver driver;
	public ConfigReader cr;
	public Login l;

	@BeforeTest
	public void launchbrowser() throws Exception {
		cr = new ConfigReader();
		driver=BrowserFactory.startApplication( "Chrome", cr.URL());
	}

	@Test
	public void logintest() throws Exception {
		l = new Login(driver);
		l.loginExistingacnt(cr.mobilenum(), cr.pwd());
	}
	
	@AfterTest
	public void quitb()
	{
		driver.quit();
	}

}
