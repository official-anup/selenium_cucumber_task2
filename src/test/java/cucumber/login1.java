package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login1 {

	WebDriver driver;
	
	@Given("Open browser")
	public void method1() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();	}
	
	@And("Go to url")
	public void method2() 
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	}
	
	@When("User enter data in username and password")
	public void method3() 
	{
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.className("inputPassword")).sendKeys("rahulshettyacademy");
	}
	
	@And("click on login button")
	public void method4() 
	{
		driver.findElement(By.className("signInBtn")).click();
	}
	
	@Then("user should redirect to home page")
	public void method5() {
		System.out.println("In home");
	}
}
