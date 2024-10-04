package homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Nive");
		driver.findElement(By.name("lastname")).sendKeys("h");
		driver.findElement(By.name("reg_email__")).sendKeys("nivi.h23@icc.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("nivy123!");
		WebElement bd = driver.findElement(By.name("birthday_day"));
		Select day = new Select(bd);
		day.selectByValue("23");
		WebElement bm = driver.findElement(By.name("birthday_month"));
		Select month = new Select(bm);
		month.selectByIndex(2);
		WebElement bys = driver.findElement(By.name("birthday_year"));
		Select year = new Select (bys);
		year.selectByVisibleText("2023");
		//Doubt-Radio Button
		WebElement rb = driver.findElement(By.name("gender_wrapper"));
		rb.click();
		
		
		
		
		
		
		
		
		
		
		
		
				
		

	}

}
