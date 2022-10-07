package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmDashboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		//login
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//Admin field
		Thread.sleep(1000);
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//form/div//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Admin\")]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Paul Collings");
		driver.findElement(By.xpath("//form/div/div/div[4]//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Enabled\")]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//Leave field where we are applying leave
		Thread.sleep(1000);
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Apply")).click();
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"CAN\")]")).click();
		driver.findElement(By.xpath("//div[@class=\"oxd-date-input\"]/input")).sendKeys("2022-09-21");
		driver.findElement(By.xpath("//div[@class=\"oxd-form-row\"][2]//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"][2]//input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//My info field
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Info")).click();
		driver.findElement(By.name("firstName")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"Ashritha");
		driver.findElement(By.name("middleName")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"Y");
		driver.findElement(By.name("lastName")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"Bhat");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div/div[2]/div/div/div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"Ashri");
		driver.findElement(By.xpath("//form/div[2]/div/div/div/div/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"2000");
		driver.findElement(By.xpath("//form/div[2]/div/div[2]/div/div/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"Id");
		driver.findElement(By.xpath("//form/div[2]/div[2]/div/div/div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"12345");
		driver.findElement(By.xpath("//form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"2025-04-16");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[2]/div[3]/div/div/div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"SSN123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[2]/div[3]/div[2]/div/div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"SIN123");
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Indian\")]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[3]/div/div[2]/div/div/div/div/div/i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"Single\")]")).click();
		driver.findElement(By.xpath("//form/div[3]/div[2]/div/div/div[2]/div/div/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"2001-04-16");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//PIM field where we are adding an employee
		Thread.sleep(1000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("middleName")).sendKeys("M");
		driver.findElement(By.name("lastName")).sendKeys("Disilva");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div/div[2]//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"3000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form//button[@type=\"submit\"]")).click();
	}
}
