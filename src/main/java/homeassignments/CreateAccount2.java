package homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();			
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("New Account2");
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.name("industryEnumId")).sendKeys("Computer Software");
		//I'm getting exceptions in the Line 27. After that i didn't get the output
		WebElement dd = driver.findElement(By.className("ownershipEnumId"));
		Select ownership = new Select(dd);
		ownership.selectByVisibleText("S-Corporation");
		WebElement aa = driver.findElement(By.id("dataSourceId"));
		Select source = new Select(aa);
		source.selectByValue("Employee");
		WebElement bb = driver.findElement(By.id("marketingCampaignId"));
		Select mc =new Select (bb);
		mc.selectByIndex(6);
		WebElement cc = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sp = new Select(cc);
		sp.selectByValue("Texas");
		
		
		
				


		
		
		
		
		

	}

}
