package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCSS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Skullakky\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String URL = "https://login.salesforce.com";
		driver.get(URL);
		System.out.println(URL);
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println("login is clicked");
	
	//to find xpath in console $x()
	//to find css in console $()
	
	//custom xpath : //tagname[@attribute='value']
		
		
		driver.findElement(By.xpath("//input[@id='username']"));
		driver.findElement(By.xpath("//*[@type='password']"));
		
	//custom ss : tagname[attribute='value']
	// for id custom css : tagName#Id
		// for class custom css : tagname.classname	
		
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("i@gmail.com");;
		driver.findElement(By.cssSelector("*[type='password']")).sendKeys("hello");
	System.out.println("successful");
		Thread.sleep(2000);
		driver.close();
		
	//regular expression for xpath: //tagname[contains(@attribute,'value')]	
		//regular expression for CSS: tagname[Attribute*='value')]		
		
		
	//identifying xpath using test: //*[text()=' Selenium ']
		
		//css text using tagname: By.cssSelector("a[href*='loadAjax']"
	}

}
