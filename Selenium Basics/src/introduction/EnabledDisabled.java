package introduction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnabledDisabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Skullakky\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String URL = "https://www.spicejet.com/";
		
		driver.get(URL);
		System.out.println(URL);
		Thread.sleep(10000);
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		//driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("enabled");
			Assert.assertTrue(true);
		
		}
		else
		{
			Assert.assertTrue(false);
		}
		driver.close();
		
	
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	
	
	
	}
	

}
