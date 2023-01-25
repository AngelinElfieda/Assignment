package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrower {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
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
			
			driver.findElement(By.linkText("Create Lead")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Elton");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Joshua");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Josh");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Testing123@gmail.com");
			driver.findElement(By.name("submitButton")).click();

			
			

	}

}
