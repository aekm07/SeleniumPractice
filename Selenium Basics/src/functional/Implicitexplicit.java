package functional;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitexplicit {

	// implicit wait: global wait. all steps will take the given time to wait for
	// exception
	// explicit wait: is used to apply wait to specific element or scenario

	// implicit wait syntax:
	// driver.manage.timeouts().implicitlyWait(5,TimeUnit.SECONDS)
	// pros:readable code
	// cons:perfrmnce issues are not caught

	// explicit wait: webdriver wait and fluent wait are 2dffrnt classes implementing  one wait interface

	// WebDriverWait w =new WebDriverWait(driver,5);
	// w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

	// pros: can capture perfrmnce issue and applied to only speicifc elemnts
	// cons: complex code

	
	//fluent wait: Wait<Web Driver> w = new FluentWait<webDriver>(driver).withtimeout(10,seconds).pollingevery(10.seconds).ignoring(nosuchelementexceptiob.class)
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Skullakky\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebDriverWait w = new WebDriverWait(driver, 5);

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector("button.promoBtn")).click();

		// explicit wait

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{

		int j = 0;

		List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']"));

		for (WebElement p : products)

		{
			String[] name = p.findElement(By.xpath("//h4[@class='product-name']")).getText().split("-");
			String formattedName = name[0].trim();

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{

				j++;

				p.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}
}
