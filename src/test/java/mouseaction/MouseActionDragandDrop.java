package mouseaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Setting which browser we need to use and setting path where that browser is present
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		
		// Creating object for web driver class
		WebDriver driver = new ChromeDriver();
		
		// get() method to navigate to the site which we need to automate
		driver.get("http://www.jqueryui.com/");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait to provide some delay to load the particular page
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		// Finding the element where we need to automate
		driver.findElement(By.linkText("Draggable")).click();
		
		//Switching to frame where we can drag
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
		
		// Creating object for action class where all mouse actions were pre-defined
		Actions mouse=new Actions(driver);
		
		// Drag and drop mouse action
		mouse.dragAndDropBy(driver.findElement(By.id("draggable")),100,100).build().perform();
	}
}
