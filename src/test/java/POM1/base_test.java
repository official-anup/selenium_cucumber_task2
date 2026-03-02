package POM1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class base_test {
	static WebDriver driver;
	
	// browser setup
	void setUpBrowser()
	{
	    driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    driver.manage().window().maximize();
	    System.out.println("Browser setup successfully !");
	
	}
	
	//login
	void login(String username,String password)
	{
		driver.findElement(By.id("inputUsername")).sendKeys(username);;
		driver.findElement(By.name("inputPasswor d")).sendKeys(password);;
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println("Logged in successfully !");
	}
	
	//title verify method
	void verifyTitle(String expectedTitle)
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Title matched !");
	}
	
    
	@Test
	void loginTest() throws InterruptedException
	{
		setUpBrowser();
		
		login("rahul", "rahulshettyacademy");
		
		Thread.sleep(4000);
		
		verifyTitle("Rahul Shetty Academy - Login page");
		
	}

	
	
	
}

