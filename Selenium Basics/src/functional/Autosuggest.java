package functional;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Skullakky\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement d = driver.findElement(By.xpath("//*[@id='autocomplete']"));
		d.sendKeys("ind");
		
		//Thread.sleep(3000);
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		//System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		//System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		List<WebElement> options = d.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
		
		for(WebElement option :options)

		{

		//if(option.getText().equalsIgnoreCase("India"))
			if(option.getAttribute("value").equalsIgnoreCase("India"))

		{

		option.click();
		String sel = driver.findElement(By.xpath("//*[@id='autocomplete']")).getText();
		System.out.println("The selected option is" + " " +  sel);

		break;

		}

		}
		
		
	}

}
