package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	private static Object delete;
	private Object key;

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
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("KJD");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Janani");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Karthick");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Jan");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("HR");
		 WebElement description = driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']"));
		 description.sendKeys("Human Resource Management");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("janad04@gmail.com");
		 WebElement state= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select obj =new Select(state);
		 obj.selectByVisibleText("Hawaii");
		 driver.findElement(By.name("submitButton")).click();
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.name("description")).clear();
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("World Record");
			driver.findElement(By.className("smallSubmit")).click();
			String title=driver.getTitle();
			System.out.println(title);
			driver.close();

	}

}
