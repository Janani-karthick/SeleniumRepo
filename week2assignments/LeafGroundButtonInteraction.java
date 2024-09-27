package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonInteraction {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Dashboard")) {
			System.out.println("Title is verified");
		}else {
			System.out.println("Title is not vrified");
	}
		

	}
}
