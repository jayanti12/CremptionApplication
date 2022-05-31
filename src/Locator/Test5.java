package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.findElement(By.name("username")).sendKeys("bala12@gamil.com");
		driver.findElement(By.name("password")).sendKeys("manik");
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[3]"));
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("instagram"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		

	}

}
