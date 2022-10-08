package testngExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchMethodOverloading {
	private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		driver = new ChromeDriver();
		SearchMethodOverloading hrm = new SearchMethodOverloading();
		hrm.login();	
		hrm.search("Admin");
		hrm.search("Admin","Paul Collings");
		hrm.search("Admin","Admin","Paul Collings");
	}
	void login()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	void search(String userName)
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//form/div//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	void search(String userName, String empName)
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//form/div//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	void search(String userName,String userRole, String empName)
	{
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//form/div//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//div[@class=\"oxd-select-text-input\"]")).sendKeys(userRole);
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
}
