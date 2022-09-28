package links;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksDemo {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Pratiksha\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		//count of all the links
		System.out.println(links.size());
		int brokenlink=0;
		
		Iterator<WebElement> it=links.iterator();
		
		while(it.hasNext())
		{
			String url=it.next().getAttribute("href");
			
			//open connection with server
			HttpsURLConnection http=(HttpsURLConnection)(new URL(url).openConnection());
			http.setRequestMethod("HEAD");
			http.connect();
			
			//fetch response code
			int resCode=http.getResponseCode();
			
			if(resCode>=400)
			{
				System.out.println(url+" is broken");
				brokenlink++;
			}
			else
				System.out.println(url + " is active");
		}
		
		System.out.println("Total broken links are: "+brokenlink);
	}
}
