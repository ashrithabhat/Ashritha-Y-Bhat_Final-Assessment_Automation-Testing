//Example for confirmation alert.

package alerthandlings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Setting which browser we need to use and setting path where that browser is present
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		
		// Creating object for web driver class
		WebDriver driver = new ChromeDriver();
		
		// get() method to navigate to the site which we need to automate
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait to provide some delay to load the particular page
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		// Finding the element where we need to automate
		driver.findElement(By.xpath("//li[2]//a[@class=\"analystic\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		Thread.sleep(1000);// To provide delay
		
		// To print text present in the alert window, switchTo() method used to switch to window or alert
		System.out.println(driver.switchTo().alert().getText());
		
		//Pressing cancel button saying that we are dismissing the alert request.
		driver.switchTo().alert().dismiss();
	}

}
