//Run this program as testNG suit by going into testing.xml file.

package testngExample;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class HrmSearchExample {
	public static WebDriver driver = null;

	@BeforeMethod 
	  public void login() {
		  	System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/button")).click(); 
	  }
	

	@Test(dataProvider="Test1")
	public void employeeSearch(String userName ) {
		driver.findElement(By.xpath("//li[1]")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input")).sendKeys(userName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(dataProvider="Test2")
	public static void employeeSearch(String userName, String empName) {
		driver.findElement(By.xpath("//li[1]")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input")).sendKeys(userName);
		driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/input")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@DataProvider(name="Test1")
	   public static Object[][] dataProviderMethod1()
	   {
	      return new Object[][] {{"Admin"}};
	   }
	
	@DataProvider(name="Test2")
	   public static Object[][] dataProviderMethod2()
	   {
	      return new Object[][] {{"Admin", "Paul"}};
	   }
}
