package introduction;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Skullakky\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String URL = "https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(URL);
		System.out.println(URL);
		driver.findElement(By.id("autosuggest")).sendKeys("om");
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option :options)

		{

		if(option.getText().equalsIgnoreCase("Oman"))

		{

		option.click();

		break;

		}

		}

		}
		
		
	


	

}
