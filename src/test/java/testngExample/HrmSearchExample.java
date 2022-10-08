//Run this program as testNG suit by going into testing.xml file.

package testngExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class HrmSearchExample {
	private static WebDriver driver;
	@Test
	public void search() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.linkText("Admin")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Admin\")]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Paul Collings");
		driver.findElement(By.xpath("//form/div/div/div[4]//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Enabled\")]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
}
