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

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class Test5 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement ele=driver.findElement(By.id("month"));
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("3");
		s.selectByVisibleText("May");
		
		List<WebElement>options = s.getOptions();
		System.out.println(options.size());
		
		ArrayList a=new ArrayList<>();
		for(WebElement allopt:options) {
			String text=allopt.getText();
			a.add(text);
			System.out.println(text);
		}
		Collections.sort(a);
		System.out.println("after sorting");
		for(Object b:a)
		{
			System.out.println(b);
			
		}
		driver.close();
		
		

	}

}
