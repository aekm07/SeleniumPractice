package introduction;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Skullakky\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String URL = "https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(URL);
		System.out.println(URL);
		
		
		
		 WebElement txt = driver.findElement(By.id("divpaxinfo"));
		 
		 txt.click();
		Thread.sleep(3000);
		driver.findElement(By.id("hrefIncChd")).click(); //selecting 1 child 
		Thread.sleep(3000);
		//int i=1;
		
		/*while(i<4)
		{
			driver.findElement(By.id("hrefIncChd")).click(); //selecting 4 child
			i++;
		
		}*/
		
		for(int i=1;i<4;i++)
		{
			driver.findElement(By.id("hrefIncChd")).click(); //selecting 4 child
			Thread.sleep(1000);
		}
		
		
		System.out.println("No of Children selected" + txt.getText());
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Thread.sleep(3000);
		
		
	//WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	//Select dropdown= new Select(staticdropdown);
	}

	
}
