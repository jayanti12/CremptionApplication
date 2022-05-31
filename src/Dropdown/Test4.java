package Dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement dropdown=driver.findElement(By.id("year"));
		Select s=new Select(dropdown);
		
		List a=new ArrayList();
		List<WebElement>alloption=s.getOptions();
		
		System.out.println(alloption);
		for(WebElement b:alloption) {
			a.add(b.getText());
			System.out.println(a);
			Collections.sort(a);
			System.out.println(a);
			
			
			
		}
	
	

	}

}
