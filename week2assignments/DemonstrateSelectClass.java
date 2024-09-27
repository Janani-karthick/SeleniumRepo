package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemonstrateSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://en-gb.facebook.com/");
Thread.sleep(5000);

driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(5000);
driver.findElement(By.name("firstname")).sendKeys("Janani");
driver.findElement(By.name("lastname")).sendKeys("Karthick");
driver.findElement(By.name("reg_email__")).sendKeys("97112347890");
driver.findElement(By.id("password_step_input")).sendKeys("Janani");
WebElement dd= driver.findElement(By.id("day"));
Select obj =new Select(dd);
obj.selectByIndex(12);
WebElement month= driver.findElement(By.id("month"));
Select obj1 = new Select(month);
obj1.selectByIndex(10);
WebElement year= driver.findElement(By.id("year"));
Select obj2 = new Select(year);
obj2.selectByIndex(33);
driver.findElement(By.className("_58mt")).click(); 

}
	}
