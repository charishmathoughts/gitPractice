package tests;

import org.openqa.selenium.WebDriver;

import pages.Login;
import utils.BrowserFactory;
import utils.ConfigReader;

public class Test1 
{
	public static void main(String[] args) throws Exception
	{
	WebDriver driver = null;
	ConfigReader cf= new ConfigReader();	
	
	driver=BrowserFactory.startApplication(driver, "Chrome",cf.URL() );
	
	Login l=new Login(driver);
	
	l.loginExistingacnt(cf.mobilenum(),cf.pwd());
	
	}
	
}
