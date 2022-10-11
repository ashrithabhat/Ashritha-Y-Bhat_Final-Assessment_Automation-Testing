package mouseaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Setting which browser we need to use and setting path where that browser is present
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		
		// Creating object for web driver class
		WebDriver driver = new ChromeDriver();
		
		// get() method to navigate to the site which we need to automate
		driver.get("http://www.aptransport.org/");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait to provide some delay to load the particular page
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		// Creating object for action class where all mouse actions were pre-defined
		Actions mouse=new Actions(driver);
		
		// Mouse hover action
		mouse.moveToElement(driver.findElement(By.linkText("REGISTRATION"))).build().perform();
		Thread.sleep(1000);
	}

}
