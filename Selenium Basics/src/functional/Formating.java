package functional;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Skullakky\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] productNames = { "Brocolli", "Cucumber", "Beans" };

		List<WebElement> products = driver.findElements(By.xpath("//h4[@class = 'product-name']"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String trimmed = name[0].trim();

			List<String> productNamesList = Arrays.asList(productNames);

			int j = 0;

			if (productNamesList.contains(trimmed)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				System.out.println(trimmed + "  is the selected object");
				j++;

				if (j == productNamesList.size())
					break;
			}

		}
		
		driver.close();
	}

}
