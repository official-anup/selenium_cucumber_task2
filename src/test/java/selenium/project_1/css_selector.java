package selenium.project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {

	public static void main(String[] arg) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		 
		try {
//			driver.findElement(By.cssSelector("#APjFqb")); // by id ie #
//			driver.findElement(By.cssSelector(".gLFyf")); // by class ie .
//			driver.findElement(By.cssSelector("input")); // by id ie #
			
			//by attribute
//			driver.findElement(By.cssSelector("textarea[name='q']"));
			
			//by multiple attribute
			
			
			//
			System.out.println("Element found");
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found"+e.getMessage());
			e.printStackTrace();
		}
		
	}
}
