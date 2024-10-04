package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("Email")).sendKeys("testleaf.2023@gmail.com");
		Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.id("Password"));
		pwd.sendKeys("Tuna@321");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.name("Log In"));
		login.click();
		
	}
		

	}


