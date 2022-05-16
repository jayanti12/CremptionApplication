package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("xyz");
		driver.findElement(By.id("V67aGc")).sendKeys("abc");
		driver.findElement(By.id("Cuz2Ue")).sendKeys("abcd123");
		
	} 
	

}
