package mouseaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Actions mouse=new Actions(driver);
		
		//for right click
		mouse.contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();
		Thread.sleep(1000);
		
		//double click
		mouse.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
		Thread.sleep(1000);
		
		//for click
		mouse.click(driver.findElement(By.id("item-0"))).build().perform();
	}
}
