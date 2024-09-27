package week2.day1assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.types.Duration;

public class DemonstrateRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	driver.findElement(By.xpath("//label[text()='Chrome']")).click();
	driver.findElement(By.xpath("//label[text()='Chrome']")).clear();


}	
}