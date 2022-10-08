package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberLogin {
	
	private static WebDriver driver = null;
	
	@Given("browser is open and application is in login page")
	public void browser_is_open_and_application_is_in_login_page() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Ashritha\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@When("user enters user name and password")
	public void user_enters_user_name_and_password() throws InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
	@Then("home page is displayed")
	public void home_page_is_displayed() throws InterruptedException 
	{
	    String actualResult;
	    String expectedResult;
	    expectedResult = "PIM";
	    actualResult = driver.findElement(By.xpath("//img[@alt=\"client brand banner\"]")).getTagName();
	    SoftAssert soft = new SoftAssert();
	    soft.assertEquals(actualResult, expectedResult);
	    Thread.sleep(2000);
	}
	
	@Then("able to apply for leave")
	public void able_to_apply_for_leave() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Apply")).click();
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"CAN\")]")).click();
		driver.findElement(By.xpath("//div[@class=\"oxd-date-input\"]/input")).sendKeys("2022-09-21");
		driver.findElement(By.xpath("//div[@class=\"oxd-form-row\"][2]//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"][2]//input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
	}
	
	@Then("able to search for admin")
	public void able_to_search_for_admin() throws InterruptedException
	{
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
	}
}
