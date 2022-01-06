package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyamicDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Skullakky\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String URL = "https://www.spicejet.com/";
		
		driver.get(URL);
		System.out.println(URL);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value='BLR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//*[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1'] //option[@value='MAA']")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

}
