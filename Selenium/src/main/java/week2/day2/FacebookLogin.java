package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
			
		 
			// load the url
				driver.get("https://www.facebook.com/");
				
				// maximize the browser
				driver.manage().window().maximize();
				
				driver.findElement(By.linkText("Create new account")).click();

	}

}
