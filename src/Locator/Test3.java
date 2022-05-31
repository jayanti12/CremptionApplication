package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("jayantikhatai@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("maner");
		driver.findElement(By.xpath("//button[contains(@class,'_42ft ')]")).click();
		String title =driver.getTitle();
		System.out.println(title);
		if(title.equals("facebook_ login"))
		{
			System.out.println("pass:home page is displayed");
		}
		else
		{
			System.out.println("fail:home page is not displayed");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		}
		
		
	}


