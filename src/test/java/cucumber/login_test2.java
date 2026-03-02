package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v140.v140CdpInfo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_test2 
{
	WebDriver driver;
	
	//setup
	@Given("Launch the browser")
	public void setUp() 
	{
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
	
	@And("Click on Signup/Login button")
	public void loginSignup()
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
	}
	
	@Then("Verify Login to your account is visible")
	public void LoginPage()
	{
		System.out.println("Login-signup form is visible");
	}
	
	@When("Enter incorrect email address and password")
	public void enterDetails()
	{
		driver.findElement(By.name("email")).sendKeys("asbfadhf@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Anup");
	}
	
	
//	And Click Login button
	@And("Click Login button")
	public void loginClick() 
	{
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
	}
	
//	Then Verify error message Your email or password is incorrect! is visible
	@Then("Verify error message Your email or password is incorrect! is visible")
	public void verifyError()
	{
		System.out.println("Error message is visible");
	}
	
	
}
