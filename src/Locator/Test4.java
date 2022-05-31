package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manik@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manika");
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd _3AWRsL')]")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("flipkart-login"))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is not failed");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		}
		
		

	}


