package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//span[text()='Phone']")).click();
driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
driver.findElement(By.name("phoneNumber")).sendKeys("9710841648");
driver.findElement(By.className().click();

	}

}
