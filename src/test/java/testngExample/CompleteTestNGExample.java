//Test this program as TestNG Test

package testngExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CompleteTestNGExample {
	private static WebDriver driver;
	@Test(priority=1)
	public void hrmLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
	}
	@Test(priority=2)
	public void hrmApplyLeave() throws InterruptedException
	{
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Apply")).click();
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"CAN\")]")).click();
		driver.findElement(By.xpath("//div[@class=\"oxd-date-input\"]/input")).sendKeys("2022-09-21");
		driver.findElement(By.xpath("//div[@class=\"oxd-form-row\"][2]//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"][2]//input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
	}
	@Test(priority=3)
	public void hrmSearch() throws InterruptedException
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//form/div//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Admin\")]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Paul Collings");
		driver.findElement(By.xpath("//form/div/div/div[4]//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Enabled\")]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
	}
}
