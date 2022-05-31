package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown=driver.findElement(By.id("cars"));
		Select s = new Select(dropdown);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("399");
		Thread.sleep(3000);
		s.selectByVisibleText("INR 100 - INR 199(16)");
		Thread.sleep(3000);
		s.deselectByIndex(2);
		Thread.sleep(3000);
		s.deselectByValue("399");
		Thread.sleep(3000);
		s.deselectByVisibleText("INR 100 - INR 199(16)");
		
		

	}

}
