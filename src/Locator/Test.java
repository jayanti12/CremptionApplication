package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("jayantikhatai619@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("jayanti@1234");
        driver.findElement(By.name("login")).click();
	}

}
