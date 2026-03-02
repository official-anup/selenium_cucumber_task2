package selenium.project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_selector {
	
    public static void main(String[] arg) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		 
		try {

			
			
			
			System.out.println("Element found");
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found"+e.getMessage());
			e.printStackTrace();
		}
		
	}
}
