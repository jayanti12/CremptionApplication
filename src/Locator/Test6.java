package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("user");
		driver.findElement(By.xpath("//button[contains(@class,'login_Btn')]")).click();
		
		
		
		
		
	}

}
