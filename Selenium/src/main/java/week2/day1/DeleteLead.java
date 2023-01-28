package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		
		 
		// load the url
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			// maximize the browser
			driver.manage().window().maximize();
			
			// Enter the username
			WebElement eleUserName = driver.findElement(By.id("username"));
			eleUserName.sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.linkText("CRM/SFA")).click();
		
			driver.findElement(By.linkText("Leads")).click();
			
			// click on find lead
			
			driver.findElement(By.linkText("Find Leads")).click();
			
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
	
	}

}
