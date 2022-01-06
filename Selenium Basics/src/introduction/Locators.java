package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Skullakky\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String URL = "https://www.google.com";
		driver.get(URL);
		System.out.println(URL);
		
		driver.findElement(By.name("q")).sendKeys("facebook");
		
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Find ICMR authorized COVID-19 testing centers near you")).click();
		
		
		//compound class name not allowed.r4 wide primary
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
