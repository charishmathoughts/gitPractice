package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login
{
	public  WebDriver driver;
	public  WebDriverWait wait;
	
	/*@FindBy(xpath="//*[text()='Login']")
	public WebElement Lgnbtn;*/
	
	@FindBy(xpath="//*[@class='_2zrpKA _1dBPDZ']")  
	public WebElement mobilenum;
	
	@FindBy(xpath="//*[@type='password']")
	public WebElement pwd;
	
	@FindBy(xpath="//*[@class='_2AkmmA _1LctnI _7UHT_c']")
	public WebElement submtbtn;
	
	@FindBy(xpath="(//*[@class='Wbt_B2 _1YVU3_'])[1]") public WebElement Electrcs;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginExistingacnt(String x, String y) throws Exception
	{
		wait= new WebDriverWait(driver,1000);
		wait.until(ExpectedConditions.elementToBeClickable(mobilenum));
		mobilenum.click();
		mobilenum.sendKeys(x);
		pwd.click();
		pwd.sendKeys(y);
		submtbtn.click();
		System.out.println(Electrcs.getText());
	}
}
