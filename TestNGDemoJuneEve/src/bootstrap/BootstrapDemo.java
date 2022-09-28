package bootstrap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDemo {

	//Customized listbox/Bootstrap - Select tag is not present

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Pratiksha\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("selenium");
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		System.out.println("Totla options - "+options.size());
		
		for(int i=0;i<options.size();i++)
		{
			//System.out.println(options.get(i).getText());
			if(options.get(i).getText().equalsIgnoreCase("selenium ide"))
			{
				options.get(i).click();
				break;
			}
		}
		
	}
}
