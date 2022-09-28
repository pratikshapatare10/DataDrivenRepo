package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declararion
	@FindBy (xpath="//input[@id='user-name']") private WebElement un;
	@FindBy (xpath="//input[@id='password']") private WebElement pwd;
	@FindBy (xpath="//input[@id='login-button']") private WebElement lgnBtn;
	
	//initialzation
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	//method for username we
	public void setLoginPageUsername()
	{
		un.sendKeys("standard_user");
	}
	
	//method for pwd we
	public void setLoginPagePassword()
	{
		pwd.sendKeys("secret_sauce");
	}
	
	//method for login button we
	public void clickLoginPageLoginButton()
	{
		lgnBtn.click();
	}
}
