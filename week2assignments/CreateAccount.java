package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/main");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
WebElement login= driver.findElement(By.className("decorativeSubmit"));
login.click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.id("accountName")).sendKeys("Sai");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
driver.findElement(By.name("numberEmployees")).sendKeys("150");
driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
driver.findElement(By.className("smallSubmit")).click();
String title=driver.getTitle();
System.out.println(title);
if(title.contains("Account Details")) {
	System.out.println("Title is verified");
}else {
	System.out.println("Title is not vrified");
}
}


	}


