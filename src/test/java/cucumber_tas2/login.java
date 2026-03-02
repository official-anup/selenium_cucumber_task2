package cucumber_tas2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login 

{

WebDriver driver;
	
	//setup
	@Given("Launch the browser")
	public void setUp()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-extensions");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	//navigate to url
	@And("navigate to URL")
	public void navigateToUrl() 
	{
		driver.get("https://automationexercise.com/");
	}
	
	@Then("Verify home page is visible")
	public void home() 
	{
		System.out.println("In home page");
	}
	
	
	@And("Click on SignUpLogin button")
	public void loginSignup()
	{
//		driver.findElement(By.xpath("//a[normalize-space()=' Signup / Login']")).click();	
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
	}
	  
	
	@Then("Verify Login to your account is visible")
	public void LoginPage()
	{
		System.out.println("Login-signup form is visible");
	}
	
	
	
	@When("Enter incorrect email address and password")
	public void enterDetails() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("anup@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Anup");
	}
	
	
//	@And("Click Login button")
//	public void loginClick() 
//	{
//		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
//	}
	
	@And("Click Login button")
	public void loginClick() {

	    WebElement loginBtn = driver.findElement(
	            By.xpath("//button[@data-qa='login-button']")
	    );

	    // Scroll to the element
	    ((JavascriptExecutor) driver)
	            .executeScript("arguments[0].scrollIntoView({block:'center'});", loginBtn);

	    // Now click
	    loginBtn.click();
	}
	
	
//	Then Verify error message Your email or password is incorrect! is visible
	@Then("Verify error message Your email or password is incorrect! is visible")
	public void verifyError()
	{
		System.out.println("Error message is visible");
	}
	
	
	
}
