package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Skullakky\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = "https://www.spicejet.com/";

		driver.get(URL);
		System.out.println(URL);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("(//*[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();
		// driver.findElement(By.xpath("//a[@class='ui-state-default.ui-state-highlight.ui-state-active']")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

			System.out.println("its disabled");

			Assert.assertTrue(true);

		}

		else

		{

			Assert.assertTrue(false);

		}

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		WebElement txt = driver.findElement(By.id("divpaxinfo"));

		txt.click();
		Thread.sleep(3000);

		WebElement adult = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));

		Select dropdown = new Select(adult);

		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		Assert.assertEquals(txt.getText(), "4 Adult");

		System.out.println("No of Adult selected" + txt.getText());

		driver.findElement(By.cssSelector("input[value='Search']")).click();

	}

}
