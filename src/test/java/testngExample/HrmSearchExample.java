//Run this program as testNG suit by going into testing.xml file.

package testngExample;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class HrmSearchExample {
	private static WebDriver driver;
	@Test(priority=1)
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	//@Parameters({"Admin"})
	@Test(dataProvider="Admin1")
	public void search(String admin) throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//form/div//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys(admin);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	@DataProvider(name="Admin1")
	public static Object[][] dataProviderMethod()
	{
		return new Object[][]{{"Admin"}};
	}
	
	@Parameters({"Admin","Paul Collings"})
	@Test(priority=3)
	void search(String userName, String empName)
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//form/div//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	/*
	@Test(priority=4)
	void search(String userName,String userRole, String empName)
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//form/div//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//div[@class=\"oxd-select-text-input\"]")).sendKeys(userRole);
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	*/
}
