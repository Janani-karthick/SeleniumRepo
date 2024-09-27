package week2.day1assignments;


import java.util.List;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreateLead {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/main");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
WebElement login= driver.findElement(By.className("decorativeSubmit"));
		 login.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Janani");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KJD");
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Manager");
			driver.findElement(By.name("submitButton")).click();
			String title=driver.getTitle();
			System.out.println(title);
			if(title.contains("View Lead")) {
				System.out.println("Title is verified");
			}else {
				System.out.println("Title is not vrified");
}
driver.close();
		
	}

}
