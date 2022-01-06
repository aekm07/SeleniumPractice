package functional;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Skullakky\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// String openLinkInNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);

		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String checkBox = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println(checkBox);
		WebElement dropDown = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		Select s = new Select(dropDown);
		s.selectByVisibleText(checkBox);
		System.out.println(s.getFirstSelectedOption().getText());
	
		
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys(checkBox);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		String alert = driver.switchTo().alert().getText();
		
		if (alert.contains(checkBox))
		{
			System.out.println(" the alert contains the word" + " " + checkBox);
		}
		
		
		
		
		
	}

}
