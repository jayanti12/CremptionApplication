package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("facebook0-login")) {
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is not passed");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		}
	}

