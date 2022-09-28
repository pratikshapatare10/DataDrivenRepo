package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.VerifyLogoHomePage;

public class TestClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Pratiksha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage l=new LoginPage(driver);
		l.setLoginPageUsername();
		l.setLoginPagePassword();
		l.clickLoginPageLoginButton();
		
		VerifyLogoHomePage v=new VerifyLogoHomePage(driver);
		v.verifyHomePageLogo();
	}
}
