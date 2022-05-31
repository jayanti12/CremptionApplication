package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("manik@gmail.com");
		driver.findElement(By.id("createAccountSubmit")).sendKeys("manik!23");
		
	}

}
