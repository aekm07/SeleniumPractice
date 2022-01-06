package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating driver object
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Skullakky\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String URL = "https://www.google.com";
		driver.get(URL);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().to("https://www.yahoo.com");
		driver.navigate().forward();
		driver.navigate().back();
	driver.navigate().back();
	driver.close();
	}
	
	
	//locator: statement inside driver.findelement(by)
	//webelement: entire driver statment
	
	
	

}
