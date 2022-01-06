package functional;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderadvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Skullakky\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		WebElement month = driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']"));
		while(!month.getText().contains("October 2021"))
		{
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> days = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++)
		{
		String day =days.get(i).getText();
		if(day.contains("23"))
		{
			days.get(i).click();
		}
		}
	
	
	
	}
	
	
	

}
