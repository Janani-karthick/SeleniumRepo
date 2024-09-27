package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement Basic = driver.findElement(By.className("col-12"));
		Basic.click(); 
	
		
	}

}
